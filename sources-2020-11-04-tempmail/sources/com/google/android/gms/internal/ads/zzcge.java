package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcge implements zzela<zzcgd> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzccd> f7183a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcck> f7184b;

    private zzcge(zzelj<zzccd> zzelj, zzelj<zzcck> zzelj2) {
        this.f7183a = zzelj;
        this.f7184b = zzelj2;
    }

    public static zzcge a(zzelj<zzccd> zzelj, zzelj<zzcck> zzelj2) {
        return new zzcge(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzcgd(this.f7183a.get(), this.f7184b.get());
    }
}
