package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbll implements zzbsq {

    /* renamed from: b  reason: collision with root package name */
    private final zzdkm f6506b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdkw f6507c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdpd f6508d;

    public zzbll(zzdkw zzdkw, zzdpd zzdpd) {
        this.f6507c = zzdkw;
        this.f6508d = zzdpd;
        this.f6506b = zzdkw.f8345b.f8340b;
    }

    public final void onAdFailedToLoad(int i) {
        this.f6508d.a(this.f6507c, (zzdkk) null, this.f6506b.f8320a);
    }
}
