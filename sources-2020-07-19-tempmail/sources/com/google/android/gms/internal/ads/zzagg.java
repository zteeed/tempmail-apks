package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzagg extends zzafr {

    /* renamed from: b  reason: collision with root package name */
    private final UnifiedNativeAd.UnconfirmedClickListener f5686b;

    public zzagg(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f5686b = unconfirmedClickListener;
    }

    public final void onUnconfirmedClickCancelled() {
        this.f5686b.onUnconfirmedClickCancelled();
    }

    public final void onUnconfirmedClickReceived(String str) {
        this.f5686b.onUnconfirmedClickReceived(str);
    }
}
