package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbtc extends zzbwv<zzbtd> {

    /* renamed from: c  reason: collision with root package name */
    private boolean f6633c = false;

    public zzbtc(Set<zzbyg<zzbtd>> set) {
        super(set);
    }

    public final synchronized void onAdImpression() {
        if (!this.f6633c) {
            k0(ld.f4298a);
            this.f6633c = true;
        }
    }
}
