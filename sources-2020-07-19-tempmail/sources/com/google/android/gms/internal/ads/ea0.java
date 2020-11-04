package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ea0 implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f3701b = Executors.defaultThreadFactory();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f3702c = new AtomicInteger(1);

    ea0() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3701b.newThread(runnable);
        int andIncrement = this.f3702c.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
