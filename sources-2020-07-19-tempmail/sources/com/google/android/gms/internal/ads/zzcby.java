package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcby implements zzela<zzbmh> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzqn> f6815a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6816b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f6817c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Clock> f6818d;

    public zzcby(zzelj<zzqn> zzelj, zzelj<Executor> zzelj2, zzelj<Context> zzelj3, zzelj<Clock> zzelj4) {
        this.f6815a = zzelj;
        this.f6816b = zzelj2;
        this.f6817c = zzelj3;
        this.f6818d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        zzbmh zzbmh = new zzbmh(this.f6816b.get(), new zzbls(this.f6817c.get(), this.f6815a.get()), this.f6818d.get());
        zzelg.b(zzbmh, "Cannot return null from a non-@Nullable @Provides method");
        return zzbmh;
    }
}
