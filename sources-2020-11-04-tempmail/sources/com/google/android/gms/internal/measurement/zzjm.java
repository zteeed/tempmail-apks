package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjm implements zzjn {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9868a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Long> f9869b;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9868a = zzdb.d("measurement.sdk.attribution.cache", true);
        f9869b = zzdb.b("measurement.sdk.attribution.cache.ttl", 604800000);
    }

    public final boolean a() {
        return f9868a.n().booleanValue();
    }

    public final long b() {
        return f9869b.n().longValue();
    }
}
