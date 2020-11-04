package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzmr implements zzmo {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9975a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Double> f9976b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Long> f9977c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<Long> f9978d;

    /* renamed from: e  reason: collision with root package name */
    private static final zzcv<String> f9979e;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9975a = zzdb.d("measurement.test.boolean_flag", false);
        f9976b = zzdb.a("measurement.test.double_flag", -3.0d);
        f9977c = zzdb.b("measurement.test.int_flag", -2);
        f9978d = zzdb.b("measurement.test.long_flag", -1);
        f9979e = zzdb.c("measurement.test.string_flag", "---");
    }

    public final boolean a() {
        return f9975a.n().booleanValue();
    }

    public final double b() {
        return f9976b.n().doubleValue();
    }

    public final long c() {
        return f9977c.n().longValue();
    }

    public final long d() {
        return f9978d.n().longValue();
    }

    public final String e() {
        return f9979e.n();
    }
}
