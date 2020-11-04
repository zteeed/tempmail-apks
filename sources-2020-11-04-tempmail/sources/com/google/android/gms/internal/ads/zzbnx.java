package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnx implements zzela<zzbyg<zzqs>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbow> f6623a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6624b;

    public zzbnx(zzbnj zzbnj, zzelj<zzbow> zzelj, zzelj<Executor> zzelj2) {
        this.f6623a = zzelj;
        this.f6624b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f6623a.get(), this.f6624b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
