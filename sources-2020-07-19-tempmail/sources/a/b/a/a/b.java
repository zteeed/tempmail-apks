package a.b.a.a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f79a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f80b = Executors.newFixedThreadPool(2, new a(this));

    /* compiled from: DefaultTaskExecutor */
    class a implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f81b = new AtomicInteger(0);

        a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f81b.getAndIncrement())}));
            return thread;
        }
    }

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
