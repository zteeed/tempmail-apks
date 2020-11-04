package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxp implements zzela<Set<zzbyg<zzbup>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6873a;

    private zzbxp(zzbxa zzbxa) {
        this.f6873a = zzbxa;
    }

    public static zzbxp a(zzbxa zzbxa) {
        return new zzbxp(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbup>> k = this.f6873a.k();
        zzelg.b(k, "Cannot return null from a non-@Nullable @Provides method");
        return k;
    }
}
