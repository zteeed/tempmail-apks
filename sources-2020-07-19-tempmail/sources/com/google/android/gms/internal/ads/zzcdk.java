package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdk implements zzela<zzcdg> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzaxx> f6883a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f6884b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcco> f6885c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcck> f6886d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzcdo> f6887e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzcdw> f6888f;
    private final zzelj<Executor> g;
    private final zzelj<Executor> h;
    private final zzelj<zzccj> i;

    private zzcdk(zzelj<zzaxx> zzelj, zzelj<zzdla> zzelj2, zzelj<zzcco> zzelj3, zzelj<zzcck> zzelj4, zzelj<zzcdo> zzelj5, zzelj<zzcdw> zzelj6, zzelj<Executor> zzelj7, zzelj<Executor> zzelj8, zzelj<zzccj> zzelj9) {
        this.f6883a = zzelj;
        this.f6884b = zzelj2;
        this.f6885c = zzelj3;
        this.f6886d = zzelj4;
        this.f6887e = zzelj5;
        this.f6888f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
        this.i = zzelj9;
    }

    public static zzcdk a(zzelj<zzaxx> zzelj, zzelj<zzdla> zzelj2, zzelj<zzcco> zzelj3, zzelj<zzcck> zzelj4, zzelj<zzcdo> zzelj5, zzelj<zzcdw> zzelj6, zzelj<Executor> zzelj7, zzelj<Executor> zzelj8, zzelj<zzccj> zzelj9) {
        return new zzcdk(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6, zzelj7, zzelj8, zzelj9);
    }

    public final /* synthetic */ Object get() {
        return new zzcdg(this.f6883a.get(), this.f6884b.get(), this.f6885c.get(), this.f6886d.get(), this.f6887e.get(), this.f6888f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
