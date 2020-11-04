package org.greenrobot.eventbus;

import java.util.logging.Level;

/* compiled from: BackgroundPoster */
final class b implements Runnable, k {

    /* renamed from: b  reason: collision with root package name */
    private final j f14998b = new j();

    /* renamed from: c  reason: collision with root package name */
    private final c f14999c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f15000d;

    b(c cVar) {
        this.f14999c = cVar;
    }

    public void a(p pVar, Object obj) {
        i a2 = i.a(pVar, obj);
        synchronized (this) {
            this.f14998b.a(a2);
            if (!this.f15000d) {
                this.f15000d = true;
                this.f14999c.d().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                i c2 = this.f14998b.c(1000);
                if (c2 == null) {
                    synchronized (this) {
                        c2 = this.f14998b.b();
                        if (c2 == null) {
                            this.f15000d = false;
                            this.f15000d = false;
                            return;
                        }
                    }
                }
                this.f14999c.g(c2);
            } catch (InterruptedException e2) {
                try {
                    f e3 = this.f14999c.e();
                    Level level = Level.WARNING;
                    e3.b(level, Thread.currentThread().getName() + " was interruppted", e2);
                    return;
                } finally {
                    this.f15000d = false;
                }
            }
        }
    }
}
