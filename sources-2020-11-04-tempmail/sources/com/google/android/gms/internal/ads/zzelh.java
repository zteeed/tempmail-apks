package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzelh<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<zzelj<T>> f8842a;

    /* renamed from: b  reason: collision with root package name */
    private final List<zzelj<Collection<T>>> f8843b;

    private zzelh(int i, int i2) {
        this.f8842a = zzekv.a(i);
        this.f8843b = zzekv.a(i2);
    }

    public final zzelh<T> a(zzelj<? extends T> zzelj) {
        this.f8842a.add(zzelj);
        return this;
    }

    public final zzelh<T> b(zzelj<? extends Collection<? extends T>> zzelj) {
        this.f8843b.add(zzelj);
        return this;
    }

    public final zzelf<T> c() {
        return new zzelf<>(this.f8842a, this.f8843b);
    }
}
