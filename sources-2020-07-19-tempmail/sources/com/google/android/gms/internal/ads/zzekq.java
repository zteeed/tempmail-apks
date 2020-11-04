package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzekq<E> extends AbstractList<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final zzeks f8641d = zzeks.b(zzekq.class);

    /* renamed from: b  reason: collision with root package name */
    List<E> f8642b;

    /* renamed from: c  reason: collision with root package name */
    Iterator<E> f8643c;

    public zzekq(List<E> list, Iterator<E> it) {
        this.f8642b = list;
        this.f8643c = it;
    }

    public E get(int i) {
        if (this.f8642b.size() > i) {
            return this.f8642b.get(i);
        }
        if (this.f8643c.hasNext()) {
            this.f8642b.add(this.f8643c.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new q90(this);
    }

    public int size() {
        f8641d.a("potentially expensive size() call");
        f8641d.a("blowup running");
        while (this.f8643c.hasNext()) {
            this.f8642b.add(this.f8643c.next());
        }
        return this.f8642b.size();
    }
}
