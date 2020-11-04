package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckn implements zzbsq, zzbua, zzbva {

    /* renamed from: b  reason: collision with root package name */
    private final zzckv f7343b;

    /* renamed from: c  reason: collision with root package name */
    private final zzclc f7344c;

    public zzckn(zzckv zzckv, zzclc zzclc) {
        this.f7343b = zzckv;
        this.f7344c = zzclc;
    }

    public final void B(zzdkw zzdkw) {
        this.f7343b.a(zzdkw);
    }

    public final void C(zzasm zzasm) {
        this.f7343b.b(zzasm.f6092b);
    }

    public final void onAdFailedToLoad(int i) {
        this.f7343b.c().put("action", "ftl");
        this.f7343b.c().put("ftl", String.valueOf(i));
        this.f7344c.d(this.f7343b.c());
    }

    public final void onAdLoaded() {
        this.f7343b.c().put("action", "loaded");
        this.f7344c.d(this.f7343b.c());
    }
}
