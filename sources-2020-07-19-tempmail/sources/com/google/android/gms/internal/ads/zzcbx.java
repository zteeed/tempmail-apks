package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcbx implements zzela<zzbyj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6813a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdkk> f6814b;

    public zzcbx(zzelj<Context> zzelj, zzelj<zzdkk> zzelj2) {
        this.f6813a = zzelj;
        this.f6814b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzbyj zzbyj = new zzbyj(this.f6813a.get(), new HashSet(), this.f6814b.get());
        zzelg.b(zzbyj, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyj;
    }
}
