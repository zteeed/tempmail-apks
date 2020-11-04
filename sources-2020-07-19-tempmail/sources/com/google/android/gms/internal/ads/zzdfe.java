package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfe implements zzdec<zzdfb> {

    /* renamed from: a  reason: collision with root package name */
    private final zzaxd f7974a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7975b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7976c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaxh f7977d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f7978e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f7979f;

    public zzdfe(zzaxd zzaxd, int i, Context context, zzaxh zzaxh, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f7974a = zzaxd;
        this.f7975b = i;
        this.f7976c = context;
        this.f7977d = zzaxh;
        this.f7978e = scheduledExecutorService;
        this.f7979f = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a() throws Exception {
        return this.f7974a.b(this.f7976c, this.f7975b);
    }

    public final zzdvf<zzdfb> b() {
        return zzduo.H(zzdux.c(new rt(this), this.f7979f)).D(tt.f5012a, this.f7979f).C(((Long) zzwg.e().c(zzaav.t0)).longValue(), TimeUnit.MILLISECONDS, this.f7978e).E(Exception.class, new st(this), zzdvh.c());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdfb c(Exception exc) {
        this.f7977d.e(exc, "AttestationTokenSignal");
        return null;
    }
}
