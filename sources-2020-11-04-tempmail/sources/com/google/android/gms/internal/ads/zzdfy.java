package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfy implements zzdec<zzdfv> {

    /* renamed from: a  reason: collision with root package name */
    private zzame f8189a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f8190b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8191c;

    /* renamed from: d  reason: collision with root package name */
    private ApplicationInfo f8192d;

    public zzdfy(zzame zzame, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f8189a = zzame;
        this.f8190b = scheduledExecutorService;
        this.f8191c = z;
        this.f8192d = applicationInfo;
    }

    public final zzdvf<zzdfv> b() {
        if (!zzaca.f5751b.a().booleanValue()) {
            return zzdux.a(new Exception("Auto Collect Location by gms is disabled."));
        }
        if (!this.f8191c) {
            return zzdux.a(new Exception("Auto Collect Location is false."));
        }
        return zzdux.i(zzdux.d(this.f8189a.a(this.f8192d), ((Long) zzwg.e().c(zzaav.E1)).longValue(), TimeUnit.MILLISECONDS, this.f8190b), zt.f5676a, zzbbf.f6320a);
    }
}
