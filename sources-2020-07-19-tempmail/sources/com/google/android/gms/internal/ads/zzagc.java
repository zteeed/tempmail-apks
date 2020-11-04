package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzagc extends zzaex {

    /* renamed from: b  reason: collision with root package name */
    private final NativeContentAd.OnContentAdLoadedListener f5683b;

    public zzagc(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f5683b = onContentAdLoadedListener;
    }

    public final void R4(zzael zzael) {
        this.f5683b.onContentAdLoaded(new zzaem(zzael));
    }
}
