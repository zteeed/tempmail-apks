package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchc implements zzela<zzchb> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7047a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7048b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzeg> f7049c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f7050d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zza> f7051e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzbfv> f7052f;

    public zzchc(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzeg> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zza> zzelj5, zzelj<zzbfv> zzelj6) {
        this.f7047a = zzelj;
        this.f7048b = zzelj2;
        this.f7049c = zzelj3;
        this.f7050d = zzelj4;
        this.f7051e = zzelj5;
        this.f7052f = zzelj6;
    }

    public final /* synthetic */ Object get() {
        return new zzchb(this.f7047a.get(), this.f7048b.get(), this.f7049c.get(), this.f7050d.get(), this.f7051e.get(), this.f7052f.get());
    }
}
