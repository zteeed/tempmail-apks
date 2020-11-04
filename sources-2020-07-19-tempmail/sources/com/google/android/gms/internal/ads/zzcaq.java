package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcaq implements zzbsl {

    /* renamed from: b  reason: collision with root package name */
    private final zzbtc f6750b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdkk f6751c;

    public zzcaq(zzbtc zzbtc, zzdkk zzdkk) {
        this.f6750b = zzbtc;
        this.f6751c = zzdkk;
    }

    public final void d(zzatg zzatg, String str, String str2) {
    }

    public final void onAdClosed() {
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdOpened() {
        int i = this.f6751c.P;
        if (i == 0 || i == 1) {
            this.f6750b.onAdImpression();
        }
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }
}
