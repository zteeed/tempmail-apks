package d.a.a0.g;

import d.a.a0.a.d;
import d.a.d0.a;
import d.a.t;
import d.a.y.b;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: NewThreadWorker */
public class f extends t.c implements b {

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f13826b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f13827c;

    public f(ThreadFactory threadFactory) {
        this.f13826b = l.a(threadFactory);
    }

    public b b(Runnable runnable) {
        return c(runnable, 0, (TimeUnit) null);
    }

    public b c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f13827c) {
            return d.INSTANCE;
        }
        return e(runnable, j, timeUnit, (d.a.a0.a.b) null);
    }

    public void dispose() {
        if (!this.f13827c) {
            this.f13827c = true;
            this.f13826b.shutdownNow();
        }
    }

    public k e(Runnable runnable, long j, TimeUnit timeUnit, d.a.a0.a.b bVar) {
        Future future;
        k kVar = new k(a.u(runnable), bVar);
        if (bVar != null && !bVar.b(kVar)) {
            return kVar;
        }
        if (j <= 0) {
            try {
                future = this.f13826b.submit(kVar);
            } catch (RejectedExecutionException e2) {
                if (bVar != null) {
                    bVar.a(kVar);
                }
                a.s(e2);
            }
        } else {
            future = this.f13826b.schedule(kVar, j, timeUnit);
        }
        kVar.a(future);
        return kVar;
    }

    public b f(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        j jVar = new j(a.u(runnable));
        if (j <= 0) {
            try {
                future = this.f13826b.submit(jVar);
            } catch (RejectedExecutionException e2) {
                a.s(e2);
                return d.INSTANCE;
            }
        } else {
            future = this.f13826b.schedule(jVar, j, timeUnit);
        }
        jVar.a(future);
        return jVar;
    }

    public b g(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable u = a.u(runnable);
        if (j2 <= 0) {
            c cVar = new c(u, this.f13826b);
            if (j <= 0) {
                try {
                    future = this.f13826b.submit(cVar);
                } catch (RejectedExecutionException e2) {
                    a.s(e2);
                    return d.INSTANCE;
                }
            } else {
                future = this.f13826b.schedule(cVar, j, timeUnit);
            }
            cVar.b(future);
            return cVar;
        }
        i iVar = new i(u);
        try {
            iVar.a(this.f13826b.scheduleAtFixedRate(iVar, j, j2, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e3) {
            a.s(e3);
            return d.INSTANCE;
        }
    }

    public void h() {
        if (!this.f13827c) {
            this.f13827c = true;
            this.f13826b.shutdown();
        }
    }
}
