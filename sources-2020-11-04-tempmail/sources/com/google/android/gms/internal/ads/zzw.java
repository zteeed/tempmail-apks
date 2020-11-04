package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzw extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<zzaa<?>> f9391b;

    /* renamed from: c  reason: collision with root package name */
    private final zzx f9392c;

    /* renamed from: d  reason: collision with root package name */
    private final zzk f9393d;

    /* renamed from: e  reason: collision with root package name */
    private final zzak f9394e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f9395f = false;

    public zzw(BlockingQueue<zzaa<?>> blockingQueue, zzx zzx, zzk zzk, zzak zzak) {
        this.f9391b = blockingQueue;
        this.f9392c = zzx;
        this.f9393d = zzk;
        this.f9394e = zzak;
    }

    private final void a() throws InterruptedException {
        zzaa take = this.f9391b.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.A(3);
        try {
            take.u("network-queue-take");
            take.k();
            TrafficStats.setThreadStatsTag(take.v());
            zzy a2 = this.f9392c.a(take);
            take.u("network-http-complete");
            if (!a2.f9411e || !take.N()) {
                zzaj o = take.o(a2);
                take.u("network-parse-complete");
                if (take.I() && o.f5917b != null) {
                    this.f9393d.K(take.E(), o.f5917b);
                    take.u("network-cache-written");
                }
                take.L();
                this.f9394e.b(take, o);
                take.q(o);
                take.A(4);
                return;
            }
            take.B("not-modified");
            take.O();
        } catch (zzao e2) {
            e2.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f9394e.a(take, e2);
            take.O();
        } catch (Exception e3) {
            zzaq.e(e3, "Unhandled exception %s", e3.toString());
            zzao zzao = new zzao((Throwable) e3);
            zzao.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f9394e.a(take, zzao);
            take.O();
        } finally {
            take.A(4);
        }
    }

    public final void b() {
        this.f9395f = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f9395f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaq.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
