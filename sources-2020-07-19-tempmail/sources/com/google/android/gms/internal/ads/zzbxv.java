package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxv implements zzela<zzcts> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6693a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Clock> f6694b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzctu> f6695c;

    private zzbxv(zzbxa zzbxa, zzelj<Clock> zzelj, zzelj<zzctu> zzelj2) {
        this.f6693a = zzbxa;
        this.f6694b = zzelj;
        this.f6695c = zzelj2;
    }

    public static zzbxv a(zzbxa zzbxa, zzelj<Clock> zzelj, zzelj<zzctu> zzelj2) {
        return new zzbxv(zzbxa, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzcts a2 = this.f6693a.a(this.f6694b.get(), this.f6695c.get());
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
