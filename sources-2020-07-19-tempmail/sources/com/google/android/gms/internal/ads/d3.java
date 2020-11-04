package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d3 implements zzo {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzapn f3595b;

    d3(zzapn zzapn) {
        this.f3595b = zzapn;
    }

    public final void onPause() {
        zzbba.f("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        zzbba.f("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzud() {
        zzbba.f("AdMobCustomTabsAdapter overlay is closed.");
        this.f3595b.f5834b.onAdClosed(this.f3595b);
    }

    public final void zzue() {
        zzbba.f("Opening AdMobCustomTabsAdapter overlay.");
        this.f3595b.f5834b.onAdOpened(this.f3595b);
    }
}
