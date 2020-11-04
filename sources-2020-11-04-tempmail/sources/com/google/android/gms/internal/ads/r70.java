package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class r70<E> extends m50<E> implements RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final r70<Object> f4973e;

    /* renamed from: c  reason: collision with root package name */
    private E[] f4974c;

    /* renamed from: d  reason: collision with root package name */
    private int f4975d;

    static {
        r70<Object> r70 = new r70<>(new Object[0], 0);
        f4973e = r70;
        r70.k();
    }

    private r70(E[] eArr, int i) {
        this.f4974c = eArr;
        this.f4975d = i;
    }

    public static <E> r70<E> h() {
        return f4973e;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.f4975d) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    private final String j(int i) {
        int i2 = this.f4975d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final boolean add(E e2) {
        c();
        int i = this.f4975d;
        E[] eArr = this.f4974c;
        if (i == eArr.length) {
            this.f4974c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4974c;
        int i2 = this.f4975d;
        this.f4975d = i2 + 1;
        eArr2[i2] = e2;
        this.modCount++;
        return true;
    }

    public final E get(int i) {
        i(i);
        return this.f4974c[i];
    }

    public final /* synthetic */ zzegm r(int i) {
        if (i >= this.f4975d) {
            return new r70(Arrays.copyOf(this.f4974c, i), this.f4975d);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        c();
        i(i);
        E[] eArr = this.f4974c;
        E e2 = eArr[i];
        int i2 = this.f4975d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f4975d--;
        this.modCount++;
        return e2;
    }

    public final E set(int i, E e2) {
        c();
        i(i);
        E[] eArr = this.f4974c;
        E e3 = eArr[i];
        eArr[i] = e2;
        this.modCount++;
        return e3;
    }

    public final int size() {
        return this.f4975d;
    }

    public final void add(int i, E e2) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.f4975d)) {
            throw new IndexOutOfBoundsException(j(i));
        }
        E[] eArr = this.f4974c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f4974c, i, eArr2, i + 1, this.f4975d - i);
            this.f4974c = eArr2;
        }
        this.f4974c[i] = e2;
        this.f4975d++;
        this.modCount++;
    }
}
