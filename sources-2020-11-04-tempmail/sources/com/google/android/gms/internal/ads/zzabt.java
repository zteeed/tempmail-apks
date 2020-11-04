package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzabt extends zzabr {

    /* renamed from: b  reason: collision with root package name */
    private final OnCustomRenderedAdLoadedListener f5746b;

    public zzabt(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f5746b = onCustomRenderedAdLoadedListener;
    }

    public final void u2(zzabn zzabn) {
        this.f5746b.onCustomRenderedAdLoaded(new zzabk(zzabn));
    }
}
