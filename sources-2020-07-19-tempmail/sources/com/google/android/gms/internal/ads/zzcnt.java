package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcnt implements zzela<zzcnp> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdla> f7294a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcml> f7295b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdvi> f7296c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7297d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzcqf> f7298e;

    private zzcnt(zzelj<zzdla> zzelj, zzelj<zzcml> zzelj2, zzelj<zzdvi> zzelj3, zzelj<ScheduledExecutorService> zzelj4, zzelj<zzcqf> zzelj5) {
        this.f7294a = zzelj;
        this.f7295b = zzelj2;
        this.f7296c = zzelj3;
        this.f7297d = zzelj4;
        this.f7298e = zzelj5;
    }

    public static zzcnt a(zzelj<zzdla> zzelj, zzelj<zzcml> zzelj2, zzelj<zzdvi> zzelj3, zzelj<ScheduledExecutorService> zzelj4, zzelj<zzcqf> zzelj5) {
        return new zzcnt(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzcnp(this.f7294a.get(), this.f7295b.get(), this.f7296c.get(), this.f7297d.get(), this.f7298e.get());
    }
}
