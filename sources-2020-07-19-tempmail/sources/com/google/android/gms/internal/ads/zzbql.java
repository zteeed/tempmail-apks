package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbql implements zzela<zzaxg> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Clock> f6527a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzaxs> f6528b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdla> f6529c;

    private zzbql(zzelj<Clock> zzelj, zzelj<zzaxs> zzelj2, zzelj<zzdla> zzelj3) {
        this.f6527a = zzelj;
        this.f6528b = zzelj2;
        this.f6529c = zzelj3;
    }

    public static zzbql a(zzelj<Clock> zzelj, zzelj<zzaxs> zzelj2, zzelj<zzdla> zzelj3) {
        return new zzbql(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        zzaxg c2 = this.f6528b.get().c(this.f6527a.get(), this.f6529c.get().f8168f);
        zzelg.b(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
