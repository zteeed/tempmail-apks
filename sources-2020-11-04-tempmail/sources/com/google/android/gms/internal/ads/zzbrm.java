package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrm implements zzela<zzdrx<zzdkk, zzayv>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6765a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f6766b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdla> f6767c;

    public zzbrm(zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdla> zzelj3) {
        this.f6765a = zzelj;
        this.f6766b = zzelj2;
        this.f6767c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        ad adVar = new ad(this.f6765a.get(), this.f6766b.get(), this.f6767c.get());
        zzelg.b(adVar, "Cannot return null from a non-@Nullable @Provides method");
        return adVar;
    }
}
