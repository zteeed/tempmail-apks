package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjm implements zzjn {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9685a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Long> f9686b;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9685a = zzdb.d("measurement.sdk.attribution.cache", true);
        f9686b = zzdb.b("measurement.sdk.attribution.cache.ttl", 604800000);
    }

    public final boolean a() {
        return f9685a.n().booleanValue();
    }

    public final long b() {
        return f9686b.n().longValue();
    }
}
