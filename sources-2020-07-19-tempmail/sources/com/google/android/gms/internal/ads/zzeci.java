package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeci implements zzdwp {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f8486a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8487b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f8488c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f8489d;

    public zzeci(byte[] bArr, int i) throws GeneralSecurityException {
        zzedv.a(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i <= 16) {
            this.f8486a = new SecretKeySpec(bArr, "AES");
            this.f8487b = i;
            Cipher b2 = b();
            b2.init(1, this.f8486a);
            byte[] a2 = x40.a(b2.doFinal(new byte[16]));
            this.f8488c = a2;
            this.f8489d = x40.a(a2);
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    private static Cipher b() throws GeneralSecurityException {
        return zzedf.f8517f.a("AES/ECB/NoPadding");
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        Cipher b2 = b();
        b2.init(1, this.f8486a);
        int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if ((max << 4) == bArr.length) {
            bArr2 = zzecp.b(bArr, (max - 1) << 4, this.f8488c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length < 16) {
                byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                bArr2 = zzecp.d(copyOf, this.f8489d);
            } else {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
        }
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr3 = b2.doFinal(zzecp.b(bArr3, 0, bArr, i << 4, 16));
        }
        byte[] d2 = zzecp.d(bArr2, bArr3);
        byte[] bArr4 = new byte[this.f8487b];
        System.arraycopy(b2.doFinal(d2), 0, bArr4, 0, this.f8487b);
        return bArr4;
    }
}
