package a.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap */
public class g<K, V> {

    /* renamed from: e  reason: collision with root package name */
    static Object[] f139e;

    /* renamed from: f  reason: collision with root package name */
    static int f140f;
    static Object[] g;
    static int h;

    /* renamed from: b  reason: collision with root package name */
    int[] f141b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f142c;

    /* renamed from: d  reason: collision with root package name */
    int f143d;

    public g() {
        this.f141b = c.f110a;
        this.f142c = c.f112c;
        this.f143d = 0;
    }

    private void a(int i) {
        Class<g> cls = g.class;
        if (i == 8) {
            synchronized (cls) {
                if (g != null) {
                    Object[] objArr = g;
                    this.f142c = objArr;
                    g = (Object[]) objArr[0];
                    this.f141b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f139e != null) {
                    Object[] objArr2 = f139e;
                    this.f142c = objArr2;
                    f139e = (Object[]) objArr2[0];
                    this.f141b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f140f--;
                    return;
                }
            }
        }
        this.f141b = new int[i];
        this.f142c = new Object[(i << 1)];
    }

    private static int b(int[] iArr, int i, int i2) {
        try {
            return c.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        Class<g> cls = g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f140f < 10) {
                    objArr[0] = f139e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f139e = objArr;
                    f140f++;
                }
            }
        }
    }

    public void c(int i) {
        int i2 = this.f143d;
        int[] iArr = this.f141b;
        if (iArr.length < i) {
            Object[] objArr = this.f142c;
            a(i);
            if (this.f143d > 0) {
                System.arraycopy(iArr, 0, this.f141b, 0, i2);
                System.arraycopy(objArr, 0, this.f142c, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.f143d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f143d;
        if (i > 0) {
            int[] iArr = this.f141b;
            Object[] objArr = this.f142c;
            this.f141b = c.f110a;
            this.f142c = c.f112c;
            this.f143d = 0;
            d(iArr, objArr, i);
        }
        if (this.f143d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj, int i) {
        int i2 = this.f143d;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f141b, i2, i);
        if (b2 < 0 || obj.equals(this.f142c[b2 << 1])) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f141b[i3] == i) {
            if (obj.equals(this.f142c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b2 - 1;
        while (i4 >= 0 && this.f141b[i4] == i) {
            if (obj.equals(this.f142c[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f143d) {
                try {
                    Object i2 = i(i);
                    Object m = m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f143d) {
                try {
                    Object i4 = i(i3);
                    Object m2 = m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i = this.f143d;
        if (i == 0) {
            return -1;
        }
        int b2 = b(this.f141b, i, 0);
        if (b2 < 0 || this.f142c[b2 << 1] == null) {
            return b2;
        }
        int i2 = b2 + 1;
        while (i2 < i && this.f141b[i2] == 0) {
            if (this.f142c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b2 - 1;
        while (i3 >= 0 && this.f141b[i3] == 0) {
            if (this.f142c[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? this.f142c[(f2 << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    public int h(Object obj) {
        int i = this.f143d * 2;
        Object[] objArr = this.f142c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f141b;
        Object[] objArr = this.f142c;
        int i = this.f143d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public K i(int i) {
        return this.f142c[i << 1];
    }

    public boolean isEmpty() {
        return this.f143d <= 0;
    }

    public void j(g<? extends K, ? extends V> gVar) {
        int i = gVar.f143d;
        c(this.f143d + i);
        if (this.f143d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.i(i2), gVar.m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f141b, 0, this.f141b, 0, i);
            System.arraycopy(gVar.f142c, 0, this.f142c, 0, i << 1);
            this.f143d = i;
        }
    }

    public V k(int i) {
        V[] vArr = this.f142c;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f143d;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.f141b, vArr, i3);
            this.f141b = c.f110a;
            this.f142c = c.f112c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f141b;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f141b;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr = this.f142c;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f142c;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f141b;
                Object[] objArr3 = this.f142c;
                a(i6);
                if (i3 == this.f143d) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f141b, 0, i);
                        System.arraycopy(objArr3, 0, this.f142c, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.f141b, i, i11);
                        System.arraycopy(objArr3, i10 << 1, this.f142c, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f143d) {
            this.f143d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f142c;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public V m(int i) {
        return this.f142c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f143d;
        if (k == null) {
            i2 = g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f142c;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f141b.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f141b;
            Object[] objArr = this.f142c;
            a(i6);
            if (i3 == this.f143d) {
                int[] iArr2 = this.f141b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f142c, 0, objArr.length);
                }
                d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f141b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f142c;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f143d - i5) << 1);
        }
        int i8 = this.f143d;
        if (i3 == i8) {
            int[] iArr4 = this.f141b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f142c;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f143d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return k(f2);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f2 = f(k);
        if (f2 >= 0) {
            return l(f2, v);
        }
        return null;
    }

    public int size() {
        return this.f143d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f143d * 28);
        sb.append('{');
        for (int i = 0; i < this.f143d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        Object m = m(f2);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        k(f2);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int f2 = f(k);
        if (f2 < 0) {
            return false;
        }
        V m = m(f2);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        l(f2, v2);
        return true;
    }

    public g(int i) {
        if (i == 0) {
            this.f141b = c.f110a;
            this.f142c = c.f112c;
        } else {
            a(i);
        }
        this.f143d = 0;
    }

    public g(g<K, V> gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }
}
