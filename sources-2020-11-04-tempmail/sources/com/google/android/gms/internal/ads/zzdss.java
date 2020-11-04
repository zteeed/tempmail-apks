package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public abstract class zzdss<E> extends zzdsr<E> implements List<E>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final zzdtm<Object> f8550c = new nz(rz.f5033f, 0);

    zzdss() {
    }

    public static <E> zzdss<E> s(E e2) {
        Object[] objArr = {e2};
        for (int i = 0; i <= 0; i++) {
            zzdtd.a(objArr[0], 0);
        }
        return w(objArr, 1);
    }

    public static <E> zzdss<E> u() {
        return rz.f5033f;
    }

    public static <E> zzdss<E> v(E[] eArr) {
        if (eArr.length == 0) {
            return rz.f5033f;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            zzdtd.a(objArr[i], i);
        }
        return w(objArr, objArr.length);
    }

    static <E> zzdss<E> w(Object[] objArr, int i) {
        if (i == 0) {
            return rz.f5033f;
        }
        return new rz(objArr, i);
    }

    static <E> zzdss<E> y(Object[] objArr) {
        return w(objArr, objArr.length);
    }

    public static <E> zzdss<E> z(Iterable<? extends E> iterable) {
        zzdsh.b(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection instanceof zzdsr) {
                zzdss<E> m = ((zzdsr) collection).m();
                if (!m.q()) {
                    return m;
                }
                Object[] array = m.toArray();
                return w(array, array.length);
            }
            Object[] array2 = collection.toArray();
            int length = array2.length;
            for (int i = 0; i < length; i++) {
                zzdtd.a(array2[i], i);
            }
            return w(array2, array2.length);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return rz.f5033f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return s(next);
        }
        zzdsv zzdsv = new zzdsv();
        zzdsv.b(next);
        zzdsv zzdsv2 = zzdsv;
        zzdsv2.a(it);
        zzdsv zzdsv3 = zzdsv2;
        zzdsv3.f4618c = true;
        return w(zzdsv3.f4616a, zzdsv3.f4617b);
    }

    /* renamed from: A */
    public zzdss<E> subList(int i, int i2) {
        zzdsh.f(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return rz.f5033f;
        }
        return new oz(this, i, i3);
    }

    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(@NullableDecl Object obj) {
        zzdsh.b(this);
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (zzdse.a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i2);
                        i2++;
                        if (!zzdse.a(obj2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final zzdtn<E> iterator() {
        return (zzdtm) listIterator();
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        zzdsh.h(i, size());
        if (isEmpty()) {
            return f8550c;
        }
        return new nz(this, i);
    }

    public final zzdss<E> m() {
        return this;
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ ListIterator listIterator() {
        return (zzdtm) listIterator(0);
    }
}
