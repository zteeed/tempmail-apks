package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgg implements zzela<zzcgh> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<String> f7185a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzccd> f7186b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcck> f7187c;

    private zzcgg(zzelj<String> zzelj, zzelj<zzccd> zzelj2, zzelj<zzcck> zzelj3) {
        this.f7185a = zzelj;
        this.f7186b = zzelj2;
        this.f7187c = zzelj3;
    }

    public static zzcgg a(zzelj<String> zzelj, zzelj<zzccd> zzelj2, zzelj<zzcck> zzelj3) {
        return new zzcgg(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzcgh(this.f7185a.get(), this.f7186b.get(), this.f7187c.get());
    }
}
