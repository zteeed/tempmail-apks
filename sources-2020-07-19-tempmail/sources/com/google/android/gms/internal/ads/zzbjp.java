package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbjp {

    /* renamed from: a  reason: collision with root package name */
    private zzbie f6285a;

    /* renamed from: b  reason: collision with root package name */
    private zzbkb f6286b;

    /* renamed from: c  reason: collision with root package name */
    private zzdpb f6287c;

    /* renamed from: d  reason: collision with root package name */
    private zzbkk f6288d;

    /* renamed from: e  reason: collision with root package name */
    private zzdlr f6289e;

    private zzbjp() {
    }

    public final zzbjp a(zzbkb zzbkb) {
        zzelg.a(zzbkb);
        this.f6286b = zzbkb;
        return this;
    }

    public final zzbif b() {
        zzelg.c(this.f6285a, zzbie.class);
        zzelg.c(this.f6286b, zzbkb.class);
        if (this.f6287c == null) {
            this.f6287c = new zzdpb();
        }
        if (this.f6288d == null) {
            this.f6288d = new zzbkk();
        }
        if (this.f6289e == null) {
            this.f6289e = new zzdlr();
        }
        return new zzbiz(this.f6285a, this.f6286b, this.f6287c, this.f6288d, this.f6289e);
    }

    public final zzbjp c(zzbie zzbie) {
        zzelg.a(zzbie);
        this.f6285a = zzbie;
        return this;
    }
}
