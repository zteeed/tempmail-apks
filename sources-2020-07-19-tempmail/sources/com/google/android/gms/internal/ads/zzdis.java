package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdis implements zzela<zzdil<zzchm, zzchj>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8084a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdmi> f8085b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdna> f8086c;

    public zzdis(zzelj<Context> zzelj, zzelj<zzdmi> zzelj2, zzelj<zzdna> zzelj3) {
        this.f8084a = zzelj;
        this.f8085b = zzelj2;
        this.f8086c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        zzdil zzdil;
        Context context = this.f8084a.get();
        zzdmi zzdmi = this.f8085b.get();
        zzdna zzdna = this.f8086c.get();
        if (((Integer) zzwg.e().c(zzaav.i3)).intValue() > 0) {
            zzdmz a2 = zzdna.a(zzdmr.Rewarded, context, zzdmi, new xu(new zzdho()));
            zzdil = new zzdhp(new zzdig(new zzdid()), new zzdhy(a2.f8233a, zzbbf.f6137a), a2.f8234b, zzbbf.f6137a);
        } else {
            zzdil = new zzdid();
        }
        zzelg.b(zzdil, "Cannot return null from a non-@Nullable @Provides method");
        return zzdil;
    }
}
