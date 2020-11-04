package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.PooledExecutorsProvider;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class a implements PooledExecutorsProvider.PooledExecutorFactory {
    a() {
    }

    public final ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
