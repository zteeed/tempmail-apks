package b.c.a.b;

/* compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
public abstract class c<T> {
    public static <T> c<T> d(T t) {
        return new a((Integer) null, t, d.VERY_LOW);
    }

    public static <T> c<T> e(T t) {
        return new a((Integer) null, t, d.HIGHEST);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}
