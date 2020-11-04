package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctf implements zzela<zzctc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7670a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcbc> f7671b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f7672c;

    public zzctf(zzelj<Context> zzelj, zzelj<zzcbc> zzelj2, zzelj<Executor> zzelj3) {
        this.f7670a = zzelj;
        this.f7671b = zzelj2;
        this.f7672c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzctc(this.f7670a.get(), this.f7671b.get(), this.f7672c.get());
    }
}
