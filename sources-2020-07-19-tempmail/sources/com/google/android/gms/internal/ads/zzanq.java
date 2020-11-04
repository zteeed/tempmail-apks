package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzanq extends zzand {

    /* renamed from: b  reason: collision with root package name */
    private final NativeAppInstallAdMapper f5812b;

    public zzanq(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f5812b = nativeAppInstallAdMapper;
    }

    public final void A(IObjectWrapper iObjectWrapper) {
        this.f5812b.handleClick((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final boolean D() {
        return this.f5812b.getOverrideClickHandling();
    }

    public final void K(IObjectWrapper iObjectWrapper) {
        this.f5812b.trackView((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final String d() {
        return this.f5812b.getHeadline();
    }

    public final IObjectWrapper e() {
        return null;
    }

    public final zzadl f() {
        return null;
    }

    public final Bundle getExtras() {
        return this.f5812b.getExtras();
    }

    public final zzyi getVideoController() {
        if (this.f5812b.getVideoController() != null) {
            return this.f5812b.getVideoController().zzdu();
        }
        return null;
    }

    public final String h() {
        return this.f5812b.getCallToAction();
    }

    public final String i() {
        return this.f5812b.getBody();
    }

    public final List j() {
        List<NativeAd.Image> images = this.f5812b.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image next : images) {
            arrayList.add(new zzadf(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
        }
        return arrayList;
    }

    public final zzadt k() {
        NativeAd.Image icon = this.f5812b.getIcon();
        if (icon != null) {
            return new zzadf(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    public final String l() {
        return this.f5812b.getPrice();
    }

    public final double n() {
        return this.f5812b.getStarRating();
    }

    public final String p() {
        return this.f5812b.getStore();
    }

    public final void r(IObjectWrapper iObjectWrapper) {
        this.f5812b.untrackView((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final void recordImpression() {
        this.f5812b.recordImpression();
    }

    public final boolean t() {
        return this.f5812b.getOverrideImpressionRecording();
    }

    public final void u(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f5812b.trackViews((View) ObjectWrapper.P(iObjectWrapper), (HashMap) ObjectWrapper.P(iObjectWrapper2), (HashMap) ObjectWrapper.P(iObjectWrapper3));
    }

    public final IObjectWrapper v() {
        View zzacy = this.f5812b.zzacy();
        if (zzacy == null) {
            return null;
        }
        return ObjectWrapper.b0(zzacy);
    }

    public final IObjectWrapper w() {
        View adChoicesContent = this.f5812b.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.b0(adChoicesContent);
    }
}
