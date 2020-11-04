package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.a.a;
import com.google.firebase.analytics.connector.internal.e;
import com.google.firebase.analytics.connector.internal.g;
import com.google.firebase.c;
import com.google.firebase.f.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public class b implements a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f11001c;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private final AppMeasurementSdk f11002a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final Map<String, com.google.firebase.analytics.connector.internal.a> f11003b = new ConcurrentHashMap();

    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
    class a implements a.C0100a {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ String f11004a;

        a(String str) {
            this.f11004a = str;
        }

        public void unregister() {
            if (b.this.h(this.f11004a)) {
                a.b a2 = b.this.f11003b.get(this.f11004a).a();
                if (a2 != null) {
                    a2.onMessageTriggered(0, (Bundle) null);
                }
                b.this.f11003b.remove(this.f11004a);
            }
        }
    }

    private b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.k(appMeasurementSdk);
        this.f11002a = appMeasurementSdk;
    }

    @KeepForSdk
    public static a e(c cVar, Context context, d dVar) {
        Preconditions.k(cVar);
        Preconditions.k(context);
        Preconditions.k(dVar);
        Preconditions.k(context.getApplicationContext());
        if (f11001c == null) {
            synchronized (b.class) {
                if (f11001c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.q()) {
                        dVar.b(com.google.firebase.a.class, c.f11006b, d.f11007a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.p());
                    }
                    f11001c = new b(zzag.c(context, (String) null, (String) null, (String) null, bundle).f());
                }
            }
        }
        return f11001c;
    }

    static final /* synthetic */ void f(com.google.firebase.f.a aVar) {
        boolean z = ((com.google.firebase.a) aVar.a()).f10979a;
        synchronized (b.class) {
            ((b) f11001c).f11002a.v(z);
        }
    }

    /* access modifiers changed from: private */
    public final boolean h(String str) {
        return !str.isEmpty() && this.f11003b.containsKey(str) && this.f11003b.get(str) != null;
    }

    @KeepForSdk
    public void Q(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.c(str) && com.google.firebase.analytics.connector.internal.b.d(str2, bundle) && com.google.firebase.analytics.connector.internal.b.f(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.h(str, str2, bundle);
            this.f11002a.o(str, str2, bundle);
        }
    }

    @KeepForSdk
    public int T(String str) {
        return this.f11002a.m(str);
    }

    @KeepForSdk
    public List<a.c> X(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle a2 : this.f11002a.g(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.a(a2));
        }
        return arrayList;
    }

    @KeepForSdk
    public Map<String, Object> a(boolean z) {
        return this.f11002a.n((String) null, (String) null, z);
    }

    @KeepForSdk
    public void b(a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.b.b(cVar)) {
            this.f11002a.s(com.google.firebase.analytics.connector.internal.b.g(cVar));
        }
    }

    @KeepForSdk
    public void c(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.c(str) && com.google.firebase.analytics.connector.internal.b.e(str, str2)) {
            this.f11002a.u(str, str2, obj);
        }
    }

    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.d(str2, bundle)) {
            this.f11002a.b(str, str2, bundle);
        }
    }

    @KeepForSdk
    public a.C0100a d(String str, a.b bVar) {
        Object obj;
        Preconditions.k(bVar);
        if (!com.google.firebase.analytics.connector.internal.b.c(str) || h(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f11002a;
        if ("fiam".equals(str)) {
            obj = new e(appMeasurementSdk, bVar);
        } else if ("crash".equals(str) || "clx".equals(str)) {
            obj = new g(appMeasurementSdk, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f11003b.put(str, obj);
        return new a(str);
    }
}
