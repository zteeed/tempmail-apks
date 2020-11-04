package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrd implements zzela<zzcqz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbmq> f7396a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7397b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f7398c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzchw> f7399d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdla> f7400e;

    public zzcrd(zzelj<zzbmq> zzelj, zzelj<Context> zzelj2, zzelj<Executor> zzelj3, zzelj<zzchw> zzelj4, zzelj<zzdla> zzelj5) {
        this.f7396a = zzelj;
        this.f7397b = zzelj2;
        this.f7398c = zzelj3;
        this.f7399d = zzelj4;
        this.f7400e = zzelj5;
    }

    public final /* synthetic */ Object get() {
        return new zzcqz(this.f7396a.get(), this.f7397b.get(), this.f7398c.get(), this.f7399d.get(), this.f7400e.get());
    }
}
