package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcms implements zzela<zzdvf<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzeg> f7436a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7437b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdvi> f7438c;

    private zzcms(zzelj<zzeg> zzelj, zzelj<Context> zzelj2, zzelj<zzdvi> zzelj3) {
        this.f7436a = zzelj;
        this.f7437b = zzelj2;
        this.f7438c = zzelj3;
    }

    public static zzcms a(zzelj<zzeg> zzelj, zzelj<Context> zzelj2, zzelj<zzdvi> zzelj3) {
        return new zzcms(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        zzdvf f2 = this.f7438c.get().f(new gl(this.f7436a.get(), this.f7437b.get()));
        zzelg.b(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
