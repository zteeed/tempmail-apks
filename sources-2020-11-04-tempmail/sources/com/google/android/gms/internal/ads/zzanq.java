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
    private final NativeAppInstallAdMapper f5995b;

    public zzanq(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f5995b = nativeAppInstallAdMapper;
    }

    public final void D(IObjectWrapper iObjectWrapper) {
        this.f5995b.handleClick((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final boolean G() {
        return this.f5995b.getOverrideClickHandling();
    }

    public final void O(IObjectWrapper iObjectWrapper) {
        this.f5995b.trackView((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final String e() {
        return this.f5995b.getHeadline();
    }

    public final IObjectWrapper f() {
        return null;
    }

    public final zzadl g() {
        return null;
    }

    public final Bundle getExtras() {
        return this.f5995b.getExtras();
    }

    public final zzyi getVideoController() {
        if (this.f5995b.getVideoController() != null) {
            return this.f5995b.getVideoController().zzdu();
        }
        return null;
    }

    public final String i() {
        return this.f5995b.getCallToAction();
    }

    public final String j() {
        return this.f5995b.getBody();
    }

    public final List k() {
        List<NativeAd.Image> images = this.f5995b.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image next : images) {
            arrayList.add(new zzadf(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
        }
        return arrayList;
    }

    public final zzadt m() {
        NativeAd.Image icon = this.f5995b.getIcon();
        if (icon != null) {
            return new zzadf(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    public final String n() {
        return this.f5995b.getPrice();
    }

    public final double p() {
        return this.f5995b.getStarRating();
    }

    public final String r() {
        return this.f5995b.getStore();
    }

    public final void recordImpression() {
        this.f5995b.recordImpression();
    }

    public final void t(IObjectWrapper iObjectWrapper) {
        this.f5995b.untrackView((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final boolean v() {
        return this.f5995b.getOverrideImpressionRecording();
    }

    public final void w(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f5995b.trackViews((View) ObjectWrapper.V(iObjectWrapper), (HashMap) ObjectWrapper.V(iObjectWrapper2), (HashMap) ObjectWrapper.V(iObjectWrapper3));
    }

    public final IObjectWrapper x() {
        View zzacy = this.f5995b.zzacy();
        if (zzacy == null) {
            return null;
        }
        return ObjectWrapper.h0(zzacy);
    }

    public final IObjectWrapper z() {
        View adChoicesContent = this.f5995b.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.h0(adChoicesContent);
    }
}
