package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbtm implements zzela<zzbtf> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbtg>>> f6635a;

    private zzbtm(zzelj<Set<zzbyg<zzbtg>>> zzelj) {
        this.f6635a = zzelj;
    }

    public static zzbtm a(zzelj<Set<zzbyg<zzbtg>>> zzelj) {
        return new zzbtm(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbtf(this.f6635a.get());
    }
}
