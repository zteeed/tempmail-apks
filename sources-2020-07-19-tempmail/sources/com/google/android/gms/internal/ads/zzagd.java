package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzagd extends zzaes {

    /* renamed from: b  reason: collision with root package name */
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener f5684b;

    public zzagd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f5684b = onAppInstallAdLoadedListener;
    }

    public final void O1(zzaeh zzaeh) {
        this.f5684b.onAppInstallAdLoaded(new zzaei(zzaeh));
    }
}
