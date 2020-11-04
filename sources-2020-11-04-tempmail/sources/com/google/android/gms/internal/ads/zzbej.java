package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbej implements zzbfa {
    public final zzbes a(zzbdb zzbdb, int i, String str, zzbdc zzbdc) {
        if (i <= 0) {
            return new zzbez(zzbdb);
        }
        int B = zzbdy.B();
        if (B < zzbdc.g) {
            return new zzbfd(zzbdb, zzbdc);
        }
        if (B < zzbdc.f6354b) {
            return new zzbfe(zzbdb, zzbdc);
        }
        return new zzbfc(zzbdb);
    }
}
