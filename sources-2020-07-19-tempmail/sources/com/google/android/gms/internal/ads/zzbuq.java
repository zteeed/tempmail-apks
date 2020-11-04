package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbuq implements zzela<zzbuo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbup>>> f6644a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdkk> f6645b;

    private zzbuq(zzelj<Set<zzbyg<zzbup>>> zzelj, zzelj<zzdkk> zzelj2) {
        this.f6644a = zzelj;
        this.f6645b = zzelj2;
    }

    public static zzbuq a(zzelj<Set<zzbyg<zzbup>>> zzelj, zzelj<zzdkk> zzelj2) {
        return new zzbuq(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzbuo(this.f6644a.get(), this.f6645b.get());
    }
}
