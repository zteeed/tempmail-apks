package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdoz implements zzela<zzdou> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f8453a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f8454b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<ay> f8455c;

    private zzdoz(zzelj<zzdvi> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<ay> zzelj3) {
        this.f8453a = zzelj;
        this.f8454b = zzelj2;
        this.f8455c = zzelj3;
    }

    public static zzdoz a(zzelj<zzdvi> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<ay> zzelj3) {
        return new zzdoz(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzdou(this.f8453a.get(), this.f8454b.get(), this.f8455c.get());
    }
}
