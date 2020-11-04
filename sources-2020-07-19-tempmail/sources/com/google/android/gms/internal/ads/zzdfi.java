package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfi implements zzela<zzdfe> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzaxd> f7981a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Integer> f7982b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f7983c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzaxh> f7984d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7985e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<Executor> f7986f;

    public zzdfi(zzelj<zzaxd> zzelj, zzelj<Integer> zzelj2, zzelj<Context> zzelj3, zzelj<zzaxh> zzelj4, zzelj<ScheduledExecutorService> zzelj5, zzelj<Executor> zzelj6) {
        this.f7981a = zzelj;
        this.f7982b = zzelj2;
        this.f7983c = zzelj3;
        this.f7984d = zzelj4;
        this.f7985e = zzelj5;
        this.f7986f = zzelj6;
    }

    public final /* synthetic */ Object get() {
        return new zzdfe(this.f7981a.get(), this.f7982b.get().intValue(), this.f7983c.get(), this.f7984d.get(), this.f7985e.get(), this.f7986f.get());
    }
}
