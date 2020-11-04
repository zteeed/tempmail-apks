package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdoa implements zzela<ScheduledExecutorService> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<ThreadFactory> f8246a;

    public zzdoa(zzelj<ThreadFactory> zzelj) {
        this.f8246a = zzelj;
    }

    public final /* synthetic */ Object get() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, this.f8246a.get());
        zzelg.b(scheduledThreadPoolExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return scheduledThreadPoolExecutor;
    }
}
