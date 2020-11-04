package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnq implements zzela<Set<zzbyg<zzbua>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnj f6609a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbos> f6610b;

    public zzbnq(zzbnj zzbnj, zzelj<zzbos> zzelj) {
        this.f6609a = zzbnj;
        this.f6610b = zzelj;
    }

    public static Set<zzbyg<zzbua>> a(zzbnj zzbnj, zzbos zzbos) {
        Set<zzbyg<zzbua>> singleton = Collections.singleton(new zzbyg(zzbos, zzbbf.f6325f));
        zzelg.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6609a, this.f6610b.get());
    }
}
