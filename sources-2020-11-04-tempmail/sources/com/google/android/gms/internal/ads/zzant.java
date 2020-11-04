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
    private final NativeContentAdMapper f6004b;

    public zzant(NativeContentAdMapper nativeContentAdMapper) {
        this.f6004b = nativeContentAdMapper;
    }

    public final void D(IObjectWrapper iObjectWrapper) {
        this.f6004b.handleClick((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final boolean G() {
        return this.f6004b.getOverrideClickHandling();
    }

    public final void O(IObjectWrapper iObjectWrapper) {
        this.f6004b.trackView((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final String e() {
        return this.f6004b.getHeadline();
    }

    public final IObjectWrapper f() {
        return null;
    }

    public final zzadl g() {
        return null;
    }

    public final Bundle getExtras() {
        return this.f6004b.getExtras();
    }

    public final zzyi getVideoController() {
        if (this.f6004b.getVideoController() != null) {
            return this.f6004b.getVideoController().zzdu();
        }
        return null;
    }

    public final String i() {
        return this.f6004b.getCallToAction();
    }

    public final String j() {
        return this.f6004b.getBody();
    }

    public final List k() {
        List<NativeAd.Image> images = this.f6004b.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image next : images) {
            arrayList.add(new zzadf(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
        }
        return arrayList;
    }

    public final zzadt n0() {
        NativeAd.Image logo = this.f6004b.getLogo();
        if (logo != null) {
            return new zzadf(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    public final String q() {
        return this.f6004b.getAdvertiser();
    }

    public final void recordImpression() {
        this.f6004b.recordImpression();
    }

    public final void t(IObjectWrapper iObjectWrapper) {
        this.f6004b.untrackView((View) ObjectWrapper.V(iObjectWrapper));
    }

    public final boolean v() {
        return this.f6004b.getOverrideImpressionRecording();
    }

    public final void w(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f6004b.trackViews((View) ObjectWrapper.V(iObjectWrapper), (HashMap) ObjectWrapper.V(iObjectWrapper2), (HashMap) ObjectWrapper.V(iObjectWrapper3));
    }

    public final IObjectWrapper x() {
        View zzacy = this.f6004b.zzacy();
        if (zzacy == null) {
            return null;
        }
        return ObjectWrapper.h0(zzacy);
    }

    public final IObjectWrapper z() {
        View adChoicesContent = this.f6004b.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.h0(adChoicesContent);
    }
}
