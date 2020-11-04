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
    private final UnifiedNativeAdMapper f6008b;

    public zzaoi(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f6008b = unifiedNativeAdMapper;
    }

    public final void D(IObjectWrapper iObjectWrapper) {
        this.f6008b.handleClick((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final boolean G() {
        return this.f6008b.getOverrideClickHandling();
    }

    public final float K1() {
        return this.f6008b.getCurrentTime();
    }

    public final float W0() {
        return this.f6008b.getMediaContentAspectRatio();
    }

    public final float c2() {
        return this.f6008b.getDuration();
    }

    public final String e() {
        return this.f6008b.getHeadline();
    }

    public final IObjectWrapper f() {
        Object zzjw = this.f6008b.zzjw();
        if (zzjw == null) {
            return null;
        }
        return ObjectWrapper.h0(zzjw);
    }

    public final zzadl g() {
        return null;
    }

    public final Bundle getExtras() {
        return this.f6008b.getExtras();
    }

    public final zzyi getVideoController() {
        if (this.f6008b.getVideoController() != null) {
            return this.f6008b.getVideoController().zzdu();
        }
        return null;
    }

    public final String i() {
        return this.f6008b.getCallToAction();
    }

    public final String j() {
        return this.f6008b.getBody();
    }

    public final List k() {
        List<NativeAd.Image> images = this.f6008b.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image next : images) {
                arrayList.add(new zzadf(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
            }
        }
        return arrayList;
    }

    public final zzadt m() {
        NativeAd.Image icon = this.f6008b.getIcon();
        if (icon != null) {
            return new zzadf(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    public final String n() {
        return this.f6008b.getPrice();
    }

    public final double p() {
        if (this.f6008b.getStarRating() != null) {
            return this.f6008b.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    public final String q() {
        return this.f6008b.getAdvertiser();
    }

    public final String r() {
        return this.f6008b.getStore();
    }

    public final void recordImpression() {
        this.f6008b.recordImpression();
    }

    public final void t(IObjectWrapper iObjectWrapper) {
        this.f6008b.untrackView((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final boolean v() {
        return this.f6008b.getOverrideImpressionRecording();
    }

    public final void w(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f6008b.trackViews((View) ObjectWrapper.V(iObjectWrapper), (HashMap) ObjectWrapper.V(iObjectWrapper2), (HashMap) ObjectWrapper.V(iObjectWrapper3));
    }

    public final IObjectWrapper x() {
        View zzacy = this.f6008b.zzacy();
        if (zzacy == null) {
            return null;
        }
        return ObjectWrapper.h0(zzacy);
    }

    public final IObjectWrapper z() {
        View adChoicesContent = this.f6008b.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.h0(adChoicesContent);
    }
}
