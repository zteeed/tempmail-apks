package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbyh implements zzela<zzbyc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbyd>>> f6881a;

    private zzbyh(zzelj<Set<zzbyg<zzbyd>>> zzelj) {
        this.f6881a = zzelj;
    }

    public static zzbyh a(zzelj<Set<zzbyg<zzbyd>>> zzelj) {
        return new zzbyh(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbyc(this.f6881a.get());
    }
}
