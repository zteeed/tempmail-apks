package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class g2 extends g1<Float> implements zzfx<Float>, j3, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private float[] f9586c;

    /* renamed from: d  reason: collision with root package name */
    private int f9587d;

    static {
        new g2(new float[0], 0).b();
    }

    g2() {
        this(new float[10], 0);
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f9587d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f9587d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i < 0 || i > (i2 = this.f9587d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        float[] fArr = this.f9586c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f9586c, i, fArr2, i + 1, this.f9587d - i);
            this.f9586c = fArr2;
        }
        this.f9586c[i] = floatValue;
        this.f9587d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        zzfr.d(collection);
        if (!(collection instanceof g2)) {
            return super.addAll(collection);
        }
        g2 g2Var = (g2) collection;
        int i = g2Var.f9587d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9587d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f9586c;
            if (i3 > fArr.length) {
                this.f9586c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(g2Var.f9586c, 0, this.f9586c, this.f9587d, g2Var.f9587d);
            this.f9587d = i3;
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
        if (!(obj instanceof g2)) {
            return super.equals(obj);
        }
        g2 g2Var = (g2) obj;
        if (this.f9587d != g2Var.f9587d) {
            return false;
        }
        float[] fArr = g2Var.f9586c;
        for (int i = 0; i < this.f9587d; i++) {
            if (Float.floatToIntBits(this.f9586c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzfx f(int i) {
        if (i >= this.f9587d) {
            return new g2(Arrays.copyOf(this.f9586c, i), this.f9587d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        i(i);
        return Float.valueOf(this.f9586c[i]);
    }

    public final void h(float f2) {
        c();
        int i = this.f9587d;
        float[] fArr = this.f9586c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f9586c = fArr2;
        }
        float[] fArr3 = this.f9586c;
        int i2 = this.f9587d;
        this.f9587d = i2 + 1;
        fArr3[i2] = f2;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9587d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f9586c[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f9586c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f9587d; i++) {
            if (obj.equals(Float.valueOf(this.f9586c[i]))) {
                float[] fArr = this.f9586c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f9587d - i) - 1);
                this.f9587d--;
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
            float[] fArr = this.f9586c;
            System.arraycopy(fArr, i2, fArr, i, this.f9587d - i2);
            this.f9587d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        i(i);
        float[] fArr = this.f9586c;
        float f2 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f9587d;
    }

    private g2(float[] fArr, int i) {
        this.f9586c = fArr;
        this.f9587d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        i(i);
        float[] fArr = this.f9586c;
        float f2 = fArr[i];
        int i2 = this.f9587d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f9587d--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
