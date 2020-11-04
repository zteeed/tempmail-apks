package d.a.a0.g;

import d.a.z.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SchedulerPoolFactory */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f13836a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f13837b;

    /* renamed from: c  reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f13838c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    static final Map<ScheduledThreadPoolExecutor, Object> f13839d = new ConcurrentHashMap();

    /* compiled from: SchedulerPoolFactory */
    static final class a implements Runnable {
        a() {
        }

        public void run() {
            Iterator it = new ArrayList(l.f13839d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    l.f13839d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* compiled from: SchedulerPoolFactory */
    static final class b implements n<String, String> {
        b() {
        }

        /* renamed from: a */
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean b2 = b(true, "rx2.purge-enabled", true, true, bVar);
        f13836a = b2;
        f13837b = c(b2, "rx2.purge-period-seconds", 1, 1, bVar);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(f13836a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static boolean b(boolean z, String str, boolean z2, boolean z3, n<String, String> nVar) {
        if (!z) {
            return z3;
        }
        try {
            String apply = nVar.apply(str);
            if (apply == null) {
                return z2;
            }
            return "true".equals(apply);
        } catch (Throwable unused) {
            return z2;
        }
    }

    static int c(boolean z, String str, int i, int i2, n<String, String> nVar) {
        if (!z) {
            return i2;
        }
        try {
            String apply = nVar.apply(str);
            if (apply == null) {
                return i;
            }
            return Integer.parseInt(apply);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static void d() {
        f(f13836a);
    }

    static void e(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f13839d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void f(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = f13838c.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new h("RxSchedulerPurge"));
                    if (f13838c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        a aVar = new a();
                        int i = f13837b;
                        newScheduledThreadPool.scheduleAtFixedRate(aVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }
}
