package d.a.a0.g;

import d.a.a0.a.d;
import d.a.t;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TrampolineScheduler */
public final class n extends t {

    /* renamed from: b  reason: collision with root package name */
    private static final n f13846b = new n();

    /* compiled from: TrampolineScheduler */
    static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f13847b;

        /* renamed from: c  reason: collision with root package name */
        private final c f13848c;

        /* renamed from: d  reason: collision with root package name */
        private final long f13849d;

        a(Runnable runnable, c cVar, long j) {
            this.f13847b = runnable;
            this.f13848c = cVar;
            this.f13849d = j;
        }

        public void run() {
            if (!this.f13848c.f13857e) {
                long a2 = this.f13848c.a(TimeUnit.MILLISECONDS);
                long j = this.f13849d;
                if (j > a2) {
                    try {
                        Thread.sleep(j - a2);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        d.a.d0.a.s(e2);
                        return;
                    }
                }
                if (!this.f13848c.f13857e) {
                    this.f13847b.run();
                }
            }
        }
    }

    /* compiled from: TrampolineScheduler */
    static final class b implements Comparable<b> {

        /* renamed from: b  reason: collision with root package name */
        final Runnable f13850b;

        /* renamed from: c  reason: collision with root package name */
        final long f13851c;

        /* renamed from: d  reason: collision with root package name */
        final int f13852d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f13853e;

        b(Runnable runnable, Long l, int i) {
            this.f13850b = runnable;
            this.f13851c = l.longValue();
            this.f13852d = i;
        }

        /* renamed from: f */
        public int compareTo(b bVar) {
            int b2 = d.a.a0.b.b.b(this.f13851c, bVar.f13851c);
            return b2 == 0 ? d.a.a0.b.b.a(this.f13852d, bVar.f13852d) : b2;
        }
    }

    /* compiled from: TrampolineScheduler */
    static final class c extends t.c implements d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final PriorityBlockingQueue<b> f13854b = new PriorityBlockingQueue<>();

        /* renamed from: c  reason: collision with root package name */
        private final AtomicInteger f13855c = new AtomicInteger();

        /* renamed from: d  reason: collision with root package name */
        final AtomicInteger f13856d = new AtomicInteger();

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f13857e;

        /* compiled from: TrampolineScheduler */
        final class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final b f13858b;

            a(b bVar) {
                this.f13858b = bVar;
            }

            public void run() {
                this.f13858b.f13853e = true;
                c.this.f13854b.remove(this.f13858b);
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
            this.f13857e = true;
        }

        /* access modifiers changed from: package-private */
        public d.a.y.b e(Runnable runnable, long j) {
            if (this.f13857e) {
                return d.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.f13856d.incrementAndGet());
            this.f13854b.add(bVar);
            if (this.f13855c.getAndIncrement() != 0) {
                return d.a.y.c.b(new a(bVar));
            }
            int i = 1;
            while (!this.f13857e) {
                b poll = this.f13854b.poll();
                if (poll == null) {
                    i = this.f13855c.addAndGet(-i);
                    if (i == 0) {
                        return d.INSTANCE;
                    }
                } else if (!poll.f13853e) {
                    poll.f13850b.run();
                }
            }
            this.f13854b.clear();
            return d.INSTANCE;
        }
    }

    n() {
    }

    public static n f() {
        return f13846b;
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
