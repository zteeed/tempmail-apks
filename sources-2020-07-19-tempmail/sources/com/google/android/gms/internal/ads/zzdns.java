package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdns implements zzela<zzdvi> {
    public static zzdns a() {
        return mx.f4426a;
    }

    public final /* synthetic */ Object get() {
        zzdvi zzdvi;
        if (((Boolean) zzwg.e().c(zzaav.E2)).booleanValue()) {
            zzdvi = zzbbf.f6139c;
        } else {
            if (((Boolean) zzwg.e().c(zzaav.D2)).booleanValue()) {
                zzdvi = zzbbf.f6137a;
            } else {
                zzdvi = zzbbf.f6141e;
            }
        }
        zzelg.b(zzdvi, "Cannot return null from a non-@Nullable @Provides method");
        return zzdvi;
    }
}
