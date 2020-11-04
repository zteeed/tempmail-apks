package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjy implements zzjz {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9887a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9888b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Boolean> f9889c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<Boolean> f9890d;

    /* renamed from: e  reason: collision with root package name */
    private static final zzcv<Boolean> f9891e;

    /* renamed from: f  reason: collision with root package name */
    private static final zzcv<Boolean> f9892f;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9887a = zzdb.d("measurement.gold.enhanced_ecommerce.format_logs", true);
        f9888b = zzdb.d("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        f9889c = zzdb.d("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        f9890d = zzdb.d("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        f9891e = zzdb.d("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f9892f = zzdb.d("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9887a.n().booleanValue();
    }

    public final boolean c() {
        return f9888b.n().booleanValue();
    }

    public final boolean d() {
        return f9889c.n().booleanValue();
    }

    public final boolean e() {
        return f9890d.n().booleanValue();
    }

    public final boolean j() {
        return f9891e.n().booleanValue();
    }

    public final boolean l() {
        return f9892f.n().booleanValue();
    }
}
