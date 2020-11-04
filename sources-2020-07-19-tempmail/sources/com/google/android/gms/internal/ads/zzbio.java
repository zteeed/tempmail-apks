package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbio implements zzela<zzblb> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbif> f6274a;

    public zzbio(zzbie zzbie, zzelj<zzbif> zzelj) {
        this.f6274a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzbif zzbif = this.f6274a.get();
        zzelg.b(zzbif, "Cannot return null from a non-@Nullable @Provides method");
        return zzbif;
    }
}
