package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public interface zzdvi extends ExecutorService {
    <T> zzdvf<T> f(Callable<T> callable);

    zzdvf<?> g(Runnable runnable);
}
