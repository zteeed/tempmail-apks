package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class p60 extends m50<Float> implements zzegm<Float>, q70, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private float[] f4613c;

    /* renamed from: d  reason: collision with root package name */
    private int f4614d;

    static {
        new p60(new float[0], 0).k();
    }

    p60() {
        this(new float[10], 0);
    }

    private final void h(int i) {
        if (i < 0 || i >= this.f4614d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    private final String i(int i) {
        int i2 = this.f4614d;
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
        if (i < 0 || i > (i2 = this.f4614d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        float[] fArr = this.f4613c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f4613c, i, fArr2, i + 1, this.f4614d - i);
            this.f4613c = fArr2;
        }
        this.f4613c[i] = floatValue;
        this.f4614d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        zzegd.a(collection);
        if (!(collection instanceof p60)) {
            return super.addAll(collection);
        }
        p60 p60 = (p60) collection;
        int i = p60.f4614d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4614d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f4613c;
            if (i3 > fArr.length) {
                this.f4613c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(p60.f4613c, 0, this.f4613c, this.f4614d, p60.f4614d);
            this.f4614d = i3;
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
        if (!(obj instanceof p60)) {
            return super.equals(obj);
        }
        p60 p60 = (p60) obj;
        if (this.f4614d != p60.f4614d) {
            return false;
        }
        float[] fArr = p60.f4613c;
        for (int i = 0; i < this.f4614d; i++) {
            if (Float.floatToIntBits(this.f4613c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        h(i);
        return Float.valueOf(this.f4613c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4614d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f4613c[i2]);
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
            if (this.f4613c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final void j(float f2) {
        c();
        int i = this.f4614d;
        float[] fArr = this.f4613c;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f4613c = fArr2;
        }
        float[] fArr3 = this.f4613c;
        int i2 = this.f4614d;
        this.f4614d = i2 + 1;
        fArr3[i2] = f2;
    }

    public final /* synthetic */ zzegm r(int i) {
        if (i >= this.f4614d) {
            return new p60(Arrays.copyOf(this.f4613c, i), this.f4614d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.f4614d; i++) {
            if (obj.equals(Float.valueOf(this.f4613c[i]))) {
                float[] fArr = this.f4613c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f4614d - i) - 1);
                this.f4614d--;
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
            float[] fArr = this.f4613c;
            System.arraycopy(fArr, i2, fArr, i, this.f4614d - i2);
            this.f4614d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        h(i);
        float[] fArr = this.f4613c;
        float f2 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f4614d;
    }

    private p60(float[] fArr, int i) {
        this.f4613c = fArr;
        this.f4614d = i;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        h(i);
        float[] fArr = this.f4613c;
        float f2 = fArr[i];
        int i2 = this.f4614d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f4614d--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        j(((Float) obj).floatValue());
        return true;
    }
}
