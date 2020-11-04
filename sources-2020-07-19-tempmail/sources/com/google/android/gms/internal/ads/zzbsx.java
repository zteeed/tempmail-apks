package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsx implements zzela<zzbsw> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzbsz>>> f6629a;

    private zzbsx(zzelj<Set<zzbyg<zzbsz>>> zzelj) {
        this.f6629a = zzelj;
    }

    public static zzbsx a(zzelj<Set<zzbyg<zzbsz>>> zzelj) {
        return new zzbsx(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbsw(this.f6629a.get());
    }
}
