package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbly implements zzela<zzblp> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzqn> f6353a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzalw> f6354b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f6355c;

    private zzbly(zzelj<zzqn> zzelj, zzelj<zzalw> zzelj2, zzelj<Executor> zzelj3) {
        this.f6353a = zzelj;
        this.f6354b = zzelj2;
        this.f6355c = zzelj3;
    }

    public static zzbly a(zzelj<zzqn> zzelj, zzelj<zzalw> zzelj2, zzelj<Executor> zzelj3) {
        return new zzbly(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        zzblp zzblp = new zzblp(this.f6353a.get().a(), this.f6354b.get(), this.f6355c.get());
        zzelg.b(zzblp, "Cannot return null from a non-@Nullable @Provides method");
        return zzblp;
    }
}
