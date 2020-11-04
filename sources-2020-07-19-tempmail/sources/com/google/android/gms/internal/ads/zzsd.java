package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsd extends zzsj {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<AppOpenAd.AppOpenAdLoadCallback> f9085b;

    public zzsd(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f9085b = new WeakReference<>(appOpenAdLoadCallback);
    }

    public final void m4(int i) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = (AppOpenAd.AppOpenAdLoadCallback) this.f9085b.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }

    public final void x5(zzsf zzsf) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = (AppOpenAd.AppOpenAdLoadCallback) this.f9085b.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(new zzsm(zzsf));
        }
    }
}
