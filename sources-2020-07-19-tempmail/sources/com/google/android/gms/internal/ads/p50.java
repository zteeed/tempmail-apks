package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class p50 extends m50<Boolean> implements zzegm<Boolean>, q70, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f4610c;

    /* renamed from: d  reason: collision with root package name */
    private int f4611d;

    static {
        new p50(new boolean[0], 0).k();
    }

    p50() {
        this(new boolean[10], 0);
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f4611d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f4611d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i < 0 || i > (i2 = this.f4611d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        boolean[] zArr = this.f4610c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f4610c, i, zArr2, i + 1, this.f4611d - i);
            this.f4610c = zArr2;
        }
        this.f4610c[i] = booleanValue;
        this.f4611d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        zzegd.a(collection);
        if (!(collection instanceof p50)) {
            return super.addAll(collection);
        }
        p50 p50 = (p50) collection;
        int i = p50.f4611d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4611d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f4610c;
            if (i3 > zArr.length) {
                this.f4610c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(p50.f4610c, 0, this.f4610c, this.f4611d, p50.f4611d);
            this.f4611d = i3;
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
        if (!(obj instanceof p50)) {
            return super.equals(obj);
        }
        p50 p50 = (p50) obj;
        if (this.f4611d != p50.f4611d) {
            return false;
        }
        boolean[] zArr = p50.f4610c;
        for (int i = 0; i < this.f4611d; i++) {
            if (this.f4610c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        i(i);
        return Boolean.valueOf(this.f4610c[i]);
    }

    public final void h(boolean z) {
        c();
        int i = this.f4611d;
        boolean[] zArr = this.f4610c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f4610c = zArr2;
        }
        boolean[] zArr3 = this.f4610c;
        int i2 = this.f4611d;
        this.f4611d = i2 + 1;
        zArr3[i2] = z;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4611d; i2++) {
            i = (i * 31) + zzegd.e(this.f4610c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4610c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ zzegm r(int i) {
        if (i >= this.f4611d) {
            return new p50(Arrays.copyOf(this.f4610c, i), this.f4611d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f4611d; i++) {
            if (obj.equals(Boolean.valueOf(this.f4610c[i]))) {
                boolean[] zArr = this.f4610c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f4611d - i) - 1);
                this.f4611d--;
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
            boolean[] zArr = this.f4610c;
            System.arraycopy(zArr, i2, zArr, i, this.f4611d - i2);
            this.f4611d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        i(i);
        boolean[] zArr = this.f4610c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f4611d;
    }

    private p50(boolean[] zArr, int i) {
        this.f4610c = zArr;
        this.f4611d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        i(i);
        boolean[] zArr = this.f4610c;
        boolean z = zArr[i];
        int i2 = this.f4611d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f4611d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }
}
