package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class kb implements zzdkc {

    /* renamed from: a  reason: collision with root package name */
    private zzelj<Context> f4376a;

    /* renamed from: b  reason: collision with root package name */
    private zzelj<zzdil<zzchm, zzchj>> f4377b;

    /* renamed from: c  reason: collision with root package name */
    private zzelj<zzdiu> f4378c;

    /* renamed from: d  reason: collision with root package name */
    private zzelj<zzdkv> f4379d;

    /* renamed from: e  reason: collision with root package name */
    private zzelj<zzdjq> f4380e;

    /* renamed from: f  reason: collision with root package name */
    private zzelj<zzdke> f4381f;
    private zzelj<String> g;
    private zzelj<zzdjy> h;
    private final /* synthetic */ zzbiz i;

    private kb(zzbiz zzbiz, Context context, String str) {
        this.i = zzbiz;
        zzela a2 = zzekz.a(context);
        this.f4376a = a2;
        this.f4377b = new zzdis(a2, this.i.a0, this.i.b0);
        this.f4378c = zzekx.a(new zzdjo(this.i.a0));
        this.f4379d = zzekx.a(zzdky.a());
        zzelj<zzdjq> a3 = zzekx.a(new zzdjv(this.f4376a, this.i.f6465d, this.i.y, this.f4377b, this.f4378c, zzdlb.a(), this.f4379d));
        this.f4380e = a3;
        this.f4381f = zzekx.a(new zzdkf(a3, this.f4378c, this.f4379d));
        zzela b2 = zzekz.b(str);
        this.g = b2;
        this.h = zzekx.a(new zzdjz(b2, this.f4380e, this.f4376a, this.f4378c, this.f4379d));
    }

    public final zzdjy a() {
        return this.h.get();
    }

    public final zzdke b() {
        return this.f4381f.get();
    }
}
