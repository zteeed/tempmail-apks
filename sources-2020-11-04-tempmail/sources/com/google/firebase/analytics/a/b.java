package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.a.a;
import com.google.firebase.analytics.connector.internal.f;
import com.google.firebase.c;
import com.google.firebase.f.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public class b implements a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f11553c;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private final AppMeasurementSdk f11554a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final Map<String, Object> f11555b = new ConcurrentHashMap();

    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
    class a implements a.C0100a {
        a(b bVar, String str) {
        }
    }

    private b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.k(appMeasurementSdk);
        this.f11554a = appMeasurementSdk;
    }

    @KeepForSdk
    public static a e(c cVar, Context context, d dVar) {
        Preconditions.k(cVar);
        Preconditions.k(context);
        Preconditions.k(dVar);
        Preconditions.k(context.getApplicationContext());
        if (f11553c == null) {
            synchronized (b.class) {
                if (f11553c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.q()) {
                        dVar.b(com.google.firebase.a.class, c.f11556b, d.f11557a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.p());
                    }
                    f11553c = new b(zzag.c(context, (String) null, (String) null, (String) null, bundle).f());
                }
            }
        }
        return f11553c;
    }

    static final /* synthetic */ void f(com.google.firebase.f.a aVar) {
        boolean z = ((com.google.firebase.a) aVar.a()).f11531a;
        synchronized (b.class) {
            ((b) f11553c).f11554a.v(z);
        }
    }

    private final boolean g(String str) {
        return !str.isEmpty() && this.f11555b.containsKey(str) && this.f11555b.get(str) != null;
    }

    @KeepForSdk
    public void W(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.a.c(str) && com.google.firebase.analytics.connector.internal.a.d(str2, bundle) && com.google.firebase.analytics.connector.internal.a.f(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.a.h(str, str2, bundle);
            this.f11554a.o(str, str2, bundle);
        }
    }

    @KeepForSdk
    public int Z(String str) {
        return this.f11554a.m(str);
    }

    @KeepForSdk
    public Map<String, Object> a(boolean z) {
        return this.f11554a.n((String) null, (String) null, z);
    }

    @KeepForSdk
    public void b(a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.a.b(cVar)) {
            this.f11554a.s(com.google.firebase.analytics.connector.internal.a.g(cVar));
        }
    }

    @KeepForSdk
    public void c(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.a.c(str) && com.google.firebase.analytics.connector.internal.a.e(str, str2)) {
            this.f11554a.u(str, str2, obj);
        }
    }

    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.a.d(str2, bundle)) {
            this.f11554a.b(str, str2, bundle);
        }
    }

    @KeepForSdk
    public a.C0100a d(String str, a.b bVar) {
        Object obj;
        Preconditions.k(bVar);
        if (!com.google.firebase.analytics.connector.internal.a.c(str) || g(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f11554a;
        if ("fiam".equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.d(appMeasurementSdk, bVar);
        } else if ("crash".equals(str) || "clx".equals(str)) {
            obj = new f(appMeasurementSdk, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f11555b.put(str, obj);
        return new a(this, str);
    }

    @KeepForSdk
    public List<a.c> d0(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle a2 : this.f11554a.g(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.a.a(a2));
        }
        return arrayList;
    }
}
