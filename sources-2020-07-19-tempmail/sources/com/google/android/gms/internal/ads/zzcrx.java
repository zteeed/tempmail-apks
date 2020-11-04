package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrx implements zzela<zzcrs> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7429a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7430b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcae> f7431c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdki> f7432d;

    public zzcrx(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzcae> zzelj3, zzelj<zzdki> zzelj4) {
        this.f7429a = zzelj;
        this.f7430b = zzelj2;
        this.f7431c = zzelj3;
        this.f7432d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzcrs(this.f7429a.get(), this.f7430b.get(), this.f7431c.get(), this.f7432d.get());
    }
}
