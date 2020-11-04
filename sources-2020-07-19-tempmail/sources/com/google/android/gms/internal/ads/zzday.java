package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzddz;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzday<S extends zzddz<?>> implements zzdec<S> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<zr<S>> f7805a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final Clock f7806b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdec<S> f7807c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7808d;

    public zzday(zzdec<S> zzdec, long j, Clock clock) {
        this.f7806b = clock;
        this.f7807c = zzdec;
        this.f7808d = j;
    }

    public final zzdvf<S> b() {
        zr zrVar = this.f7805a.get();
        if (zrVar == null || zrVar.a()) {
            zrVar = new zr(this.f7807c.b(), this.f7808d, this.f7806b);
            this.f7805a.set(zrVar);
        }
        return zrVar.f5489a;
    }
}
