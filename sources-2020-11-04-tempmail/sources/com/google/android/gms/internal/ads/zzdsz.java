package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public abstract class zzdsz<E> extends zzdsr<E> implements Set<E> {
    @NullableDecl

    /* renamed from: c  reason: collision with root package name */
    private transient zzdss<E> f8556c;

    zzdsz() {
    }

    static int A(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        zzdsh.a(z, "collection too large");
        return 1073741824;
    }

    public static <E> zzdsy<E> B(int i) {
        jz.b(i, "expectedSize");
        return new zzdsy<>(i);
    }

    /* access modifiers changed from: private */
    public static boolean C(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* access modifiers changed from: private */
    public static <E> zzdsz<E> s(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return v(objArr[0]);
            }
            int A = A(i);
            Object[] objArr2 = new Object[A];
            int i2 = A - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                zzdtd.a(obj, i5);
                int hashCode = obj.hashCode();
                int a2 = lz.a(hashCode);
                while (true) {
                    int i6 = a2 & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a2++;
                    } else {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new yz(objArr[0], i3);
            }
            if (A(i4) < A / 2) {
                i = i4;
            } else {
                if (C(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new wz(objArr, i3, objArr2, i2, i4);
            }
        }
        return wz.i;
    }

    @SafeVarargs
    public static <E> zzdsz<E> u(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        zzdsh.a(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return s(length, objArr);
    }

    public static <E> zzdsz<E> v(E e2) {
        return new yz(e2);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdsz) || !w() || !((zzdsz) obj).w() || hashCode() == obj.hashCode()) {
            return zzdtl.a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return zzdtl.b(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public zzdss<E> m() {
        zzdss<E> zzdss = this.f8556c;
        if (zzdss != null) {
            return zzdss;
        }
        zzdss<E> y = y();
        this.f8556c = y;
        return y;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public zzdss<E> y() {
        return zzdss.y(toArray());
    }
}
