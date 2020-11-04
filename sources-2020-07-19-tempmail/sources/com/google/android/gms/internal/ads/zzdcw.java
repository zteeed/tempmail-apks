package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcw implements zzela<zzdcu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f7877a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Bundle> f7878b;

    private zzdcw(zzelj<zzdvi> zzelj, zzelj<Bundle> zzelj2) {
        this.f7877a = zzelj;
        this.f7878b = zzelj2;
    }

    public static zzdcw a(zzelj<zzdvi> zzelj, zzelj<Bundle> zzelj2) {
        return new zzdcw(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzdcu(this.f7877a.get(), this.f7878b.get());
    }
}
