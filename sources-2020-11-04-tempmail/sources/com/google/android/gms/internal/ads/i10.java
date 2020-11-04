package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class i10<V> extends t00<V> {
    /* access modifiers changed from: private */
    @NullableDecl
    public zzdvf<V> i;
    /* access modifiers changed from: private */
    @NullableDecl
    public ScheduledFuture<?> j;

    private i10(zzdvf<V> zzdvf) {
        zzdsh.b(zzdvf);
        this.i = zzdvf;
    }

    static <V> zzdvf<V> K(zzdvf<V> zzdvf, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        i10 i10 = new i10(zzdvf);
        j10 j10 = new j10(i10);
        i10.j = scheduledExecutorService.schedule(j10, j2, timeUnit);
        zzdvf.f(j10, q00.INSTANCE);
        return i10;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        g(this.i);
        ScheduledFuture<?> scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.i = null;
        this.j = null;
    }

    /* access modifiers changed from: protected */
    public final String h() {
        zzdvf<V> zzdvf = this.i;
        ScheduledFuture<?> scheduledFuture = this.j;
        if (zzdvf == null) {
            return null;
        }
        String valueOf = String.valueOf(zzdvf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
