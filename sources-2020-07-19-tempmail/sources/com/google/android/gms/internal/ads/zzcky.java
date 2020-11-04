package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcky implements zzela<zzckx> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclc> f7177a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7178b;

    public zzcky(zzelj<zzclc> zzelj, zzelj<Executor> zzelj2) {
        this.f7177a = zzelj;
        this.f7178b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        return new zzckx(this.f7177a.get(), this.f7178b.get());
    }
}
