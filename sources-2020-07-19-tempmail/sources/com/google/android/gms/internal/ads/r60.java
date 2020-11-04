package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class r60 extends m50<Integer> implements zzegh, q70, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final r60 f4785e;

    /* renamed from: c  reason: collision with root package name */
    private int[] f4786c;

    /* renamed from: d  reason: collision with root package name */
    private int f4787d;

    static {
        r60 r60 = new r60(new int[0], 0);
        f4785e = r60;
        r60.k();
    }

    r60() {
        this(new int[10], 0);
    }

    public static r60 i() {
        return f4785e;
    }

    private final void j(int i) {
        if (i < 0 || i >= this.f4787d) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private final String l(int i) {
        int i2 = this.f4787d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void L(int i) {
        c();
        int i2 = this.f4787d;
        int[] iArr = this.f4786c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4786c = iArr2;
        }
        int[] iArr3 = this.f4786c;
        int i3 = this.f4787d;
        this.f4787d = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i2 = this.f4787d)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        int[] iArr = this.f4786c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f4786c, i, iArr2, i + 1, this.f4787d - i);
            this.f4786c = iArr2;
        }
        this.f4786c[i] = intValue;
        this.f4787d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        zzegd.a(collection);
        if (!(collection instanceof r60)) {
            return super.addAll(collection);
        }
        r60 r60 = (r60) collection;
        int i = r60.f4787d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4787d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f4786c;
            if (i3 > iArr.length) {
                this.f4786c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(r60.f4786c, 0, this.f4786c, this.f4787d, r60.f4787d);
            this.f4787d = i3;
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
        if (!(obj instanceof r60)) {
            return super.equals(obj);
        }
        r60 r60 = (r60) obj;
        if (this.f4787d != r60.f4787d) {
            return false;
        }
        int[] iArr = r60.f4786c;
        for (int i = 0; i < this.f4787d; i++) {
            if (this.f4786c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(h(i));
    }

    public final int h(int i) {
        j(i);
        return this.f4786c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4787d; i2++) {
            i = (i * 31) + this.f4786c[i2];
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
            if (this.f4786c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f4787d; i++) {
            if (obj.equals(Integer.valueOf(this.f4786c[i]))) {
                int[] iArr = this.f4786c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f4787d - i) - 1);
                this.f4787d--;
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
            int[] iArr = this.f4786c;
            System.arraycopy(iArr, i2, iArr, i, this.f4787d - i2);
            this.f4787d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        j(i);
        int[] iArr = this.f4786c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f4787d;
    }

    /* renamed from: x */
    public final zzegh r(int i) {
        if (i >= this.f4787d) {
            return new r60(Arrays.copyOf(this.f4786c, i), this.f4787d);
        }
        throw new IllegalArgumentException();
    }

    private r60(int[] iArr, int i) {
        this.f4786c = iArr;
        this.f4787d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        j(i);
        int[] iArr = this.f4786c;
        int i2 = iArr[i];
        int i3 = this.f4787d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f4787d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        L(((Integer) obj).intValue());
        return true;
    }
}
