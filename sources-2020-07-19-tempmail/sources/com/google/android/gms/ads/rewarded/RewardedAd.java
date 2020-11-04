package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaut;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class RewardedAd {
    private final zzaut zzhhh;

    public RewardedAd(Context context, String str) {
        Preconditions.l(context, "context cannot be null");
        Preconditions.l(str, "adUnitID cannot be null");
        this.zzhhh = new zzaut(context, str);
    }

    public final Bundle getAdMetadata() {
        return this.zzhhh.a();
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzhhh.b();
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzhhh.c();
    }

    public final RewardItem getRewardItem() {
        return this.zzhhh.d();
    }

    public final boolean isLoaded() {
        return this.zzhhh.e();
    }

    public final void loadAd(AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzhhh.k(adRequest.zzdq(), rewardedAdLoadCallback);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzhhh.f(onAdMetadataChangedListener);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzhhh.g(onPaidEventListener);
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.zzhhh.h(serverSideVerificationOptions);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        this.zzhhh.i(activity, rewardedAdCallback);
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzhhh.k(publisherAdRequest.zzdq(), rewardedAdLoadCallback);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        this.zzhhh.j(activity, rewardedAdCallback, z);
    }
}
