package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bb implements zzdhg {

    /* renamed from: a  reason: collision with root package name */
    private zzelj<Context> f3626a;

    /* renamed from: b  reason: collision with root package name */
    private zzelj<String> f3627b;

    /* renamed from: c  reason: collision with root package name */
    private zzelj<zzdil<zzbmq, zzbmw>> f3628c;

    /* renamed from: d  reason: collision with root package name */
    private zzelj<zzdhi> f3629d;

    /* renamed from: e  reason: collision with root package name */
    private zzelj<zzdgr> f3630e;

    /* renamed from: f  reason: collision with root package name */
    private zzelj<zzdha> f3631f;
    private final /* synthetic */ zzbiz g;

    private bb(zzbiz zzbiz, Context context, String str) {
        this.g = zzbiz;
        this.f3626a = zzekz.a(context);
        this.f3627b = zzekz.a(str);
        this.f3628c = new zzdip(this.f3626a, this.g.a0, this.g.b0);
        this.f3629d = zzekx.a(new zzdhl(this.g.a0));
        this.f3630e = zzekx.a(new zzdgx(this.f3626a, this.g.f6465d, this.g.y, this.f3628c, this.f3629d, zzdlb.a()));
        this.f3631f = zzekx.a(new zzdhd(this.g.y, this.f3626a, this.f3627b, this.f3630e, this.f3629d, this.g.l));
    }

    public final zzdha a() {
        return this.f3631f.get();
    }
}
