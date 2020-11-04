package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdea implements zzela<zzddt> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f7925a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7926b;

    private zzdea(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2) {
        this.f7925a = zzelj;
        this.f7926b = zzelj2;
    }

    public static zzddt a(zzdvi zzdvi, Context context) {
        return new zzddt(zzdvi, context);
    }

    public static zzdea b(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2) {
        return new zzdea(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f7925a.get(), this.f7926b.get());
    }
}
