package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpo {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8995a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f8996b = Build.DEVICE;

    /* renamed from: c  reason: collision with root package name */
    public static final String f8997c = Build.MANUFACTURER;

    /* renamed from: d  reason: collision with root package name */
    public static final String f8998d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f8999e;

    static {
        int i;
        if (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        f8995a = i;
        String str = Build.MODEL;
        f8998d = str;
        String str2 = f8996b;
        String str3 = f8997c;
        int i2 = f8995a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        f8999e = sb.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(0.1f, Math.min(f2, 8.0f));
    }

    public static int b(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static long c(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    public static String d(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void e(zzok zzok) {
        if (zzok != null) {
            try {
                zzok.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void f(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > 1000000 ? 1 : (j2 == 1000000 ? 0 : -1));
        if (i2 >= 0 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || 1000000 % j2 != 0) {
            double d2 = 1000000.0d / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d2);
                i++;
            }
        } else {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x0019
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0013
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0008
        L_0x0013:
            if (r7 == 0) goto L_0x0018
            int r5 = r0 + -1
            goto L_0x0019
        L_0x0018:
            r5 = r0
        L_0x0019:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r4 = java.lang.Math.min(r4, r5)
            return r4
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpo.h(long[], long, boolean, boolean):int");
    }

    public static ExecutorService i(String str) {
        return Executors.newSingleThreadExecutor(new td0(str));
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        return new Locale(str).getLanguage();
    }

    public static byte[] k(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static int l(String str) {
        int length = str.length();
        zzpb.a(length <= 4);
        char c2 = 0;
        for (int i = 0; i < length; i++) {
            c2 = (c2 << 8) | str.charAt(i);
        }
        return c2;
    }

    public static byte[] m(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static int n(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int o(int i) {
        if (i == 0) {
            return 16777216;
        }
        if (i == 1) {
            return 3538944;
        }
        if (i == 2) {
            return 13107200;
        }
        if (i == 3 || i == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static int p(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static int q(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int r(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i == 1073741824) {
            return i2 << 2;
        }
        if (i == 2) {
            return i2 << 1;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }
}
