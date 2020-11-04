package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class jx implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f4167b = new AtomicInteger(1);

    jx() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f4167b.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
