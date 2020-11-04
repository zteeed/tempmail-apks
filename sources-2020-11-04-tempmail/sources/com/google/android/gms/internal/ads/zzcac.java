package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcac implements zzo {

    /* renamed from: b  reason: collision with root package name */
    private final zzbui f6919b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbyc f6920c;

    public zzcac(zzbui zzbui, zzbyc zzbyc) {
        this.f6919b = zzbui;
        this.f6920c = zzbyc;
    }

    public final void onPause() {
        this.f6919b.onPause();
    }

    public final void onResume() {
        this.f6919b.onResume();
    }

    public final void zzud() {
        this.f6919b.zzud();
        this.f6920c.C0();
    }

    public final void zzue() {
        this.f6919b.zzue();
        this.f6920c.D0();
    }
}
