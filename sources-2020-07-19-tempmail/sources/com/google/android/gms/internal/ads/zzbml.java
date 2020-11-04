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
    private final ScheduledExecutorService f6386a;

    /* renamed from: b  reason: collision with root package name */
    private final Clock f6387b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f6388c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private long f6389d = -1;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private long f6390e = -1;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private Runnable f6391f = null;
    @GuardedBy("this")
    private boolean g = false;

    public zzbml(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.f6386a = scheduledExecutorService;
        this.f6387b = clock;
        zzq.zzkz().d(this);
    }

    @VisibleForTesting
    private final synchronized void c() {
        if (!this.g) {
            if (this.f6388c == null || this.f6388c.isDone()) {
                this.f6390e = -1;
            } else {
                this.f6388c.cancel(true);
                this.f6390e = this.f6389d - this.f6387b.b();
            }
            this.g = true;
        }
    }

    @VisibleForTesting
    private final synchronized void d() {
        if (this.g) {
            if (this.f6390e > 0 && this.f6388c != null && this.f6388c.isCancelled()) {
                this.f6388c = this.f6386a.schedule(this.f6391f, this.f6390e, TimeUnit.MILLISECONDS);
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
        this.f6391f = runnable;
        long j = (long) i;
        this.f6389d = this.f6387b.b() + j;
        this.f6388c = this.f6386a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
