package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbe implements zzdec<zzdbb> {

    /* renamed from: a  reason: collision with root package name */
    private zzame f7998a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f7999b;

    /* renamed from: c  reason: collision with root package name */
    private zzaxx f8000c;

    /* renamed from: d  reason: collision with root package name */
    private ApplicationInfo f8001d;

    /* renamed from: e  reason: collision with root package name */
    zzdla f8002e;

    public zzdbe(zzame zzame, ScheduledExecutorService scheduledExecutorService, zzaxx zzaxx, ApplicationInfo applicationInfo, zzdla zzdla) {
        this.f7998a = zzame;
        this.f7999b = scheduledExecutorService;
        this.f8000c = zzaxx;
        this.f8001d = applicationInfo;
        this.f8002e = zzdla;
    }

    public final zzdvf<zzdbb> b() {
        zzdvf<V> zzdvf;
        if (!zzaca.f5750a.a().booleanValue()) {
            zzdvf = zzdux.g(null);
        } else if (!this.f8000c.j()) {
            zzdvf = zzdux.g(null);
        } else {
            zzdvf = zzdux.k(zzdux.d(this.f7998a.a(this.f8001d), ((Long) zzwg.e().c(zzaav.E1)).longValue(), TimeUnit.MILLISECONDS, this.f7999b), Throwable.class, cs.f3759a, zzbbf.f6325f);
        }
        return zzdux.i(zzdux.i(zzdvf, new ds(this), this.f7999b), bs.f3680a, zzbbf.f6320a);
    }
}
