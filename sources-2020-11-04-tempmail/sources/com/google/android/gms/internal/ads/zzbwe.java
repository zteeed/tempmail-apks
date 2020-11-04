package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbwe implements zzela<zzbwc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbwd>>> f6844a;

    private zzbwe(zzelj<Set<zzbyg<zzbwd>>> zzelj) {
        this.f6844a = zzelj;
    }

    public static zzbwe a(zzelj<Set<zzbyg<zzbwd>>> zzelj) {
        return new zzbwe(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbwc(this.f6844a.get());
    }
}
