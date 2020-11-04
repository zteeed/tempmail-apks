package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
public class PooledExecutorsProvider {

    /* renamed from: a  reason: collision with root package name */
    private static PooledExecutorFactory f3074a;

    public interface PooledExecutorFactory {
        @KeepForSdk
        ScheduledExecutorService a();
    }

    private PooledExecutorsProvider() {
    }

    @KeepForSdk
    public static synchronized PooledExecutorFactory a() {
        PooledExecutorFactory pooledExecutorFactory;
        synchronized (PooledExecutorsProvider.class) {
            if (f3074a == null) {
                f3074a = new a();
            }
            pooledExecutorFactory = f3074a;
        }
        return pooledExecutorFactory;
    }
}
