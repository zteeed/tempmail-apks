package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccj {

    /* renamed from: a  reason: collision with root package name */
    private zzado f6830a;

    public zzccj(zzccb zzccb) {
        this.f6830a = zzccb;
    }

    public final synchronized void a(zzado zzado) {
        this.f6830a = zzado;
    }

    public final synchronized zzado b() {
        return this.f6830a;
    }
}
