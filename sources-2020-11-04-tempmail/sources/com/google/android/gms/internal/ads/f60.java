package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class f60 extends m50<Double> implements zzegm<Double>, q70, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private double[] f3948c;

    /* renamed from: d  reason: collision with root package name */
    private int f3949d;

    static {
        new f60(new double[0], 0).k();
    }

    f60() {
        this(new double[10], 0);
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f3949d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f3949d;
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
        if (i < 0 || i > (i2 = this.f3949d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        double[] dArr = this.f3948c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f3948c, i, dArr2, i + 1, this.f3949d - i);
            this.f3948c = dArr2;
        }
        this.f3948c[i] = doubleValue;
        this.f3949d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        zzegd.a(collection);
        if (!(collection instanceof f60)) {
            return super.addAll(collection);
        }
        f60 f60 = (f60) collection;
        int i = f60.f3949d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3949d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f3948c;
            if (i3 > dArr.length) {
                this.f3948c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(f60.f3948c, 0, this.f3948c, this.f3949d, f60.f3949d);
            this.f3949d = i3;
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
        if (!(obj instanceof f60)) {
            return super.equals(obj);
        }
        f60 f60 = (f60) obj;
        if (this.f3949d != f60.f3949d) {
            return false;
        }
        double[] dArr = f60.f3948c;
        for (int i = 0; i < this.f3949d; i++) {
            if (Double.doubleToLongBits(this.f3948c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        i(i);
        return Double.valueOf(this.f3948c[i]);
    }

    public final void h(double d2) {
        c();
        int i = this.f3949d;
        double[] dArr = this.f3948c;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f3948c = dArr2;
        }
        double[] dArr3 = this.f3948c;
        int i2 = this.f3949d;
        this.f3949d = i2 + 1;
        dArr3[i2] = d2;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3949d; i2++) {
            i = (i * 31) + zzegd.g(Double.doubleToLongBits(this.f3948c[i2]));
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
            if (this.f3948c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ zzegm r(int i) {
        if (i >= this.f3949d) {
            return new f60(Arrays.copyOf(this.f3948c, i), this.f3949d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f3949d; i++) {
            if (obj.equals(Double.valueOf(this.f3948c[i]))) {
                double[] dArr = this.f3948c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f3949d - i) - 1);
                this.f3949d--;
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
            double[] dArr = this.f3948c;
            System.arraycopy(dArr, i2, dArr, i, this.f3949d - i2);
            this.f3949d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        i(i);
        double[] dArr = this.f3948c;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f3949d;
    }

    private f60(double[] dArr, int i) {
        this.f3948c = dArr;
        this.f3949d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        i(i);
        double[] dArr = this.f3948c;
        double d2 = dArr[i];
        int i2 = this.f3949d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f3949d--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
