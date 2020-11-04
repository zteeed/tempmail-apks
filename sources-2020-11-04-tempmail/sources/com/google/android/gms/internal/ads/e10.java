package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class e10 extends f10 implements zzdvi, ScheduledExecutorService {

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f3859c;

    e10(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        zzdsh.b(scheduledExecutorService);
        this.f3859c = scheduledExecutorService;
    }

    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        l10 J = l10.J(callable);
        return new h10(J, this.f3859c.schedule(J, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        g10 g10 = new g10(runnable);
        return new h10(g10, this.f3859c.scheduleAtFixedRate(g10, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        g10 g10 = new g10(runnable);
        return new h10(g10, this.f3859c.scheduleWithFixedDelay(g10, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        l10 I = l10.I(runnable, null);
        return new h10(I, this.f3859c.schedule(I, j, timeUnit));
    }
}
