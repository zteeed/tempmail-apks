package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxi implements zzela<Set<zzbyg<zzbtd>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6866a;

    private zzbxi(zzbxa zzbxa) {
        this.f6866a = zzbxa;
    }

    public static zzbxi a(zzbxa zzbxa) {
        return new zzbxi(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbtd>> i = this.f6866a.i();
        zzelg.b(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
