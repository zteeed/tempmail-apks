package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzva extends zzwm {

    /* renamed from: b  reason: collision with root package name */
    private final AdListener f9358b;

    public zzva(AdListener adListener) {
        this.f9358b = adListener;
    }

    public final AdListener e7() {
        return this.f9358b;
    }

    public final void o2(zzuy zzuy) {
        new AdError(zzuy.f9355b, zzuy.f9356c, zzuy.f9357d);
    }

    public final void onAdClicked() {
        this.f9358b.onAdClicked();
    }

    public final void onAdClosed() {
        this.f9358b.onAdClosed();
    }

    public final void onAdFailedToLoad(int i) {
        this.f9358b.onAdFailedToLoad(i);
    }

    public final void onAdImpression() {
        this.f9358b.onAdImpression();
    }

    public final void onAdLeftApplication() {
        this.f9358b.onAdLeftApplication();
    }

    public final void onAdLoaded() {
        this.f9358b.onAdLoaded();
    }

    public final void onAdOpened() {
        this.f9358b.onAdOpened();
    }
}
