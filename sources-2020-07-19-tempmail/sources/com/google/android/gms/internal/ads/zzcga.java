package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcga implements zzela<zzcfp> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdla> f6989a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6990b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzchw> f6991c;

    public zzcga(zzelj<zzdla> zzelj, zzelj<Executor> zzelj2, zzelj<zzchw> zzelj3) {
        this.f6989a = zzelj;
        this.f6990b = zzelj2;
        this.f6991c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcfp(this.f6989a.get(), this.f6990b.get(), this.f6991c.get());
    }
}
