package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdco implements zzela<zzdcm> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f7866a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7867b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Set<String>> f7868c;

    private zzdco(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2, zzelj<Set<String>> zzelj3) {
        this.f7866a = zzelj;
        this.f7867b = zzelj2;
        this.f7868c = zzelj3;
    }

    public static zzdco a(zzelj<zzdvi> zzelj, zzelj<Context> zzelj2, zzelj<Set<String>> zzelj3) {
        return new zzdco(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzdcm(this.f7866a.get(), this.f7867b.get(), this.f7868c.get());
    }
}
