package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcso implements zzela<zzcsm> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7647a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f7648b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcae> f7649c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f7650d;

    public zzcso(zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzcae> zzelj3, zzelj<Executor> zzelj4) {
        this.f7647a = zzelj;
        this.f7648b = zzelj2;
        this.f7649c = zzelj3;
        this.f7650d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzcsm(this.f7647a.get(), this.f7648b.get(), this.f7649c.get(), this.f7650d.get());
    }
}
