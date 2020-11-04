package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcnh implements zzela<zzcnf> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7458a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f7459b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcoa> f7460c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcoy> f7461d;

    public zzcnh(zzelj<ScheduledExecutorService> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcoa> zzelj3, zzelj<zzcoy> zzelj4) {
        this.f7458a = zzelj;
        this.f7459b = zzelj2;
        this.f7460c = zzelj3;
        this.f7461d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzcnf(this.f7458a.get(), this.f7459b.get(), this.f7460c.get(), zzekx.b(this.f7461d));
    }
}
