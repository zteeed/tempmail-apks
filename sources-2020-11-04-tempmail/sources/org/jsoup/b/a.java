package org.jsoup.b;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: ChangeNotifyingArrayList */
public abstract class a<E> extends ArrayList<E> {
    public a(int i) {
        super(i);
    }

    public boolean add(E e2) {
        c();
        return super.add(e2);
    }

    public boolean addAll(Collection<? extends E> collection) {
        c();
        return super.addAll(collection);
    }

    public abstract void c();

    public void clear() {
        c();
        super.clear();
    }

    public E remove(int i) {
        c();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        c();
        return super.removeAll(collection);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        c();
        super.removeRange(i, i2);
    }

    public boolean retainAll(Collection<?> collection) {
        c();
        return super.retainAll(collection);
    }

    public E set(int i, E e2) {
        c();
        return super.set(i, e2);
    }

    public void add(int i, E e2) {
        c();
        super.add(i, e2);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        c();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
