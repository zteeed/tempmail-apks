package a.e;

/* compiled from: LongSparseArray */
public class d<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f114f = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f115b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f116c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f117d;

    /* renamed from: e  reason: collision with root package name */
    private int f118e;

    public d() {
        this(10);
    }

    private void g() {
        int i = this.f118e;
        long[] jArr = this.f116c;
        Object[] objArr = this.f117d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f114f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f115b = false;
        this.f118e = i2;
    }

    public void b(long j, E e2) {
        int i = this.f118e;
        if (i == 0 || j > this.f116c[i - 1]) {
            if (this.f115b && this.f118e >= this.f116c.length) {
                g();
            }
            int i2 = this.f118e;
            if (i2 >= this.f116c.length) {
                int f2 = c.f(i2 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.f116c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f117d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f116c = jArr;
                this.f117d = objArr;
            }
            this.f116c[i2] = j;
            this.f117d[i2] = e2;
            this.f118e = i2 + 1;
            return;
        }
        n(j, e2);
    }

    public void c() {
        int i = this.f118e;
        Object[] objArr = this.f117d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f118e = 0;
        this.f115b = false;
    }

    /* renamed from: d */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f116c = (long[]) this.f116c.clone();
            dVar.f117d = (Object[]) this.f117d.clone();
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
        int b2 = c.b(this.f116c, this.f118e, j);
        if (b2 >= 0) {
            E[] eArr = this.f117d;
            if (eArr[b2] != f114f) {
                return eArr[b2];
            }
        }
        return e2;
    }

    public int k(long j) {
        if (this.f115b) {
            g();
        }
        return c.b(this.f116c, this.f118e, j);
    }

    public long l(int i) {
        if (this.f115b) {
            g();
        }
        return this.f116c[i];
    }

    public void n(long j, E e2) {
        int b2 = c.b(this.f116c, this.f118e, j);
        if (b2 >= 0) {
            this.f117d[b2] = e2;
            return;
        }
        int i = ~b2;
        if (i < this.f118e) {
            Object[] objArr = this.f117d;
            if (objArr[i] == f114f) {
                this.f116c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f115b && this.f118e >= this.f116c.length) {
            g();
            i = ~c.b(this.f116c, this.f118e, j);
        }
        int i2 = this.f118e;
        if (i2 >= this.f116c.length) {
            int f2 = c.f(i2 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f116c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f117d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f116c = jArr;
            this.f117d = objArr2;
        }
        int i3 = this.f118e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f116c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f117d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f118e - i);
        }
        this.f116c[i] = j;
        this.f117d[i] = e2;
        this.f118e++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f117d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f116c
            int r1 = r2.f118e
            int r3 = a.e.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f117d
            r0 = r4[r3]
            java.lang.Object r1 = f114f
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f115b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.d.o(long):void");
    }

    public void p(int i) {
        Object[] objArr = this.f117d;
        Object obj = objArr[i];
        Object obj2 = f114f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f115b = true;
        }
    }

    public int r() {
        if (this.f115b) {
            g();
        }
        return this.f118e;
    }

    public E s(int i) {
        if (this.f115b) {
            g();
        }
        return this.f117d[i];
    }

    public String toString() {
        if (r() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f118e * 28);
        sb.append('{');
        for (int i = 0; i < this.f118e; i++) {
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
        this.f115b = false;
        if (i == 0) {
            this.f116c = c.f112b;
            this.f117d = c.f113c;
            return;
        }
        int f2 = c.f(i);
        this.f116c = new long[f2];
        this.f117d = new Object[f2];
    }
}
