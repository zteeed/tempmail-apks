package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcnt implements zzela<zzcnp> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdla> f7477a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcml> f7478b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdvi> f7479c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7480d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzcqf> f7481e;

    private zzcnt(zzelj<zzdla> zzelj, zzelj<zzcml> zzelj2, zzelj<zzdvi> zzelj3, zzelj<ScheduledExecutorService> zzelj4, zzelj<zzcqf> zzelj5) {
        this.f7477a = zzelj;
        this.f7478b = zzelj2;
        this.f7479c = zzelj3;
        this.f7480d = zzelj4;
        this.f7481e = zzelj5;
    }

    public static zzcnt a(zzelj<zzdla> zzelj, zzelj<zzcml> zzelj2, zzelj<zzdvi> zzelj3, zzelj<ScheduledExecutorService> zzelj4, zzelj<zzcqf> zzelj5) {
        return new zzcnt(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzcnp(this.f7477a.get(), this.f7478b.get(), this.f7479c.get(), this.f7480d.get(), this.f7481e.get());
    }
}
