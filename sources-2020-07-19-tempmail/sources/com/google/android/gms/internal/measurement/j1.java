package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class j1 extends g1<Boolean> implements zzfx<Boolean>, j3, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f9427c;

    /* renamed from: d  reason: collision with root package name */
    private int f9428d;

    static {
        new j1(new boolean[0], 0).b();
    }

    j1() {
        this(new boolean[10], 0);
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f9428d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f9428d;
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
        if (i < 0 || i > (i2 = this.f9428d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        boolean[] zArr = this.f9427c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f9427c, i, zArr2, i + 1, this.f9428d - i);
            this.f9427c = zArr2;
        }
        this.f9427c[i] = booleanValue;
        this.f9428d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        zzfr.d(collection);
        if (!(collection instanceof j1)) {
            return super.addAll(collection);
        }
        j1 j1Var = (j1) collection;
        int i = j1Var.f9428d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9428d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f9427c;
            if (i3 > zArr.length) {
                this.f9427c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(j1Var.f9427c, 0, this.f9427c, this.f9428d, j1Var.f9428d);
            this.f9428d = i3;
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
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        if (this.f9428d != j1Var.f9428d) {
            return false;
        }
        boolean[] zArr = j1Var.f9427c;
        for (int i = 0; i < this.f9428d; i++) {
            if (this.f9427c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzfx f(int i) {
        if (i >= this.f9428d) {
            return new j1(Arrays.copyOf(this.f9427c, i), this.f9428d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        i(i);
        return Boolean.valueOf(this.f9427c[i]);
    }

    public final void h(boolean z) {
        c();
        int i = this.f9428d;
        boolean[] zArr = this.f9427c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f9427c = zArr2;
        }
        boolean[] zArr3 = this.f9427c;
        int i2 = this.f9428d;
        this.f9428d = i2 + 1;
        zArr3[i2] = z;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9428d; i2++) {
            i = (i * 31) + zzfr.c(this.f9427c[i2]);
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
            if (this.f9427c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f9428d; i++) {
            if (obj.equals(Boolean.valueOf(this.f9427c[i]))) {
                boolean[] zArr = this.f9427c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f9428d - i) - 1);
                this.f9428d--;
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
            boolean[] zArr = this.f9427c;
            System.arraycopy(zArr, i2, zArr, i, this.f9428d - i2);
            this.f9428d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        i(i);
        boolean[] zArr = this.f9427c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f9428d;
    }

    private j1(boolean[] zArr, int i) {
        this.f9427c = zArr;
        this.f9428d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        i(i);
        boolean[] zArr = this.f9427c;
        boolean z = zArr[i];
        int i2 = this.f9428d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f9428d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }
}
