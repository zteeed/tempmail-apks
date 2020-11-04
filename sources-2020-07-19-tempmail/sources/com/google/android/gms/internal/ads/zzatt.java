package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatt extends zzatp {

    /* renamed from: b  reason: collision with root package name */
    private RewardedVideoAdListener f5949b;

    public zzatt(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f5949b = rewardedVideoAdListener;
    }

    public final RewardedVideoAdListener A6() {
        return this.f5949b;
    }

    public final void B6(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f5949b = rewardedVideoAdListener;
    }

    public final void H4(zzatg zzatg) {
        RewardedVideoAdListener rewardedVideoAdListener = this.f5949b;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewarded(new zzatr(zzatg));
        }
    }

    public final void onRewardedVideoAdClosed() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f5949b;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdClosed();
        }
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        RewardedVideoAdListener rewardedVideoAdListener = this.f5949b;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public final void onRewardedVideoAdLeftApplication() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f5949b;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLeftApplication();
        }
    }

    public final void onRewardedVideoAdLoaded() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f5949b;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLoaded();
        }
    }

    public final void onRewardedVideoAdOpened() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f5949b;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdOpened();
        }
    }

    public final void onRewardedVideoCompleted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f5949b;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoCompleted();
        }
    }

    public final void onRewardedVideoStarted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f5949b;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoStarted();
        }
    }
}
