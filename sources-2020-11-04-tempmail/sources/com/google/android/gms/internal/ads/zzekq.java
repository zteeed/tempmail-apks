package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzekq<E> extends AbstractList<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final zzeks f8824d = zzeks.b(zzekq.class);

    /* renamed from: b  reason: collision with root package name */
    List<E> f8825b;

    /* renamed from: c  reason: collision with root package name */
    Iterator<E> f8826c;

    public zzekq(List<E> list, Iterator<E> it) {
        this.f8825b = list;
        this.f8826c = it;
    }

    public E get(int i) {
        if (this.f8825b.size() > i) {
            return this.f8825b.get(i);
        }
        if (this.f8826c.hasNext()) {
            this.f8825b.add(this.f8826c.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new q90(this);
    }

    public int size() {
        f8824d.a("potentially expensive size() call");
        f8824d.a("blowup running");
        while (this.f8826c.hasNext()) {
            this.f8825b.add(this.f8826c.next());
        }
        return this.f8825b.size();
    }
}
