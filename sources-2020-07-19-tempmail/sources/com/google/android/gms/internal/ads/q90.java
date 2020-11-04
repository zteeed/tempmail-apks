package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class q90 implements Iterator<E> {

    /* renamed from: b  reason: collision with root package name */
    private int f4698b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzekq f4699c;

    q90(zzekq zzekq) {
        this.f4699c = zzekq;
    }

    public final boolean hasNext() {
        return this.f4698b < this.f4699c.f8642b.size() || this.f4699c.f8643c.hasNext();
    }

    public final E next() {
        while (this.f4698b >= this.f4699c.f8642b.size()) {
            zzekq zzekq = this.f4699c;
            zzekq.f8642b.add(zzekq.f8643c.next());
        }
        List<E> list = this.f4699c.f8642b;
        int i = this.f4698b;
        this.f4698b = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
