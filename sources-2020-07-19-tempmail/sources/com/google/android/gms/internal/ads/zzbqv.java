package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzc;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbqv implements zzela<zzc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6548a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzavr> f6549b;

    private zzbqv(zzbqs zzbqs, zzelj<Context> zzelj, zzelj<zzavr> zzelj2) {
        this.f6548a = zzelj;
        this.f6549b = zzelj2;
    }

    public static zzbqv a(zzbqs zzbqs, zzelj<Context> zzelj, zzelj<zzavr> zzelj2) {
        return new zzbqv(zzbqs, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzc zzc = new zzc(this.f6548a.get(), this.f6549b.get(), (zzarx) null);
        zzelg.b(zzc, "Cannot return null from a non-@Nullable @Provides method");
        return zzc;
    }
}
