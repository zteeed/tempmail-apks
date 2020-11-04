package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbri implements zzela<zzbrj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6754a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f6755b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbbd> f6756c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzaxx> f6757d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzclx> f6758e;

    private zzbri(zzelj<Context> zzelj, zzelj<zzdla> zzelj2, zzelj<zzbbd> zzelj3, zzelj<zzaxx> zzelj4, zzelj<zzclx> zzelj5) {
        this.f6754a = zzelj;
        this.f6755b = zzelj2;
        this.f6756c = zzelj3;
        this.f6757d = zzelj4;
        this.f6758e = zzelj5;
    }

    public static zzbri a(zzelj<Context> zzelj, zzelj<zzdla> zzelj2, zzelj<zzbbd> zzelj3, zzelj<zzaxx> zzelj4, zzelj<zzclx> zzelj5) {
        return new zzbri(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzbrj(this.f6754a.get(), this.f6755b.get(), this.f6756c.get(), this.f6757d.get(), this.f6758e.get());
    }
}
