package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzabt extends zzabr {

    /* renamed from: b  reason: collision with root package name */
    private final OnCustomRenderedAdLoadedListener f5563b;

    public zzabt(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f5563b = onCustomRenderedAdLoadedListener;
    }

    public final void k2(zzabn zzabn) {
        this.f5563b.onCustomRenderedAdLoaded(new zzabk(zzabn));
    }
}
