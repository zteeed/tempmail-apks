package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckn implements zzbsq, zzbua, zzbva {

    /* renamed from: b  reason: collision with root package name */
    private final zzckv f7160b;

    /* renamed from: c  reason: collision with root package name */
    private final zzclc f7161c;

    public zzckn(zzckv zzckv, zzclc zzclc) {
        this.f7160b = zzckv;
        this.f7161c = zzclc;
    }

    public final void B(zzdkw zzdkw) {
        this.f7160b.a(zzdkw);
    }

    public final void C(zzasm zzasm) {
        this.f7160b.b(zzasm.f5909b);
    }

    public final void onAdFailedToLoad(int i) {
        this.f7160b.c().put("action", "ftl");
        this.f7160b.c().put("ftl", String.valueOf(i));
        this.f7161c.d(this.f7160b.c());
    }

    public final void onAdLoaded() {
        this.f7160b.c().put("action", "loaded");
        this.f7161c.d(this.f7160b.c());
    }
}
