package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzty;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcar implements zzela<zzcao> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6935a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbfn> f6936b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdkk> f6937c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbbd> f6938d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzty.zza.C0085zza> f6939e;

    private zzcar(zzelj<Context> zzelj, zzelj<zzbfn> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zzty.zza.C0085zza> zzelj5) {
        this.f6935a = zzelj;
        this.f6936b = zzelj2;
        this.f6937c = zzelj3;
        this.f6938d = zzelj4;
        this.f6939e = zzelj5;
    }

    public static zzcar a(zzelj<Context> zzelj, zzelj<zzbfn> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzbbd> zzelj4, zzelj<zzty.zza.C0085zza> zzelj5) {
        return new zzcar(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzcao(this.f6935a.get(), this.f6936b.get(), this.f6937c.get(), this.f6938d.get(), this.f6939e.get());
    }
}
