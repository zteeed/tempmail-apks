package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class h10<V> extends zzduv<V> implements zzdvf<V>, ScheduledFuture<V> {

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledFuture<?> f4110c;

    public h10(zzdvf<V> zzdvf, ScheduledFuture<?> scheduledFuture) {
        super(zzdvf);
        this.f4110c = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f4110c.cancel(z);
        }
        return cancel;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f4110c.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f4110c.getDelay(timeUnit);
    }
}
