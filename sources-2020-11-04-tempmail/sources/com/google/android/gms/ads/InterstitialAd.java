package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzuu;
import com.google.android.gms.internal.ads.zzyu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class InterstitialAd {
    private final zzyu zzadd;

    public InterstitialAd(Context context) {
        this.zzadd = new zzyu(context);
        Preconditions.l(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzadd.a();
    }

    public final Bundle getAdMetadata() {
        return this.zzadd.b();
    }

    public final String getAdUnitId() {
        return this.zzadd.c();
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzadd.e();
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzadd.g();
    }

    public final boolean isLoaded() {
        return this.zzadd.h();
    }

    public final boolean isLoading() {
        return this.zzadd.i();
    }

    public final void loadAd(AdRequest adRequest) {
        this.zzadd.t(adRequest.zzdq());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzadd.j(adListener);
        if (adListener != null && (adListener instanceof zzuu)) {
            this.zzadd.s((zzuu) adListener);
        } else if (adListener == null) {
            this.zzadd.s((zzuu) null);
        }
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        this.zzadd.k(adMetadataListener);
    }

    public final void setAdUnitId(String str) {
        this.zzadd.l(str);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzadd.n(z);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzadd.p(onPaidEventListener);
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzadd.q(rewardedVideoAdListener);
    }

    public final void show() {
        this.zzadd.r();
    }

    public final void zzd(boolean z) {
        this.zzadd.v(true);
    }
}
