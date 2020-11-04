package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddl implements zzela<zzddj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzavy> f7906a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f7907b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f7908c;

    private zzddl(zzelj<zzavy> zzelj, zzelj<zzdvi> zzelj2, zzelj<Context> zzelj3) {
        this.f7906a = zzelj;
        this.f7907b = zzelj2;
        this.f7908c = zzelj3;
    }

    public static zzddl a(zzelj<zzavy> zzelj, zzelj<zzdvi> zzelj2, zzelj<Context> zzelj3) {
        return new zzddl(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        return new zzddj(this.f7906a.get(), this.f7907b.get(), this.f7908c.get());
    }
}
