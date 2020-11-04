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
    static final h f14405d;

    /* renamed from: e  reason: collision with root package name */
    static final h f14406e;

    /* renamed from: f  reason: collision with root package name */
    private static final long f14407f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private static final TimeUnit g = TimeUnit.SECONDS;
    static final c h;
    static final a i;

    /* renamed from: b  reason: collision with root package name */
    final ThreadFactory f14408b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<a> f14409c;

    /* compiled from: IoScheduler */
    static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final long f14410b;

        /* renamed from: c  reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f14411c;

        /* renamed from: d  reason: collision with root package name */
        final d.a.y.a f14412d;

        /* renamed from: e  reason: collision with root package name */
        private final ScheduledExecutorService f14413e;

        /* renamed from: f  reason: collision with root package name */
        private final Future<?> f14414f;
        private final ThreadFactory g;

        a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.f14410b = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f14411c = new ConcurrentLinkedQueue<>();
            this.f14412d = new d.a.y.a();
            this.g = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, d.f14406e);
                long j2 = this.f14410b;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f14413e = scheduledExecutorService;
            this.f14414f = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f14411c.isEmpty()) {
                long c2 = c();
                Iterator<c> it = this.f14411c.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.i() > c2) {
                        return;
                    }
                    if (this.f14411c.remove(next)) {
                        this.f14412d.a(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public c b() {
            if (this.f14412d.f()) {
                return d.h;
            }
            while (!this.f14411c.isEmpty()) {
                c poll = this.f14411c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.g);
            this.f14412d.b(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public long c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        public void d(c cVar) {
            cVar.j(c() + this.f14410b);
            this.f14411c.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f14412d.dispose();
            Future<?> future = this.f14414f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f14413e;
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
        private final d.a.y.a f14415b;

        /* renamed from: c  reason: collision with root package name */
        private final a f14416c;

        /* renamed from: d  reason: collision with root package name */
        private final c f14417d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicBoolean f14418e = new AtomicBoolean();

        b(a aVar) {
            this.f14416c = aVar;
            this.f14415b = new d.a.y.a();
            this.f14417d = aVar.b();
        }

        public d.a.y.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f14415b.f()) {
                return d.a.a0.a.d.INSTANCE;
            }
            return this.f14417d.e(runnable, j, timeUnit, this.f14415b);
        }

        public void dispose() {
            if (this.f14418e.compareAndSet(false, true)) {
                this.f14415b.dispose();
                this.f14416c.d(this.f14417d);
            }
        }
    }

    /* compiled from: IoScheduler */
    static final class c extends f {

        /* renamed from: d  reason: collision with root package name */
        private long f14419d = 0;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        public long i() {
            return this.f14419d;
        }

        public void j(long j) {
            this.f14419d = j;
        }
    }

    static {
        c cVar = new c(new h("RxCachedThreadSchedulerShutdown"));
        h = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f14405d = new h("RxCachedThreadScheduler", max);
        f14406e = new h("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0, (TimeUnit) null, f14405d);
        i = aVar;
        aVar.e();
    }

    public d() {
        this(f14405d);
    }

    public t.c a() {
        return new b(this.f14409c.get());
    }

    public void f() {
        a aVar = new a(f14407f, g, this.f14408b);
        if (!this.f14409c.compareAndSet(i, aVar)) {
            aVar.e();
        }
    }

    public d(ThreadFactory threadFactory) {
        this.f14408b = threadFactory;
        this.f14409c = new AtomicReference<>(i);
        f();
    }
}
