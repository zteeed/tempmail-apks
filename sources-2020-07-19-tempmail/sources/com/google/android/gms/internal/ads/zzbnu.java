package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnu implements zzela<zzavv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6436a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdla> f6437b;

    public zzbnu(zzbnj zzbnj, zzelj<Context> zzelj, zzelj<zzdla> zzelj2) {
        this.f6436a = zzelj;
        this.f6437b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzavv zzavv = new zzavv(this.f6436a.get(), this.f6437b.get().f8168f);
        zzelg.b(zzavv, "Cannot return null from a non-@Nullable @Provides method");
        return zzavv;
    }
}
