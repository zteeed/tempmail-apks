package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzs implements zzela<zzbyg<zzo>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcao> f6724a;

    private zzbzs(zzbzk zzbzk, zzelj<zzcao> zzelj) {
        this.f6724a = zzelj;
    }

    public static zzbzs a(zzbzk zzbzk, zzelj<zzcao> zzelj) {
        return new zzbzs(zzbzk, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6724a.get(), zzbbf.f6141e);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
