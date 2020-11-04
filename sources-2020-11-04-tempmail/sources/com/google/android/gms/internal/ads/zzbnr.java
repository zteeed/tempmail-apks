package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnr implements zzela<zzbyg<zzbua>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnj f6611a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f6612b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbbd> f6613c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdkk> f6614d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdla> f6615e;

    public zzbnr(zzbnj zzbnj, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzdla> zzelj4) {
        this.f6611a = zzbnj;
        this.f6612b = zzelj;
        this.f6613c = zzelj2;
        this.f6614d = zzelj3;
        this.f6615e = zzelj4;
    }

    public static zzbyg<zzbua> a(zzbnj zzbnj, Context context, zzbbd zzbbd, zzdkk zzdkk, zzdla zzdla) {
        zzbyg<zzbua> zzbyg = new zzbyg<>(new ic(context, zzbbd, zzdkk, zzdla), zzbbf.f6325f);
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6611a, this.f6612b.get(), this.f6613c.get(), this.f6614d.get(), this.f6615e.get());
    }
}
