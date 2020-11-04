package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcac implements zzo {

    /* renamed from: b  reason: collision with root package name */
    private final zzbui f6736b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbyc f6737c;

    public zzcac(zzbui zzbui, zzbyc zzbyc) {
        this.f6736b = zzbui;
        this.f6737c = zzbyc;
    }

    public final void onPause() {
        this.f6736b.onPause();
    }

    public final void onResume() {
        this.f6736b.onResume();
    }

    public final void zzud() {
        this.f6736b.zzud();
        this.f6737c.C0();
    }

    public final void zzue() {
        this.f6736b.zzue();
        this.f6737c.D0();
    }
}
