package com.tempmail.k;

import android.text.TextUtils;
import android.util.Base64;
import b.a.a.a.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: Security */
public class g {
    public static PublicKey a(String str) throws IOException {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidKeySpecException e3) {
            String str2 = "Invalid key specification: " + e3;
            a.f("IABUtil/Security", str2);
            throw new IOException(str2);
        }
    }

    public static boolean b(PublicKey publicKey, String str, String str2) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                if (instance.verify(decode)) {
                    return true;
                }
                a.f("IABUtil/Security", "Signature verification failed.");
                return false;
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            } catch (InvalidKeyException unused) {
                a.f("IABUtil/Security", "Invalid key specification.");
                return false;
            } catch (SignatureException unused2) {
                a.f("IABUtil/Security", "Signature exception.");
                return false;
            }
        } catch (IllegalArgumentException unused3) {
            a.f("IABUtil/Security", "Base64 decoding failed.");
            return false;
        }
    }

    public static boolean c(String str, String str2, String str3) throws IOException {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return b(a(str), str2, str3);
        }
        a.f("IABUtil/Security", "Purchase verification failed: missing data.");
        return false;
    }
}
