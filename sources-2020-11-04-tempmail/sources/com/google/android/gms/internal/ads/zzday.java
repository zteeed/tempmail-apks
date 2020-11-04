package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzddz;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzday<S extends zzddz<?>> implements zzdec<S> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<zr<S>> f7988a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final Clock f7989b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdec<S> f7990c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7991d;

    public zzday(zzdec<S> zzdec, long j, Clock clock) {
        this.f7989b = clock;
        this.f7990c = zzdec;
        this.f7991d = j;
    }

    public final zzdvf<S> b() {
        zr zrVar = this.f7988a.get();
        if (zrVar == null || zrVar.a()) {
            zrVar = new zr(this.f7990c.b(), this.f7991d, this.f7989b);
            this.f7988a.set(zrVar);
        }
        return zrVar.f5672a;
    }
}
