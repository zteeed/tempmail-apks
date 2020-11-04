package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclu implements zzela<zzclv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclj> f7405a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbif> f7406b;

    private zzclu(zzelj<zzclj> zzelj, zzelj<zzbif> zzelj2) {
        this.f7405a = zzelj;
        this.f7406b = zzelj2;
    }

    public static zzclu a(zzelj<zzclj> zzelj, zzelj<zzbif> zzelj2) {
        return new zzclu(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzclv(this.f7405a.get(), this.f7406b.get());
    }
}
