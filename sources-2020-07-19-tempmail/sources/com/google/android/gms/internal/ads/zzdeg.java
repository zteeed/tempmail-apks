package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdeg<T> implements zzela<zzdeb<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7935a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Set<zzdec<? extends zzddz<T>>>> f7936b;

    private zzdeg(zzelj<Executor> zzelj, zzelj<Set<zzdec<? extends zzddz<T>>>> zzelj2) {
        this.f7935a = zzelj;
        this.f7936b = zzelj2;
    }

    public static <T> zzdeb<T> a(Executor executor, Set<zzdec<? extends zzddz<T>>> set) {
        return new zzdeb<>(executor, set);
    }

    public static <T> zzdeg<T> b(zzelj<Executor> zzelj, zzelj<Set<zzdec<? extends zzddz<T>>>> zzelj2) {
        return new zzdeg<>(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f7935a.get(), this.f7936b.get());
    }
}
