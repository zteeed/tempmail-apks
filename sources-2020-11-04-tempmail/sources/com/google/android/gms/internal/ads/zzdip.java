package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdip implements zzela<zzdil<zzbmq, zzbmw>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8262a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdmi> f8263b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdna> f8264c;

    public zzdip(zzelj<Context> zzelj, zzelj<zzdmi> zzelj2, zzelj<zzdna> zzelj3) {
        this.f8262a = zzelj;
        this.f8263b = zzelj2;
        this.f8264c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        zzdil zzdil;
        Context context = this.f8262a.get();
        zzdmi zzdmi = this.f8263b.get();
        zzdna zzdna = this.f8264c.get();
        if (((Integer) zzwg.e().c(zzaav.w3)).intValue() > 0) {
            zzdmz a2 = zzdna.a(zzdmr.AppOpen, context, zzdmi, new xu(new zzdho()));
            zzdil = new zzdhp(new zzdig(new zzdid()), new zzdhy(a2.f8416a, zzbbf.f6320a), a2.f8417b, zzbbf.f6320a);
        } else {
            zzdil = new zzdid();
        }
        zzelg.b(zzdil, "Cannot return null from a non-@Nullable @Provides method");
        return zzdil;
    }
}
