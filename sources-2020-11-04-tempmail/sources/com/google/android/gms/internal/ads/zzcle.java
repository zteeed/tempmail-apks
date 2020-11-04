package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcle implements zzela<zzclc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7375a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbe> f7376b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f7377c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f7378d;

    public zzcle(zzelj<Executor> zzelj, zzelj<zzbbe> zzelj2, zzelj<Context> zzelj3, zzelj<zzbbd> zzelj4) {
        this.f7375a = zzelj;
        this.f7376b = zzelj2;
        this.f7377c = zzelj3;
        this.f7378d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzclc(this.f7375a.get(), this.f7376b.get(), this.f7377c.get(), this.f7378d.get());
    }
}
