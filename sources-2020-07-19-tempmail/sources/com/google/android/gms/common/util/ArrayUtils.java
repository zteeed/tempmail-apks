package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.Arrays;

@KeepForSdk
@VisibleForTesting
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @KeepForSdk
    public static <T> T[] a(T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr2 = tArr[i2];
            System.arraycopy(tArr2, 0, copyOf, length2, tArr2.length);
            length2 += tArr2.length;
        }
        return copyOf;
    }

    @KeepForSdk
    public static <T> boolean b(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (Objects.a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static void c(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    @KeepForSdk
    public static void d(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    @KeepForSdk
    public static void e(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    @KeepForSdk
    public static void f(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    @KeepForSdk
    public static <T> void g(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i].toString());
        }
    }

    @KeepForSdk
    public static void h(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    @KeepForSdk
    public static void i(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }
}
