package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbta implements zzela<zzbss> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbsw> f6630a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbsp>>> f6631b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f6632c;

    private zzbta(zzelj<zzbsw> zzelj, zzelj<Set<zzbyg<zzbsp>>> zzelj2, zzelj<Executor> zzelj3) {
        this.f6630a = zzelj;
        this.f6631b = zzelj2;
        this.f6632c = zzelj3;
    }

    public static zzbta a(zzelj<zzbsw> zzelj, zzelj<Set<zzbyg<zzbsp>>> zzelj2, zzelj<Executor> zzelj3) {
        return new zzbta(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzbss(this.f6630a.get(), this.f6631b.get(), this.f6632c.get());
    }
}
