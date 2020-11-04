package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzm extends Thread {
    private static final boolean h = zzaq.f5855b;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<zzaa<?>> f8861b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<zzaa<?>> f8862c;

    /* renamed from: d  reason: collision with root package name */
    private final zzk f8863d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzak f8864e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f8865f = false;
    private final qd0 g;

    public zzm(BlockingQueue<zzaa<?>> blockingQueue, BlockingQueue<zzaa<?>> blockingQueue2, zzk zzk, zzak zzak) {
        this.f8861b = blockingQueue;
        this.f8862c = blockingQueue2;
        this.f8863d = zzk;
        this.f8864e = zzak;
        this.g = new qd0(this);
    }

    private final void a() throws InterruptedException {
        zzaa take = this.f8861b.take();
        take.u("cache-queue-take");
        take.A(1);
        try {
            take.k();
            zzn G = this.f8863d.G(take.E());
            if (G == null) {
                take.u("cache-miss");
                if (!this.g.d(take)) {
                    this.f8862c.put(take);
                }
            } else if (G.a()) {
                take.u("cache-hit-expired");
                take.n(G);
                if (!this.g.d(take)) {
                    this.f8862c.put(take);
                }
                take.A(2);
            } else {
                take.u("cache-hit");
                zzaj o = take.o(new zzy(G.f8883a, G.g));
                take.u("cache-hit-parsed");
                if (!(G.f8888f < System.currentTimeMillis())) {
                    this.f8864e.b(take, o);
                } else {
                    take.u("cache-hit-refresh-needed");
                    take.n(G);
                    o.f5736d = true;
                    if (!this.g.d(take)) {
                        this.f8864e.c(take, o, new sd0(this, take));
                    } else {
                        this.f8864e.b(take, o);
                    }
                }
                take.A(2);
            }
        } finally {
            take.A(2);
        }
    }

    public final void b() {
        this.f8865f = true;
        interrupt();
    }

    public final void run() {
        if (h) {
            zzaq.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f8863d.F();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f8865f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaq.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
