package a.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f104f = new int[0];
    private static final Object[] g = new Object[0];
    private static Object[] h;
    private static int i;
    private static Object[] j;
    private static int k;

    /* renamed from: b  reason: collision with root package name */
    private int[] f105b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f106c;

    /* renamed from: d  reason: collision with root package name */
    int f107d;

    /* renamed from: e  reason: collision with root package name */
    private f<E, E> f108e;

    /* compiled from: ArraySet */
    class a extends f<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i, int i2) {
            return b.this.f106c[i];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.f107d;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e2, E e3) {
            b.this.add(e2);
        }

        /* access modifiers changed from: protected */
        public void h(int i) {
            b.this.q(i);
        }

        /* access modifiers changed from: protected */
        public E i(int i, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void c(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                if (j != null) {
                    Object[] objArr = j;
                    this.f106c = objArr;
                    j = (Object[]) objArr[0];
                    this.f105b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                if (h != null) {
                    Object[] objArr2 = h;
                    this.f106c = objArr2;
                    h = (Object[]) objArr2[0];
                    this.f105b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.f105b = new int[i2];
        this.f106c = new Object[i2];
    }

    private static void i(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (k < 10) {
                    objArr[0] = j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    j = objArr;
                    k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (i < 10) {
                    objArr[0] = h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    h = objArr;
                    i++;
                }
            }
        }
    }

    private f<E, E> j() {
        if (this.f108e == null) {
            this.f108e = new a();
        }
        return this.f108e;
    }

    private int l(Object obj, int i2) {
        int i3 = this.f107d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f105b, i3, i2);
        if (a2 < 0 || obj.equals(this.f106c[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f105b[i4] == i2) {
            if (obj.equals(this.f106c[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f105b[i5] == i2) {
            if (obj.equals(this.f106c[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    private int m() {
        int i2 = this.f107d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f105b, i2, 0);
        if (a2 < 0 || this.f106c[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f105b[i3] == 0) {
            if (this.f106c[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f105b[i4] == 0) {
            if (this.f106c[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = m();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = l(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f107d;
        if (i5 >= this.f105b.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f105b;
            Object[] objArr = this.f106c;
            c(i6);
            int[] iArr2 = this.f105b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f106c, 0, objArr.length);
            }
            i(iArr, objArr, this.f107d);
        }
        int i7 = this.f107d;
        if (i4 < i7) {
            int[] iArr3 = this.f105b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f106c;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f107d - i4);
        }
        this.f105b[i4] = i2;
        this.f106c[i4] = e2;
        this.f107d++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        h(this.f107d + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i2 = this.f107d;
        if (i2 != 0) {
            i(this.f105b, this.f106c, i2);
            this.f105b = f104f;
            this.f106c = g;
            this.f107d = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f107d) {
                try {
                    if (!set.contains(s(i2))) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void h(int i2) {
        int[] iArr = this.f105b;
        if (iArr.length < i2) {
            Object[] objArr = this.f106c;
            c(i2);
            int i3 = this.f107d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f105b, 0, i3);
                System.arraycopy(objArr, 0, this.f106c, 0, this.f107d);
            }
            i(iArr, objArr, this.f107d);
        }
    }

    public int hashCode() {
        int[] iArr = this.f105b;
        int i2 = this.f107d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? m() : l(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f107d <= 0;
    }

    public Iterator<E> iterator() {
        return j().m().iterator();
    }

    public E q(int i2) {
        E[] eArr = this.f106c;
        E e2 = eArr[i2];
        int i3 = this.f107d;
        if (i3 <= 1) {
            i(this.f105b, eArr, i3);
            this.f105b = f104f;
            this.f106c = g;
            this.f107d = 0;
        } else {
            int[] iArr = this.f105b;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = this.f107d - 1;
                this.f107d = i5;
                if (i2 < i5) {
                    int[] iArr2 = this.f105b;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr = this.f106c;
                    System.arraycopy(objArr, i6, objArr, i2, this.f107d - i2);
                }
                this.f106c[this.f107d] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f105b;
                Object[] objArr2 = this.f106c;
                c(i4);
                this.f107d--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.f105b, 0, i2);
                    System.arraycopy(objArr2, 0, this.f106c, 0, i2);
                }
                int i7 = this.f107d;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.f105b, i2, i7 - i2);
                    System.arraycopy(objArr2, i8, this.f106c, i2, this.f107d - i2);
                }
            }
        }
        return e2;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        q(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f107d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f106c[i2])) {
                q(i2);
                z = true;
            }
        }
        return z;
    }

    public E s(int i2) {
        return this.f106c[i2];
    }

    public int size() {
        return this.f107d;
    }

    public Object[] toArray() {
        int i2 = this.f107d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f106c, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f107d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f107d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object s = s(i2);
            if (s != this) {
                sb.append(s);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f105b = f104f;
            this.f106c = g;
        } else {
            c(i2);
        }
        this.f107d = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f107d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f107d);
        }
        System.arraycopy(this.f106c, 0, tArr, 0, this.f107d);
        int length = tArr.length;
        int i2 = this.f107d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
