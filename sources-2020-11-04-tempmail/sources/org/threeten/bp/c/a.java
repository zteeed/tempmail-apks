package org.threeten.bp.c;

/* compiled from: Jdk8Methods */
public final class a {
    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str + " must not be null");
    }

    public static int b(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        throw new ArithmeticException("Addition overflows an int: " + i + " + " + i2);
    }

    public static int c(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Multiplication overflows an int: " + i + " * " + i2);
    }
}
