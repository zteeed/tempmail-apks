package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqn implements zzela<zzcqi> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7555a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbrq> f7556b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcqf> f7557c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcpz> f7558d;

    private zzcqn(zzelj<Context> zzelj, zzelj<zzbrq> zzelj2, zzelj<zzcqf> zzelj3, zzelj<zzcpz> zzelj4) {
        this.f7555a = zzelj;
        this.f7556b = zzelj2;
        this.f7557c = zzelj3;
        this.f7558d = zzelj4;
    }

    public static zzcqn a(zzelj<Context> zzelj, zzelj<zzbrq> zzelj2, zzelj<zzcqf> zzelj3, zzelj<zzcpz> zzelj4) {
        return new zzcqn(zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        return new zzcqi(this.f7555a.get(), this.f7556b.get(), this.f7557c.get(), this.f7558d.get());
    }
}
