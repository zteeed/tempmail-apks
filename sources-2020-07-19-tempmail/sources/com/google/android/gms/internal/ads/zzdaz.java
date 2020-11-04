package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdaz implements zzela<zzday<zzdef>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<jt> f7809a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Clock> f7810b;

    public zzdaz(zzelj<jt> zzelj, zzelj<Clock> zzelj2) {
        this.f7809a = zzelj;
        this.f7810b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzday zzday = new zzday(this.f7809a.get(), zzacd.f5573a.a().longValue(), this.f7810b.get());
        zzelg.b(zzday, "Cannot return null from a non-@Nullable @Provides method");
        return zzday;
    }
}
