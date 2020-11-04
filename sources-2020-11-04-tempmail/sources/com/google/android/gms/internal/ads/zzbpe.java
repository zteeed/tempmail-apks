package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpe<AdT> implements zzela<zzbpf<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Map<String, zzcqt<AdT>>> f6678a;

    private zzbpe(zzelj<Map<String, zzcqt<AdT>>> zzelj) {
        this.f6678a = zzelj;
    }

    public static <AdT> zzbpe<AdT> a(zzelj<Map<String, zzcqt<AdT>>> zzelj) {
        return new zzbpe<>(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbpf(this.f6678a.get());
    }
}
