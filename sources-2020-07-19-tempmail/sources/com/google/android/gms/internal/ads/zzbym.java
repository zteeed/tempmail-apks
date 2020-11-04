package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbym implements zzela<zzbyk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbyp>>> f6705a;

    private zzbym(zzelj<Set<zzbyg<zzbyp>>> zzelj) {
        this.f6705a = zzelj;
    }

    public static zzbym a(zzelj<Set<zzbyg<zzbyp>>> zzelj) {
        return new zzbym(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbyk(this.f6705a.get());
    }
}
