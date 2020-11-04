package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzagh extends zzafl {

    /* renamed from: b  reason: collision with root package name */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f5687b;

    public zzagh(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f5687b = onUnifiedNativeAdLoadedListener;
    }

    public final void y0(zzaft zzaft) {
        this.f5687b.onUnifiedNativeAdLoaded(new zzafu(zzaft));
    }
}
