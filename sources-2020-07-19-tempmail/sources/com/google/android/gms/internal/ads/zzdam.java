package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdam implements zzela<zzdai> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7790a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7791b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f7792c;

    private zzdam(zzelj<Context> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<Executor> zzelj3) {
        this.f7790a = zzelj;
        this.f7791b = zzelj2;
        this.f7792c = zzelj3;
    }

    public static zzdam a(zzelj<Context> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<Executor> zzelj3) {
        return new zzdam(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzdai(this.f7790a.get(), this.f7791b.get(), this.f7792c.get());
    }
}
