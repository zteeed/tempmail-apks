package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbwt implements zzela<zzbwo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbww>>> f6664a;

    private zzbwt(zzelj<Set<zzbyg<zzbww>>> zzelj) {
        this.f6664a = zzelj;
    }

    public static zzbwt a(zzelj<Set<zzbyg<zzbww>>> zzelj) {
        return new zzbwt(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbwo(this.f6664a.get());
    }
}
