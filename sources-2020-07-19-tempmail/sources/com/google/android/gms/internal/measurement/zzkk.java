package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzkk implements zzkl {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9721a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9722b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Boolean> f9723c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<Boolean> f9724d;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9721a = zzdb.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f9722b = zzdb.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f9723c = zzdb.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f9724d = zzdb.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9721a.n().booleanValue();
    }

    public final boolean c() {
        return f9722b.n().booleanValue();
    }

    public final boolean d() {
        return f9723c.n().booleanValue();
    }

    public final boolean e() {
        return f9724d.n().booleanValue();
    }
}
