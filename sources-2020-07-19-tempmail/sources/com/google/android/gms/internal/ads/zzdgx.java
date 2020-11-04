package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdgx implements zzela<zzdgr> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8037a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f8038b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbif> f8039c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzdil<zzbmq, zzbmw>> f8040d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdhi> f8041e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzdlc> f8042f;

    public zzdgx(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzbif> zzelj3, zzelj<zzdil<zzbmq, zzbmw>> zzelj4, zzelj<zzdhi> zzelj5, zzelj<zzdlc> zzelj6) {
        this.f8037a = zzelj;
        this.f8038b = zzelj2;
        this.f8039c = zzelj3;
        this.f8040d = zzelj4;
        this.f8041e = zzelj5;
        this.f8042f = zzelj6;
    }

    public final /* synthetic */ Object get() {
        return new zzdgr(this.f8037a.get(), this.f8038b.get(), this.f8039c.get(), this.f8040d.get(), this.f8041e.get(), this.f8042f.get());
    }
}
