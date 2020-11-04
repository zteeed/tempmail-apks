package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzlt implements zzlq {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9943a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9944b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Boolean> f9945c;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9943a = zzdb.d("measurement.client.global_params.dev", false);
        f9944b = zzdb.d("measurement.service.global_params_in_payload", true);
        f9945c = zzdb.d("measurement.service.global_params", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9943a.n().booleanValue();
    }

    public final boolean c() {
        return f9944b.n().booleanValue();
    }

    public final boolean d() {
        return f9945c.n().booleanValue();
    }
}
