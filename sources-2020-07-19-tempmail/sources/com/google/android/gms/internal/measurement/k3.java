package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class k3<E> extends g1<E> implements RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final k3<Object> f9439e;

    /* renamed from: c  reason: collision with root package name */
    private E[] f9440c;

    /* renamed from: d  reason: collision with root package name */
    private int f9441d;

    static {
        k3<Object> k3Var = new k3<>(new Object[0], 0);
        f9439e = k3Var;
        k3Var.b();
    }

    private k3(E[] eArr, int i) {
        this.f9440c = eArr;
        this.f9441d = i;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.f9441d) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    private final String i(int i) {
        int i2 = this.f9441d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static <E> k3<E> j() {
        return f9439e;
    }

    public final boolean add(E e2) {
        c();
        int i = this.f9441d;
        E[] eArr = this.f9440c;
        if (i == eArr.length) {
            this.f9440c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f9440c;
        int i2 = this.f9441d;
        this.f9441d = i2 + 1;
        eArr2[i2] = e2;
        this.modCount++;
        return true;
    }

    public final /* synthetic */ zzfx f(int i) {
        if (i >= this.f9441d) {
            return new k3(Arrays.copyOf(this.f9440c, i), this.f9441d);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        h(i);
        return this.f9440c[i];
    }

    public final E remove(int i) {
        c();
        h(i);
        E[] eArr = this.f9440c;
        E e2 = eArr[i];
        int i2 = this.f9441d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f9441d--;
        this.modCount++;
        return e2;
    }

    public final E set(int i, E e2) {
        c();
        h(i);
        E[] eArr = this.f9440c;
        E e3 = eArr[i];
        eArr[i] = e2;
        this.modCount++;
        return e3;
    }

    public final int size() {
        return this.f9441d;
    }

    public final void add(int i, E e2) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.f9441d)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        E[] eArr = this.f9440c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f9440c, i, eArr2, i + 1, this.f9441d - i);
            this.f9440c = eArr2;
        }
        this.f9440c[i] = e2;
        this.f9441d++;
        this.modCount++;
    }
}
