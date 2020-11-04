package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzmf implements zzmc {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9962a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9963b;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9962a = zzdb.d("measurement.sdk.screen.manual_screen_view_logging", true);
        f9963b = zzdb.d("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9962a.n().booleanValue();
    }

    public final boolean c() {
        return f9963b.n().booleanValue();
    }
}
