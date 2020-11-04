package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzddz;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcn<S extends zzddz<?>> implements zzdec<S> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdec<S> f8046a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8047b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f8048c;

    public zzdcn(zzdec<S> zzdec, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f8046a = zzdec;
        this.f8047b = j;
        this.f8048c = scheduledExecutorService;
    }

    public final zzdvf<S> b() {
        zzdvf<S> b2 = this.f8046a.b();
        long j = this.f8047b;
        if (j > 0) {
            b2 = zzdux.d(b2, j, TimeUnit.MILLISECONDS, this.f8048c);
        }
        return zzdux.k(b2, Throwable.class, qs.f4936a, zzbbf.f6325f);
    }
}
