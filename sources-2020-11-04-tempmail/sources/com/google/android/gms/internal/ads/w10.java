package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import com.google.android.gms.internal.ads.zzebn;
import com.google.android.gms.internal.ads.zzebq;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class w10 {
    static {
        Charset.forName("UTF-8");
    }

    public static zzebq a(zzebn zzebn) {
        zzebq.zzb L = zzebq.L();
        L.x(zzebn.G());
        for (zzebn.zzb next : zzebn.H()) {
            zzebq.zza.C0076zza P = zzebq.zza.P();
            P.z(next.L().N());
            P.w(next.G());
            P.x(next.H());
            P.y(next.M());
            L.w((zzebq.zza) ((zzegb) P.O()));
        }
        return (zzebq) ((zzegb) L.O());
    }

    public static void b(zzebn zzebn) throws GeneralSecurityException {
        int G = zzebn.G();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzebn.zzb next : zzebn.H()) {
            if (next.G() == zzebg.ENABLED) {
                if (!next.I()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.M())}));
                } else if (next.H() == zzebz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.M())}));
                } else if (next.G() != zzebg.UNKNOWN_STATUS) {
                    if (next.M() == G) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.L().Q() != zzebf.zza.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.M())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
