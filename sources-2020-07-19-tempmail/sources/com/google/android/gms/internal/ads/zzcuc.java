package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcuc implements zzela<zzcua> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7546a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7547b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzchm> f7548c;

    public zzcuc(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzchm> zzelj3) {
        this.f7546a = zzelj;
        this.f7547b = zzelj2;
        this.f7548c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcua(this.f7546a.get(), this.f7547b.get(), this.f7548c.get());
    }
}
