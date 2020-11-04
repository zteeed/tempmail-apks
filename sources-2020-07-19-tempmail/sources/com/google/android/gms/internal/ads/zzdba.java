package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdba implements zzela<zzday<zzdap>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdas> f7811a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Clock> f7812b;

    public zzdba(zzelj<zzdas> zzelj, zzelj<Clock> zzelj2) {
        this.f7811a = zzelj;
        this.f7812b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzday zzday = new zzday(this.f7811a.get(), 10000, this.f7812b.get());
        zzelg.b(zzday, "Cannot return null from a non-@Nullable @Provides method");
        return zzday;
    }
}
