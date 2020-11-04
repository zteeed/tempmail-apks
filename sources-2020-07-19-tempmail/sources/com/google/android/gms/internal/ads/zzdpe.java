package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdpe implements zzela<zzalr> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8285a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f8286b;

    public zzdpe(zzdpb zzdpb, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2) {
        this.f8285a = zzelj;
        this.f8286b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzalr b2 = new zzali().b(this.f8285a.get(), this.f8286b.get());
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
