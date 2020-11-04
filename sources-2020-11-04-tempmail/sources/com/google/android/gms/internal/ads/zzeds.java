package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeds implements zzdwp {

    /* renamed from: a  reason: collision with root package name */
    private final Mac f8707a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8708b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8709c;

    /* renamed from: d  reason: collision with root package name */
    private final Key f8710d;

    public zzeds(String str, Key key, int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        } else if (key.getEncoded().length >= 16) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c2 = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c2 = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        String valueOf = String.valueOf(str);
                        throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
                    } else if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                } else if (i > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i > 20) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
            this.f8709c = str;
            this.f8708b = i;
            this.f8710d = key;
            Mac a2 = zzedf.g.a(str);
            this.f8707a = a2;
            a2.init(key);
        } else {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        Mac mac;
        try {
            mac = (Mac) this.f8707a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = zzedf.g.a(this.f8709c);
            mac.init(this.f8710d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f8708b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f8708b);
        return bArr2;
    }
}
