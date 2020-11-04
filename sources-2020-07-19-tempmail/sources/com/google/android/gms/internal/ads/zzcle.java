package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcle implements zzela<zzclc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Executor> f7192a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbe> f7193b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f7194c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f7195d;

    public zzcle(zzelj<Executor> zzelj, zzelj<zzbbe> zzelj2, zzelj<Context> zzelj3, zzelj<zzbbd> zzelj4) {
        this.f7192a = zzelj;
        this.f7193b = zzelj2;
        this.f7194c = zzelj3;
        this.f7195d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzclc(this.f7192a.get(), this.f7193b.get(), this.f7194c.get(), this.f7195d.get());
    }
}
