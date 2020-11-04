package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclm implements zzela<Set<zzbyg<zzbtg>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclv> f7207a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7208b;

    private zzclm(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        this.f7207a = zzelj;
        this.f7208b = zzelj2;
    }

    public static zzclm a(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        return new zzclm(zzcll, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbtg>> a2 = zzcll.a(this.f7207a.get(), this.f7208b.get());
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
