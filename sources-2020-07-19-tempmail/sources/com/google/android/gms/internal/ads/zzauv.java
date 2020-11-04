package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauv extends zzaum {

    /* renamed from: b  reason: collision with root package name */
    private final RewardedAdCallback f5966b;

    public zzauv(RewardedAdCallback rewardedAdCallback) {
        this.f5966b = rewardedAdCallback;
    }

    public final void D4(zzuy zzuy) {
    }

    public final void L0() {
        RewardedAdCallback rewardedAdCallback = this.f5966b;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    public final void O(zzaud zzaud) {
        RewardedAdCallback rewardedAdCallback = this.f5966b;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzauw(zzaud));
        }
    }

    public final void V5(int i) {
        RewardedAdCallback rewardedAdCallback = this.f5966b;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i);
        }
    }

    public final void v1() {
        RewardedAdCallback rewardedAdCallback = this.f5966b;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }
}
