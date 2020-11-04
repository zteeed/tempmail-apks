package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchc implements zzela<zzchb> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7230a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7231b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzeg> f7232c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f7233d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zza> f7234e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzbfv> f7235f;

    public zzchc(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzeg> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zza> zzelj5, zzelj<zzbfv> zzelj6) {
        this.f7230a = zzelj;
        this.f7231b = zzelj2;
        this.f7232c = zzelj3;
        this.f7233d = zzelj4;
        this.f7234e = zzelj5;
        this.f7235f = zzelj6;
    }

    public final /* synthetic */ Object get() {
        return new zzchb(this.f7230a.get(), this.f7231b.get(), this.f7232c.get(), this.f7233d.get(), this.f7234e.get(), this.f7235f.get());
    }
}
