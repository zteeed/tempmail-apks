package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsd extends zzsj {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<AppOpenAd.AppOpenAdLoadCallback> f9268b;

    public zzsd(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f9268b = new WeakReference<>(appOpenAdLoadCallback);
    }

    public final void G4(int i) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = (AppOpenAd.AppOpenAdLoadCallback) this.f9268b.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }

    public final void V5(zzsf zzsf) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = (AppOpenAd.AppOpenAdLoadCallback) this.f9268b.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(new zzsm(zzsf));
        }
    }
}
