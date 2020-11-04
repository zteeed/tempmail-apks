package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgn implements zzela<zzcgl> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7021a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcck> f7022b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcdg> f7023c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzccd> f7024d;

    private zzcgn(zzelj<Context> zzelj, zzelj<zzcck> zzelj2, zzelj<zzcdg> zzelj3, zzelj<zzccd> zzelj4) {
        this.f7021a = zzelj;
        this.f7022b = zzelj2;
        this.f7023c = zzelj3;
        this.f7024d = zzelj4;
    }

    public static zzcgn a(zzelj<Context> zzelj, zzelj<zzcck> zzelj2, zzelj<zzcdg> zzelj3, zzelj<zzccd> zzelj4) {
        return new zzcgn(zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        return new zzcgl(this.f7021a.get(), this.f7022b.get(), this.f7023c.get(), this.f7024d.get());
    }
}
