package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class p extends zzabc {
    p() {
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        if (i == 0 && length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    public final String a(String str, String str2) {
        String b2 = b(str);
        String b3 = b(str2);
        if (TextUtils.isEmpty(b2)) {
            return b3;
        }
        if (TextUtils.isEmpty(b3)) {
            return b2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 1 + String.valueOf(b3).length());
        sb.append(b2);
        sb.append(",");
        sb.append(b3);
        return sb.toString();
    }
}
