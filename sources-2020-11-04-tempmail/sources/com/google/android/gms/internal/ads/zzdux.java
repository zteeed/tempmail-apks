package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.y00;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdux extends w00 {
    public static <V> zzdvf<V> a(Throwable th) {
        zzdsh.b(th);
        return new y00.a(th);
    }

    @SafeVarargs
    public static <V> zzduy<V> b(zzdvf<? extends V>... zzdvfArr) {
        return new zzduy<>(false, zzdss.v(zzdvfArr), (u00) null);
    }

    public static <O> zzdvf<O> c(zzduf<O> zzduf, Executor executor) {
        l10 l10 = new l10(zzduf);
        executor.execute(l10);
        return l10;
    }

    public static <V> zzdvf<V> d(zzdvf<V> zzdvf, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzdvf.isDone()) {
            return zzdvf;
        }
        return i10.K(zzdvf, j, timeUnit, scheduledExecutorService);
    }

    public static <V> V e(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return zzdvx.a(future);
        }
        throw new IllegalStateException(zzdsi.c("Future was expected to be done: %s", future));
    }

    public static <V> void f(zzdvf<V> zzdvf, zzduu<? super V> zzduu, Executor executor) {
        zzdsh.b(zzduu);
        zzdvf.f(new v00(zzdvf, zzduu), executor);
    }

    public static <V> zzdvf<V> g(@NullableDecl V v) {
        if (v == null) {
            return y00.f5523c;
        }
        return new y00(v);
    }

    @SafeVarargs
    public static <V> zzduy<V> h(zzdvf<? extends V>... zzdvfArr) {
        return new zzduy<>(true, zzdss.v(zzdvfArr), (u00) null);
    }

    public static <I, O> zzdvf<O> i(zzdvf<I> zzdvf, zzdrx<? super I, ? extends O> zzdrx, Executor executor) {
        return d00.J(zzdvf, zzdrx, executor);
    }

    public static <I, O> zzdvf<O> j(zzdvf<I> zzdvf, zzduh<? super I, ? extends O> zzduh, Executor executor) {
        return d00.K(zzdvf, zzduh, executor);
    }

    public static <V, X extends Throwable> zzdvf<V> k(zzdvf<? extends V> zzdvf, Class<X> cls, zzduh<? super X, ? extends V> zzduh, Executor executor) {
        return b00.J(zzdvf, cls, zzduh, executor);
    }

    public static <V> V l(Future<V> future) {
        zzdsh.b(future);
        try {
            return zzdvx.a(future);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new zzdup((Error) cause);
            }
            throw new zzdvy(cause);
        }
    }

    public static <V> zzdvf<List<V>> m(Iterable<? extends zzdvf<? extends V>> iterable) {
        return new n00(zzdss.z(iterable), true);
    }

    public static <V> zzduy<V> n(Iterable<? extends zzdvf<? extends V>> iterable) {
        return new zzduy<>(false, zzdss.z(iterable), (u00) null);
    }

    public static <V> zzduy<V> o(Iterable<? extends zzdvf<? extends V>> iterable) {
        return new zzduy<>(true, zzdss.z(iterable), (u00) null);
    }
}
