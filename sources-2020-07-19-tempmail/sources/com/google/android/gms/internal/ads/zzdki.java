package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdki {

    /* renamed from: a  reason: collision with root package name */
    private final Clock f8124a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8125b = new Object();
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private volatile int f8126c = nw.f4509a;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f8127d = 0;

    public zzdki(Clock clock) {
        this.f8124a = clock;
    }

    private final void a() {
        long a2 = this.f8124a.a();
        synchronized (this.f8125b) {
            if (this.f8126c == nw.f4511c) {
                if (this.f8127d + ((Long) zzwg.e().c(zzaav.P2)).longValue() <= a2) {
                    this.f8126c = nw.f4509a;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e(int r5, int r6) {
        /*
            r4 = this;
            r4.a()
            com.google.android.gms.common.util.Clock r0 = r4.f8124a
            long r0 = r0.a()
            java.lang.Object r2 = r4.f8125b
            monitor-enter(r2)
            int r3 = r4.f8126c     // Catch:{ all -> 0x001e }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x0012:
            r4.f8126c = r6     // Catch:{ all -> 0x001e }
            int r5 = r4.f8126c     // Catch:{ all -> 0x001e }
            int r6 = com.google.android.gms.internal.ads.nw.f4511c     // Catch:{ all -> 0x001e }
            if (r5 != r6) goto L_0x001c
            r4.f8127d = r0     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdki.e(int, int):void");
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f8125b) {
            a();
            z = this.f8126c == nw.f4510b;
        }
        return z;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f8125b) {
            a();
            z = this.f8126c == nw.f4511c;
        }
        return z;
    }

    public final void d(boolean z) {
        if (z) {
            e(nw.f4509a, nw.f4510b);
        } else {
            e(nw.f4510b, nw.f4509a);
        }
    }

    public final void f() {
        e(nw.f4510b, nw.f4511c);
    }
}
