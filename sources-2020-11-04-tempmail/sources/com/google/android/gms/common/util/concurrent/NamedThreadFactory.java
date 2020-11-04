package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private final String f3314b;

    /* renamed from: c  reason: collision with root package name */
    private final ThreadFactory f3315c;

    @KeepForSdk
    public NamedThreadFactory(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f3315c.newThread(new a(runnable, 0));
        newThread.setName(this.f3314b);
        return newThread;
    }

    private NamedThreadFactory(String str, int i) {
        this.f3315c = Executors.defaultThreadFactory();
        Preconditions.l(str, "Name must not be null");
        this.f3314b = str;
    }
}
