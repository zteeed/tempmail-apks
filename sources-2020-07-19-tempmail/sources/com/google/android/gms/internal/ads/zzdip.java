package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdip implements zzela<zzdil<zzbmq, zzbmw>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8079a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdmi> f8080b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdna> f8081c;

    public zzdip(zzelj<Context> zzelj, zzelj<zzdmi> zzelj2, zzelj<zzdna> zzelj3) {
        this.f8079a = zzelj;
        this.f8080b = zzelj2;
        this.f8081c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        zzdil zzdil;
        Context context = this.f8079a.get();
        zzdmi zzdmi = this.f8080b.get();
        zzdna zzdna = this.f8081c.get();
        if (((Integer) zzwg.e().c(zzaav.w3)).intValue() > 0) {
            zzdmz a2 = zzdna.a(zzdmr.AppOpen, context, zzdmi, new xu(new zzdho()));
            zzdil = new zzdhp(new zzdig(new zzdid()), new zzdhy(a2.f8233a, zzbbf.f6137a), a2.f8234b, zzbbf.f6137a);
        } else {
            zzdil = new zzdid();
        }
        zzelg.b(zzdil, "Cannot return null from a non-@Nullable @Provides method");
        return zzdil;
    }
}
