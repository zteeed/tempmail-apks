package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfi implements zzela<zzdfe> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzaxd> f8164a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Integer> f8165b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f8166c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzaxh> f8167d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f8168e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<Executor> f8169f;

    public zzdfi(zzelj<zzaxd> zzelj, zzelj<Integer> zzelj2, zzelj<Context> zzelj3, zzelj<zzaxh> zzelj4, zzelj<ScheduledExecutorService> zzelj5, zzelj<Executor> zzelj6) {
        this.f8164a = zzelj;
        this.f8165b = zzelj2;
        this.f8166c = zzelj3;
        this.f8167d = zzelj4;
        this.f8168e = zzelj5;
        this.f8169f = zzelj6;
    }

    public final /* synthetic */ Object get() {
        return new zzdfe(this.f8164a.get(), this.f8165b.get().intValue(), this.f8166c.get(), this.f8167d.get(), this.f8168e.get(), this.f8169f.get());
    }
}
