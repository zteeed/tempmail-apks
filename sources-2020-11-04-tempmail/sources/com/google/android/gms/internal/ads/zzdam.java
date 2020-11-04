package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdam implements zzela<zzdai> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7973a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7974b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f7975c;

    private zzdam(zzelj<Context> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<Executor> zzelj3) {
        this.f7973a = zzelj;
        this.f7974b = zzelj2;
        this.f7975c = zzelj3;
    }

    public static zzdam a(zzelj<Context> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<Executor> zzelj3) {
        return new zzdam(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzdai(this.f7973a.get(), this.f7974b.get(), this.f7975c.get());
    }
}
