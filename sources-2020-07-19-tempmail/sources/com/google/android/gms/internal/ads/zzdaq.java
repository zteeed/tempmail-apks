package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdaq implements zzela<zzdao> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f7797a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7798b;

    private zzdaq(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2) {
        this.f7797a = zzelj;
        this.f7798b = zzelj2;
    }

    public static zzdaq a(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2) {
        return new zzdaq(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzdao(this.f7797a.get(), this.f7798b.get());
    }
}
