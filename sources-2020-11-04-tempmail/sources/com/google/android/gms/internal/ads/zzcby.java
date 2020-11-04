package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcby implements zzela<zzbmh> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzqn> f6998a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6999b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f7000c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Clock> f7001d;

    public zzcby(zzelj<zzqn> zzelj, zzelj<Executor> zzelj2, zzelj<Context> zzelj3, zzelj<Clock> zzelj4) {
        this.f6998a = zzelj;
        this.f6999b = zzelj2;
        this.f7000c = zzelj3;
        this.f7001d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        zzbmh zzbmh = new zzbmh(this.f6999b.get(), new zzbls(this.f7000c.get(), this.f6998a.get()), this.f7001d.get());
        zzelg.b(zzbmh, "Cannot return null from a non-@Nullable @Provides method");
        return zzbmh;
    }
}
