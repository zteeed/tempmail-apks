package a.h.j;

/* compiled from: Preconditions */
public final class h {
    public static int a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <T> T c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
