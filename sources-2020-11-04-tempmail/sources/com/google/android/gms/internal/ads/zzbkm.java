package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbkm implements zzela<zzazq> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6490a;

    public zzbkm(zzelj<Context> zzelj) {
        this.f6490a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzazq zzazq = new zzazq(this.f6490a.get());
        zzelg.b(zzazq, "Cannot return null from a non-@Nullable @Provides method");
        return zzazq;
    }
}
