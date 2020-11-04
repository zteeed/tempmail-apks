package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class g80 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f3858b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f3859c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ e80 f3860d;

    private g80(e80 e80) {
        this.f3860d = e80;
        this.f3858b = this.f3860d.f3690c.size();
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f3859c == null) {
            this.f3859c = this.f3860d.g.entrySet().iterator();
        }
        return this.f3859c;
    }

    public final boolean hasNext() {
        int i = this.f3858b;
        return (i > 0 && i <= this.f3860d.f3690c.size()) || b().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (b().hasNext()) {
            return (Map.Entry) b().next();
        }
        List f2 = this.f3860d.f3690c;
        int i = this.f3858b - 1;
        this.f3858b = i;
        return (Map.Entry) f2.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ g80(e80 e80, d80 d80) {
        this(e80);
    }
}
