package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcev implements zzela<zzcet> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzazq> f7125a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Clock> f7126b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f7127c;

    public zzcev(zzelj<zzazq> zzelj, zzelj<Clock> zzelj2, zzelj<Executor> zzelj3) {
        this.f7125a = zzelj;
        this.f7126b = zzelj2;
        this.f7127c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcet(this.f7125a.get(), this.f7126b.get(), this.f7127c.get());
    }
}
