package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbjp {

    /* renamed from: a  reason: collision with root package name */
    private zzbie f6468a;

    /* renamed from: b  reason: collision with root package name */
    private zzbkb f6469b;

    /* renamed from: c  reason: collision with root package name */
    private zzdpb f6470c;

    /* renamed from: d  reason: collision with root package name */
    private zzbkk f6471d;

    /* renamed from: e  reason: collision with root package name */
    private zzdlr f6472e;

    private zzbjp() {
    }

    public final zzbjp a(zzbkb zzbkb) {
        zzelg.a(zzbkb);
        this.f6469b = zzbkb;
        return this;
    }

    public final zzbif b() {
        zzelg.c(this.f6468a, zzbie.class);
        zzelg.c(this.f6469b, zzbkb.class);
        if (this.f6470c == null) {
            this.f6470c = new zzdpb();
        }
        if (this.f6471d == null) {
            this.f6471d = new zzbkk();
        }
        if (this.f6472e == null) {
            this.f6472e = new zzdlr();
        }
        return new zzbiz(this.f6468a, this.f6469b, this.f6470c, this.f6471d, this.f6472e);
    }

    public final zzbjp c(zzbie zzbie) {
        zzelg.a(zzbie);
        this.f6468a = zzbie;
        return this;
    }
}
