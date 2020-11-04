package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzy implements zzela<zzbyg<zzbwd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbzk f6914a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6915b;

    private zzbzy(zzbzk zzbzk, zzelj<Executor> zzelj) {
        this.f6914a = zzbzk;
        this.f6915b = zzelj;
    }

    public static zzbzy a(zzbzk zzbzk, zzelj<Executor> zzelj) {
        return new zzbzy(zzbzk, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbyg<zzbwd> f2 = this.f6914a.f(this.f6915b.get());
        zzelg.b(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
