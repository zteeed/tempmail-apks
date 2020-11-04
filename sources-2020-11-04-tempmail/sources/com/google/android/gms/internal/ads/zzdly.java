package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdly implements zzela<zzdlv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8377a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzaxs> f8378b;

    private zzdly(zzelj<Context> zzelj, zzelj<zzaxs> zzelj2) {
        this.f8377a = zzelj;
        this.f8378b = zzelj2;
    }

    public static zzdly a(zzelj<Context> zzelj, zzelj<zzaxs> zzelj2) {
        return new zzdly(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzdlv(this.f8377a.get(), this.f8378b.get());
    }
}
