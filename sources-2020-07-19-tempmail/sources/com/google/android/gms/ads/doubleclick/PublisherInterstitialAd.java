package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzyu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class PublisherInterstitialAd {
    private final zzyu zzadd;

    public PublisherInterstitialAd(Context context) {
        this.zzadd = new zzyu(context, this);
        Preconditions.l(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzadd.a();
    }

    public final String getAdUnitId() {
        return this.zzadd.c();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzadd.d();
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzadd.e();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzadd.f();
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

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzadd.t(publisherAdRequest.zzdq());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzadd.j(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzadd.l(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzadd.m(appEventListener);
    }

    @KeepForSdk
    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public final void setImmersiveMode(boolean z) {
        this.zzadd.n(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzadd.o(onCustomRenderedAdLoadedListener);
    }

    public final void show() {
        this.zzadd.r();
    }
}
