package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblv implements zzela<zzbls> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6346a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzqn> f6347b;

    private zzblv(zzelj<Context> zzelj, zzelj<zzqn> zzelj2) {
        this.f6346a = zzelj;
        this.f6347b = zzelj2;
    }

    public static zzblv a(zzelj<Context> zzelj, zzelj<zzqn> zzelj2) {
        return new zzblv(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzbls(this.f6346a.get(), this.f6347b.get());
    }
}
