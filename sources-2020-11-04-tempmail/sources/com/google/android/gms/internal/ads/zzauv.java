package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauv extends zzaum {

    /* renamed from: b  reason: collision with root package name */
    private final RewardedAdCallback f6149b;

    public zzauv(RewardedAdCallback rewardedAdCallback) {
        this.f6149b = rewardedAdCallback;
    }

    public final void E1() {
        RewardedAdCallback rewardedAdCallback = this.f6149b;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    public final void S0() {
        RewardedAdCallback rewardedAdCallback = this.f6149b;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    public final void U(zzaud zzaud) {
        RewardedAdCallback rewardedAdCallback = this.f6149b;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzauw(zzaud));
        }
    }

    public final void X4(zzuy zzuy) {
    }

    public final void v6(int i) {
        RewardedAdCallback rewardedAdCallback = this.f6149b;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i);
        }
    }
}
