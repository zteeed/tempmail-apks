package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzavg extends zzaup {

    /* renamed from: b  reason: collision with root package name */
    private final RewardedInterstitialAdLoadCallback f6166b;

    /* renamed from: c  reason: collision with root package name */
    private final zzavf f6167c;

    public zzavg(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzavf zzavf) {
        this.f6166b = rewardedInterstitialAdLoadCallback;
        this.f6167c = zzavf;
    }

    public final void Q0() {
        zzavf zzavf;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f6166b;
        if (rewardedInterstitialAdLoadCallback != null && (zzavf = this.f6167c) != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdLoaded(zzavf);
        }
    }

    public final void U4(int i) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f6166b;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdFailedToLoad(i);
        }
    }
}
