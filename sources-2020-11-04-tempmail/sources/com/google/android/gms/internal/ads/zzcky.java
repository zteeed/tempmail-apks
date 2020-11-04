package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcky implements zzela<zzckx> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclc> f7360a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7361b;

    public zzcky(zzelj<zzclc> zzelj, zzelj<Executor> zzelj2) {
        this.f7360a = zzelj;
        this.f7361b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        return new zzckx(this.f7360a.get(), this.f7361b.get());
    }
}
