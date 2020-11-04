package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfy implements zzdec<zzdfv> {

    /* renamed from: a  reason: collision with root package name */
    private zzame f8006a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f8007b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8008c;

    /* renamed from: d  reason: collision with root package name */
    private ApplicationInfo f8009d;

    public zzdfy(zzame zzame, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f8006a = zzame;
        this.f8007b = scheduledExecutorService;
        this.f8008c = z;
        this.f8009d = applicationInfo;
    }

    public final zzdvf<zzdfv> b() {
        if (!zzaca.f5568b.a().booleanValue()) {
            return zzdux.a(new Exception("Auto Collect Location by gms is disabled."));
        }
        if (!this.f8008c) {
            return zzdux.a(new Exception("Auto Collect Location is false."));
        }
        return zzdux.i(zzdux.d(this.f8006a.a(this.f8009d), ((Long) zzwg.e().c(zzaav.E1)).longValue(), TimeUnit.MILLISECONDS, this.f8007b), zt.f5493a, zzbbf.f6137a);
    }
}
