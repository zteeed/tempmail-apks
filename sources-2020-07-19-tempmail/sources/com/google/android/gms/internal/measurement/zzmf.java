package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzmf implements zzmc {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9779a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9780b;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9779a = zzdb.d("measurement.sdk.screen.manual_screen_view_logging", true);
        f9780b = zzdb.d("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9779a.n().booleanValue();
    }

    public final boolean c() {
        return f9780b.n().booleanValue();
    }
}
