package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgp implements zzela<zzcgm> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<String> f7028a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzccd> f7029b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcck> f7030c;

    private zzcgp(zzelj<String> zzelj, zzelj<zzccd> zzelj2, zzelj<zzcck> zzelj3) {
        this.f7028a = zzelj;
        this.f7029b = zzelj2;
        this.f7030c = zzelj3;
    }

    public static zzcgp a(zzelj<String> zzelj, zzelj<zzccd> zzelj2, zzelj<zzcck> zzelj3) {
        return new zzcgp(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzcgm(this.f7028a.get(), this.f7029b.get(), this.f7030c.get());
    }
}