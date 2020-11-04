package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddh implements zzela<zzdde> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f8075a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f8076b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<String> f8077c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcwj> f8078d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<Context> f8079e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<zzdla> f8080f;
    private final zzelj<zzcwh> g;

    private zzddh(zzelj<zzdvi> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<String> zzelj3, zzelj<zzcwj> zzelj4, zzelj<Context> zzelj5, zzelj<zzdla> zzelj6, zzelj<zzcwh> zzelj7) {
        this.f8075a = zzelj;
        this.f8076b = zzelj2;
        this.f8077c = zzelj3;
        this.f8078d = zzelj4;
        this.f8079e = zzelj5;
        this.f8080f = zzelj6;
        this.g = zzelj7;
    }

    public static zzddh a(zzelj<zzdvi> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<String> zzelj3, zzelj<zzcwj> zzelj4, zzelj<Context> zzelj5, zzelj<zzdla> zzelj6, zzelj<zzcwh> zzelj7) {
        return new zzddh(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6, zzelj7);
    }

    public final /* synthetic */ Object get() {
        return new zzdde(this.f8075a.get(), this.f8076b.get(), this.f8077c.get(), this.f8078d.get(), this.f8079e.get(), this.f8080f.get(), this.g.get());
    }
}
