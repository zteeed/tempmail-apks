package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnd implements zzela<zzbus> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f6590a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Clock> f6591b;

    public zzbnd(zzelj<ScheduledExecutorService> zzelj, zzelj<Clock> zzelj2) {
        this.f6590a = zzelj;
        this.f6591b = zzelj2;
    }

    public static zzbus a(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        zzbus zzbus = new zzbus(scheduledExecutorService, clock);
        zzelg.b(zzbus, "Cannot return null from a non-@Nullable @Provides method");
        return zzbus;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6590a.get(), this.f6591b.get());
    }
}
