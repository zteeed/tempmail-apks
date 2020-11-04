package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbtu implements zzela<zzbtl> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbsl>>> f6636a;

    private zzbtu(zzelj<Set<zzbyg<zzbsl>>> zzelj) {
        this.f6636a = zzelj;
    }

    public static zzbtu a(zzelj<Set<zzbyg<zzbsl>>> zzelj) {
        return new zzbtu(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbtl(this.f6636a.get());
    }
}
