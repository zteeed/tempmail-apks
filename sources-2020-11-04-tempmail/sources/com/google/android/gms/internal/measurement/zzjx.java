package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjx implements zzju {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9886a;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9886a = zzdb.d("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        zzdb.d("measurement.collection.init_params_control_enabled", true);
        zzdb.d("measurement.sdk.dynamite.use_dynamite3", true);
        zzdb.b("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    public final boolean a() {
        return f9886a.n().booleanValue();
    }
}
