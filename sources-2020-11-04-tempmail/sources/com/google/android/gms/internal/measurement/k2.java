package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class k2 extends g1<Integer> implements zzfv, j3, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final k2 f9619e;

    /* renamed from: c  reason: collision with root package name */
    private int[] f9620c;

    /* renamed from: d  reason: collision with root package name */
    private int f9621d;

    static {
        k2 k2Var = new k2(new int[0], 0);
        f9619e = k2Var;
        k2Var.b();
    }

    k2() {
        this(new int[10], 0);
    }

    public static k2 i() {
        return f9619e;
    }

    private final void l(int i) {
        if (i < 0 || i >= this.f9621d) {
            throw new IndexOutOfBoundsException(m(i));
        }
    }

    private final String m(int i) {
        int i2 = this.f9621d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i2 = this.f9621d)) {
            throw new IndexOutOfBoundsException(m(i));
        }
        int[] iArr = this.f9620c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f9620c, i, iArr2, i + 1, this.f9621d - i);
            this.f9620c = iArr2;
        }
        this.f9620c[i] = intValue;
        this.f9621d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        zzfr.d(collection);
        if (!(collection instanceof k2)) {
            return super.addAll(collection);
        }
        k2 k2Var = (k2) collection;
        int i = k2Var.f9621d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9621d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f9620c;
            if (i3 > iArr.length) {
                this.f9620c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(k2Var.f9620c, 0, this.f9620c, this.f9621d, k2Var.f9621d);
            this.f9621d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return super.equals(obj);
        }
        k2 k2Var = (k2) obj;
        if (this.f9621d != k2Var.f9621d) {
            return false;
        }
        int[] iArr = k2Var.f9620c;
        for (int i = 0; i < this.f9621d; i++) {
            if (this.f9620c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final zzfv f(int i) {
        if (i >= this.f9621d) {
            return new k2(Arrays.copyOf(this.f9620c, i), this.f9621d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(h(i));
    }

    public final int h(int i) {
        l(i);
        return this.f9620c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9621d; i2++) {
            i = (i * 31) + this.f9620c[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9620c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    public final void j(int i) {
        c();
        int i2 = this.f9621d;
        int[] iArr = this.f9620c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f9620c = iArr2;
        }
        int[] iArr3 = this.f9620c;
        int i3 = this.f9621d;
        this.f9621d = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f9621d; i++) {
            if (obj.equals(Integer.valueOf(this.f9620c[i]))) {
                int[] iArr = this.f9620c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f9621d - i) - 1);
                this.f9621d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            int[] iArr = this.f9620c;
            System.arraycopy(iArr, i2, iArr, i, this.f9621d - i2);
            this.f9621d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        l(i);
        int[] iArr = this.f9620c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f9621d;
    }

    private k2(int[] iArr, int i) {
        this.f9620c = iArr;
        this.f9621d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        l(i);
        int[] iArr = this.f9620c;
        int i2 = iArr[i];
        int i3 = this.f9621d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f9621d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
