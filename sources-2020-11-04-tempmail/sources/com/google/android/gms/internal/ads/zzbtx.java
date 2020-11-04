package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbtx implements zzela<zzbtv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbua>>> f6820a;

    private zzbtx(zzelj<Set<zzbyg<zzbua>>> zzelj) {
        this.f6820a = zzelj;
    }

    public static zzbtx a(zzelj<Set<zzbyg<zzbua>>> zzelj) {
        return new zzbtx(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbtv(this.f6820a.get());
    }
}
