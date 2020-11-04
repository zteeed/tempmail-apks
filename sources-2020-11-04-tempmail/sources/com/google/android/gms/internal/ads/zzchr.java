package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchr implements zzela<zzcqt<zzchj>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcve<zzchj, zzdlm, zzcsc>> f7250a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcve<zzchj, zzdlm, zzcsd>> f7251b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdla> f7252c;

    public zzchr(zzelj<zzcve<zzchj, zzdlm, zzcsc>> zzelj, zzelj<zzcve<zzchj, zzdlm, zzcsd>> zzelj2, zzelj<zzdla> zzelj3) {
        this.f7250a = zzelj;
        this.f7251b = zzelj2;
        this.f7252c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        zzcqt zzcqt;
        zzelj<zzcve<zzchj, zzdlm, zzcsc>> zzelj = this.f7250a;
        zzelj<zzcve<zzchj, zzdlm, zzcsd>> zzelj2 = this.f7251b;
        if (hj.f4161a[this.f7252c.get().n.f8326a - 1] != 1) {
            zzcqt = zzelj2.get();
        } else {
            zzcqt = zzelj.get();
        }
        zzelg.b(zzcqt, "Cannot return null from a non-@Nullable @Provides method");
        return zzcqt;
    }
}
