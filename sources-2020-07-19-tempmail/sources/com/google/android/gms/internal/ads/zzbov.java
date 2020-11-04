package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbov implements zzela<zzbos> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdkk> f6477a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbtc> f6478b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbue> f6479c;

    private zzbov(zzelj<zzdkk> zzelj, zzelj<zzbtc> zzelj2, zzelj<zzbue> zzelj3) {
        this.f6477a = zzelj;
        this.f6478b = zzelj2;
        this.f6479c = zzelj3;
    }

    public static zzbov a(zzelj<zzdkk> zzelj, zzelj<zzbtc> zzelj2, zzelj<zzbue> zzelj3) {
        return new zzbov(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzbos(this.f6477a.get(), this.f6478b.get(), this.f6479c.get());
    }
}
