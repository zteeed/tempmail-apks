package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zn implements zzduu<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcrw f5482a;

    zn(zzcrw zzcrw) {
        this.f5482a = zzcrw;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        this.f5482a.f7427d.onAdFailedToLoad(b2.f9172b);
        zzdlj.a(b2.f9172b, th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbnc) obj).b();
    }
}