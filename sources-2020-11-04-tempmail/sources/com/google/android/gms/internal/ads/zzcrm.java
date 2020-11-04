package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrm implements zzela<zzcrk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7594a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f7595b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbny> f7596c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f7597d;

    public zzcrm(zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzbny> zzelj3, zzelj<Executor> zzelj4) {
        this.f7594a = zzelj;
        this.f7595b = zzelj2;
        this.f7596c = zzelj3;
        this.f7597d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzcrk(this.f7594a.get(), this.f7595b.get(), this.f7596c.get(), this.f7597d.get());
    }
}
