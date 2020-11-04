package a.e;

/* compiled from: SparseArrayCompat */
public class h<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f145f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f146b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f147c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f148d;

    /* renamed from: e  reason: collision with root package name */
    private int f149e;

    public h() {
        this(10);
    }

    private void e() {
        int i = this.f149e;
        int[] iArr = this.f147c;
        Object[] objArr = this.f148d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f145f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f146b = false;
        this.f149e = i2;
    }

    public void b(int i, E e2) {
        int i2 = this.f149e;
        if (i2 == 0 || i > this.f147c[i2 - 1]) {
            if (this.f146b && this.f149e >= this.f147c.length) {
                e();
            }
            int i3 = this.f149e;
            if (i3 >= this.f147c.length) {
                int e3 = c.e(i3 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f147c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f148d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f147c = iArr;
                this.f148d = objArr;
            }
            this.f147c[i3] = i;
            this.f148d[i3] = e2;
            this.f149e = i3 + 1;
            return;
        }
        l(i, e2);
    }

    public void c() {
        int i = this.f149e;
        Object[] objArr = this.f148d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f149e = 0;
        this.f146b = false;
    }

    /* renamed from: d */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f147c = (int[]) this.f147c.clone();
            hVar.f148d = (Object[]) this.f148d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E f(int i) {
        return g(i, (Object) null);
    }

    public E g(int i, E e2) {
        int a2 = c.a(this.f147c, this.f149e, i);
        if (a2 >= 0) {
            E[] eArr = this.f148d;
            if (eArr[a2] != f145f) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public int i(int i) {
        if (this.f146b) {
            e();
        }
        return c.a(this.f147c, this.f149e, i);
    }

    public int j(E e2) {
        if (this.f146b) {
            e();
        }
        for (int i = 0; i < this.f149e; i++) {
            if (this.f148d[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public int k(int i) {
        if (this.f146b) {
            e();
        }
        return this.f147c[i];
    }

    public void l(int i, E e2) {
        int a2 = c.a(this.f147c, this.f149e, i);
        if (a2 >= 0) {
            this.f148d[a2] = e2;
            return;
        }
        int i2 = ~a2;
        if (i2 < this.f149e) {
            Object[] objArr = this.f148d;
            if (objArr[i2] == f145f) {
                this.f147c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f146b && this.f149e >= this.f147c.length) {
            e();
            i2 = ~c.a(this.f147c, this.f149e, i);
        }
        int i3 = this.f149e;
        if (i3 >= this.f147c.length) {
            int e3 = c.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f147c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f148d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f147c = iArr;
            this.f148d = objArr2;
        }
        int i4 = this.f149e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f147c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f148d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f149e - i2);
        }
        this.f147c[i2] = i;
        this.f148d[i2] = e2;
        this.f149e++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f148d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f147c
            int r1 = r3.f149e
            int r4 = a.e.c.a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f148d
            r1 = r0[r4]
            java.lang.Object r2 = f145f
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f146b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.h.n(int):void");
    }

    public int o() {
        if (this.f146b) {
            e();
        }
        return this.f149e;
    }

    public E p(int i) {
        if (this.f146b) {
            e();
        }
        return this.f148d[i];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f149e * 28);
        sb.append('{');
        for (int i = 0; i < this.f149e; i++) {
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
        this.f146b = false;
        if (i == 0) {
            this.f147c = c.f111a;
            this.f148d = c.f113c;
            return;
        }
        int e2 = c.e(i);
        this.f147c = new int[e2];
        this.f148d = new Object[e2];
    }
}
