package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* compiled from: MetadataBackendRegistry */
class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f2557a;

    /* renamed from: b  reason: collision with root package name */
    private final i f2558b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, m> f2559c;

    /* compiled from: MetadataBackendRegistry */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2560a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f2561b = null;

        a(Context context) {
            this.f2560a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d2 = d(context);
            if (d2 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d2.keySet()) {
                Object obj = d2.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f2561b == null) {
                this.f2561b = a(this.f2560a);
            }
            return this.f2561b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e2);
                return null;
            } catch (IllegalAccessException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e3);
                return null;
            } catch (InstantiationException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e6);
                return null;
            }
        }
    }

    @Inject
    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    public synchronized m a(String str) {
        if (this.f2559c.containsKey(str)) {
            return this.f2559c.get(str);
        }
        d b2 = this.f2557a.b(str);
        if (b2 == null) {
            return null;
        }
        m create = b2.create(this.f2558b.a(str));
        this.f2559c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.f2559c = new HashMap();
        this.f2557a = aVar;
        this.f2558b = iVar;
    }
}
