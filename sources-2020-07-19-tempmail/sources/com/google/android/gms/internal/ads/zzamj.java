package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzamj {

    /* renamed from: b  reason: collision with root package name */
    private static zzamj f5788b;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f5789a = new AtomicBoolean(false);

    zzamj() {
    }

    private static void a(Context context, AppMeasurementSdk appMeasurementSdk) {
        try {
            ((zzbia) zzbaz.a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", q2.f4679a)).t5(ObjectWrapper.b0(context), new zzamg(appMeasurementSdk));
        } catch (RemoteException | zzbbb | NullPointerException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    static /* synthetic */ void c(Context context, String str) {
        zzaav.a(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzwg.e().c(zzaav.Y)).booleanValue());
        a(context, AppMeasurementSdk.l(context, "FA-Ads", "am", str, bundle));
    }

    private static boolean e(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static /* synthetic */ void f(Context context) {
        zzaav.a(context);
        if (((Boolean) zzwg.e().c(zzaav.d0)).booleanValue() && e(context)) {
            a(context, AppMeasurementSdk.k(context));
        }
    }

    public static zzamj g() {
        if (f5788b == null) {
            f5788b = new zzamj();
        }
        return f5788b;
    }

    public final Thread b(Context context, String str) {
        if (!this.f5789a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new p2(this, context, str));
        thread.start();
        return thread;
    }

    public final Thread d(Context context) {
        if (!this.f5789a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new r2(this, context));
        thread.start();
        return thread;
    }
}
