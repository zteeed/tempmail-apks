package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzddz;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zr<S extends zzddz<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final zzdvf<S> f5489a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5490b;

    /* renamed from: c  reason: collision with root package name */
    private final Clock f5491c;

    public zr(zzdvf<S> zzdvf, long j, Clock clock) {
        this.f5489a = zzdvf;
        this.f5491c = clock;
        this.f5490b = clock.b() + j;
    }

    public final boolean a() {
        return this.f5490b < this.f5491c.b();
    }
}
