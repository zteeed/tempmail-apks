package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class f implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private ThreadFactory f9393b = Executors.defaultThreadFactory();

    f(zzag zzag) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f9393b.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
