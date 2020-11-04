package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcfm implements zzela<zzcfi> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7160a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcey> f7161b;

    public zzcfm(zzelj<Executor> zzelj, zzelj<zzcey> zzelj2) {
        this.f7160a = zzelj;
        this.f7161b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        return new zzcfi(this.f7160a.get(), this.f7161b.get());
    }
}
