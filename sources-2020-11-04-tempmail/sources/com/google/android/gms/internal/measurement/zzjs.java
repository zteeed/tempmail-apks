package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjs implements zzjt {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9880a;

    /* renamed from: b  reason: collision with root package name */
    private static final zzcv<Boolean> f9881b;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9880a = zzdb.d("measurement.service.configurable_service_limits", false);
        f9881b = zzdb.d("measurement.client.configurable_service_limits", false);
        zzdb.b("measurement.id.service.configurable_service_limits", 0);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9880a.n().booleanValue();
    }

    public final boolean c() {
        return f9881b.n().booleanValue();
    }
}
