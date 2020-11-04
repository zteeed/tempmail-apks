package org.jsoup.b;

/* compiled from: Validate */
public final class c {
    public static void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void b(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    public static void c(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    public static void e(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(Object[] objArr) {
        g(objArr, "Array must not contain any null objects");
    }

    public static void g(Object[] objArr, String str) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException(str);
            }
        }
    }

    public static void h(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
