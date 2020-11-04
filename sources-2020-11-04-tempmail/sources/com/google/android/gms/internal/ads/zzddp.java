package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddp implements zzela<zzddn> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f8101a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f8102b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbbd> f8103c;

    private zzddp(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2, zzelj<zzbbd> zzelj3) {
        this.f8101a = zzelj;
        this.f8102b = zzelj2;
        this.f8103c = zzelj3;
    }

    public static zzddp a(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2, zzelj<zzbbd> zzelj3) {
        return new zzddp(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzddn(this.f8101a.get(), this.f8102b.get(), this.f8103c.get());
    }
}
