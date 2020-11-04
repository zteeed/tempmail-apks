package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcmj implements zzela<zzclx> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7422a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7423b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<WeakReference<Context>> f7424c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f7425d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzcix> f7426e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7427f;
    private final zzelj<zzclh> g;
    private final zzelj<zzbbd> h;

    public zzcmj(zzelj<Executor> zzelj, zzelj<Context> zzelj2, zzelj<WeakReference<Context>> zzelj3, zzelj<Executor> zzelj4, zzelj<zzcix> zzelj5, zzelj<ScheduledExecutorService> zzelj6, zzelj<zzclh> zzelj7, zzelj<zzbbd> zzelj8) {
        this.f7422a = zzelj;
        this.f7423b = zzelj2;
        this.f7424c = zzelj3;
        this.f7425d = zzelj4;
        this.f7426e = zzelj5;
        this.f7427f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
    }

    public final /* synthetic */ Object get() {
        return new zzclx(this.f7422a.get(), this.f7423b.get(), this.f7424c.get(), this.f7425d.get(), this.f7426e.get(), this.f7427f.get(), this.g.get(), this.h.get());
    }
}
