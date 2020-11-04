package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnk implements zzela<zzbtv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnj f6602a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbua>>> f6603b;

    public zzbnk(zzbnj zzbnj, zzelj<Set<zzbyg<zzbua>>> zzelj) {
        this.f6602a = zzbnj;
        this.f6603b = zzelj;
    }

    public static zzbtv a(zzbnj zzbnj, Set<zzbyg<zzbua>> set) {
        zzbtv a2 = zzbnj.a(set);
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6602a, this.f6603b.get());
    }
}
