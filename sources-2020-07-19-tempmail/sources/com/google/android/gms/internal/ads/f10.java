package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
class f10 extends zzdtx {

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f3756b;

    f10(ExecutorService executorService) {
        zzdsh.b(executorService);
        this.f3756b = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f3756b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f3756b.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f3756b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f3756b.isTerminated();
    }

    public final void shutdown() {
        this.f3756b.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f3756b.shutdownNow();
    }
}
