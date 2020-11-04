package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckk implements zzela<zzckl> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7148a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdli> f7149b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzckx> f7150c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdkw> f7151d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdkk> f7152e;

    private zzckk(zzelj<Context> zzelj, zzelj<zzdli> zzelj2, zzelj<zzckx> zzelj3, zzelj<zzdkw> zzelj4, zzelj<zzdkk> zzelj5) {
        this.f7148a = zzelj;
        this.f7149b = zzelj2;
        this.f7150c = zzelj3;
        this.f7151d = zzelj4;
        this.f7152e = zzelj5;
    }

    public static zzckk a(zzelj<Context> zzelj, zzelj<zzdli> zzelj2, zzelj<zzckx> zzelj3, zzelj<zzdkw> zzelj4, zzelj<zzdkk> zzelj5) {
        return new zzckk(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzckl(this.f7148a.get(), this.f7149b.get(), this.f7150c.get(), this.f7151d.get(), this.f7152e.get());
    }
}
