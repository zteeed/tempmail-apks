package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbus extends zzbwv<zzbuw> {

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f6646c;

    /* renamed from: d  reason: collision with root package name */
    private final Clock f6647d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private long f6648e = -1;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private long f6649f = -1;
    @GuardedBy("this")
    private boolean g = false;
    @GuardedBy("this")
    private ScheduledFuture<?> h;

    public zzbus(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.f6646c = scheduledExecutorService;
        this.f6647d = clock;
    }

    /* access modifiers changed from: private */
    public final void E0() {
        k0(ee.f3719a);
    }

    private final synchronized void G0(long j) {
        if (this.h != null && !this.h.isDone()) {
            this.h.cancel(true);
        }
        this.f6648e = this.f6647d.b() + j;
        this.h = this.f6646c.schedule(new fe(this), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void D0() {
        this.g = false;
        G0(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void F0(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L_0x0005
            monitor-exit(r6)
            return
        L_0x0005:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0043 }
            long r1 = (long) r7     // Catch:{ all -> 0x0043 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0043 }
            boolean r7 = r6.g     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x0025
            long r2 = r6.f6649f     // Catch:{ all -> 0x0043 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x001f
            long r2 = r6.f6649f     // Catch:{ all -> 0x0043 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            long r0 = r6.f6649f     // Catch:{ all -> 0x0043 }
        L_0x0021:
            r6.f6649f = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)
            return
        L_0x0025:
            com.google.android.gms.common.util.Clock r7 = r6.f6647d     // Catch:{ all -> 0x0043 }
            long r2 = r7.b()     // Catch:{ all -> 0x0043 }
            long r4 = r6.f6648e     // Catch:{ all -> 0x0043 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x003e
            long r2 = r6.f6648e     // Catch:{ all -> 0x0043 }
            com.google.android.gms.common.util.Clock r7 = r6.f6647d     // Catch:{ all -> 0x0043 }
            long r4 = r7.b()     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0041
        L_0x003e:
            r6.G0(r0)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r6)
            return
        L_0x0043:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbus.F0(int):void");
    }

    public final synchronized void onPause() {
        if (!this.g) {
            if (this.h == null || this.h.isCancelled()) {
                this.f6649f = -1;
            } else {
                this.h.cancel(true);
                this.f6649f = this.f6648e - this.f6647d.b();
            }
            this.g = true;
        }
    }

    public final synchronized void onResume() {
        if (this.g) {
            if (this.f6649f > 0 && this.h.isCancelled()) {
                G0(this.f6649f);
            }
            this.g = false;
        }
    }
}
