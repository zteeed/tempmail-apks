package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdod<E, V> implements zzdvf<V> {

    /* renamed from: b  reason: collision with root package name */
    private final E f8247b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8248c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvf<V> f8249d;

    public zzdod(E e2, String str, zzdvf<V> zzdvf) {
        this.f8247b = e2;
        this.f8248c = str;
        this.f8249d = zzdvf;
    }

    public final E a() {
        return this.f8247b;
    }

    public final String b() {
        return this.f8248c;
    }

    public final boolean cancel(boolean z) {
        return this.f8249d.cancel(z);
    }

    public final void f(Runnable runnable, Executor executor) {
        this.f8249d.f(runnable, executor);
    }

    public final V get() throws InterruptedException, ExecutionException {
        return this.f8249d.get();
    }

    public final boolean isCancelled() {
        return this.f8249d.isCancelled();
    }

    public final boolean isDone() {
        return this.f8249d.isDone();
    }

    public final String toString() {
        String str = this.f8248c;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f8249d.get(j, timeUnit);
    }
}
