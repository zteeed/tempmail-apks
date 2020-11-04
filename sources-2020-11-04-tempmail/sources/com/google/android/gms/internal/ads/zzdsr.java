package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public abstract class zzdsr<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private static final Object[] f8549b = new Object[0];

    zzdsr() {
    }

    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i) {
        zzdtn zzdtn = (zzdtn) iterator();
        while (zzdtn.hasNext()) {
            objArr[i] = zzdtn.next();
            i++;
        }
        return i;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: h */
    public abstract zzdtn<E> iterator();

    /* access modifiers changed from: package-private */
    @NullableDecl
    public Object[] i() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int l() {
        throw new UnsupportedOperationException();
    }

    public zzdss<E> m() {
        return isEmpty() ? zzdss.u() : zzdss.y(toArray());
    }

    /* access modifiers changed from: package-private */
    public abstract boolean q();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f8549b);
    }

    public final <T> T[] toArray(T[] tArr) {
        zzdsh.b(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] i = i();
            if (i != null) {
                return Arrays.copyOfRange(i, j(), l(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        c(tArr, 0);
        return tArr;
    }
}
