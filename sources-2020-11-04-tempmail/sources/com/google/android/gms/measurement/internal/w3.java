package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class w3 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private final Object f10480b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<u3<?>> f10481c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10482d = false;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzfv f10483e;

    public w3(zzfv zzfv, String str, BlockingQueue<u3<?>> blockingQueue) {
        this.f10483e = zzfv;
        Preconditions.k(str);
        Preconditions.k(blockingQueue);
        this.f10480b = new Object();
        this.f10481c = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f10483e.h().J().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void c() {
        synchronized (this.f10483e.i) {
            if (!this.f10482d) {
                this.f10483e.j.release();
                this.f10483e.i.notifyAll();
                if (this == this.f10483e.f10632c) {
                    w3 unused = this.f10483e.f10632c = null;
                } else if (this == this.f10483e.f10633d) {
                    w3 unused2 = this.f10483e.f10633d = null;
                } else {
                    this.f10483e.h().G().a("Current scheduler thread is neither worker nor network");
                }
                this.f10482d = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f10480b) {
            this.f10480b.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.zzfv r1 = r5.f10483e     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.j     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r5.b(r1)
            goto L_0x0001
        L_0x0013:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0081 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0081 }
        L_0x001b:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.u3<?>> r1 = r5.f10481c     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0081 }
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.u3) r1     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.f10451c     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x002b
            r2 = r0
            goto L_0x002d
        L_0x002b:
            r2 = 10
        L_0x002d:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x0081 }
            r1.run()     // Catch:{ all -> 0x0081 }
            goto L_0x001b
        L_0x0034:
            java.lang.Object r1 = r5.f10480b     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.u3<?>> r2 = r5.f10481c     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            com.google.android.gms.measurement.internal.zzfv r2 = r5.f10483e     // Catch:{ all -> 0x007e }
            boolean r2 = r2.k     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            java.lang.Object r2 = r5.f10480b     // Catch:{ InterruptedException -> 0x004f }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r5.b(r2)     // Catch:{ all -> 0x007e }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.zzfv r1 = r5.f10483e     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.i     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.u3<?>> r2 = r5.f10481c     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0079
            com.google.android.gms.measurement.internal.zzfv r0 = r5.f10483e     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.zzy r0 = r0.l()     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.y0     // Catch:{ all -> 0x007b }
            boolean r0 = r0.t(r2)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            r5.c()     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r5.c()
            return
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x001b
        L_0x007b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r5.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w3.run():void");
    }
}
