package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcfj implements zzela<zzcey> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7154a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcet> f7155b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzeg> f7156c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f7157d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zza> f7158e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zztm> f7159f;
    private final zzelj<Executor> g;
    private final zzelj<zzdla> h;
    private final zzelj<zzcfp> i;
    private final zzelj<ScheduledExecutorService> j;

    public zzcfj(zzelj<Context> zzelj, zzelj<zzcet> zzelj2, zzelj<zzeg> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zza> zzelj5, zzelj<zztm> zzelj6, zzelj<Executor> zzelj7, zzelj<zzdla> zzelj8, zzelj<zzcfp> zzelj9, zzelj<ScheduledExecutorService> zzelj10) {
        this.f7154a = zzelj;
        this.f7155b = zzelj2;
        this.f7156c = zzelj3;
        this.f7157d = zzelj4;
        this.f7158e = zzelj5;
        this.f7159f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
        this.i = zzelj9;
        this.j = zzelj10;
    }

    public final /* synthetic */ Object get() {
        return new zzcey(this.f7154a.get(), this.f7155b.get(), this.f7156c.get(), this.f7157d.get(), this.f7158e.get(), this.f7159f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
