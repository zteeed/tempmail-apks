package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdvh {
    public static zzdvi a(ExecutorService executorService) {
        if (executorService instanceof zzdvi) {
            return (zzdvi) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new e10((ScheduledExecutorService) executorService);
        }
        return new f10(executorService);
    }

    static Executor b(Executor executor, zzdtu<?> zzdtu) {
        zzdsh.b(executor);
        zzdsh.b(zzdtu);
        if (executor == q00.INSTANCE) {
            return executor;
        }
        return new d10(executor, zzdtu);
    }

    public static Executor c() {
        return q00.INSTANCE;
    }
}
