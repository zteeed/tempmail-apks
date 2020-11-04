package com.google.zxing.t.m;

/* compiled from: MathUtils */
public final class a {
    public static float a(float f2, float f3, float f4, float f5) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        return (float) Math.sqrt((double) ((f6 * f6) + (f7 * f7)));
    }

    public static float b(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        return (float) Math.sqrt((double) ((i5 * i5) + (i6 * i6)));
    }

    public static int c(float f2) {
        return (int) (f2 + (f2 < 0.0f ? -0.5f : 0.5f));
    }

    public static int d(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
