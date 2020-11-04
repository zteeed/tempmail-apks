package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbl implements zzela<zzdbh> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8010a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f8011b;

    private zzdbl(zzelj<Context> zzelj, zzelj<zzdvi> zzelj2) {
        this.f8010a = zzelj;
        this.f8011b = zzelj2;
    }

    public static zzdbh a(Context context, zzdvi zzdvi) {
        return new zzdbh(context, zzdvi);
    }

    public static zzdbl b(zzelj<Context> zzelj, zzelj<zzdvi> zzelj2) {
        return new zzdbl(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f8010a.get(), this.f8011b.get());
    }
}
