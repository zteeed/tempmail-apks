package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmr {

    /* renamed from: a  reason: collision with root package name */
    private final zzckx f6584a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdkw f6585b;

    public zzbmr(zzckx zzckx, zzdkw zzdkw) {
        this.f6584a = zzckx;
        this.f6585b = zzdkw;
    }

    public final void a(long j) {
        zzckw b2 = this.f6584a.b();
        b2.b(this.f6585b.f8345b.f8340b);
        b2.g("action", "ad_closed");
        b2.g("show_time", String.valueOf(j));
        b2.g("ad_format", "appopen");
        b2.d();
    }
}
