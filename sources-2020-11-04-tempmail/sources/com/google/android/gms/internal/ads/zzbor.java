package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbor implements zzela<zzboi> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbpa> f6646a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzafn> f6647b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Runnable> f6648c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f6649d;

    public zzbor(zzelj<zzbpa> zzelj, zzelj<zzafn> zzelj2, zzelj<Runnable> zzelj3, zzelj<Executor> zzelj4) {
        this.f6646a = zzelj;
        this.f6647b = zzelj2;
        this.f6648c = zzelj3;
        this.f6649d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzboi(this.f6646a.get(), this.f6647b.get(), this.f6648c.get(), this.f6649d.get());
    }
}
