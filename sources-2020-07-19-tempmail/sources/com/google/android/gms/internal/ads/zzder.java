package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzder implements zzela<zzdeq> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzaxd> f7955a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7956b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7957c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f7958d;

    public zzder(zzelj<zzaxd> zzelj, zzelj<Context> zzelj2, zzelj<ScheduledExecutorService> zzelj3, zzelj<Executor> zzelj4) {
        this.f7955a = zzelj;
        this.f7956b = zzelj2;
        this.f7957c = zzelj3;
        this.f7958d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzdeq(this.f7955a.get(), this.f7956b.get(), this.f7957c.get(), this.f7958d.get());
    }
}
