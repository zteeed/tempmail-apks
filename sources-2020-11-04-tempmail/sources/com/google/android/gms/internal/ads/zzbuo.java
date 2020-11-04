package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbuo extends zzbwv<zzbup> implements zzbtd, zzbuf {

    /* renamed from: c  reason: collision with root package name */
    private final zzdkk f6825c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f6826d = new AtomicBoolean();

    public zzbuo(Set<zzbyg<zzbup>> set, zzdkk zzdkk) {
        super(set);
        this.f6825c = zzdkk;
    }

    private final void D0() {
        zzvj zzvj;
        if (((Boolean) zzwg.e().c(zzaav.K3)).booleanValue() && this.f6826d.compareAndSet(false, true) && (zzvj = this.f6825c.X) != null && zzvj.f9377b == 3) {
            k0(new de(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void C0(zzbup zzbup) throws Exception {
        zzbup.a(this.f6825c.X);
    }

    public final void a1() {
        if (this.f6825c.f8315b == 1) {
            D0();
        }
    }

    public final void onAdImpression() {
        int i = this.f6825c.f8315b;
        if (i == 2 || i == 5 || i == 4) {
            D0();
        }
    }
}
