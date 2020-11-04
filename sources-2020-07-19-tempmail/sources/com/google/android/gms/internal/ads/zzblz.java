package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblz implements zzela<zzblu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzalw> f6356a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbls> f6357b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f6358c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzblp> f6359d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<Clock> f6360e;

    private zzblz(zzelj<zzalw> zzelj, zzelj<zzbls> zzelj2, zzelj<Executor> zzelj3, zzelj<zzblp> zzelj4, zzelj<Clock> zzelj5) {
        this.f6356a = zzelj;
        this.f6357b = zzelj2;
        this.f6358c = zzelj3;
        this.f6359d = zzelj4;
        this.f6360e = zzelj5;
    }

    public static zzblz a(zzelj<zzalw> zzelj, zzelj<zzbls> zzelj2, zzelj<Executor> zzelj3, zzelj<zzblp> zzelj4, zzelj<Clock> zzelj5) {
        return new zzblz(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzblu(this.f6356a.get(), this.f6357b.get(), this.f6358c.get(), this.f6359d.get(), this.f6360e.get());
    }
}
