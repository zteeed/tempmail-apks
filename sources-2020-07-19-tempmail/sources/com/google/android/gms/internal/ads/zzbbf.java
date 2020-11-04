package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbbf {

    /* renamed from: a  reason: collision with root package name */
    public static final zzdvi f6137a = a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), b("Default")));

    /* renamed from: b  reason: collision with root package name */
    public static final zzdvi f6138b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzdvi f6139c;

    /* renamed from: d  reason: collision with root package name */
    public static final ScheduledExecutorService f6140d = new ScheduledThreadPoolExecutor(3, b("Schedule"));

    /* renamed from: e  reason: collision with root package name */
    public static final zzdvi f6141e = a(new p6());

    /* renamed from: f  reason: collision with root package name */
    public static final zzdvi f6142f = a(zzdvh.c());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), b("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6138b = a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), b("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f6139c = a(threadPoolExecutor2);
    }

    private static zzdvi a(Executor executor) {
        return new r6(executor, (q6) null);
    }

    private static ThreadFactory b(String str) {
        return new q6(str);
    }
}
