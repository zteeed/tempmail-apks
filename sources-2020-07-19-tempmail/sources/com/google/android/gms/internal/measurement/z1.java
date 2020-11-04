package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class z1 extends g1<Double> implements zzfx<Double>, j3, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private double[] f9535c;

    /* renamed from: d  reason: collision with root package name */
    private int f9536d;

    static {
        new z1(new double[0], 0).b();
    }

    z1() {
        this(new double[10], 0);
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f9536d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f9536d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i < 0 || i > (i2 = this.f9536d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        double[] dArr = this.f9535c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f9535c, i, dArr2, i + 1, this.f9536d - i);
            this.f9535c = dArr2;
        }
        this.f9535c[i] = doubleValue;
        this.f9536d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        zzfr.d(collection);
        if (!(collection instanceof z1)) {
            return super.addAll(collection);
        }
        z1 z1Var = (z1) collection;
        int i = z1Var.f9536d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9536d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f9535c;
            if (i3 > dArr.length) {
                this.f9535c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(z1Var.f9535c, 0, this.f9535c, this.f9536d, z1Var.f9536d);
            this.f9536d = i3;
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
        if (!(obj instanceof z1)) {
            return super.equals(obj);
        }
        z1 z1Var = (z1) obj;
        if (this.f9536d != z1Var.f9536d) {
            return false;
        }
        double[] dArr = z1Var.f9535c;
        for (int i = 0; i < this.f9536d; i++) {
            if (Double.doubleToLongBits(this.f9535c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzfx f(int i) {
        if (i >= this.f9536d) {
            return new z1(Arrays.copyOf(this.f9535c, i), this.f9536d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        i(i);
        return Double.valueOf(this.f9535c[i]);
    }

    public final void h(double d2) {
        c();
        int i = this.f9536d;
        double[] dArr = this.f9535c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f9535c = dArr2;
        }
        double[] dArr3 = this.f9535c;
        int i2 = this.f9536d;
        this.f9536d = i2 + 1;
        dArr3[i2] = d2;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9536d; i2++) {
            i = (i * 31) + zzfr.b(Double.doubleToLongBits(this.f9535c[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9535c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f9536d; i++) {
            if (obj.equals(Double.valueOf(this.f9535c[i]))) {
                double[] dArr = this.f9535c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f9536d - i) - 1);
                this.f9536d--;
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
            double[] dArr = this.f9535c;
            System.arraycopy(dArr, i2, dArr, i, this.f9536d - i2);
            this.f9536d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        i(i);
        double[] dArr = this.f9535c;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f9536d;
    }

    private z1(double[] dArr, int i) {
        this.f9535c = dArr;
        this.f9536d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        i(i);
        double[] dArr = this.f9535c;
        double d2 = dArr[i];
        int i2 = this.f9536d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f9536d--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
