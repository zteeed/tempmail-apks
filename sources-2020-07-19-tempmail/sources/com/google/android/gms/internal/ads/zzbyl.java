package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbyl implements zzela<zzbyj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6702a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzqs>>> f6703b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdkk> f6704c;

    private zzbyl(zzelj<Context> zzelj, zzelj<Set<zzbyg<zzqs>>> zzelj2, zzelj<zzdkk> zzelj3) {
        this.f6702a = zzelj;
        this.f6703b = zzelj2;
        this.f6704c = zzelj3;
    }

    public static zzbyl a(zzelj<Context> zzelj, zzelj<Set<zzbyg<zzqs>>> zzelj2, zzelj<zzdkk> zzelj3) {
        return new zzbyl(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzbyj(this.f6702a.get(), this.f6703b.get(), this.f6704c.get());
    }
}
