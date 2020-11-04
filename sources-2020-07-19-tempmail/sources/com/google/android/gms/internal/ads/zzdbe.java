package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbe implements zzdec<zzdbb> {

    /* renamed from: a  reason: collision with root package name */
    private zzame f7815a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f7816b;

    /* renamed from: c  reason: collision with root package name */
    private zzaxx f7817c;

    /* renamed from: d  reason: collision with root package name */
    private ApplicationInfo f7818d;

    /* renamed from: e  reason: collision with root package name */
    zzdla f7819e;

    public zzdbe(zzame zzame, ScheduledExecutorService scheduledExecutorService, zzaxx zzaxx, ApplicationInfo applicationInfo, zzdla zzdla) {
        this.f7815a = zzame;
        this.f7816b = scheduledExecutorService;
        this.f7817c = zzaxx;
        this.f7818d = applicationInfo;
        this.f7819e = zzdla;
    }

    public final zzdvf<zzdbb> b() {
        zzdvf<V> zzdvf;
        if (!zzaca.f5567a.a().booleanValue()) {
            zzdvf = zzdux.g(null);
        } else if (!this.f7817c.j()) {
            zzdvf = zzdux.g(null);
        } else {
            zzdvf = zzdux.k(zzdux.d(this.f7815a.a(this.f7818d), ((Long) zzwg.e().c(zzaav.E1)).longValue(), TimeUnit.MILLISECONDS, this.f7816b), Throwable.class, cs.f3576a, zzbbf.f6142f);
        }
        return zzdux.i(zzdux.i(zzdvf, new ds(this), this.f7816b), bs.f3497a, zzbbf.f6137a);
    }
}
