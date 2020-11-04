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
    final ArrayList<T> f14488b = new ArrayList<>();

    public boolean add(T t) {
        boolean add = this.f14488b.add(t);
        lazySet(this.f14488b.size());
        return add;
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.f14488b.addAll(collection);
        lazySet(this.f14488b.size());
        return addAll;
    }

    public void clear() {
        this.f14488b.clear();
        lazySet(0);
    }

    public boolean contains(Object obj) {
        return this.f14488b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f14488b.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f14488b.equals(((r) obj).f14488b);
        }
        return this.f14488b.equals(obj);
    }

    public T get(int i) {
        return this.f14488b.get(i);
    }

    public int hashCode() {
        return this.f14488b.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f14488b.indexOf(obj);
    }

    public boolean isEmpty() {
        return get() == 0;
    }

    public Iterator<T> iterator() {
        return this.f14488b.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f14488b.lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return this.f14488b.listIterator();
    }

    public boolean remove(Object obj) {
        boolean remove = this.f14488b.remove(obj);
        lazySet(this.f14488b.size());
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f14488b.removeAll(collection);
        lazySet(this.f14488b.size());
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f14488b.retainAll(collection);
        lazySet(this.f14488b.size());
        return retainAll;
    }

    public T set(int i, T t) {
        return this.f14488b.set(i, t);
    }

    public int size() {
        return get();
    }

    public List<T> subList(int i, int i2) {
        return this.f14488b.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f14488b.toArray();
    }

    public String toString() {
        return this.f14488b.toString();
    }

    public ListIterator<T> listIterator(int i) {
        return this.f14488b.listIterator(i);
    }

    public <E> E[] toArray(E[] eArr) {
        return this.f14488b.toArray(eArr);
    }

    public void add(int i, T t) {
        this.f14488b.add(i, t);
        lazySet(this.f14488b.size());
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.f14488b.addAll(i, collection);
        lazySet(this.f14488b.size());
        return addAll;
    }

    public T remove(int i) {
        T remove = this.f14488b.remove(i);
        lazySet(this.f14488b.size());
        return remove;
    }
}
