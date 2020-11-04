package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcoi implements zzela<am> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7307a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzavy> f7308b;

    private zzcoi(zzelj<Context> zzelj, zzelj<zzavy> zzelj2) {
        this.f7307a = zzelj;
        this.f7308b = zzelj2;
    }

    public static zzcoi a(zzelj<Context> zzelj, zzelj<zzavy> zzelj2) {
        return new zzcoi(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new am(this.f7307a.get(), this.f7308b.get());
    }
}
