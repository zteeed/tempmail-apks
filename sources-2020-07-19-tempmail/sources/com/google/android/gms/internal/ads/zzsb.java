package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzsb implements Comparator<zzrp> {
    public zzsb(zzry zzry) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzrp zzrp = (zzrp) obj;
        zzrp zzrp2 = (zzrp) obj2;
        if (zzrp.b() < zzrp2.b()) {
            return -1;
        }
        if (zzrp.b() > zzrp2.b()) {
            return 1;
        }
        if (zzrp.a() < zzrp2.a()) {
            return -1;
        }
        if (zzrp.a() > zzrp2.a()) {
            return 1;
        }
        float d2 = (zzrp.d() - zzrp.b()) * (zzrp.c() - zzrp.a());
        float d3 = (zzrp2.d() - zzrp2.b()) * (zzrp2.c() - zzrp2.a());
        if (d2 > d3) {
            return -1;
        }
        if (d2 < d3) {
            return 1;
        }
        return 0;
    }
}
