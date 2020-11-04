package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgp implements zzela<zzcgm> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<String> f7211a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzccd> f7212b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcck> f7213c;

    private zzcgp(zzelj<String> zzelj, zzelj<zzccd> zzelj2, zzelj<zzcck> zzelj3) {
        this.f7211a = zzelj;
        this.f7212b = zzelj2;
        this.f7213c = zzelj3;
    }

    public static zzcgp a(zzelj<String> zzelj, zzelj<zzccd> zzelj2, zzelj<zzcck> zzelj3) {
        return new zzcgp(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzcgm(this.f7211a.get(), this.f7212b.get(), this.f7213c.get());
    }
}
