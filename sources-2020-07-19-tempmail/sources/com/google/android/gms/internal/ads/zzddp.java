package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddp implements zzela<zzddn> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f7918a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7919b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbbd> f7920c;

    private zzddp(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2, zzelj<zzbbd> zzelj3) {
        this.f7918a = zzelj;
        this.f7919b = zzelj2;
        this.f7920c = zzelj3;
    }

    public static zzddp a(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2, zzelj<zzbbd> zzelj3) {
        return new zzddp(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzddn(this.f7918a.get(), this.f7919b.get(), this.f7920c.get());
    }
}
