package d.a.a0.g;

import d.a.a0.a.d;
import d.a.t;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TrampolineScheduler */
public final class n extends t {

    /* renamed from: b  reason: collision with root package name */
    private static final n f14442b = new n();

    /* compiled from: TrampolineScheduler */
    static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f14443b;

        /* renamed from: c  reason: collision with root package name */
        private final c f14444c;

        /* renamed from: d  reason: collision with root package name */
        private final long f14445d;

        a(Runnable runnable, c cVar, long j) {
            this.f14443b = runnable;
            this.f14444c = cVar;
            this.f14445d = j;
        }

        public void run() {
            if (!this.f14444c.f14453e) {
                long a2 = this.f14444c.a(TimeUnit.MILLISECONDS);
                long j = this.f14445d;
                if (j > a2) {
                    try {
                        Thread.sleep(j - a2);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        d.a.d0.a.s(e2);
                        return;
                    }
                }
                if (!this.f14444c.f14453e) {
                    this.f14443b.run();
                }
            }
        }
    }

    /* compiled from: TrampolineScheduler */
    static final class b implements Comparable<b> {

        /* renamed from: b  reason: collision with root package name */
        final Runnable f14446b;

        /* renamed from: c  reason: collision with root package name */
        final long f14447c;

        /* renamed from: d  reason: collision with root package name */
        final int f14448d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f14449e;

        b(Runnable runnable, Long l, int i) {
            this.f14446b = runnable;
            this.f14447c = l.longValue();
            this.f14448d = i;
        }

        /* renamed from: f */
        public int compareTo(b bVar) {
            int b2 = d.a.a0.b.b.b(this.f14447c, bVar.f14447c);
            return b2 == 0 ? d.a.a0.b.b.a(this.f14448d, bVar.f14448d) : b2;
        }
    }

    /* compiled from: TrampolineScheduler */
    static final class c extends t.c implements d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final PriorityBlockingQueue<b> f14450b = new PriorityBlockingQueue<>();

        /* renamed from: c  reason: collision with root package name */
        private final AtomicInteger f14451c = new AtomicInteger();

        /* renamed from: d  reason: collision with root package name */
        final AtomicInteger f14452d = new AtomicInteger();

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f14453e;

        /* compiled from: TrampolineScheduler */
        final class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final b f14454b;

            a(b bVar) {
                this.f14454b = bVar;
            }

            public void run() {
                this.f14454b.f14449e = true;
                c.this.f14450b.remove(this.f14454b);
            }
        }

        c() {
        }

        public d.a.y.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        public d.a.y.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            long a2 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return e(new a(runnable, this, a2), a2);
        }

        public void dispose() {
            this.f14453e = true;
        }

        /* access modifiers changed from: package-private */
        public d.a.y.b e(Runnable runnable, long j) {
            if (this.f14453e) {
                return d.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.f14452d.incrementAndGet());
            this.f14450b.add(bVar);
            if (this.f14451c.getAndIncrement() != 0) {
                return d.a.y.c.b(new a(bVar));
            }
            int i = 1;
            while (!this.f14453e) {
                b poll = this.f14450b.poll();
                if (poll == null) {
                    i = this.f14451c.addAndGet(-i);
                    if (i == 0) {
                        return d.INSTANCE;
                    }
                } else if (!poll.f14449e) {
                    poll.f14446b.run();
                }
            }
            this.f14450b.clear();
            return d.INSTANCE;
        }
    }

    n() {
    }

    public static n f() {
        return f14442b;
    }

    public t.c a() {
        return new c();
    }

    public d.a.y.b c(Runnable runnable) {
        d.a.d0.a.u(runnable).run();
        return d.INSTANCE;
    }

    public d.a.y.b d(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            d.a.d0.a.u(runnable).run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            d.a.d0.a.s(e2);
        }
        return d.INSTANCE;
    }
}
