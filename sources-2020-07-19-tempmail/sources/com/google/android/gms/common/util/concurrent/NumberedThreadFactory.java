package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final String f3133b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f3134c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadFactory f3135d;

    @KeepForSdk
    public NumberedThreadFactory(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f3135d.newThread(new a(runnable, 0));
        String str = this.f3133b;
        int andIncrement = this.f3134c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }

    private NumberedThreadFactory(String str, int i) {
        this.f3134c = new AtomicInteger();
        this.f3135d = Executors.defaultThreadFactory();
        Preconditions.l(str, "Name must not be null");
        this.f3133b = str;
    }
}
