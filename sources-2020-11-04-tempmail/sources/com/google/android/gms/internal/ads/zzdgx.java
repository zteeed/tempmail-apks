package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdgx implements zzela<zzdgr> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8220a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f8221b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbif> f8222c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdil<zzbmq, zzbmw>> f8223d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdhi> f8224e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzdlc> f8225f;

    public zzdgx(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzbif> zzelj3, zzelj<zzdil<zzbmq, zzbmw>> zzelj4, zzelj<zzdhi> zzelj5, zzelj<zzdlc> zzelj6) {
        this.f8220a = zzelj;
        this.f8221b = zzelj2;
        this.f8222c = zzelj3;
        this.f8223d = zzelj4;
        this.f8224e = zzelj5;
        this.f8225f = zzelj6;
    }

    public final /* synthetic */ Object get() {
        return new zzdgr(this.f8220a.get(), this.f8221b.get(), this.f8222c.get(), this.f8223d.get(), this.f8224e.get(), this.f8225f.get());
    }
}
