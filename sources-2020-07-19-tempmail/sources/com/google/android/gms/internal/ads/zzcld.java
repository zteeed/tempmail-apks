package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcld implements zzela<zzclb> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckv> f7189a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Set<ok>> f7190b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Clock> f7191c;

    private zzcld(zzelj<zzckv> zzelj, zzelj<Set<ok>> zzelj2, zzelj<Clock> zzelj3) {
        this.f7189a = zzelj;
        this.f7190b = zzelj2;
        this.f7191c = zzelj3;
    }

    public static zzcld a(zzelj<zzckv> zzelj, zzelj<Set<ok>> zzelj2, zzelj<Clock> zzelj3) {
        return new zzcld(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzclb(this.f7189a.get(), this.f7190b.get(), this.f7191c.get());
    }
}
