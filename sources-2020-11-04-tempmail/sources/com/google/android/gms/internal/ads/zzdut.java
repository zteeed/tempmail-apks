package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzdut<V> extends zzdsp implements Future<V> {
    protected zzdut() {
    }

    public boolean cancel(boolean z) {
        return g().cancel(z);
    }

    public V get() throws InterruptedException, ExecutionException {
        return g().get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract Future<? extends V> g();

    public boolean isCancelled() {
        return g().isCancelled();
    }

    public boolean isDone() {
        return g().isDone();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return g().get(j, timeUnit);
    }
}
