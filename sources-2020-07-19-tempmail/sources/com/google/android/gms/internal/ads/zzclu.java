package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclu implements zzela<zzclv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclj> f7222a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbif> f7223b;

    private zzclu(zzelj<zzclj> zzelj, zzelj<zzbif> zzelj2) {
        this.f7222a = zzelj;
        this.f7223b = zzelj2;
    }

    public static zzclu a(zzelj<zzclj> zzelj, zzelj<zzbif> zzelj2) {
        return new zzclu(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzclv(this.f7222a.get(), this.f7223b.get());
    }
}
