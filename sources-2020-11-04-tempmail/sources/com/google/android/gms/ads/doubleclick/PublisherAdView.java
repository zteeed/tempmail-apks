package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzww;
import com.google.android.gms.internal.ads.zzys;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class PublisherAdView extends ViewGroup {
    private final zzys zzadt;

    public PublisherAdView(Context context) {
        super(context);
        this.zzadt = new zzys(this);
    }

    public final void destroy() {
        this.zzadt.a();
    }

    public final AdListener getAdListener() {
        return this.zzadt.b();
    }

    public final AdSize getAdSize() {
        return this.zzadt.c();
    }

    public final AdSize[] getAdSizes() {
        return this.zzadt.d();
    }

    public final String getAdUnitId() {
        return this.zzadt.e();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzadt.f();
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzadt.g();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzadt.h();
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzadt.i();
    }

    public final VideoController getVideoController() {
        return this.zzadt.j();
    }

    public final VideoOptions getVideoOptions() {
        return this.zzadt.k();
    }

    public final boolean isLoading() {
        return this.zzadt.l();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzadt.A(publisherAdRequest.zzdq());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e2) {
                zzbba.c("Unable to retrieve ad size.", e2);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void pause() {
        this.zzadt.m();
    }

    public final void recordManualImpression() {
        this.zzadt.n();
    }

    public final void resume() {
        this.zzadt.o();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzadt.p(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zzadt.B(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.zzadt.r(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzadt.s(appEventListener);
    }

    @KeepForSdk
    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzadt.t(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzadt.u(onCustomRenderedAdLoadedListener);
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzadt.w(videoOptions);
    }

    public final boolean zza(zzww zzww) {
        return this.zzadt.C(zzww);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzadt = new zzys(this, attributeSet, true);
        Preconditions.l(context, "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzadt = new zzys(this, attributeSet, true);
    }
}
