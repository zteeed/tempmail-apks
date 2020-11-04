package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class zzb implements RewardedVideoAdListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractAdViewAdapter f2634a;

    zzb(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f2634a = abstractAdViewAdapter;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.f2634a.zzmn.onRewarded(this.f2634a, rewardItem);
    }

    public final void onRewardedVideoAdClosed() {
        this.f2634a.zzmn.onAdClosed(this.f2634a);
        InterstitialAd unused = this.f2634a.zzmm = null;
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.f2634a.zzmn.onAdFailedToLoad(this.f2634a, i);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.f2634a.zzmn.onAdLeftApplication(this.f2634a);
    }

    public final void onRewardedVideoAdLoaded() {
        this.f2634a.zzmn.onAdLoaded(this.f2634a);
    }

    public final void onRewardedVideoAdOpened() {
        this.f2634a.zzmn.onAdOpened(this.f2634a);
    }

    public final void onRewardedVideoCompleted() {
        this.f2634a.zzmn.onVideoCompleted(this.f2634a);
    }

    public final void onRewardedVideoStarted() {
        this.f2634a.zzmn.onVideoStarted(this.f2634a);
    }
}
