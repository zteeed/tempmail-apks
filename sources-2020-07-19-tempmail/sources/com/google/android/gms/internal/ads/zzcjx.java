package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcjx implements zzela<zzcjq> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zztm> f7135a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdir> f7136b;

    private zzcjx(zzelj<zztm> zzelj, zzelj<zzdir> zzelj2) {
        this.f7135a = zzelj;
        this.f7136b = zzelj2;
    }

    public static zzcjx a(zzelj<zztm> zzelj, zzelj<zzdir> zzelj2) {
        return new zzcjx(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzcjq(this.f7135a.get(), this.f7136b.get());
    }
}
