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
    private final Handler f13963b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13964c;

    /* compiled from: HandlerScheduler */
    private static final class a extends t.c {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f13965b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f13966c;

        /* renamed from: d  reason: collision with root package name */
        private volatile boolean f13967d;

        a(Handler handler, boolean z) {
            this.f13965b = handler;
            this.f13966c = z;
        }

        @SuppressLint({"NewApi"})
        public d.a.y.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f13967d) {
                return c.a();
            } else {
                C0160b bVar = new C0160b(this.f13965b, d.a.d0.a.u(runnable));
                Message obtain = Message.obtain(this.f13965b, bVar);
                obtain.obj = this;
                if (this.f13966c) {
                    obtain.setAsynchronous(true);
                }
                this.f13965b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f13967d) {
                    return bVar;
                }
                this.f13965b.removeCallbacks(bVar);
                return c.a();
            }
        }

        public void dispose() {
            this.f13967d = true;
            this.f13965b.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: d.a.x.b.b$b  reason: collision with other inner class name */
    /* compiled from: HandlerScheduler */
    private static final class C0160b implements Runnable, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f13968b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f13969c;

        C0160b(Handler handler, Runnable runnable) {
            this.f13968b = handler;
            this.f13969c = runnable;
        }

        public void dispose() {
            this.f13968b.removeCallbacks(this);
        }

        public void run() {
            try {
                this.f13969c.run();
            } catch (Throwable th) {
                d.a.d0.a.s(th);
            }
        }
    }

    b(Handler handler, boolean z) {
        this.f13963b = handler;
        this.f13964c = z;
    }

    public t.c a() {
        return new a(this.f13963b, this.f13964c);
    }

    @SuppressLint({"NewApi"})
    public d.a.y.b d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C0160b bVar = new C0160b(this.f13963b, d.a.d0.a.u(runnable));
            Message obtain = Message.obtain(this.f13963b, bVar);
            if (this.f13964c) {
                obtain.setAsynchronous(true);
            }
            this.f13963b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
