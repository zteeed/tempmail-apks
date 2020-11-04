package a.h.j;

/* compiled from: Pools */
public class f<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f355a;

    /* renamed from: b  reason: collision with root package name */
    private int f356b;

    public f(int i) {
        if (i > 0) {
            this.f355a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t) {
        for (int i = 0; i < this.f356b; i++) {
            if (this.f355a[i] == t) {
                return true;
            }
        }
        return false;
    }

    public boolean a(T t) {
        if (!c(t)) {
            int i = this.f356b;
            Object[] objArr = this.f355a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f356b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public T b() {
        int i = this.f356b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f355a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f356b = i - 1;
        return t;
    }
}
