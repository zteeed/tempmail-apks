package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzecj implements zzdwc {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f8490e = new v40();

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f8491f = new u40();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f8492a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8493b;

    /* renamed from: c  reason: collision with root package name */
    private final SecretKeySpec f8494c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8495d;

    public zzecj(byte[] bArr, int i) throws GeneralSecurityException {
        if (i == 12 || i == 16) {
            this.f8495d = i;
            zzedv.a(bArr.length);
            this.f8494c = new SecretKeySpec(bArr, "AES");
            Cipher cipher = f8490e.get();
            cipher.init(1, this.f8494c);
            byte[] d2 = d(cipher.doFinal(new byte[16]));
            this.f8492a = d2;
            this.f8493b = d(d2);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] b(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(c(bArr3, this.f8492a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = c(copyOfRange, this.f8492a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f8493b, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(c(doFinal, bArr2));
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    private static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i = this.f8495d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i + 16)];
            byte[] c2 = zzedu.c(i);
            System.arraycopy(c2, 0, bArr4, 0, this.f8495d);
            Cipher cipher = f8490e.get();
            cipher.init(1, this.f8494c);
            byte[] b2 = b(cipher, 0, c2, 0, c2.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] b3 = b(cipher, 1, bArr5, 0, bArr5.length);
            Cipher cipher2 = f8491f.get();
            cipher2.init(1, this.f8494c, new IvParameterSpec(b2));
            cipher2.doFinal(bArr, 0, bArr3.length, bArr4, this.f8495d);
            byte[] b4 = b(cipher, 2, bArr4, this.f8495d, bArr3.length);
            int length2 = bArr3.length + this.f8495d;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr4[length2 + i2] = (byte) ((b3[i2] ^ b2[i2]) ^ b4[i2]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
