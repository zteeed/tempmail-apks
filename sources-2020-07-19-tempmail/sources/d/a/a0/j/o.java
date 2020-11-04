package d.a.a0.j;

/* compiled from: OpenHashSet */
public final class o<T> {

    /* renamed from: a  reason: collision with root package name */
    final float f13887a;

    /* renamed from: b  reason: collision with root package name */
    int f13888b;

    /* renamed from: c  reason: collision with root package name */
    int f13889c;

    /* renamed from: d  reason: collision with root package name */
    int f13890d;

    /* renamed from: e  reason: collision with root package name */
    T[] f13891e;

    public o() {
        this(16, 0.75f);
    }

    static int c(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public boolean a(T t) {
        T t2;
        T[] tArr = this.f13891e;
        int i = this.f13888b;
        int c2 = c(t.hashCode()) & i;
        T t3 = tArr[c2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                c2 = (c2 + 1) & i;
                t2 = tArr[c2];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[c2] = t;
        int i2 = this.f13889c + 1;
        this.f13889c = i2;
        if (i2 >= this.f13890d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f13891e;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        T[] tArr = this.f13891e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f13889c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int c2 = c(tArr[length].hashCode()) & i2;
                if (tArr2[c2] != null) {
                    do {
                        c2 = (c2 + 1) & i2;
                    } while (tArr2[c2] != null);
                }
                tArr2[c2] = tArr[length];
                i3 = i4;
            } else {
                this.f13888b = i2;
                this.f13890d = (int) (((float) i) * this.f13887a);
                this.f13891e = tArr2;
                return;
            }
        }
    }

    public boolean e(T t) {
        T t2;
        T[] tArr = this.f13891e;
        int i = this.f13888b;
        int c2 = c(t.hashCode()) & i;
        T t3 = tArr[c2];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return f(c2, tArr, i);
        }
        do {
            c2 = (c2 + 1) & i;
            t2 = tArr[c2];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return f(c2, tArr, i);
    }

    /* access modifiers changed from: package-private */
    public boolean f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f13889c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int c2 = c(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= c2 || c2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= c2 && c2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public int g() {
        return this.f13889c;
    }

    public o(int i, float f2) {
        this.f13887a = f2;
        int a2 = p.a(i);
        this.f13888b = a2 - 1;
        this.f13890d = (int) (f2 * ((float) a2));
        this.f13891e = new Object[a2];
    }
}
