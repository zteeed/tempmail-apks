package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzv extends zzyb {

    /* renamed from: b  reason: collision with root package name */
    private final OnPaidEventListener f9275b;

    public zzzv(OnPaidEventListener onPaidEventListener) {
        this.f9275b = onPaidEventListener;
    }

    public final void V2(zzvj zzvj) {
        if (this.f9275b != null) {
            this.f9275b.onPaidEvent(AdValue.zza(zzvj.f9195c, zzvj.f9196d, zzvj.f9197e));
        }
    }
}
