package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class m80 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f4541b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4542c;

    /* renamed from: d  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f4543d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ e80 f4544e;

    private m80(e80 e80) {
        this.f4544e = e80;
        this.f4541b = -1;
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f4543d == null) {
            this.f4543d = this.f4544e.f3874d.entrySet().iterator();
        }
        return this.f4543d;
    }

    public final boolean hasNext() {
        if (this.f4541b + 1 < this.f4544e.f3873c.size() || (!this.f4544e.f3874d.isEmpty() && b().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f4542c = true;
        int i = this.f4541b + 1;
        this.f4541b = i;
        if (i < this.f4544e.f3873c.size()) {
            return (Map.Entry) this.f4544e.f3873c.get(this.f4541b);
        }
        return (Map.Entry) b().next();
    }

    public final void remove() {
        if (this.f4542c) {
            this.f4542c = false;
            this.f4544e.k();
            if (this.f4541b < this.f4544e.f3873c.size()) {
                e80 e80 = this.f4544e;
                int i = this.f4541b;
                this.f4541b = i - 1;
                Object unused = e80.q(i);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ m80(e80 e80, d80 d80) {
        this(e80);
    }
}
