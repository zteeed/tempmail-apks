package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbml implements zzrj {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f6569a;

    /* renamed from: b  reason: collision with root package name */
    private final Clock f6570b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f6571c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private long f6572d = -1;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private long f6573e = -1;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private Runnable f6574f = null;
    @GuardedBy("this")
    private boolean g = false;

    public zzbml(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.f6569a = scheduledExecutorService;
        this.f6570b = clock;
        zzq.zzkz().d(this);
    }

    @VisibleForTesting
    private final synchronized void c() {
        if (!this.g) {
            if (this.f6571c == null || this.f6571c.isDone()) {
                this.f6573e = -1;
            } else {
                this.f6571c.cancel(true);
                this.f6573e = this.f6572d - this.f6570b.b();
            }
            this.g = true;
        }
    }

    @VisibleForTesting
    private final synchronized void d() {
        if (this.g) {
            if (this.f6573e > 0 && this.f6571c != null && this.f6571c.isCancelled()) {
                this.f6571c = this.f6569a.schedule(this.f6574f, this.f6573e, TimeUnit.MILLISECONDS);
            }
            this.g = false;
        }
    }

    public final void a(boolean z) {
        if (z) {
            d();
        } else {
            c();
        }
    }

    public final synchronized void b(int i, Runnable runnable) {
        this.f6574f = runnable;
        long j = (long) i;
        this.f6572d = this.f6570b.b() + j;
        this.f6571c = this.f6569a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
