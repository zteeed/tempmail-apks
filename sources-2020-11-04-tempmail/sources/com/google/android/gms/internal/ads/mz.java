package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
class mz<E> extends zzdst<E> {

    /* renamed from: a  reason: collision with root package name */
    Object[] f4616a;

    /* renamed from: b  reason: collision with root package name */
    int f4617b = 0;

    /* renamed from: c  reason: collision with root package name */
    boolean f4618c;

    mz(int i) {
        jz.b(i, "initialCapacity");
        this.f4616a = new Object[i];
    }

    private final void e(int i) {
        Object[] objArr = this.f4616a;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.f4616a = Arrays.copyOf(objArr, i2);
                this.f4618c = false;
                return;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        } else if (this.f4618c) {
            this.f4616a = (Object[]) objArr.clone();
            this.f4618c = false;
        }
    }

    public zzdst<E> c(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(this.f4617b + collection.size());
            if (collection instanceof zzdsr) {
                this.f4617b = ((zzdsr) collection).c(this.f4616a, this.f4617b);
                return this;
            }
        }
        super.c(iterable);
        return this;
    }

    public mz<E> d(E e2) {
        zzdsh.b(e2);
        e(this.f4617b + 1);
        Object[] objArr = this.f4616a;
        int i = this.f4617b;
        this.f4617b = i + 1;
        objArr[i] = e2;
        return this;
    }
}
