package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzmr implements zzmo {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9792a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Double> f9793b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Long> f9794c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<Long> f9795d;

    /* renamed from: e  reason: collision with root package name */
    private static final zzcv<String> f9796e;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9792a = zzdb.d("measurement.test.boolean_flag", false);
        f9793b = zzdb.a("measurement.test.double_flag", -3.0d);
        f9794c = zzdb.b("measurement.test.int_flag", -2);
        f9795d = zzdb.b("measurement.test.long_flag", -1);
        f9796e = zzdb.c("measurement.test.string_flag", "---");
    }

    public final boolean a() {
        return f9792a.n().booleanValue();
    }

    public final double b() {
        return f9793b.n().doubleValue();
    }

    public final long c() {
        return f9794c.n().longValue();
    }

    public final long d() {
        return f9795d.n().longValue();
    }

    public final String e() {
        return f9796e.n();
    }
}
