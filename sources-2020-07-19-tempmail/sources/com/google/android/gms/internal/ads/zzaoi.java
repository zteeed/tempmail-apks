package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaoi extends zzanj {

    /* renamed from: b  reason: collision with root package name */
    private final UnifiedNativeAdMapper f5825b;

    public zzaoi(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f5825b = unifiedNativeAdMapper;
    }

    public final void A(IObjectWrapper iObjectWrapper) {
        this.f5825b.handleClick((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final float B1() {
        return this.f5825b.getCurrentTime();
    }

    public final boolean D() {
        return this.f5825b.getOverrideClickHandling();
    }

    public final float P0() {
        return this.f5825b.getMediaContentAspectRatio();
    }

    public final float T1() {
        return this.f5825b.getDuration();
    }

    public final String d() {
        return this.f5825b.getHeadline();
    }

    public final IObjectWrapper e() {
        Object zzjw = this.f5825b.zzjw();
        if (zzjw == null) {
            return null;
        }
        return ObjectWrapper.b0(zzjw);
    }

    public final zzadl f() {
        return null;
    }

    public final Bundle getExtras() {
        return this.f5825b.getExtras();
    }

    public final zzyi getVideoController() {
        if (this.f5825b.getVideoController() != null) {
            return this.f5825b.getVideoController().zzdu();
        }
        return null;
    }

    public final String h() {
        return this.f5825b.getCallToAction();
    }

    public final String i() {
        return this.f5825b.getBody();
    }

    public final List j() {
        List<NativeAd.Image> images = this.f5825b.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image next : images) {
                arrayList.add(new zzadf(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
            }
        }
        return arrayList;
    }

    public final zzadt k() {
        NativeAd.Image icon = this.f5825b.getIcon();
        if (icon != null) {
            return new zzadf(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    public final String l() {
        return this.f5825b.getPrice();
    }

    public final double n() {
        if (this.f5825b.getStarRating() != null) {
            return this.f5825b.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    public final String o() {
        return this.f5825b.getAdvertiser();
    }

    public final String p() {
        return this.f5825b.getStore();
    }

    public final void r(IObjectWrapper iObjectWrapper) {
        this.f5825b.untrackView((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final void recordImpression() {
        this.f5825b.recordImpression();
    }

    public final boolean t() {
        return this.f5825b.getOverrideImpressionRecording();
    }

    public final void u(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f5825b.trackViews((View) ObjectWrapper.P(iObjectWrapper), (HashMap) ObjectWrapper.P(iObjectWrapper2), (HashMap) ObjectWrapper.P(iObjectWrapper3));
    }

    public final IObjectWrapper v() {
        View zzacy = this.f5825b.zzacy();
        if (zzacy == null) {
            return null;
        }
        return ObjectWrapper.b0(zzacy);
    }

    public final IObjectWrapper w() {
        View adChoicesContent = this.f5825b.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.b0(adChoicesContent);
    }
}
