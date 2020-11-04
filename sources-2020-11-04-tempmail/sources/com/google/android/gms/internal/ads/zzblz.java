package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblz implements zzela<zzblu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzalw> f6539a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbls> f6540b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f6541c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzblp> f6542d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<Clock> f6543e;

    private zzblz(zzelj<zzalw> zzelj, zzelj<zzbls> zzelj2, zzelj<Executor> zzelj3, zzelj<zzblp> zzelj4, zzelj<Clock> zzelj5) {
        this.f6539a = zzelj;
        this.f6540b = zzelj2;
        this.f6541c = zzelj3;
        this.f6542d = zzelj4;
        this.f6543e = zzelj5;
    }

    public static zzblz a(zzelj<zzalw> zzelj, zzelj<zzbls> zzelj2, zzelj<Executor> zzelj3, zzelj<zzblp> zzelj4, zzelj<Clock> zzelj5) {
        return new zzblz(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzblu(this.f6539a.get(), this.f6540b.get(), this.f6541c.get(), this.f6542d.get(), this.f6543e.get());
    }
}
