package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgb implements zzela<zzcfu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f6992a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbmh> f6993b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbyj> f6994c;

    public zzcgb(zzelj<Executor> zzelj, zzelj<zzbmh> zzelj2, zzelj<zzbyj> zzelj3) {
        this.f6992a = zzelj;
        this.f6993b = zzelj2;
        this.f6994c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcfu(this.f6992a.get(), this.f6993b.get(), this.f6994c.get());
    }
}
