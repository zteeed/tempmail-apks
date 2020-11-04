package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.instream.InstreamAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzajd extends zzaiz {

    /* renamed from: b  reason: collision with root package name */
    private final InstreamAd.InstreamAdLoadCallback f5927b;

    public zzajd(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        this.f5927b = instreamAdLoadCallback;
    }

    public final void e4(zzaiq zzaiq) {
        this.f5927b.onInstreamAdLoaded(new zzajb(zzaiq));
    }

    public final void r6(int i) {
        this.f5927b.onInstreamAdFailedToLoad(i);
    }
}
