package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbc implements zzela<zzdki> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Clock> f7814a;

    public zzdbc(zzelj<Clock> zzelj) {
        this.f7814a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzdki zzdki = new zzdki(this.f7814a.get());
        zzelg.b(zzdki, "Cannot return null from a non-@Nullable @Provides method");
        return zzdki;
    }
}
