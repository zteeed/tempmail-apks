package d.a.a0.g;

import d.a.a0.a.d;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleScheduler */
public final class m extends t {

    /* renamed from: c  reason: collision with root package name */
    static final h f13840c = new h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: d  reason: collision with root package name */
    static final ScheduledExecutorService f13841d;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f13842b;

    /* compiled from: SingleScheduler */
    static final class a extends t.c {

        /* renamed from: b  reason: collision with root package name */
        final ScheduledExecutorService f13843b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.y.a f13844c = new d.a.y.a();

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f13845d;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f13843b = scheduledExecutorService;
        }

        public b c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f13845d) {
                return d.INSTANCE;
            }
            k kVar = new k(d.a.d0.a.u(runnable), this.f13844c);
            this.f13844c.b(kVar);
            if (j <= 0) {
                try {
                    future = this.f13843b.submit(kVar);
                } catch (RejectedExecutionException e2) {
                    dispose();
                    d.a.d0.a.s(e2);
                    return d.INSTANCE;
                }
            } else {
                future = this.f13843b.schedule(kVar, j, timeUnit);
            }
            kVar.a(future);
            return kVar;
        }

        public void dispose() {
            if (!this.f13845d) {
                this.f13845d = true;
                this.f13844c.dispose();
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f13841d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public m() {
        this(f13840c);
    }

    static ScheduledExecutorService f(ThreadFactory threadFactory) {
        return l.a(threadFactory);
    }

    public t.c a() {
        return new a(this.f13842b.get());
    }

    public b d(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        j jVar = new j(d.a.d0.a.u(runnable));
        if (j <= 0) {
            try {
                future = this.f13842b.get().submit(jVar);
            } catch (RejectedExecutionException e2) {
                d.a.d0.a.s(e2);
                return d.INSTANCE;
            }
        } else {
            future = this.f13842b.get().schedule(jVar, j, timeUnit);
        }
        jVar.a(future);
        return jVar;
    }

    public b e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable u = d.a.d0.a.u(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f13842b.get();
            c cVar = new c(u, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(cVar);
                } catch (RejectedExecutionException e2) {
                    d.a.d0.a.s(e2);
                    return d.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(cVar, j, timeUnit);
            }
            cVar.b(future);
            return cVar;
        }
        i iVar = new i(u);
        try {
            iVar.a(this.f13842b.get().scheduleAtFixedRate(iVar, j, j2, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e3) {
            d.a.d0.a.s(e3);
            return d.INSTANCE;
        }
    }

    public m(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f13842b = atomicReference;
        atomicReference.lazySet(f(threadFactory));
    }
}
