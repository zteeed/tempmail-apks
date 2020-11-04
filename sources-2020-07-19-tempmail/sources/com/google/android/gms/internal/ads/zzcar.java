package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzty;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcar implements zzela<zzcao> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6752a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbfn> f6753b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdkk> f6754c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f6755d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzty.zza.C0086zza> f6756e;

    private zzcar(zzelj<Context> zzelj, zzelj<zzbfn> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zzty.zza.C0086zza> zzelj5) {
        this.f6752a = zzelj;
        this.f6753b = zzelj2;
        this.f6754c = zzelj3;
        this.f6755d = zzelj4;
        this.f6756e = zzelj5;
    }

    public static zzcar a(zzelj<Context> zzelj, zzelj<zzbfn> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zzty.zza.C0086zza> zzelj5) {
        return new zzcar(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzcao(this.f6752a.get(), this.f6753b.get(), this.f6754c.get(), this.f6755d.get(), this.f6756e.get());
    }
}
