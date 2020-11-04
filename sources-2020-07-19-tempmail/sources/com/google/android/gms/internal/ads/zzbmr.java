package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmr {

    /* renamed from: a  reason: collision with root package name */
    private final zzckx f6401a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdkw f6402b;

    public zzbmr(zzckx zzckx, zzdkw zzdkw) {
        this.f6401a = zzckx;
        this.f6402b = zzdkw;
    }

    public final void a(long j) {
        zzckw b2 = this.f6401a.b();
        b2.b(this.f6402b.f8162b.f8157b);
        b2.g("action", "ad_closed");
        b2.g("show_time", String.valueOf(j));
        b2.g("ad_format", "appopen");
        b2.d();
    }
}
