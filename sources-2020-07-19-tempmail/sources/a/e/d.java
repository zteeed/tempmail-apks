package a.e;

/* compiled from: LongSparseArray */
public class d<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f113f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f114b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f115c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f116d;

    /* renamed from: e  reason: collision with root package name */
    private int f117e;

    public d() {
        this(10);
    }

    private void g() {
        int i = this.f117e;
        long[] jArr = this.f115c;
        Object[] objArr = this.f116d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f113f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f114b = false;
        this.f117e = i2;
    }

    public void b(long j, E e2) {
        int i = this.f117e;
        if (i == 0 || j > this.f115c[i - 1]) {
            if (this.f114b && this.f117e >= this.f115c.length) {
                g();
            }
            int i2 = this.f117e;
            if (i2 >= this.f115c.length) {
                int f2 = c.f(i2 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.f115c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f116d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f115c = jArr;
                this.f116d = objArr;
            }
            this.f115c[i2] = j;
            this.f116d[i2] = e2;
            this.f117e = i2 + 1;
            return;
        }
        n(j, e2);
    }

    public void c() {
        int i = this.f117e;
        Object[] objArr = this.f116d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f117e = 0;
        this.f114b = false;
    }

    /* renamed from: d */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f115c = (long[]) this.f115c.clone();
            dVar.f116d = (Object[]) this.f116d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean e(long j) {
        return k(j) >= 0;
    }

    @Deprecated
    public void f(long j) {
        o(j);
    }

    public E i(long j) {
        return j(j, (Object) null);
    }

    public E j(long j, E e2) {
        int b2 = c.b(this.f115c, this.f117e, j);
        if (b2 >= 0) {
            E[] eArr = this.f116d;
            if (eArr[b2] != f113f) {
                return eArr[b2];
            }
        }
        return e2;
    }

    public int k(long j) {
        if (this.f114b) {
            g();
        }
        return c.b(this.f115c, this.f117e, j);
    }

    public long l(int i) {
        if (this.f114b) {
            g();
        }
        return this.f115c[i];
    }

    public void n(long j, E e2) {
        int b2 = c.b(this.f115c, this.f117e, j);
        if (b2 >= 0) {
            this.f116d[b2] = e2;
            return;
        }
        int i = ~b2;
        if (i < this.f117e) {
            Object[] objArr = this.f116d;
            if (objArr[i] == f113f) {
                this.f115c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f114b && this.f117e >= this.f115c.length) {
            g();
            i = ~c.b(this.f115c, this.f117e, j);
        }
        int i2 = this.f117e;
        if (i2 >= this.f115c.length) {
            int f2 = c.f(i2 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f115c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f116d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f115c = jArr;
            this.f116d = objArr2;
        }
        int i3 = this.f117e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f115c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f116d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f117e - i);
        }
        this.f115c[i] = j;
        this.f116d[i] = e2;
        this.f117e++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f116d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f115c
            int r1 = r2.f117e
            int r3 = a.e.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f116d
            r0 = r4[r3]
            java.lang.Object r1 = f113f
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f114b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.d.o(long):void");
    }

    public void p(int i) {
        Object[] objArr = this.f116d;
        Object obj = objArr[i];
        Object obj2 = f113f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f114b = true;
        }
    }

    public int r() {
        if (this.f114b) {
            g();
        }
        return this.f117e;
    }

    public E s(int i) {
        if (this.f114b) {
            g();
        }
        return this.f116d[i];
    }

    public String toString() {
        if (r() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f117e * 28);
        sb.append('{');
        for (int i = 0; i < this.f117e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(l(i));
            sb.append('=');
            Object s = s(i);
            if (s != this) {
                sb.append(s);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i) {
        this.f114b = false;
        if (i == 0) {
            this.f115c = c.f111b;
            this.f116d = c.f112c;
            return;
        }
        int f2 = c.f(i);
        this.f115c = new long[f2];
        this.f116d = new Object[f2];
    }
}
