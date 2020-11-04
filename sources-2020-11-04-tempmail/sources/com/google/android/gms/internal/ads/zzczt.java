package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczt implements zzela<zzczr> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<String> f7939a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f7940b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcix> f7941c;

    private zzczt(zzelj<String> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcix> zzelj3) {
        this.f7939a = zzelj;
        this.f7940b = zzelj2;
        this.f7941c = zzelj3;
    }

    public static zzczt a(zzelj<String> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcix> zzelj3) {
        return new zzczt(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzczr(this.f7939a.get(), this.f7940b.get(), this.f7941c.get());
    }
}
