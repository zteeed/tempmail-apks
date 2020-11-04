package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzant extends zzane {

    /* renamed from: b  reason: collision with root package name */
    private final NativeContentAdMapper f5821b;

    public zzant(NativeContentAdMapper nativeContentAdMapper) {
        this.f5821b = nativeContentAdMapper;
    }

    public final void A(IObjectWrapper iObjectWrapper) {
        this.f5821b.handleClick((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final boolean D() {
        return this.f5821b.getOverrideClickHandling();
    }

    public final void K(IObjectWrapper iObjectWrapper) {
        this.f5821b.trackView((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final String d() {
        return this.f5821b.getHeadline();
    }

    public final IObjectWrapper e() {
        return null;
    }

    public final zzadl f() {
        return null;
    }

    public final Bundle getExtras() {
        return this.f5821b.getExtras();
    }

    public final zzyi getVideoController() {
        if (this.f5821b.getVideoController() != null) {
            return this.f5821b.getVideoController().zzdu();
        }
        return null;
    }

    public final String h() {
        return this.f5821b.getCallToAction();
    }

    public final zzadt h0() {
        NativeAd.Image logo = this.f5821b.getLogo();
        if (logo != null) {
            return new zzadf(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    public final String i() {
        return this.f5821b.getBody();
    }

    public final List j() {
        List<NativeAd.Image> images = this.f5821b.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image next : images) {
            arrayList.add(new zzadf(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
        }
        return arrayList;
    }

    public final String o() {
        return this.f5821b.getAdvertiser();
    }

    public final void r(IObjectWrapper iObjectWrapper) {
        this.f5821b.untrackView((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final void recordImpression() {
        this.f5821b.recordImpression();
    }

    public final boolean t() {
        return this.f5821b.getOverrideImpressionRecording();
    }

    public final void u(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f5821b.trackViews((View) ObjectWrapper.P(iObjectWrapper), (HashMap) ObjectWrapper.P(iObjectWrapper2), (HashMap) ObjectWrapper.P(iObjectWrapper3));
    }

    public final IObjectWrapper v() {
        View zzacy = this.f5821b.zzacy();
        if (zzacy == null) {
            return null;
        }
        return ObjectWrapper.b0(zzacy);
    }

    public final IObjectWrapper w() {
        View adChoicesContent = this.f5821b.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.b0(adChoicesContent);
    }
}
