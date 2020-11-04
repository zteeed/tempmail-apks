package b.b;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadFactory f2076d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static b f2077e;

    /* renamed from: a  reason: collision with root package name */
    private Executor f2078a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f2079b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledExecutorService f2080c;

    static class a implements ThreadFactory {

        /* renamed from: b.b.b$a$a  reason: collision with other inner class name */
        class C0058a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Runnable f2081b;

            C0058a(a aVar, Runnable runnable) {
                this.f2081b = runnable;
            }

            static boolean a(Context context, String str) {
                int a2 = androidx.core.content.a.a(context, str);
                StringBuilder sb = new StringBuilder("is Permission Available: ");
                sb.append(str);
                sb.append("; res: ");
                sb.append(a2);
                e.e(sb.toString());
                return a2 == 0;
            }

            public final void run() {
                if (Build.VERSION.SDK_INT >= 14) {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                }
                this.f2081b.run();
            }
        }

        a() {
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(new C0058a(this, runnable));
        }
    }

    private b() {
    }

    public static b a() {
        if (f2077e == null) {
            f2077e = new b();
        }
        return f2077e;
    }

    private static void d(ExecutorService executorService) {
        try {
            e.e("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                e.e("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            e.e("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                e.e("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                e.e("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }

    public ScheduledExecutorService b() {
        if (this.f2080c == null) {
            this.f2080c = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f2080c;
    }

    public Executor c() {
        Executor executor = this.f2078a;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.f2078a).isTerminated() || ((ThreadPoolExecutor) this.f2078a).isTerminating()))) {
            if (Build.VERSION.SDK_INT < 11) {
                return Executors.newSingleThreadExecutor();
            }
            this.f2078a = Executors.newFixedThreadPool(2, f2076d);
        }
        return this.f2078a;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            d(this.f2079b);
            if (this.f2078a instanceof ThreadPoolExecutor) {
                d((ThreadPoolExecutor) this.f2078a);
            }
        } catch (Throwable th) {
            e.b("failed to stop Executors", th);
        }
    }

    /* access modifiers changed from: package-private */
    public final ScheduledThreadPoolExecutor f() {
        ScheduledExecutorService scheduledExecutorService = this.f2079b;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.f2079b.isTerminated()) {
            this.f2079b = Executors.newScheduledThreadPool(2, f2076d);
        }
        return (ScheduledThreadPoolExecutor) this.f2079b;
    }
}
