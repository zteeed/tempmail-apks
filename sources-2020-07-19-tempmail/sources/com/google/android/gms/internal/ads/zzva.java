package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzva extends zzwm {

    /* renamed from: b  reason: collision with root package name */
    private final AdListener f9175b;

    public zzva(AdListener adListener) {
        this.f9175b = adListener;
    }

    public final void e2(zzuy zzuy) {
        new AdError(zzuy.f9172b, zzuy.f9173c, zzuy.f9174d);
    }

    public final void onAdClicked() {
        this.f9175b.onAdClicked();
    }

    public final void onAdClosed() {
        this.f9175b.onAdClosed();
    }

    public final void onAdFailedToLoad(int i) {
        this.f9175b.onAdFailedToLoad(i);
    }

    public final void onAdImpression() {
        this.f9175b.onAdImpression();
    }

    public final void onAdLeftApplication() {
        this.f9175b.onAdLeftApplication();
    }

    public final void onAdLoaded() {
        this.f9175b.onAdLoaded();
    }

    public final void onAdOpened() {
        this.f9175b.onAdOpened();
    }

    public final AdListener z6() {
        return this.f9175b;
    }
}
