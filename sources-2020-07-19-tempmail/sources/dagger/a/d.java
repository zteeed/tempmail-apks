package dagger.a;

/* compiled from: Preconditions */
public final class d {
    public static <T> void a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
