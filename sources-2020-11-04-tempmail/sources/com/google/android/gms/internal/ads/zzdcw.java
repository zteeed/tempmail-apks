package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcw implements zzela<zzdcu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f8060a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Bundle> f8061b;

    private zzdcw(zzelj<zzdvi> zzelj, zzelj<Bundle> zzelj2) {
        this.f8060a = zzelj;
        this.f8061b = zzelj2;
    }

    public static zzdcw a(zzelj<zzdvi> zzelj, zzelj<Bundle> zzelj2) {
        return new zzdcw(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzdcu(this.f8060a.get(), this.f8061b.get());
    }
}
