package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdgc implements zzdec<zzdfz> {

    /* renamed from: a  reason: collision with root package name */
    private zzaqq f8198a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f8199b;

    /* renamed from: c  reason: collision with root package name */
    private Context f8200c;

    public zzdgc(zzaqq zzaqq, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f8198a = zzaqq;
        this.f8199b = scheduledExecutorService;
        this.f8200c = context;
    }

    public final zzdvf<zzdfz> b() {
        return zzdux.i(zzdux.d(this.f8198a.a(this.f8200c), ((Long) zzwg.e().c(zzaav.J1)).longValue(), TimeUnit.MILLISECONDS, this.f8199b), bu.f3682a, zzbbf.f6320a);
    }
}
