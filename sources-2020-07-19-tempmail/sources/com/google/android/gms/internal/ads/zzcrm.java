package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrm implements zzela<zzcrk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7411a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f7412b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbny> f7413c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f7414d;

    public zzcrm(zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzbny> zzelj3, zzelj<Executor> zzelj4) {
        this.f7411a = zzelj;
        this.f7412b = zzelj2;
        this.f7413c = zzelj3;
        this.f7414d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzcrk(this.f7411a.get(), this.f7412b.get(), this.f7413c.get(), this.f7414d.get());
    }
}
