package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbng implements zzela<gc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbpa> f6592a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f6593b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdkj> f6594c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<View> f6595d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzbfn> f6596e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzboy> f6597f;
    private final zzelj<zzccv> g;
    private final zzelj<zzbyk> h;
    private final zzelj<zzcwo> i;
    private final zzelj<Executor> j;

    public zzbng(zzelj<zzbpa> zzelj, zzelj<Context> zzelj2, zzelj<zzdkj> zzelj3, zzelj<View> zzelj4, zzelj<zzbfn> zzelj5, zzelj<zzboy> zzelj6, zzelj<zzccv> zzelj7, zzelj<zzbyk> zzelj8, zzelj<zzcwo> zzelj9, zzelj<Executor> zzelj10) {
        this.f6592a = zzelj;
        this.f6593b = zzelj2;
        this.f6594c = zzelj3;
        this.f6595d = zzelj4;
        this.f6596e = zzelj5;
        this.f6597f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
        this.i = zzelj9;
        this.j = zzelj10;
    }

    public static gc a(zzbpa zzbpa, Context context, zzdkj zzdkj, View view, zzbfn zzbfn, zzboy zzboy, zzccv zzccv, zzbyk zzbyk, zzeku<zzcwo> zzeku, Executor executor) {
        return new gc(zzbpa, context, zzdkj, view, zzbfn, zzboy, zzccv, zzbyk, zzeku, executor);
    }

    public final /* synthetic */ Object get() {
        return a(this.f6592a.get(), this.f6593b.get(), this.f6594c.get(), this.f6595d.get(), this.f6596e.get(), this.f6597f.get(), this.g.get(), this.h.get(), zzekx.b(this.i), this.j.get());
    }
}
