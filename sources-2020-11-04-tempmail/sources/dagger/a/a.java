package dagger.a;

import dagger.Lazy;
import javax.inject.Provider;

/* compiled from: DoubleCheck */
public final class a<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f14374c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider<T> f14375a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f14376b = f14374c;

    private a(Provider<T> provider) {
        this.f14375a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> a(P p) {
        d.b(p);
        if (p instanceof a) {
            return p;
        }
        return new a(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f14374c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f14376b;
        if (t == f14374c) {
            synchronized (this) {
                t = this.f14376b;
                if (t == f14374c) {
                    t = this.f14375a.get();
                    b(this.f14376b, t);
                    this.f14376b = t;
                    this.f14375a = null;
                }
            }
        }
        return t;
    }
}
