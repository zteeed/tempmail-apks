package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgb implements zzela<zzcfu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7175a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbmh> f7176b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbyj> f7177c;

    public zzcgb(zzelj<Executor> zzelj, zzelj<zzbmh> zzelj2, zzelj<zzbyj> zzelj3) {
        this.f7175a = zzelj;
        this.f7176b = zzelj2;
        this.f7177c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcfu(this.f7175a.get(), this.f7176b.get(), this.f7177c.get());
    }
}
