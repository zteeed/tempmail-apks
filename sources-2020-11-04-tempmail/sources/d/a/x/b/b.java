package d.a.x.b;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import d.a.t;
import d.a.y.c;
import java.util.concurrent.TimeUnit;

/* compiled from: HandlerScheduler */
final class b extends t {

    /* renamed from: b  reason: collision with root package name */
    private final Handler f14365b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14366c;

    /* compiled from: HandlerScheduler */
    private static final class a extends t.c {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f14367b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f14368c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f14369d;

        a(Handler handler, boolean z) {
            this.f14367b = handler;
            this.f14368c = z;
        }

        @SuppressLint({"NewApi"})
        public d.a.y.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f14369d) {
                return c.a();
            } else {
                C0154b bVar = new C0154b(this.f14367b, d.a.d0.a.u(runnable));
                Message obtain = Message.obtain(this.f14367b, bVar);
                obtain.obj = this;
                if (this.f14368c) {
                    obtain.setAsynchronous(true);
                }
                this.f14367b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f14369d) {
                    return bVar;
                }
                this.f14367b.removeCallbacks(bVar);
                return c.a();
            }
        }

        public void dispose() {
            this.f14369d = true;
            this.f14367b.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: d.a.x.b.b$b  reason: collision with other inner class name */
    /* compiled from: HandlerScheduler */
    private static final class C0154b implements Runnable, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f14370b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f14371c;

        C0154b(Handler handler, Runnable runnable) {
            this.f14370b = handler;
            this.f14371c = runnable;
        }

        public void dispose() {
            this.f14370b.removeCallbacks(this);
        }

        public void run() {
            try {
                this.f14371c.run();
            } catch (Throwable th) {
                d.a.d0.a.s(th);
            }
        }
    }

    b(Handler handler, boolean z) {
        this.f14365b = handler;
        this.f14366c = z;
    }

    public t.c a() {
        return new a(this.f14365b, this.f14366c);
    }

    @SuppressLint({"NewApi"})
    public d.a.y.b d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C0154b bVar = new C0154b(this.f14365b, d.a.d0.a.u(runnable));
            Message obtain = Message.obtain(this.f14365b, bVar);
            if (this.f14366c) {
                obtain.setAsynchronous(true);
            }
            this.f14365b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
