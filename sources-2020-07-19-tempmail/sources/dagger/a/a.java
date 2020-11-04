package dagger.a;

import dagger.Lazy;
import javax.inject.Provider;

/* compiled from: DoubleCheck */
public final class a<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f13972c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Provider<T> f13973a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f13974b = f13972c;

    private a(Provider<T> provider) {
        this.f13973a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> a(P p) {
        d.b(p);
        if (p instanceof a) {
            return p;
        }
        return new a(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f13972c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f13974b;
        if (t == f13972c) {
            synchronized (this) {
                t = this.f13974b;
                if (t == f13972c) {
                    t = this.f13973a.get();
                    b(this.f13974b, t);
                    this.f13974b = t;
                    this.f13973a = null;
                }
            }
        }
        return t;
    }
}
