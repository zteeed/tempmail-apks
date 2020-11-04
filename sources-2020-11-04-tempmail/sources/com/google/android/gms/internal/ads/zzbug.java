package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbug implements zzela<zzbue> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbuf>>> f6823a;

    private zzbug(zzelj<Set<zzbyg<zzbuf>>> zzelj) {
        this.f6823a = zzelj;
    }

    public static zzbug a(zzelj<Set<zzbyg<zzbuf>>> zzelj) {
        return new zzbug(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbue(this.f6823a.get());
    }
}
