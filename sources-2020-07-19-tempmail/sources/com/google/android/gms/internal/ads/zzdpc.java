package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdpc implements zzela<ay> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzdpa>>> f8278a;

    private zzdpc(zzelj<Set<zzbyg<zzdpa>>> zzelj) {
        this.f8278a = zzelj;
    }

    public static zzdpc a(zzelj<Set<zzbyg<zzdpa>>> zzelj) {
        return new zzdpc(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new ay(this.f8278a.get());
    }
}
