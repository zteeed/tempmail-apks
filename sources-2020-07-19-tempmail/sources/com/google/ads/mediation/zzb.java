package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class zzb implements RewardedVideoAdListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractAdViewAdapter f2446a;

    zzb(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f2446a = abstractAdViewAdapter;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.f2446a.zzmn.onRewarded(this.f2446a, rewardItem);
    }

    public final void onRewardedVideoAdClosed() {
        this.f2446a.zzmn.onAdClosed(this.f2446a);
        InterstitialAd unused = this.f2446a.zzmm = null;
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.f2446a.zzmn.onAdFailedToLoad(this.f2446a, i);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.f2446a.zzmn.onAdLeftApplication(this.f2446a);
    }

    public final void onRewardedVideoAdLoaded() {
        this.f2446a.zzmn.onAdLoaded(this.f2446a);
    }

    public final void onRewardedVideoAdOpened() {
        this.f2446a.zzmn.onAdOpened(this.f2446a);
    }

    public final void onRewardedVideoCompleted() {
        this.f2446a.zzmn.onVideoCompleted(this.f2446a);
    }

    public final void onRewardedVideoStarted() {
        this.f2446a.zzmn.onVideoStarted(this.f2446a);
    }
}
