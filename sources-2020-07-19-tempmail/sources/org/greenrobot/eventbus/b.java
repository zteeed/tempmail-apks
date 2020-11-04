package org.greenrobot.eventbus;

import java.util.logging.Level;

/* compiled from: BackgroundPoster */
final class b implements Runnable, k {

    /* renamed from: b  reason: collision with root package name */
    private final j f14440b = new j();

    /* renamed from: c  reason: collision with root package name */
    private final c f14441c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f14442d;

    b(c cVar) {
        this.f14441c = cVar;
    }

    public void a(p pVar, Object obj) {
        i a2 = i.a(pVar, obj);
        synchronized (this) {
            this.f14440b.a(a2);
            if (!this.f14442d) {
                this.f14442d = true;
                this.f14441c.d().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                i c2 = this.f14440b.c(1000);
                if (c2 == null) {
                    synchronized (this) {
                        c2 = this.f14440b.b();
                        if (c2 == null) {
                            this.f14442d = false;
                            this.f14442d = false;
                            return;
                        }
                    }
                }
                this.f14441c.g(c2);
            } catch (InterruptedException e2) {
                try {
                    f e3 = this.f14441c.e();
                    Level level = Level.WARNING;
                    e3.b(level, Thread.currentThread().getName() + " was interruppted", e2);
                    return;
                } finally {
                    this.f14442d = false;
                }
            }
        }
    }
}
