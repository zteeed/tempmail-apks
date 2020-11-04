package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxg implements zzela<Set<zzbyg<zzbsq>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6864a;

    private zzbxg(zzbxa zzbxa) {
        this.f6864a = zzbxa;
    }

    public static zzbxg a(zzbxa zzbxa) {
        return new zzbxg(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbsq>> d2 = this.f6864a.d();
        zzelg.b(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }
}
