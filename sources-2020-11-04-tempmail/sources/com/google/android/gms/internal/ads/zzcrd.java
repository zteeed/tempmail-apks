package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrd implements zzela<zzcqz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbmq> f7579a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7580b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f7581c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzchw> f7582d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdla> f7583e;

    public zzcrd(zzelj<zzbmq> zzelj, zzelj<Context> zzelj2, zzelj<Executor> zzelj3, zzelj<zzchw> zzelj4, zzelj<zzdla> zzelj5) {
        this.f7579a = zzelj;
        this.f7580b = zzelj2;
        this.f7581c = zzelj3;
        this.f7582d = zzelj4;
        this.f7583e = zzelj5;
    }

    public final /* synthetic */ Object get() {
        return new zzcqz(this.f7579a.get(), this.f7580b.get(), this.f7581c.get(), this.f7582d.get(), this.f7583e.get());
    }
}
