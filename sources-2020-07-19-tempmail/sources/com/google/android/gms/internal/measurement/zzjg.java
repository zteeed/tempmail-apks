package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzjg implements zzjh {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9679a;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9679a = zzdb.d("measurement.androidId.delete_feature", true);
        zzdb.d("measurement.log_androidId_enabled", false);
    }

    public final boolean a() {
        return f9679a.n().booleanValue();
    }
}
