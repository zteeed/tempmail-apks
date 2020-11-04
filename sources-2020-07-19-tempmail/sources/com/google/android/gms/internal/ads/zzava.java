package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzava extends zzaup {

    /* renamed from: b  reason: collision with root package name */
    private final RewardedAdLoadCallback f5974b;

    public zzava(RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.f5974b = rewardedAdLoadCallback;
    }

    public final void A4(int i) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f5974b;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(i);
        }
    }

    public final void J0() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f5974b;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
        }
    }
}
