package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbos implements zzbua, zzqs {

    /* renamed from: b  reason: collision with root package name */
    private final zzdkk f6467b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbtc f6468c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbue f6469d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f6470e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f6471f = new AtomicBoolean();

    public zzbos(zzdkk zzdkk, zzbtc zzbtc, zzbue zzbue) {
        this.f6467b = zzdkk;
        this.f6468c = zzbtc;
        this.f6469d = zzbue;
    }

    private final void f() {
        if (this.f6470e.compareAndSet(false, true)) {
            this.f6468c.onAdImpression();
        }
    }

    public final void R(zzqt zzqt) {
        if (this.f6467b.f8135e == 1 && zzqt.j) {
            f();
        }
        if (zzqt.j && this.f6471f.compareAndSet(false, true)) {
            this.f6469d.U0();
        }
    }

    public final synchronized void onAdLoaded() {
        if (this.f6467b.f8135e != 1) {
            f();
        }
    }
}
