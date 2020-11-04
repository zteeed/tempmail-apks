package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzder implements zzela<zzdeq> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzaxd> f8138a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f8139b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f8140c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f8141d;

    public zzder(zzelj<zzaxd> zzelj, zzelj<Context> zzelj2, zzelj<ScheduledExecutorService> zzelj3, zzelj<Executor> zzelj4) {
        this.f8138a = zzelj;
        this.f8139b = zzelj2;
        this.f8140c = zzelj3;
        this.f8141d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzdeq(this.f8138a.get(), this.f8139b.get(), this.f8140c.get(), this.f8141d.get());
    }
}
