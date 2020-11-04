package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxm implements zzela<Set<zzbyg<zzbuf>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6870a;

    private zzbxm(zzbxa zzbxa) {
        this.f6870a = zzbxa;
    }

    public static zzbxm a(zzbxa zzbxa) {
        return new zzbxm(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbuf>> j = this.f6870a.j();
        zzelg.b(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }
}
