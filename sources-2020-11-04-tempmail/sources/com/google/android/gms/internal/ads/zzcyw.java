package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyw implements zzela<zzcyu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7900a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcnf> f7901b;

    public zzcyw(zzelj<Executor> zzelj, zzelj<zzcnf> zzelj2) {
        this.f7900a = zzelj;
        this.f7901b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        return new zzcyu(this.f7900a.get(), this.f7901b.get());
    }
}
