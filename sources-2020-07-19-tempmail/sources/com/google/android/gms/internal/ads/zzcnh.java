package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcnh implements zzela<zzcnf> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7275a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f7276b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcoa> f7277c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcoy> f7278d;

    public zzcnh(zzelj<ScheduledExecutorService> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcoa> zzelj3, zzelj<zzcoy> zzelj4) {
        this.f7275a = zzelj;
        this.f7276b = zzelj2;
        this.f7277c = zzelj3;
        this.f7278d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzcnf(this.f7275a.get(), this.f7276b.get(), this.f7277c.get(), zzekx.b(this.f7278d));
    }
}
