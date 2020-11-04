package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdaz implements zzela<zzday<zzdef>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<jt> f7992a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Clock> f7993b;

    public zzdaz(zzelj<jt> zzelj, zzelj<Clock> zzelj2) {
        this.f7992a = zzelj;
        this.f7993b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzday zzday = new zzday(this.f7992a.get(), zzacd.f5756a.a().longValue(), this.f7993b.get());
        zzelg.b(zzday, "Cannot return null from a non-@Nullable @Provides method");
        return zzday;
    }
}
