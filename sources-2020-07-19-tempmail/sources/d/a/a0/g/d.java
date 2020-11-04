package d.a.a0.g;

import d.a.t;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IoScheduler */
public final class d extends t {

    /* renamed from: d  reason: collision with root package name */
    static final h f13809d;

    /* renamed from: e  reason: collision with root package name */
    static final h f13810e;

    /* renamed from: f  reason: collision with root package name */
    private static final long f13811f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private static final TimeUnit g = TimeUnit.SECONDS;
    static final c h;
    static final a i;

    /* renamed from: b  reason: collision with root package name */
    final ThreadFactory f13812b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<a> f13813c;

    /* compiled from: IoScheduler */
    static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final long f13814b;

        /* renamed from: c  reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f13815c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.y.a f13816d;

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledExecutorService f13817e;

        /* renamed from: f  reason: collision with root package name */
        private final Future<?> f13818f;
        private final ThreadFactory g;

        a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.f13814b = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f13815c = new ConcurrentLinkedQueue<>();
            this.f13816d = new d.a.y.a();
            this.g = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, d.f13810e);
                long j2 = this.f13814b;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f13817e = scheduledExecutorService;
            this.f13818f = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f13815c.isEmpty()) {
                long c2 = c();
                Iterator<c> it = this.f13815c.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.i() > c2) {
                        return;
                    }
                    if (this.f13815c.remove(next)) {
                        this.f13816d.a(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public c b() {
            if (this.f13816d.f()) {
                return d.h;
            }
            while (!this.f13815c.isEmpty()) {
                c poll = this.f13815c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.g);
            this.f13816d.b(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public long c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        public void d(c cVar) {
            cVar.j(c() + this.f13814b);
            this.f13815c.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f13816d.dispose();
            Future<?> future = this.f13818f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f13817e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            a();
        }
    }

    /* compiled from: IoScheduler */
    static final class b extends t.c {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.y.a f13819b;

        /* renamed from: c  reason: collision with root package name */
        private final a f13820c;

        /* renamed from: d  reason: collision with root package name */
        private final c f13821d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicBoolean f13822e = new AtomicBoolean();

        b(a aVar) {
            this.f13820c = aVar;
            this.f13819b = new d.a.y.a();
            this.f13821d = aVar.b();
        }

        public d.a.y.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f13819b.f()) {
                return d.a.a0.a.d.INSTANCE;
            }
            return this.f13821d.e(runnable, j, timeUnit, this.f13819b);
        }

        public void dispose() {
            if (this.f13822e.compareAndSet(false, true)) {
                this.f13819b.dispose();
                this.f13820c.d(this.f13821d);
            }
        }
    }

    /* compiled from: IoScheduler */
    static final class c extends f {

        /* renamed from: d  reason: collision with root package name */
        private long f13823d = 0;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        public long i() {
            return this.f13823d;
        }

        public void j(long j) {
            this.f13823d = j;
        }
    }

    static {
        c cVar = new c(new h("RxCachedThreadSchedulerShutdown"));
        h = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f13809d = new h("RxCachedThreadScheduler", max);
        f13810e = new h("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0, (TimeUnit) null, f13809d);
        i = aVar;
        aVar.e();
    }

    public d() {
        this(f13809d);
    }

    public t.c a() {
        return new b(this.f13813c.get());
    }

    public void f() {
        a aVar = new a(f13811f, g, this.f13812b);
        if (!this.f13813c.compareAndSet(i, aVar)) {
            aVar.e();
        }
    }

    public d(ThreadFactory threadFactory) {
        this.f13812b = threadFactory;
        this.f13813c = new AtomicReference<>(i);
        f();
    }
}
