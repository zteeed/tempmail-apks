package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzagd extends zzaes {

    /* renamed from: b  reason: collision with root package name */
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener f5867b;

    public zzagd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f5867b = onAppInstallAdLoadedListener;
    }

    public final void X1(zzaeh zzaeh) {
        this.f5867b.onAppInstallAdLoaded(new zzaei(zzaeh));
    }
}
