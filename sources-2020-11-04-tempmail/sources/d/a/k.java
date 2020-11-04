package d.a;

import d.a.a0.b.b;
import d.a.a0.j.m;

/* compiled from: Notification */
public final class k<T> {

    /* renamed from: b  reason: collision with root package name */
    static final k<Object> f14346b = new k<>((Object) null);

    /* renamed from: a  reason: collision with root package name */
    final Object f14347a;

    private k(Object obj) {
        this.f14347a = obj;
    }

    public static <T> k<T> a() {
        return f14346b;
    }

    public static <T> k<T> b(Throwable th) {
        b.e(th, "error is null");
        return new k<>(m.m(th));
    }

    public static <T> k<T> c(T t) {
        b.e(t, "value is null");
        return new k<>(t);
    }

    public Throwable d() {
        Object obj = this.f14347a;
        if (m.q(obj)) {
            return m.n(obj);
        }
        return null;
    }

    public T e() {
        Object obj = this.f14347a;
        if (obj == null || m.q(obj)) {
            return null;
        }
        return this.f14347a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return b.c(this.f14347a, ((k) obj).f14347a);
        }
        return false;
    }

    public boolean f() {
        return this.f14347a == null;
    }

    public boolean g() {
        return m.q(this.f14347a);
    }

    public boolean h() {
        Object obj = this.f14347a;
        return obj != null && !m.q(obj);
    }

    public int hashCode() {
        Object obj = this.f14347a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f14347a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (m.q(obj)) {
            return "OnErrorNotification[" + m.n(obj) + "]";
        }
        return "OnNextNotification[" + this.f14347a + "]";
    }
}
