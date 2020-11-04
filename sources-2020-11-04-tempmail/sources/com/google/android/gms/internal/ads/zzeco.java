package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeco implements zzdwc {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f8679b = new w40();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f8680a;

    public zzeco(byte[] bArr) throws GeneralSecurityException {
        zzedv.a(bArr.length);
        this.f8680a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec b(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (zzedw.a()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] c2 = zzedu.c(12);
            System.arraycopy(c2, 0, bArr3, 0, 12);
            f8679b.get().init(1, this.f8680a, b(c2, 0, c2.length));
            if (!(bArr2 == null || bArr2.length == 0)) {
                f8679b.get().updateAAD(bArr2);
            }
            int doFinal = f8679b.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
