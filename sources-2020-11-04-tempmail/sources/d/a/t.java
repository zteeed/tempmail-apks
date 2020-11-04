package d.a;

import d.a.a0.a.d;
import d.a.a0.a.g;
import d.a.a0.g.f;
import d.a.a0.j.j;
import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    static final long f14349a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler */
    static final class a implements d.a.y.b, Runnable {

        /* renamed from: b  reason: collision with root package name */
        final Runnable f14350b;

        /* renamed from: c  reason: collision with root package name */
        final c f14351c;

        /* renamed from: d  reason: collision with root package name */
        Thread f14352d;

        a(Runnable runnable, c cVar) {
            this.f14350b = runnable;
            this.f14351c = cVar;
        }

        public void dispose() {
            if (this.f14352d == Thread.currentThread()) {
                c cVar = this.f14351c;
                if (cVar instanceof f) {
                    ((f) cVar).h();
                    return;
                }
            }
            this.f14351c.dispose();
        }

        public void run() {
            this.f14352d = Thread.currentThread();
            try {
                this.f14350b.run();
            } finally {
                dispose();
                this.f14352d = null;
            }
        }
    }

    /* compiled from: Scheduler */
    static final class b implements d.a.y.b, Runnable {

        /* renamed from: b  reason: collision with root package name */
        final Runnable f14353b;

        /* renamed from: c  reason: collision with root package name */
        final c f14354c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f14355d;

        b(Runnable runnable, c cVar) {
            this.f14353b = runnable;
            this.f14354c = cVar;
        }

        public void dispose() {
            this.f14355d = true;
            this.f14354c.dispose();
        }

        public void run() {
            if (!this.f14355d) {
                try {
                    this.f14353b.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f14354c.dispose();
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
            final Runnable f14356b;

            /* renamed from: c  reason: collision with root package name */
            final g f14357c;

            /* renamed from: d  reason: collision with root package name */
            final long f14358d;

            /* renamed from: e  reason: collision with root package name */
            long f14359e;

            /* renamed from: f  reason: collision with root package name */
            long f14360f;
            long g;

            a(long j, Runnable runnable, long j2, g gVar, long j3) {
                this.f14356b = runnable;
                this.f14357c = gVar;
                this.f14358d = j3;
                this.f14360f = j2;
                this.g = j;
            }

            public void run() {
                long j;
                this.f14356b.run();
                if (!this.f14357c.a()) {
                    long a2 = c.this.a(TimeUnit.NANOSECONDS);
                    long j2 = t.f14349a;
                    long j3 = this.f14360f;
                    if (a2 + j2 >= j3) {
                        long j4 = this.f14358d;
                        if (a2 < j3 + j4 + j2) {
                            long j5 = this.g;
                            long j6 = this.f14359e + 1;
                            this.f14359e = j6;
                            j = j5 + (j6 * j4);
                            this.f14360f = a2;
                            this.f14357c.b(c.this.c(this, j - a2, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j7 = this.f14358d;
                    long j8 = a2 + j7;
                    long j9 = this.f14359e + 1;
                    this.f14359e = j9;
                    this.g = j8 - (j7 * j9);
                    j = j8;
                    this.f14360f = a2;
                    this.f14357c.b(c.this.c(this, j - a2, TimeUnit.NANOSECONDS));
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
