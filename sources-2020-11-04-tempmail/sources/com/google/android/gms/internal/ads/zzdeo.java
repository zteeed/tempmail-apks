package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdeo implements zzela<zzdem> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f8132a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f8133b;

    private zzdeo(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2) {
        this.f8132a = zzelj;
        this.f8133b = zzelj2;
    }

    public static zzdeo a(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2) {
        return new zzdeo(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzdem(this.f8132a.get(), this.f8133b.get());
    }
}
