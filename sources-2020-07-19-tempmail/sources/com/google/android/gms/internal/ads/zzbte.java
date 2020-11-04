package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbte implements zzela<zzbtc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbtd>>> f6634a;

    private zzbte(zzelj<Set<zzbyg<zzbtd>>> zzelj) {
        this.f6634a = zzelj;
    }

    public static zzbte a(zzelj<Set<zzbyg<zzbtd>>> zzelj) {
        return new zzbte(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbtc(this.f6634a.get());
    }
}
