package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzys;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class AdView extends BaseAdView {
    public AdView(Context context) {
        super(context, 0);
        Preconditions.l(context, "Context cannot be null");
    }

    public final /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    public final /* bridge */ /* synthetic */ AdListener getAdListener() {
        return super.getAdListener();
    }

    public final /* bridge */ /* synthetic */ AdSize getAdSize() {
        return super.getAdSize();
    }

    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public final /* bridge */ /* synthetic */ ResponseInfo getResponseInfo() {
        return super.getResponseInfo();
    }

    public final VideoController getVideoController() {
        zzys zzys = this.zzadc;
        if (zzys != null) {
            return zzys.j();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean isLoading() {
        return super.isLoading();
    }

    public final /* bridge */ /* synthetic */ void loadAd(AdRequest adRequest) {
        super.loadAd(adRequest);
    }

    public final /* bridge */ /* synthetic */ void pause() {
        super.pause();
    }

    public final /* bridge */ /* synthetic */ void resume() {
        super.resume();
    }

    public final /* bridge */ /* synthetic */ void setAdListener(AdListener adListener) {
        super.setAdListener(adListener);
    }

    public final /* bridge */ /* synthetic */ void setAdSize(AdSize adSize) {
        super.setAdSize(adSize);
    }

    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    public final /* bridge */ /* synthetic */ void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        super.setOnPaidEventListener(onPaidEventListener);
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
