package a.h.j;

/* compiled from: Pools */
public class g<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f357c = new Object();

    public g(int i) {
        super(i);
    }

    public boolean a(T t) {
        boolean a2;
        synchronized (this.f357c) {
            a2 = super.a(t);
        }
        return a2;
    }

    public T b() {
        T b2;
        synchronized (this.f357c) {
            b2 = super.b();
        }
        return b2;
    }
}
