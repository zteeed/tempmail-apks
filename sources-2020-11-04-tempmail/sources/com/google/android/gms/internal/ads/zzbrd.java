package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrd implements zzela<zzbyg<zzo>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbpv> f6747a;

    private zzbrd(zzbqu zzbqu, zzelj<zzbpv> zzelj) {
        this.f6747a = zzelj;
    }

    public static zzbrd a(zzbqu zzbqu, zzelj<zzbpv> zzelj) {
        return new zzbrd(zzbqu, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6747a.get(), zzbbf.f6325f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
