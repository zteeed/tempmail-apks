package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbod implements zzela<zzcqt<zzbnc>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Boolean> f6446a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzctm> f6447b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcve<zzbnc, zzdlm, zzcsd>> f6448c;

    public zzbod(zzelj<Boolean> zzelj, zzelj<zzctm> zzelj2, zzelj<zzcve<zzbnc, zzdlm, zzcsd>> zzelj3) {
        this.f6446a = zzelj;
        this.f6447b = zzelj2;
        this.f6448c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        boolean booleanValue = this.f6446a.get().booleanValue();
        zzcqt zzcqt = (zzctm) this.f6447b.get();
        zzcqt zzcqt2 = (zzcve) this.f6448c.get();
        if (!booleanValue) {
            zzcqt = zzcqt2;
        }
        zzelg.b(zzcqt, "Cannot return null from a non-@Nullable @Provides method");
        return zzcqt;
    }
}
