package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjy implements zzjz {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9704a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9705b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Boolean> f9706c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<Boolean> f9707d;

    /* renamed from: e  reason: collision with root package name */
    private static final zzcv<Boolean> f9708e;

    /* renamed from: f  reason: collision with root package name */
    private static final zzcv<Boolean> f9709f;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9704a = zzdb.d("measurement.gold.enhanced_ecommerce.format_logs", true);
        f9705b = zzdb.d("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        f9706c = zzdb.d("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        f9707d = zzdb.d("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        f9708e = zzdb.d("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f9709f = zzdb.d("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9704a.n().booleanValue();
    }

    public final boolean c() {
        return f9705b.n().booleanValue();
    }

    public final boolean d() {
        return f9706c.n().booleanValue();
    }

    public final boolean e() {
        return f9707d.n().booleanValue();
    }

    public final boolean j() {
        return f9708e.n().booleanValue();
    }

    public final boolean l() {
        return f9709f.n().booleanValue();
    }
}
