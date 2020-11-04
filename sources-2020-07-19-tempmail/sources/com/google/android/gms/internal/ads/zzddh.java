package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddh implements zzela<zzdde> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f7892a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7893b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<String> f7894c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcwj> f7895d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<Context> f7896e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzdla> f7897f;
    private final zzelj<zzcwh> g;

    private zzddh(zzelj<zzdvi> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<String> zzelj3, zzelj<zzcwj> zzelj4, zzelj<Context> zzelj5, zzelj<zzdla> zzelj6, zzelj<zzcwh> zzelj7) {
        this.f7892a = zzelj;
        this.f7893b = zzelj2;
        this.f7894c = zzelj3;
        this.f7895d = zzelj4;
        this.f7896e = zzelj5;
        this.f7897f = zzelj6;
        this.g = zzelj7;
    }

    public static zzddh a(zzelj<zzdvi> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<String> zzelj3, zzelj<zzcwj> zzelj4, zzelj<Context> zzelj5, zzelj<zzdla> zzelj6, zzelj<zzcwh> zzelj7) {
        return new zzddh(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6, zzelj7);
    }

    public final /* synthetic */ Object get() {
        return new zzdde(this.f7892a.get(), this.f7893b.get(), this.f7894c.get(), this.f7895d.get(), this.f7896e.get(), this.f7897f.get(), this.g.get());
    }
}
