package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchr implements zzela<zzcqt<zzchj>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcve<zzchj, zzdlm, zzcsc>> f7067a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcve<zzchj, zzdlm, zzcsd>> f7068b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdla> f7069c;

    public zzchr(zzelj<zzcve<zzchj, zzdlm, zzcsc>> zzelj, zzelj<zzcve<zzchj, zzdlm, zzcsd>> zzelj2, zzelj<zzdla> zzelj3) {
        this.f7067a = zzelj;
        this.f7068b = zzelj2;
        this.f7069c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        zzcqt zzcqt;
        zzelj<zzcve<zzchj, zzdlm, zzcsc>> zzelj = this.f7067a;
        zzelj<zzcve<zzchj, zzdlm, zzcsd>> zzelj2 = this.f7068b;
        if (hj.f3978a[this.f7069c.get().n.f8143a - 1] != 1) {
            zzcqt = zzelj2.get();
        } else {
            zzcqt = zzelj.get();
        }
        zzelg.b(zzcqt, "Cannot return null from a non-@Nullable @Provides method");
        return zzcqt;
    }
}
