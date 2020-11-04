package d.a.a0.j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: VolatileSizeArrayList */
public final class r<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<T> f13892b = new ArrayList<>();

    public boolean add(T t) {
        boolean add = this.f13892b.add(t);
        lazySet(this.f13892b.size());
        return add;
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.f13892b.addAll(collection);
        lazySet(this.f13892b.size());
        return addAll;
    }

    public void clear() {
        this.f13892b.clear();
        lazySet(0);
    }

    public boolean contains(Object obj) {
        return this.f13892b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f13892b.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f13892b.equals(((r) obj).f13892b);
        }
        return this.f13892b.equals(obj);
    }

    public T get(int i) {
        return this.f13892b.get(i);
    }

    public int hashCode() {
        return this.f13892b.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f13892b.indexOf(obj);
    }

    public boolean isEmpty() {
        return get() == 0;
    }

    public Iterator<T> iterator() {
        return this.f13892b.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f13892b.lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return this.f13892b.listIterator();
    }

    public boolean remove(Object obj) {
        boolean remove = this.f13892b.remove(obj);
        lazySet(this.f13892b.size());
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f13892b.removeAll(collection);
        lazySet(this.f13892b.size());
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f13892b.retainAll(collection);
        lazySet(this.f13892b.size());
        return retainAll;
    }

    public T set(int i, T t) {
        return this.f13892b.set(i, t);
    }

    public int size() {
        return get();
    }

    public List<T> subList(int i, int i2) {
        return this.f13892b.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f13892b.toArray();
    }

    public String toString() {
        return this.f13892b.toString();
    }

    public ListIterator<T> listIterator(int i) {
        return this.f13892b.listIterator(i);
    }

    public <E> E[] toArray(E[] eArr) {
        return this.f13892b.toArray(eArr);
    }

    public void add(int i, T t) {
        this.f13892b.add(i, t);
        lazySet(this.f13892b.size());
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.f13892b.addAll(i, collection);
        lazySet(this.f13892b.size());
        return addAll;
    }

    public T remove(int i) {
        T remove = this.f13892b.remove(i);
        lazySet(this.f13892b.size());
        return remove;
    }
}
