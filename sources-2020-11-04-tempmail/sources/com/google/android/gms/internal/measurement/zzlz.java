package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzlz implements zzlw {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9951a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9952b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Boolean> f9953c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<Boolean> f9954d;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9951a = zzdb.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f9952b = zzdb.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f9953c = zzdb.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f9954d = zzdb.d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        zzdb.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean a() {
        return f9951a.n().booleanValue();
    }

    public final boolean b() {
        return f9952b.n().booleanValue();
    }

    public final boolean c() {
        return f9953c.n().booleanValue();
    }

    public final boolean d() {
        return f9954d.n().booleanValue();
    }
}
