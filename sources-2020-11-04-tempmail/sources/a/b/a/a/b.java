package a.b.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f79a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f80b = Executors.newFixedThreadPool(4, new a(this));

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f81c;

    /* compiled from: DefaultTaskExecutor */
    class a implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f82b = new AtomicInteger(0);

        a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f82b.getAndIncrement())}));
            return thread;
        }
    }

    private static Handler c(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void b(Runnable runnable) {
        if (this.f81c == null) {
            synchronized (this.f79a) {
                if (this.f81c == null) {
                    this.f81c = c(Looper.getMainLooper());
                }
            }
        }
        this.f81c.post(runnable);
    }
}
