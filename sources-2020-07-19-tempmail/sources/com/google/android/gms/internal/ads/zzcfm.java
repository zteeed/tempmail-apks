package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcfm implements zzela<zzcfi> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f6977a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcey> f6978b;

    public zzcfm(zzelj<Executor> zzelj, zzelj<zzcey> zzelj2) {
        this.f6977a = zzelj;
        this.f6978b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        return new zzcfi(this.f6977a.get(), this.f6978b.get());
    }
}
