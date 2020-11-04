package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrr implements zzela<bd> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6775a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdkk> f6776b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzaqp> f6777c;

    private zzbrr(zzelj<Context> zzelj, zzelj<zzdkk> zzelj2, zzelj<zzaqp> zzelj3) {
        this.f6775a = zzelj;
        this.f6776b = zzelj2;
        this.f6777c = zzelj3;
    }

    public static zzbrr a(zzelj<Context> zzelj, zzelj<zzdkk> zzelj2, zzelj<zzaqp> zzelj3) {
        return new zzbrr(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new bd(this.f6775a.get(), this.f6776b.get(), this.f6777c.get());
    }
}
