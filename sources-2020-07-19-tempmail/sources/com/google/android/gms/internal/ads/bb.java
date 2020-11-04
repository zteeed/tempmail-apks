package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bb implements zzdhg {

    /* renamed from: a  reason: collision with root package name */
    private zzelj<Context> f3443a;

    /* renamed from: b  reason: collision with root package name */
    private zzelj<String> f3444b;

    /* renamed from: c  reason: collision with root package name */
    private zzelj<zzdil<zzbmq, zzbmw>> f3445c;

    /* renamed from: d  reason: collision with root package name */
    private zzelj<zzdhi> f3446d;

    /* renamed from: e  reason: collision with root package name */
    private zzelj<zzdgr> f3447e;

    /* renamed from: f  reason: collision with root package name */
    private zzelj<zzdha> f3448f;
    private final /* synthetic */ zzbiz g;

    private bb(zzbiz zzbiz, Context context, String str) {
        this.g = zzbiz;
        this.f3443a = zzekz.a(context);
        this.f3444b = zzekz.a(str);
        this.f3445c = new zzdip(this.f3443a, this.g.a0, this.g.b0);
        this.f3446d = zzekx.a(new zzdhl(this.g.a0));
        this.f3447e = zzekx.a(new zzdgx(this.f3443a, this.g.f6282d, this.g.y, this.f3445c, this.f3446d, zzdlb.a()));
        this.f3448f = zzekx.a(new zzdhd(this.g.y, this.f3443a, this.f3444b, this.f3447e, this.f3446d, this.g.l));
    }

    public final zzdha a() {
        return this.f3448f.get();
    }
}
