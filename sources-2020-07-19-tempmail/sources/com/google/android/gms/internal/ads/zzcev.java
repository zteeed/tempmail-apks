package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcev implements zzela<zzcet> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzazq> f6942a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Clock> f6943b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f6944c;

    public zzcev(zzelj<zzazq> zzelj, zzelj<Clock> zzelj2, zzelj<Executor> zzelj3) {
        this.f6942a = zzelj;
        this.f6943b = zzelj2;
        this.f6944c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcet(this.f6942a.get(), this.f6943b.get(), this.f6944c.get());
    }
}
