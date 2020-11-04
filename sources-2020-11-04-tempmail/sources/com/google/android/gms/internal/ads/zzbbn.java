package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbbn<T> implements zzdvf<T> {

    /* renamed from: b  reason: collision with root package name */
    private final zzdvq<T> f6326b = zzdvq.C();

    private static boolean d(boolean z) {
        if (!z) {
            zzq.zzla().h(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final boolean a(T t) {
        boolean i = this.f6326b.i(t);
        d(i);
        return i;
    }

    public final boolean c(Throwable th) {
        boolean j = this.f6326b.j(th);
        d(j);
        return j;
    }

    public boolean cancel(boolean z) {
        return this.f6326b.cancel(z);
    }

    public void f(Runnable runnable, Executor executor) {
        this.f6326b.f(runnable, executor);
    }

    public T get() throws ExecutionException, InterruptedException {
        return this.f6326b.get();
    }

    public boolean isCancelled() {
        return this.f6326b.isCancelled();
    }

    public boolean isDone() {
        return this.f6326b.isDone();
    }

    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f6326b.get(j, timeUnit);
    }
}
