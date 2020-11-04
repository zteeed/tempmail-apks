package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class s00<V> extends zzduo<V> {
    private final zzdvf<V> i;

    s00(zzdvf<V> zzdvf) {
        zzdsh.b(zzdvf);
        this.i = zzdvf;
    }

    public final boolean cancel(boolean z) {
        return this.i.cancel(z);
    }

    public final void f(Runnable runnable, Executor executor) {
        this.i.f(runnable, executor);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.i.get();
    }

    public final boolean isCancelled() {
        return this.i.isCancelled();
    }

    public final boolean isDone() {
        return this.i.isDone();
    }

    public final String toString() {
        return this.i.toString();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.i.get(j, timeUnit);
    }
}
