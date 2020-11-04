package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnr implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnj f6428a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f6429b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbbd> f6430c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdkk> f6431d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdla> f6432e;

    public zzbnr(zzbnj zzbnj, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzdla> zzelj4) {
        this.f6428a = zzbnj;
        this.f6429b = zzelj;
        this.f6430c = zzelj2;
        this.f6431d = zzelj3;
        this.f6432e = zzelj4;
    }

    public static zzbyg<zzbua> a(zzbnj zzbnj, Context context, zzbbd zzbbd, zzdkk zzdkk, zzdla zzdla) {
        zzbyg<zzbua> zzbyg = new zzbyg<>(new ic(context, zzbbd, zzdkk, zzdla), zzbbf.f6142f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6428a, this.f6429b.get(), this.f6430c.get(), this.f6431d.get(), this.f6432e.get());
    }
}
