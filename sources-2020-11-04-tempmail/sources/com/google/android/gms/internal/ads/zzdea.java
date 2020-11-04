package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdea implements zzela<zzddt> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f8108a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f8109b;

    private zzdea(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2) {
        this.f8108a = zzelj;
        this.f8109b = zzelj2;
    }

    public static zzddt a(zzdvi zzdvi, Context context) {
        return new zzddt(zzdvi, context);
    }

    public static zzdea b(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2) {
        return new zzdea(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f8108a.get(), this.f8109b.get());
    }
}
