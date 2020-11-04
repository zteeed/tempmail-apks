package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class t4 implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f4950b = new AtomicInteger(1);

    t4(zzavy zzavy) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f4950b.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
