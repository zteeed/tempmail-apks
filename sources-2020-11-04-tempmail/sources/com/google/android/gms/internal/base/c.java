package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class c implements zal {
    private c() {
    }

    public final ExecutorService a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.newFixedThreadPool(2, threadFactory);
    }
}
