package a.e;

/* compiled from: SparseArrayCompat */
public class h<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f144f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f145b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f146c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f147d;

    /* renamed from: e  reason: collision with root package name */
    private int f148e;

    public h() {
        this(10);
    }

    private void e() {
        int i = this.f148e;
        int[] iArr = this.f146c;
        Object[] objArr = this.f147d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f144f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f145b = false;
        this.f148e = i2;
    }

    public void b(int i, E e2) {
        int i2 = this.f148e;
        if (i2 == 0 || i > this.f146c[i2 - 1]) {
            if (this.f145b && this.f148e >= this.f146c.length) {
                e();
            }
            int i3 = this.f148e;
            if (i3 >= this.f146c.length) {
                int e3 = c.e(i3 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f146c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f147d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f146c = iArr;
                this.f147d = objArr;
            }
            this.f146c[i3] = i;
            this.f147d[i3] = e2;
            this.f148e = i3 + 1;
            return;
        }
        l(i, e2);
    }

    public void c() {
        int i = this.f148e;
        Object[] objArr = this.f147d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f148e = 0;
        this.f145b = false;
    }

    /* renamed from: d */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f146c = (int[]) this.f146c.clone();
            hVar.f147d = (Object[]) this.f147d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E f(int i) {
        return g(i, (Object) null);
    }

    public E g(int i, E e2) {
        int a2 = c.a(this.f146c, this.f148e, i);
        if (a2 >= 0) {
            E[] eArr = this.f147d;
            if (eArr[a2] != f144f) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public int i(int i) {
        if (this.f145b) {
            e();
        }
        return c.a(this.f146c, this.f148e, i);
    }

    public int j(E e2) {
        if (this.f145b) {
            e();
        }
        for (int i = 0; i < this.f148e; i++) {
            if (this.f147d[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public int k(int i) {
        if (this.f145b) {
            e();
        }
        return this.f146c[i];
    }

    public void l(int i, E e2) {
        int a2 = c.a(this.f146c, this.f148e, i);
        if (a2 >= 0) {
            this.f147d[a2] = e2;
            return;
        }
        int i2 = ~a2;
        if (i2 < this.f148e) {
            Object[] objArr = this.f147d;
            if (objArr[i2] == f144f) {
                this.f146c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f145b && this.f148e >= this.f146c.length) {
            e();
            i2 = ~c.a(this.f146c, this.f148e, i);
        }
        int i3 = this.f148e;
        if (i3 >= this.f146c.length) {
            int e3 = c.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f146c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f147d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f146c = iArr;
            this.f147d = objArr2;
        }
        int i4 = this.f148e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f146c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f147d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f148e - i2);
        }
        this.f146c[i2] = i;
        this.f147d[i2] = e2;
        this.f148e++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f147d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f146c
            int r1 = r3.f148e
            int r4 = a.e.c.a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f147d
            r1 = r0[r4]
            java.lang.Object r2 = f144f
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f145b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.h.n(int):void");
    }

    public int o() {
        if (this.f145b) {
            e();
        }
        return this.f148e;
    }

    public E p(int i) {
        if (this.f145b) {
            e();
        }
        return this.f147d[i];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f148e * 28);
        sb.append('{');
        for (int i = 0; i < this.f148e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(k(i));
            sb.append('=');
            Object p = p(i);
            if (p != this) {
                sb.append(p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i) {
        this.f145b = false;
        if (i == 0) {
            this.f146c = c.f110a;
            this.f147d = c.f112c;
            return;
        }
        int e2 = c.e(i);
        this.f146c = new int[e2];
        this.f147d = new Object[e2];
    }
}
