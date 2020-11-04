package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbos implements zzbua, zzqs {

    /* renamed from: b  reason: collision with root package name */
    private final zzdkk f6650b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbtc f6651c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbue f6652d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f6653e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f6654f = new AtomicBoolean();

    public zzbos(zzdkk zzdkk, zzbtc zzbtc, zzbue zzbue) {
        this.f6650b = zzdkk;
        this.f6651c = zzbtc;
        this.f6652d = zzbue;
    }

    private final void f() {
        if (this.f6653e.compareAndSet(false, true)) {
            this.f6651c.onAdImpression();
        }
    }

    public final void R(zzqt zzqt) {
        if (this.f6650b.f8318e == 1 && zzqt.j) {
            f();
        }
        if (zzqt.j && this.f6654f.compareAndSet(false, true)) {
            this.f6652d.a1();
        }
    }

    public final synchronized void onAdLoaded() {
        if (this.f6650b.f8318e != 1) {
            f();
        }
    }
}
