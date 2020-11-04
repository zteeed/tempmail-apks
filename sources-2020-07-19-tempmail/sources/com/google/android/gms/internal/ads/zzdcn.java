package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzddz;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcn<S extends zzddz<?>> implements zzdec<S> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdec<S> f7863a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7864b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f7865c;

    public zzdcn(zzdec<S> zzdec, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f7863a = zzdec;
        this.f7864b = j;
        this.f7865c = scheduledExecutorService;
    }

    public final zzdvf<S> b() {
        zzdvf<S> b2 = this.f7863a.b();
        long j = this.f7864b;
        if (j > 0) {
            b2 = zzdux.d(b2, j, TimeUnit.MILLISECONDS, this.f7865c);
        }
        return zzdux.k(b2, Throwable.class, qs.f4753a, zzbbf.f6142f);
    }
}
