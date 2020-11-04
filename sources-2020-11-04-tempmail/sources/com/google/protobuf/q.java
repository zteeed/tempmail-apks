package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ProtobufArrayList */
final class q<E> extends c<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final q<Object> f12152d;

    /* renamed from: c  reason: collision with root package name */
    private final List<E> f12153c;

    static {
        q<Object> qVar = new q<>();
        f12152d = qVar;
        qVar.o();
    }

    q() {
        this(new ArrayList(10));
    }

    public static <E> q<E> h() {
        return f12152d;
    }

    public void add(int i, E e2) {
        c();
        this.f12153c.add(i, e2);
        this.modCount++;
    }

    public E get(int i) {
        return this.f12153c.get(i);
    }

    /* renamed from: i */
    public q<E> t(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f12153c);
            return new q<>(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        c();
        E remove = this.f12153c.remove(i);
        this.modCount++;
        return remove;
    }

    public E set(int i, E e2) {
        c();
        E e3 = this.f12153c.set(i, e2);
        this.modCount++;
        return e3;
    }

    public int size() {
        return this.f12153c.size();
    }

    private q(List<E> list) {
        this.f12153c = list;
    }
}
