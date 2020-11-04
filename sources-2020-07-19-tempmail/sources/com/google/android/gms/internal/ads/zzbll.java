package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbll implements zzbsq {

    /* renamed from: b  reason: collision with root package name */
    private final zzdkm f6323b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdkw f6324c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdpd f6325d;

    public zzbll(zzdkw zzdkw, zzdpd zzdpd) {
        this.f6324c = zzdkw;
        this.f6325d = zzdpd;
        this.f6323b = zzdkw.f8162b.f8157b;
    }

    public final void onAdFailedToLoad(int i) {
        this.f6325d.a(this.f6324c, (zzdkk) null, this.f6323b.f8137a);
    }
}
