package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzmg implements zzmh {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Long> f9964a;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        zzdb.b("measurement.id.max_bundles_per_iteration", 0);
        f9964a = zzdb.b("measurement.max_bundles_per_iteration", 2);
    }

    public final long a() {
        return f9964a.n().longValue();
    }
}
