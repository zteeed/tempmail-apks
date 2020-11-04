package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdpf implements zzela<zzdpd> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f8287a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbe> f8288b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcts> f8289c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f8290d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<String> f8291e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<String> f8292f;
    private final zzelj<Context> g;
    private final zzelj<zzdkv> h;
    private final zzelj<Clock> i;
    private final zzelj<zzeg> j;

    private zzdpf(zzelj<Executor> zzelj, zzelj<zzbbe> zzelj2, zzelj<zzcts> zzelj3, zzelj<zzbbd> zzelj4, zzelj<String> zzelj5, zzelj<String> zzelj6, zzelj<Context> zzelj7, zzelj<zzdkv> zzelj8, zzelj<Clock> zzelj9, zzelj<zzeg> zzelj10) {
        this.f8287a = zzelj;
        this.f8288b = zzelj2;
        this.f8289c = zzelj3;
        this.f8290d = zzelj4;
        this.f8291e = zzelj5;
        this.f8292f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
        this.i = zzelj9;
        this.j = zzelj10;
    }

    public static zzdpf a(zzelj<Executor> zzelj, zzelj<zzbbe> zzelj2, zzelj<zzcts> zzelj3, zzelj<zzbbd> zzelj4, zzelj<String> zzelj5, zzelj<String> zzelj6, zzelj<Context> zzelj7, zzelj<zzdkv> zzelj8, zzelj<Clock> zzelj9, zzelj<zzeg> zzelj10) {
        return new zzdpf(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6, zzelj7, zzelj8, zzelj9, zzelj10);
    }

    public final /* synthetic */ Object get() {
        return new zzdpd(this.f8287a.get(), this.f8288b.get(), this.f8289c.get(), this.f8290d.get(), this.f8291e.get(), this.f8292f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
