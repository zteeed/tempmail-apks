package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v20 {
    public static zzedd a(zzeag zzeag) throws GeneralSecurityException {
        int i = u20.f5213c[zzeag.ordinal()];
        if (i == 1) {
            return zzedd.UNCOMPRESSED;
        }
        if (i == 2) {
            return zzedd.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return zzedd.COMPRESSED;
        }
        String valueOf = String.valueOf(zzeag);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static zzede b(zzeau zzeau) throws GeneralSecurityException {
        int i = u20.f5212b[zzeau.ordinal()];
        if (i == 1) {
            return zzede.NIST_P256;
        }
        if (i == 2) {
            return zzede.NIST_P384;
        }
        if (i == 3) {
            return zzede.NIST_P521;
        }
        String valueOf = String.valueOf(zzeau);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String c(zzeav zzeav) throws NoSuchAlgorithmException {
        int i = u20.f5211a[zzeav.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzeav);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void d(zzeam zzeam) throws GeneralSecurityException {
        zzedc.d(b(zzeam.G().G()));
        c(zzeam.G().H());
        if (zzeam.I() != zzeag.UNKNOWN_FORMAT) {
            zzdwy.e(zzeam.H().G());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
