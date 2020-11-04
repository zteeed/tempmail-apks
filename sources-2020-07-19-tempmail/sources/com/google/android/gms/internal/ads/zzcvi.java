package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbtt;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcvi<AdT, AdapterT, ListenerT extends zzbtt> implements zzela<zzcve<AdT, AdapterT, ListenerT>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f7585a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f7586b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcqu<AdapterT, ListenerT>> f7587c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcqw<AdT, AdapterT, ListenerT>> f7588d;

    private zzcvi(zzelj<zzdou> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcqu<AdapterT, ListenerT>> zzelj3, zzelj<zzcqw<AdT, AdapterT, ListenerT>> zzelj4) {
        this.f7585a = zzelj;
        this.f7586b = zzelj2;
        this.f7587c = zzelj3;
        this.f7588d = zzelj4;
    }

    public static <AdT, AdapterT, ListenerT extends zzbtt> zzcvi<AdT, AdapterT, ListenerT> a(zzelj<zzdou> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcqu<AdapterT, ListenerT>> zzelj3, zzelj<zzcqw<AdT, AdapterT, ListenerT>> zzelj4) {
        return new zzcvi<>(zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        return new zzcve(this.f7585a.get(), this.f7586b.get(), this.f7587c.get(), this.f7588d.get());
    }
}
