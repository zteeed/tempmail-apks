package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzvb extends zzxc {

    /* renamed from: b  reason: collision with root package name */
    private final AdMetadataListener f9176b;

    public zzvb(AdMetadataListener adMetadataListener) {
        this.f9176b = adMetadataListener;
    }

    public final void onAdMetadataChanged() {
        AdMetadataListener adMetadataListener = this.f9176b;
        if (adMetadataListener != null) {
            adMetadataListener.onAdMetadataChanged();
        }
    }
}
