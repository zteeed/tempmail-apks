package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxb implements zzela<zzbso> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6678a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbsq>>> f6679b;

    private zzbxb(zzbxa zzbxa, zzelj<Set<zzbyg<zzbsq>>> zzelj) {
        this.f6678a = zzbxa;
        this.f6679b = zzelj;
    }

    public static zzbxb a(zzbxa zzbxa, zzelj<Set<zzbyg<zzbsq>>> zzelj) {
        return new zzbxb(zzbxa, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbso m = this.f6678a.m(this.f6679b.get());
        zzelg.b(m, "Cannot return null from a non-@Nullable @Provides method");
        return m;
    }
}
