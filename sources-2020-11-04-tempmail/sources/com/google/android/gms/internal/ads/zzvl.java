package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzvl extends zzxd {

    /* renamed from: b  reason: collision with root package name */
    private final AppEventListener f9381b;

    public zzvl(AppEventListener appEventListener) {
        this.f9381b = appEventListener;
    }

    public final AppEventListener f7() {
        return this.f9381b;
    }

    public final void onAppEvent(String str, String str2) {
        this.f9381b.onAppEvent(str, str2);
    }
}
