package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczh implements zzela<zzczg> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvf<String>> f7918a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7919b;

    private zzczh(zzelj<zzdvf<String>> zzelj, zzelj<Executor> zzelj2) {
        this.f7918a = zzelj;
        this.f7919b = zzelj2;
    }

    public static zzczh a(zzelj<zzdvf<String>> zzelj, zzelj<Executor> zzelj2) {
        return new zzczh(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzczg(this.f7918a.get(), this.f7919b.get());
    }
}
