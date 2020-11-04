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
    private static final ThreadFactory f1978d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static b f1979e;

    /* renamed from: a  reason: collision with root package name */
    private Executor f1980a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f1981b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledExecutorService f1982c;

    static class a implements ThreadFactory {

        /* renamed from: b.b.b$a$a  reason: collision with other inner class name */
        class C0058a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Runnable f1983b;

            C0058a(a aVar, Runnable runnable) {
                this.f1983b = runnable;
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
                this.f1983b.run();
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
        if (f1979e == null) {
            f1979e = new b();
        }
        return f1979e;
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
        if (this.f1982c == null) {
            this.f1982c = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f1982c;
    }

    public Executor c() {
        Executor executor = this.f1980a;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.f1980a).isTerminated() || ((ThreadPoolExecutor) this.f1980a).isTerminating()))) {
            if (Build.VERSION.SDK_INT < 11) {
                return Executors.newSingleThreadExecutor();
            }
            this.f1980a = Executors.newFixedThreadPool(2, f1978d);
        }
        return this.f1980a;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            d(this.f1981b);
            if (this.f1980a instanceof ThreadPoolExecutor) {
                d((ThreadPoolExecutor) this.f1980a);
            }
        } catch (Throwable th) {
            e.b("failed to stop Executors", th);
        }
    }

    /* access modifiers changed from: package-private */
    public final ScheduledThreadPoolExecutor f() {
        ScheduledExecutorService scheduledExecutorService = this.f1981b;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.f1981b.isTerminated()) {
            this.f1981b = Executors.newScheduledThreadPool(2, f1978d);
        }
        return (ScheduledThreadPoolExecutor) this.f1981b;
    }
}
