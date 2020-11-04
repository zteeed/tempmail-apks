package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgi implements zzela<zzcgj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<String> f7008a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzccd> f7009b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcck> f7010c;

    private zzcgi(zzelj<String> zzelj, zzelj<zzccd> zzelj2, zzelj<zzcck> zzelj3) {
        this.f7008a = zzelj;
        this.f7009b = zzelj2;
        this.f7010c = zzelj3;
    }

    public static zzcgi a(zzelj<String> zzelj, zzelj<zzccd> zzelj2, zzelj<zzcck> zzelj3) {
        return new zzcgi(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzcgj(this.f7008a.get(), this.f7009b.get(), this.f7010c.get());
    }
}
