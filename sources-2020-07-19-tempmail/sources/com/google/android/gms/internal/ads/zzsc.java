package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsc extends zzsk {

    /* renamed from: b  reason: collision with root package name */
    private final AppOpenAdPresentationCallback f9084b;

    public zzsc(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        this.f9084b = appOpenAdPresentationCallback;
    }

    public final void x1() {
        this.f9084b.onAppOpenAdClosed();
    }
}
