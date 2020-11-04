package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpf<AdT> implements zzbpc<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zzcqt<AdT>> f6679a;

    zzbpf(Map<String, zzcqt<AdT>> map) {
        this.f6679a = map;
    }

    public final zzcqt<AdT> a(int i, String str) {
        return this.f6679a.get(str);
    }
}
