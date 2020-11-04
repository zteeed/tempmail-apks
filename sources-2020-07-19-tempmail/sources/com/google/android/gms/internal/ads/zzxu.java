package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzxu extends zzxs {

    /* renamed from: b  reason: collision with root package name */
    private final MuteThisAdListener f9221b;

    public zzxu(MuteThisAdListener muteThisAdListener) {
        this.f9221b = muteThisAdListener;
    }

    public final void onAdMuted() {
        this.f9221b.onAdMuted();
    }
}
