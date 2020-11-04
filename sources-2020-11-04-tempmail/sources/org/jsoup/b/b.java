package org.jsoup.b;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

/* compiled from: StringUtil */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f15148a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f15149b = new a();

    /* compiled from: StringUtil */
    class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder(8192);
        }
    }

    public static void a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (d(codePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!f(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z2 = true;
                z3 = false;
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static boolean b(String str, String... strArr) {
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean d(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    public static boolean e(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!g(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean f(int i) {
        return Character.getType(i) == 16 && (i == 8203 || i == 8204 || i == 8205 || i == 173);
    }

    public static boolean g(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String h(int i) {
        if (i >= 0) {
            String[] strArr = f15148a;
            if (i < strArr.length) {
                return strArr[i];
            }
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = ' ';
            }
            return String.valueOf(cArr);
        }
        throw new IllegalArgumentException("width must be > 0");
    }

    public static String i(String str, String str2) {
        try {
            try {
                return j(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return "";
            }
        } catch (MalformedURLException unused2) {
            return new URL(str2).toExternalForm();
        }
    }

    public static URL j(URL url, String str) throws MalformedURLException {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        if (str.indexOf(46) == 0 && url.getFile().indexOf(47) != 0) {
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), "/" + url.getFile());
        }
        return new URL(url, str);
    }

    public static StringBuilder k() {
        StringBuilder sb = f15149b.get();
        if (sb.length() > 8192) {
            StringBuilder sb2 = new StringBuilder(8192);
            f15149b.set(sb2);
            return sb2;
        }
        sb.delete(0, sb.length());
        return sb;
    }
}
