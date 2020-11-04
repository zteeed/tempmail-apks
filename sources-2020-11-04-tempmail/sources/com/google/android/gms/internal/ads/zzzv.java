package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzv extends zzyb {

    /* renamed from: b  reason: collision with root package name */
    private final OnPaidEventListener f9458b;

    public zzzv(OnPaidEventListener onPaidEventListener) {
        this.f9458b = onPaidEventListener;
    }

    public final void h3(zzvj zzvj) {
        if (this.f9458b != null) {
            this.f9458b.onPaidEvent(AdValue.zza(zzvj.f9378c, zzvj.f9379d, zzvj.f9380e));
        }
    }
}
