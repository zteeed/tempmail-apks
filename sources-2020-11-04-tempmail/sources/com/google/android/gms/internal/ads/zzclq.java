package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclq implements zzela<Set<zzbyg<zzuu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclv> f7397a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7398b;

    private zzclq(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        this.f7397a = zzelj;
        this.f7398b = zzelj2;
    }

    public static zzclq a(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        return new zzclq(zzcll, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzuu>> h = zzcll.h(this.f7397a.get(), this.f7398b.get());
        zzelg.b(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
