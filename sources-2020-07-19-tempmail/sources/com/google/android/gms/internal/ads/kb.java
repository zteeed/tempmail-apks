package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class kb implements zzdkc {

    /* renamed from: a  reason: collision with root package name */
    private zzelj<Context> f4193a;

    /* renamed from: b  reason: collision with root package name */
    private zzelj<zzdil<zzchm, zzchj>> f4194b;

    /* renamed from: c  reason: collision with root package name */
    private zzelj<zzdiu> f4195c;

    /* renamed from: d  reason: collision with root package name */
    private zzelj<zzdkv> f4196d;

    /* renamed from: e  reason: collision with root package name */
    private zzelj<zzdjq> f4197e;

    /* renamed from: f  reason: collision with root package name */
    private zzelj<zzdke> f4198f;
    private zzelj<String> g;
    private zzelj<zzdjy> h;
    private final /* synthetic */ zzbiz i;

    private kb(zzbiz zzbiz, Context context, String str) {
        this.i = zzbiz;
        zzela a2 = zzekz.a(context);
        this.f4193a = a2;
        this.f4194b = new zzdis(a2, this.i.a0, this.i.b0);
        this.f4195c = zzekx.a(new zzdjo(this.i.a0));
        this.f4196d = zzekx.a(zzdky.a());
        zzelj<zzdjq> a3 = zzekx.a(new zzdjv(this.f4193a, this.i.f6282d, this.i.y, this.f4194b, this.f4195c, zzdlb.a(), this.f4196d));
        this.f4197e = a3;
        this.f4198f = zzekx.a(new zzdkf(a3, this.f4195c, this.f4196d));
        zzela b2 = zzekz.b(str);
        this.g = b2;
        this.h = zzekx.a(new zzdjz(b2, this.f4197e, this.f4193a, this.f4195c, this.f4196d));
    }

    public final zzdjy a() {
        return this.h.get();
    }

    public final zzdke b() {
        return this.f4198f.get();
    }
}
