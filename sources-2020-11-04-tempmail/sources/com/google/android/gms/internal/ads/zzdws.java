package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import com.google.android.gms.internal.ads.zzebn;
import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdws {
    @Deprecated
    public static final zzdwo a(byte[] bArr) throws GeneralSecurityException {
        try {
            zzebn M = zzebn.M(bArr, zzefo.b());
            for (zzebn.zzb next : M.H()) {
                if (next.L().Q() == zzebf.zza.UNKNOWN_KEYMATERIAL || next.L().Q() == zzebf.zza.SYMMETRIC || next.L().Q() == zzebf.zza.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzdwo.a(M);
        } catch (zzegl unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
