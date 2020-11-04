package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class g80 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f4041b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f4042c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ e80 f4043d;

    private g80(e80 e80) {
        this.f4043d = e80;
        this.f4041b = this.f4043d.f3873c.size();
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f4042c == null) {
            this.f4042c = this.f4043d.g.entrySet().iterator();
        }
        return this.f4042c;
    }

    public final boolean hasNext() {
        int i = this.f4041b;
        return (i > 0 && i <= this.f4043d.f3873c.size()) || b().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (b().hasNext()) {
            return (Map.Entry) b().next();
        }
        List f2 = this.f4043d.f3873c;
        int i = this.f4041b - 1;
        this.f4041b = i;
        return (Map.Entry) f2.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ g80(e80 e80, d80 d80) {
        this(e80);
    }
}
