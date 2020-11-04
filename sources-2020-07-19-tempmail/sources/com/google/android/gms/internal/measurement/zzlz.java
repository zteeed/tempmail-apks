package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzlz implements zzlw {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9768a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9769b;

    /* renamed from: c  reason: collision with root package name */
    private static final zzcv<Boolean> f9770c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzcv<Boolean> f9771d;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9768a = zzdb.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f9769b = zzdb.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f9770c = zzdb.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f9771d = zzdb.d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        zzdb.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean a() {
        return f9768a.n().booleanValue();
    }

    public final boolean b() {
        return f9769b.n().booleanValue();
    }

    public final boolean c() {
        return f9770c.n().booleanValue();
    }

    public final boolean d() {
        return f9771d.n().booleanValue();
    }
}
