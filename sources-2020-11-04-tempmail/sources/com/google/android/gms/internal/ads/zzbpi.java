package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpi {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6681a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f6682b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf<zzbph> f6683c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f6684d = true;

    public zzbpi(Executor executor, ScheduledExecutorService scheduledExecutorService, zzdvf<zzbph> zzdvf) {
        this.f6681a = executor;
        this.f6682b = scheduledExecutorService;
        this.f6683c = zzdvf;
    }

    /* access modifiers changed from: private */
    public final void f(List<? extends zzdvf<? extends zzbpb>> list, zzduu<zzbpb> zzduu) {
        if (list == null || list.isEmpty()) {
            this.f6681a.execute(new rc(zzduu));
            return;
        }
        zzdvf<O> g = zzdux.g(null);
        for (zzdvf tcVar : list) {
            g = zzdux.j(zzdux.k(g, Throwable.class, new qc(zzduu), this.f6681a), new tc(this, zzduu, tcVar), this.f6681a);
        }
        zzdux.f(g, new uc(this, zzduu), this.f6681a);
    }

    /* access modifiers changed from: private */
    public final void g() {
        zzbbf.f6324e.execute(new sc(this));
    }

    public final boolean a() {
        return this.f6684d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf b(zzduu zzduu, zzdvf zzdvf, zzbpb zzbpb) throws Exception {
        if (zzbpb != null) {
            zzduu.onSuccess(zzbpb);
        }
        return zzdux.d(zzdvf, zzacu.f5797a.a().longValue(), TimeUnit.MILLISECONDS, this.f6682b);
    }

    public final void e(zzduu<zzbpb> zzduu) {
        zzdux.f(this.f6683c, new vc(this, zzduu), this.f6681a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        this.f6684d = false;
    }
}
