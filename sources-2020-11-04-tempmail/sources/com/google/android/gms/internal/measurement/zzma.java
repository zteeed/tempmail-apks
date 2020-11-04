package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzma implements zzmb {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9955a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9956b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Boolean> f9957c;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        zzdb.b("measurement.id.lifecycle.app_in_background_parameter", 0);
        f9955a = zzdb.d("measurement.lifecycle.app_backgrounded_engagement", false);
        f9956b = zzdb.d("measurement.lifecycle.app_backgrounded_tracking", true);
        f9957c = zzdb.d("measurement.lifecycle.app_in_background_parameter", false);
        zzdb.b("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean a() {
        return f9955a.n().booleanValue();
    }

    public final boolean b() {
        return f9956b.n().booleanValue();
    }

    public final boolean c() {
        return f9957c.n().booleanValue();
    }
}
