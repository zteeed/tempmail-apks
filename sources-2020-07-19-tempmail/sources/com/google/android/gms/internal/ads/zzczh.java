package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczh implements zzela<zzczg> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvf<String>> f7735a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7736b;

    private zzczh(zzelj<zzdvf<String>> zzelj, zzelj<Executor> zzelj2) {
        this.f7735a = zzelj;
        this.f7736b = zzelj2;
    }

    public static zzczh a(zzelj<zzdvf<String>> zzelj, zzelj<Executor> zzelj2) {
        return new zzczh(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzczg(this.f7735a.get(), this.f7736b.get());
    }
}
