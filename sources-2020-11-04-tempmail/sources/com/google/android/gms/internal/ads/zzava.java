package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzava extends zzaup {

    /* renamed from: b  reason: collision with root package name */
    private final RewardedAdLoadCallback f6157b;

    public zzava(RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.f6157b = rewardedAdLoadCallback;
    }

    public final void Q0() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f6157b;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
        }
    }

    public final void U4(int i) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f6157b;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(i);
        }
    }
}
