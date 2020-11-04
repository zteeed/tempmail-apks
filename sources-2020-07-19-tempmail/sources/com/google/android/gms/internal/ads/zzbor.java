package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbor implements zzela<zzboi> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbpa> f6463a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzafn> f6464b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Runnable> f6465c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f6466d;

    public zzbor(zzelj<zzbpa> zzelj, zzelj<zzafn> zzelj2, zzelj<Runnable> zzelj3, zzelj<Executor> zzelj4) {
        this.f6463a = zzelj;
        this.f6464b = zzelj2;
        this.f6465c = zzelj3;
        this.f6466d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzboi(this.f6463a.get(), this.f6464b.get(), this.f6465c.get(), this.f6466d.get());
    }
}
