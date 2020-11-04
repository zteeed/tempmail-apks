package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbwh implements zzela<zzbwg> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbwk>>> f6845a;

    private zzbwh(zzelj<Set<zzbyg<zzbwk>>> zzelj) {
        this.f6845a = zzelj;
    }

    public static zzbwh a(zzelj<Set<zzbyg<zzbwk>>> zzelj) {
        return new zzbwh(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbwg(this.f6845a.get());
    }
}
