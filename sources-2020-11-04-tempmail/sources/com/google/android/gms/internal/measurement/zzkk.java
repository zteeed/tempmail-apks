package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzkk implements zzkl {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9904a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9905b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Boolean> f9906c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<Boolean> f9907d;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9904a = zzdb.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f9905b = zzdb.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f9906c = zzdb.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f9907d = zzdb.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9904a.n().booleanValue();
    }

    public final boolean c() {
        return f9905b.n().booleanValue();
    }

    public final boolean d() {
        return f9906c.n().booleanValue();
    }

    public final boolean e() {
        return f9907d.n().booleanValue();
    }
}
