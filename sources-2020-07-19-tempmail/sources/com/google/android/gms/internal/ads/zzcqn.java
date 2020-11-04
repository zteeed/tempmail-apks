package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqn implements zzela<zzcqi> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7372a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbrq> f7373b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcqf> f7374c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcpz> f7375d;

    private zzcqn(zzelj<Context> zzelj, zzelj<zzbrq> zzelj2, zzelj<zzcqf> zzelj3, zzelj<zzcpz> zzelj4) {
        this.f7372a = zzelj;
        this.f7373b = zzelj2;
        this.f7374c = zzelj3;
        this.f7375d = zzelj4;
    }

    public static zzcqn a(zzelj<Context> zzelj, zzelj<zzbrq> zzelj2, zzelj<zzcqf> zzelj3, zzelj<zzcpz> zzelj4) {
        return new zzcqn(zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        return new zzcqi(this.f7372a.get(), this.f7373b.get(), this.f7374c.get(), this.f7375d.get());
    }
}
