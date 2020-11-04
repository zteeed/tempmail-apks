package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcfj implements zzela<zzcey> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6971a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcet> f6972b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzeg> f6973c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f6974d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zza> f6975e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zztm> f6976f;
    private final zzelj<Executor> g;
    private final zzelj<zzdla> h;
    private final zzelj<zzcfp> i;
    private final zzelj<ScheduledExecutorService> j;

    public zzcfj(zzelj<Context> zzelj, zzelj<zzcet> zzelj2, zzelj<zzeg> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zza> zzelj5, zzelj<zztm> zzelj6, zzelj<Executor> zzelj7, zzelj<zzdla> zzelj8, zzelj<zzcfp> zzelj9, zzelj<ScheduledExecutorService> zzelj10) {
        this.f6971a = zzelj;
        this.f6972b = zzelj2;
        this.f6973c = zzelj3;
        this.f6974d = zzelj4;
        this.f6975e = zzelj5;
        this.f6976f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
        this.i = zzelj9;
        this.j = zzelj10;
    }

    public final /* synthetic */ Object get() {
        return new zzcey(this.f6971a.get(), this.f6972b.get(), this.f6973c.get(), this.f6974d.get(), this.f6975e.get(), this.f6976f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
