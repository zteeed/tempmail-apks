package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzech implements zzedp {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f8665d = new t40();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKeySpec f8666a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8667b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8668c;

    public zzech(byte[] bArr, int i) throws GeneralSecurityException {
        zzedv.a(bArr.length);
        this.f8666a = new SecretKeySpec(bArr, "AES");
        int blockSize = f8665d.get().getBlockSize();
        this.f8668c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f8667b = i;
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f8667b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] c2 = zzedu.c(i);
            System.arraycopy(c2, 0, bArr2, 0, this.f8667b);
            int length2 = bArr.length;
            int i2 = this.f8667b;
            Cipher cipher = f8665d.get();
            byte[] bArr3 = new byte[this.f8668c];
            System.arraycopy(c2, 0, bArr3, 0, this.f8667b);
            cipher.init(1, this.f8666a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(Integer.MAX_VALUE - this.f8667b);
        throw new GeneralSecurityException(sb.toString());
    }
}
