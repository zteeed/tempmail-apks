package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsc extends zzsk {

    /* renamed from: b  reason: collision with root package name */
    private final AppOpenAdPresentationCallback f9267b;

    public zzsc(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        this.f9267b = appOpenAdPresentationCallback;
    }

    public final void G1() {
        this.f9267b.onAppOpenAdClosed();
    }
}
