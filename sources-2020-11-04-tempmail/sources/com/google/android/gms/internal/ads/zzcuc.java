package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcuc implements zzela<zzcua> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7729a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7730b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzchm> f7731c;

    public zzcuc(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzchm> zzelj3) {
        this.f7729a = zzelj;
        this.f7730b = zzelj2;
        this.f7731c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcua(this.f7729a.get(), this.f7730b.get(), this.f7731c.get());
    }
}
