package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcmj implements zzela<zzclx> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7239a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7240b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<WeakReference<Context>> f7241c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f7242d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzcix> f7243e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7244f;
    private final zzelj<zzclh> g;
    private final zzelj<zzbbd> h;

    public zzcmj(zzelj<Executor> zzelj, zzelj<Context> zzelj2, zzelj<WeakReference<Context>> zzelj3, zzelj<Executor> zzelj4, zzelj<zzcix> zzelj5, zzelj<ScheduledExecutorService> zzelj6, zzelj<zzclh> zzelj7, zzelj<zzbbd> zzelj8) {
        this.f7239a = zzelj;
        this.f7240b = zzelj2;
        this.f7241c = zzelj3;
        this.f7242d = zzelj4;
        this.f7243e = zzelj5;
        this.f7244f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
    }

    public final /* synthetic */ Object get() {
        return new zzclx(this.f7239a.get(), this.f7240b.get(), this.f7241c.get(), this.f7242d.get(), this.f7243e.get(), this.f7244f.get(), this.g.get(), this.h.get());
    }
}
