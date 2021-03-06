package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqn implements zzela<zzbqk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Clock> f6532a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzaxg> f6533b;

    private zzbqn(zzelj<Clock> zzelj, zzelj<zzaxg> zzelj2) {
        this.f6532a = zzelj;
        this.f6533b = zzelj2;
    }

    public static zzbqn a(zzelj<Clock> zzelj, zzelj<zzaxg> zzelj2) {
        return new zzbqn(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzbqk(this.f6532a.get(), this.f6533b.get());
    }
}
