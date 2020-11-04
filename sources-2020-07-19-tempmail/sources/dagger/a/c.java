package dagger.a;

import dagger.Lazy;

/* compiled from: InstanceFactory */
public final class c<T> implements b<T>, Lazy<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f13975a;

    private c(T t) {
        this.f13975a = t;
    }

    public static <T> b<T> a(T t) {
        d.c(t, "instance cannot be null");
        return new c(t);
    }

    public T get() {
        return this.f13975a;
    }
}
