package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsm implements zzela<zzbsk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzuu>>> f6811a;

    private zzbsm(zzelj<Set<zzbyg<zzuu>>> zzelj) {
        this.f6811a = zzelj;
    }

    public static zzbsm a(zzelj<Set<zzbyg<zzuu>>> zzelj) {
        return new zzbsm(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbsk(this.f6811a.get());
    }
}
