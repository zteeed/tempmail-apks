package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzagh extends zzafl {

    /* renamed from: b  reason: collision with root package name */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f5870b;

    public zzagh(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f5870b = onUnifiedNativeAdLoadedListener;
    }

    public final void E0(zzaft zzaft) {
        this.f5870b.onUnifiedNativeAdLoaded(new zzafu(zzaft));
    }
}
