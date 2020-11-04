package d.a;

import d.a.a0.a.d;
import d.a.a0.a.g;
import d.a.a0.g.f;
import d.a.a0.j.j;
import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    static final long f13947a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler */
    static final class a implements d.a.y.b, Runnable {

        /* renamed from: b  reason: collision with root package name */
        final Runnable f13948b;

        /* renamed from: c  reason: collision with root package name */
        final c f13949c;

        /* renamed from: d  reason: collision with root package name */
        Thread f13950d;

        a(Runnable runnable, c cVar) {
            this.f13948b = runnable;
            this.f13949c = cVar;
        }

        public void dispose() {
            if (this.f13950d == Thread.currentThread()) {
                c cVar = this.f13949c;
                if (cVar instanceof f) {
                    ((f) cVar).h();
                    return;
                }
            }
            this.f13949c.dispose();
        }

        public void run() {
            this.f13950d = Thread.currentThread();
            try {
                this.f13948b.run();
            } finally {
                dispose();
                this.f13950d = null;
            }
        }
    }

    /* compiled from: Scheduler */
    static final class b implements d.a.y.b, Runnable {

        /* renamed from: b  reason: collision with root package name */
        final Runnable f13951b;

        /* renamed from: c  reason: collision with root package name */
        final c f13952c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f13953d;

        b(Runnable runnable, c cVar) {
            this.f13951b = runnable;
            this.f13952c = cVar;
        }

        public void dispose() {
            this.f13953d = true;
            this.f13952c.dispose();
        }

        public void run() {
            if (!this.f13953d) {
                try {
                    this.f13951b.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f13952c.dispose();
                    throw j.d(th);
                }
            }
        }
    }

    /* compiled from: Scheduler */
    public static abstract class c implements d.a.y.b {

        /* compiled from: Scheduler */
        final class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final Runnable f13954b;

            /* renamed from: c  reason: collision with root package name */
            final g f13955c;

            /* renamed from: d  reason: collision with root package name */
            final long f13956d;

            /* renamed from: e  reason: collision with root package name */
            long f13957e;

            /* renamed from: f  reason: collision with root package name */
            long f13958f;
            long g;

            a(long j, Runnable runnable, long j2, g gVar, long j3) {
                this.f13954b = runnable;
                this.f13955c = gVar;
                this.f13956d = j3;
                this.f13958f = j2;
                this.g = j;
            }

            public void run() {
                long j;
                this.f13954b.run();
                if (!this.f13955c.a()) {
                    long a2 = c.this.a(TimeUnit.NANOSECONDS);
                    long j2 = t.f13947a;
                    long j3 = this.f13958f;
                    if (a2 + j2 >= j3) {
                        long j4 = this.f13956d;
                        if (a2 < j3 + j4 + j2) {
                            long j5 = this.g;
                            long j6 = this.f13957e + 1;
                            this.f13957e = j6;
                            j = j5 + (j6 * j4);
                            this.f13958f = a2;
                            this.f13955c.b(c.this.c(this, j - a2, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j7 = this.f13956d;
                    long j8 = a2 + j7;
                    long j9 = this.f13957e + 1;
                    this.f13957e = j9;
                    this.g = j8 - (j7 * j9);
                    j = j8;
                    this.f13958f = a2;
                    this.f13955c.b(c.this.c(this, j - a2, TimeUnit.NANOSECONDS));
                }
            }
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public d.a.y.b b(Runnable runnable) {
            return c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public abstract d.a.y.b c(Runnable runnable, long j, TimeUnit timeUnit);

        public d.a.y.b d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            g gVar = new g();
            g gVar2 = new g(gVar);
            Runnable u = d.a.d0.a.u(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = a(TimeUnit.NANOSECONDS);
            g gVar3 = gVar;
            a aVar = r0;
            a aVar2 = new a(a2 + timeUnit2.toNanos(j3), u, a2, gVar2, nanos);
            d.a.y.b c2 = c(aVar, j3, timeUnit2);
            if (c2 == d.INSTANCE) {
                return c2;
            }
            gVar3.b(c2);
            return gVar2;
        }
    }

    public abstract c a();

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public d.a.y.b c(Runnable runnable) {
        return d(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public d.a.y.b d(Runnable runnable, long j, TimeUnit timeUnit) {
        c a2 = a();
        a aVar = new a(d.a.d0.a.u(runnable), a2);
        a2.c(aVar, j, timeUnit);
        return aVar;
    }

    public d.a.y.b e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c a2 = a();
        b bVar = new b(d.a.d0.a.u(runnable), a2);
        d.a.y.b d2 = a2.d(bVar, j, j2, timeUnit);
        return d2 == d.INSTANCE ? d2 : bVar;
    }
}
