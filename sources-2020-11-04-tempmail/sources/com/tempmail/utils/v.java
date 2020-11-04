package com.tempmail.utils;

import android.util.Base64;

/* compiled from: StringXORer */
public class v {
    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    public static String b(String str, int i) {
        String c2 = c(str, i);
        String str2 = x.f13134a;
        m.b(str2, "xor " + c2);
        return a(c2.getBytes());
    }

    private static String c(String str, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append((char) (str.charAt(i2) ^ i));
        }
        return sb.toString();
    }
}
