package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccj {

    /* renamed from: a  reason: collision with root package name */
    private zzado f7013a;

    public zzccj(zzccb zzccb) {
        this.f7013a = zzccb;
    }

    public final synchronized void a(zzado zzado) {
        this.f7013a = zzado;
    }

    public final synchronized zzado b() {
        return this.f7013a;
    }
}
