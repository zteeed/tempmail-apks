package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdpk {
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f8476c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f8477d = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f8478a = f8477d;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8479b = f8476c;

    private static X509Certificate b(String str) throws GeneralSecurityException {
        try {
            X509Certificate[][] h = zzb.h(str);
            if (h.length == 1) {
                return h[0][0];
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzh e2) {
            throw new GeneralSecurityException("Package is not signed", e2);
        } catch (IOException | RuntimeException e3) {
            throw new GeneralSecurityException("Failed to verify signatures", e3);
        }
    }

    public final boolean a(File file) throws GeneralSecurityException {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(b(file.getAbsolutePath()).getEncoded());
        if (!Arrays.equals(this.f8479b, digest)) {
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f8478a, digest);
        }
        return true;
    }
}
