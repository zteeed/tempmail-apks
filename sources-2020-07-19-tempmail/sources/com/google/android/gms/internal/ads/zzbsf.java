package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsf implements zzela<zzbsg> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdkk> f6620a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<String> f6621b;

    private zzbsf(zzelj<zzdkk> zzelj, zzelj<String> zzelj2) {
        this.f6620a = zzelj;
        this.f6621b = zzelj2;
    }

    public static zzbsf a(zzelj<zzdkk> zzelj, zzelj<String> zzelj2) {
        return new zzbsf(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzbsg(this.f6620a.get(), this.f6621b.get());
    }
}
