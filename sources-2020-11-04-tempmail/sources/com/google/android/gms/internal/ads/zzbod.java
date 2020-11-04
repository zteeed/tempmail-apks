package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbod implements zzela<zzcqt<zzbnc>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Boolean> f6629a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzctm> f6630b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcve<zzbnc, zzdlm, zzcsd>> f6631c;

    public zzbod(zzelj<Boolean> zzelj, zzelj<zzctm> zzelj2, zzelj<zzcve<zzbnc, zzdlm, zzcsd>> zzelj3) {
        this.f6629a = zzelj;
        this.f6630b = zzelj2;
        this.f6631c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        boolean booleanValue = this.f6629a.get().booleanValue();
        zzcqt zzcqt = (zzctm) this.f6630b.get();
        zzcqt zzcqt2 = (zzcve) this.f6631c.get();
        if (!booleanValue) {
            zzcqt = zzcqt2;
        }
        zzelg.b(zzcqt, "Cannot return null from a non-@Nullable @Provides method");
        return zzcqt;
    }
}
