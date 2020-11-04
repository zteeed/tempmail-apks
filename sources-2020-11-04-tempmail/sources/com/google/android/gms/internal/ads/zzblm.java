package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblm implements zzela<zzblk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6509a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6510b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f6511c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdkw> f6512d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdkk> f6513e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzdpd> f6514f;
    private final zzelj<View> g;
    private final zzelj<zzeg> h;
    private final zzelj<zzabv> i;

    private zzblm(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<ScheduledExecutorService> zzelj3, zzelj<zzdkw> zzelj4, zzelj<zzdkk> zzelj5, zzelj<zzdpd> zzelj6, zzelj<View> zzelj7, zzelj<zzeg> zzelj8, zzelj<zzabv> zzelj9) {
        this.f6509a = zzelj;
        this.f6510b = zzelj2;
        this.f6511c = zzelj3;
        this.f6512d = zzelj4;
        this.f6513e = zzelj5;
        this.f6514f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
        this.i = zzelj9;
    }

    public static zzblm a(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<ScheduledExecutorService> zzelj3, zzelj<zzdkw> zzelj4, zzelj<zzdkk> zzelj5, zzelj<zzdpd> zzelj6, zzelj<View> zzelj7, zzelj<zzeg> zzelj8, zzelj<zzabv> zzelj9) {
        return new zzblm(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6, zzelj7, zzelj8, zzelj9);
    }

    public final /* synthetic */ Object get() {
        return new zzblk(this.f6509a.get(), this.f6510b.get(), this.f6511c.get(), this.f6512d.get(), this.f6513e.get(), this.f6514f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
