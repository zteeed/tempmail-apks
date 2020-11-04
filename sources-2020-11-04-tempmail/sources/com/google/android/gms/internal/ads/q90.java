package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class q90 implements Iterator<E> {

    /* renamed from: b  reason: collision with root package name */
    private int f4881b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzekq f4882c;

    q90(zzekq zzekq) {
        this.f4882c = zzekq;
    }

    public final boolean hasNext() {
        return this.f4881b < this.f4882c.f8825b.size() || this.f4882c.f8826c.hasNext();
    }

    public final E next() {
        while (this.f4881b >= this.f4882c.f8825b.size()) {
            zzekq zzekq = this.f4882c;
            zzekq.f8825b.add(zzekq.f8826c.next());
        }
        List<E> list = this.f4882c.f8825b;
        int i = this.f4881b;
        this.f4881b = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
