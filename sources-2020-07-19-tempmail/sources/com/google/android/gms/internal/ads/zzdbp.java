package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbp implements zzela<zzdbn> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7831a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f7832b;

    private zzdbp(zzelj<Context> zzelj, zzelj<zzdvi> zzelj2) {
        this.f7831a = zzelj;
        this.f7832b = zzelj2;
    }

    public static zzdbp a(zzelj<Context> zzelj, zzelj<zzdvi> zzelj2) {
        return new zzdbp(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzdbn(this.f7831a.get(), this.f7832b.get());
    }
}
