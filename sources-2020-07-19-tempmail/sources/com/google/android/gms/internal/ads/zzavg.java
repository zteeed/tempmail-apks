package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzavg extends zzaup {

    /* renamed from: b  reason: collision with root package name */
    private final RewardedInterstitialAdLoadCallback f5983b;

    /* renamed from: c  reason: collision with root package name */
    private final zzavf f5984c;

    public zzavg(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzavf zzavf) {
        this.f5983b = rewardedInterstitialAdLoadCallback;
        this.f5984c = zzavf;
    }

    public final void A4(int i) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f5983b;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdFailedToLoad(i);
        }
    }

    public final void J0() {
        zzavf zzavf;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f5983b;
        if (rewardedInterstitialAdLoadCallback != null && (zzavf = this.f5984c) != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdLoaded(zzavf);
        }
    }
}
