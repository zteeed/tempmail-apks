package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzli implements zzlj {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9748a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9749b;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9748a = zzdb.d("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f9749b = zzdb.d("measurement.collection.redundant_engagement_removal_enabled", false);
        zzdb.b("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean a() {
        return f9748a.n().booleanValue();
    }

    public final boolean b() {
        return f9749b.n().booleanValue();
    }
}
