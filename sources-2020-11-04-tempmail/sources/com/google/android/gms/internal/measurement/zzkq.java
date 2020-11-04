package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzkq implements zzkr {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9913a;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9913a = zzdb.d("measurement.sdk.referrer.delayed_install_referrer_api", false);
        zzdb.b("measurement.id.sdk.referrer.delayed_install_referrer_api", 0);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9913a.n().booleanValue();
    }
}
