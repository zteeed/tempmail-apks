package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzm extends Thread {
    private static final boolean h = zzaq.f6038b;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<zzaa<?>> f9044b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<zzaa<?>> f9045c;

    /* renamed from: d  reason: collision with root package name */
    private final zzk f9046d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzak f9047e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f9048f = false;
    private final qd0 g;

    public zzm(BlockingQueue<zzaa<?>> blockingQueue, BlockingQueue<zzaa<?>> blockingQueue2, zzk zzk, zzak zzak) {
        this.f9044b = blockingQueue;
        this.f9045c = blockingQueue2;
        this.f9046d = zzk;
        this.f9047e = zzak;
        this.g = new qd0(this);
    }

    private final void a() throws InterruptedException {
        zzaa take = this.f9044b.take();
        take.u("cache-queue-take");
        take.A(1);
        try {
            take.k();
            zzn J = this.f9046d.J(take.E());
            if (J == null) {
                take.u("cache-miss");
                if (!this.g.d(take)) {
                    this.f9045c.put(take);
                }
            } else if (J.a()) {
                take.u("cache-hit-expired");
                take.n(J);
                if (!this.g.d(take)) {
                    this.f9045c.put(take);
                }
                take.A(2);
            } else {
                take.u("cache-hit");
                zzaj o = take.o(new zzy(J.f9066a, J.g));
                take.u("cache-hit-parsed");
                if (!(J.f9071f < System.currentTimeMillis())) {
                    this.f9047e.b(take, o);
                } else {
                    take.u("cache-hit-refresh-needed");
                    take.n(J);
                    o.f5919d = true;
                    if (!this.g.d(take)) {
                        this.f9047e.c(take, o, new sd0(this, take));
                    } else {
                        this.f9047e.b(take, o);
                    }
                }
                take.A(2);
            }
        } finally {
            take.A(2);
        }
    }

    public final void b() {
        this.f9048f = true;
        interrupt();
    }

    public final void run() {
        if (h) {
            zzaq.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f9046d.I();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f9048f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaq.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
