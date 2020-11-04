package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqk implements zzbsl, zzbtd, zzbua, zzbva, zzuu {

    /* renamed from: b  reason: collision with root package name */
    private final Clock f6525b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaxg f6526c;

    public zzbqk(Clock clock, zzaxg zzaxg) {
        this.f6525b = clock;
        this.f6526c = zzaxg;
    }

    public final void B(zzdkw zzdkw) {
        this.f6526c.e(this.f6525b.b());
    }

    public final void C(zzasm zzasm) {
    }

    public final void a(zzve zzve) {
        this.f6526c.d(zzve);
    }

    public final String b() {
        return this.f6526c.i();
    }

    public final void d(zzatg zzatg, String str, String str2) {
    }

    public final void onAdClicked() {
        this.f6526c.g();
    }

    public final void onAdClosed() {
        this.f6526c.h();
    }

    public final void onAdImpression() {
        this.f6526c.f();
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdLoaded() {
        this.f6526c.c(true);
    }

    public final void onAdOpened() {
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }
}
