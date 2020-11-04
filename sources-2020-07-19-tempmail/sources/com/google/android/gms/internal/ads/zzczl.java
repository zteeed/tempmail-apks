package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczl implements zzela<zzczj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzday<zzdef>> f7747a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f7748b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f7749c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzaxh> f7750d;

    private zzczl(zzelj<zzday<zzdef>> zzelj, zzelj<zzdla> zzelj2, zzelj<Context> zzelj3, zzelj<zzaxh> zzelj4) {
        this.f7747a = zzelj;
        this.f7748b = zzelj2;
        this.f7749c = zzelj3;
        this.f7750d = zzelj4;
    }

    public static zzczl a(zzelj<zzday<zzdef>> zzelj, zzelj<zzdla> zzelj2, zzelj<Context> zzelj3, zzelj<zzaxh> zzelj4) {
        return new zzczl(zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        return new zzczj(this.f7747a.get(), this.f7748b.get(), this.f7749c.get(), this.f7750d.get());
    }
}