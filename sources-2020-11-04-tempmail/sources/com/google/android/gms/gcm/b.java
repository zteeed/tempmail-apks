package com.google.android.gms.gcm;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class b implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f3431b = new AtomicInteger(1);

    b(GcmTaskService gcmTaskService) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f3431b.getAndIncrement();
        StringBuilder sb = new StringBuilder(20);
        sb.append("gcm-task#");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable, sb.toString());
        thread.setPriority(4);
        return thread;
    }
}
