package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzduo<V> extends x00<V> {
    zzduo() {
    }

    public static <V> zzduo<V> H(zzdvf<V> zzdvf) {
        if (zzdvf instanceof zzduo) {
            return (zzduo) zzdvf;
        }
        return new s00(zzdvf);
    }

    public final zzduo<V> C(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (zzduo) zzdux.d(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> zzduo<T> D(zzdrx<? super V, T> zzdrx, Executor executor) {
        zzdsh.b(zzdrx);
        e00 e00 = new e00(this, zzdrx);
        f(e00, zzdvh.b(executor, e00));
        return e00;
    }

    public final <X extends Throwable> zzduo<V> E(Class<X> cls, zzdrx<? super X, ? extends V> zzdrx, Executor executor) {
        c00 c00 = new c00(this, cls, zzdrx);
        f(c00, zzdvh.b(executor, c00));
        return c00;
    }

    public final <X extends Throwable> zzduo<V> F(Class<X> cls, zzduh<? super X, ? extends V> zzduh, Executor executor) {
        a00 a00 = new a00(this, cls, zzduh);
        f(a00, zzdvh.b(executor, a00));
        return a00;
    }

    public final <T> zzduo<T> G(zzduh<? super V, T> zzduh, Executor executor) {
        zzdsh.b(executor);
        f00 f00 = new f00(this, zzduh);
        f(f00, zzdvh.b(executor, f00));
        return f00;
    }
}
