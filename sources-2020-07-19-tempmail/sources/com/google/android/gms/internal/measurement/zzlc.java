package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzlc implements zzld {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcv<Boolean> f9742a;

    static {
        zzdb zzdb = new zzdb(zzcw.a("com.google.android.gms.measurement"));
        f9742a = zzdb.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzdb.d("measurement.client.sessions.check_on_startup", true);
        zzdb.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return f9742a.n().booleanValue();
    }
}
