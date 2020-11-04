package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfe implements zzdec<zzdfb> {

    /* renamed from: a  reason: collision with root package name */
    private final zzaxd f8157a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8158b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8159c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaxh f8160d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f8161e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f8162f;

    public zzdfe(zzaxd zzaxd, int i, Context context, zzaxh zzaxh, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f8157a = zzaxd;
        this.f8158b = i;
        this.f8159c = context;
        this.f8160d = zzaxh;
        this.f8161e = scheduledExecutorService;
        this.f8162f = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a() throws Exception {
        return this.f8157a.b(this.f8159c, this.f8158b);
    }

    public final zzdvf<zzdfb> b() {
        return zzduo.H(zzdux.c(new rt(this), this.f8162f)).D(tt.f5195a, this.f8162f).C(((Long) zzwg.e().c(zzaav.t0)).longValue(), TimeUnit.MILLISECONDS, this.f8161e).E(Exception.class, new st(this), zzdvh.c());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdfb c(Exception exc) {
        this.f8160d.e(exc, "AttestationTokenSignal");
        return null;
    }
}
