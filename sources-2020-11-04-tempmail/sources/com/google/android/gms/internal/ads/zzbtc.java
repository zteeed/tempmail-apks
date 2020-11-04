package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbtc extends zzbwv<zzbtd> {

    /* renamed from: c  reason: collision with root package name */
    private boolean f6816c = false;

    public zzbtc(Set<zzbyg<zzbtd>> set) {
        super(set);
    }

    public final synchronized void onAdImpression() {
        if (!this.f6816c) {
            k0(ld.f4481a);
            this.f6816c = true;
        }
    }
}
