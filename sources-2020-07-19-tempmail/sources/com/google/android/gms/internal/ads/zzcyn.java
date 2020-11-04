package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyn implements zzela<zzcxz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbif> f7700a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7701b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzeg> f7702c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f7703d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdll<zzcgr>> f7704e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzdvi> f7705f;
    private final zzelj<ScheduledExecutorService> g;

    public zzcyn(zzelj<zzbif> zzelj, zzelj<Context> zzelj2, zzelj<zzeg> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zzdll<zzcgr>> zzelj5, zzelj<zzdvi> zzelj6, zzelj<ScheduledExecutorService> zzelj7) {
        this.f7700a = zzelj;
        this.f7701b = zzelj2;
        this.f7702c = zzelj3;
        this.f7703d = zzelj4;
        this.f7704e = zzelj5;
        this.f7705f = zzelj6;
        this.g = zzelj7;
    }

    public final /* synthetic */ Object get() {
        return new zzcxz(this.f7700a.get(), this.f7701b.get(), this.f7702c.get(), this.f7703d.get(), this.f7704e.get(), this.f7705f.get(), this.g.get());
    }
}
