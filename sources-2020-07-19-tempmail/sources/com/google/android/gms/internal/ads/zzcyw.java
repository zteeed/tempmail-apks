package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyw implements zzela<zzcyu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7717a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcnf> f7718b;

    public zzcyw(zzelj<Executor> zzelj, zzelj<zzcnf> zzelj2) {
        this.f7717a = zzelj;
        this.f7718b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        return new zzcyu(this.f7717a.get(), this.f7718b.get());
    }
}
