package a.f.a;

/* compiled from: Pools */
class h<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f176a;

    /* renamed from: b  reason: collision with root package name */
    private int f177b;

    h(int i) {
        if (i > 0) {
            this.f176a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(T t) {
        int i = this.f177b;
        Object[] objArr = this.f176a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f177b = i + 1;
        return true;
    }

    public T b() {
        int i = this.f177b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f176a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f177b = i - 1;
        return t;
    }

    public void c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f177b;
            Object[] objArr = this.f176a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f177b = i3 + 1;
            }
        }
    }
}
