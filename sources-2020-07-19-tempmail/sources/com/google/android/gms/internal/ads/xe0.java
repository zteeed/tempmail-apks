package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xe0 implements Comparator<zzrw> {
    xe0(zzrr zzrr) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzrw zzrw = (zzrw) obj;
        zzrw zzrw2 = (zzrw) obj2;
        int i = zzrw.f9076c - zzrw2.f9076c;
        if (i != 0) {
            return i;
        }
        return (int) (zzrw.f9074a - zzrw2.f9074a);
    }
}
