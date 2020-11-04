package com.google.android.gms.internal.firebase_messaging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
public interface zzb {
    ExecutorService a(ThreadFactory threadFactory, int i);

    ScheduledExecutorService b(int i, ThreadFactory threadFactory, int i2);
}
