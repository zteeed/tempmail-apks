package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class m80 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f4358b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4359c;

    /* renamed from: d  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f4360d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ e80 f4361e;

    private m80(e80 e80) {
        this.f4361e = e80;
        this.f4358b = -1;
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f4360d == null) {
            this.f4360d = this.f4361e.f3691d.entrySet().iterator();
        }
        return this.f4360d;
    }

    public final boolean hasNext() {
        if (this.f4358b + 1 < this.f4361e.f3690c.size() || (!this.f4361e.f3691d.isEmpty() && b().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f4359c = true;
        int i = this.f4358b + 1;
        this.f4358b = i;
        if (i < this.f4361e.f3690c.size()) {
            return (Map.Entry) this.f4361e.f3690c.get(this.f4358b);
        }
        return (Map.Entry) b().next();
    }

    public final void remove() {
        if (this.f4359c) {
            this.f4359c = false;
            this.f4361e.k();
            if (this.f4358b < this.f4361e.f3690c.size()) {
                e80 e80 = this.f4361e;
                int i = this.f4358b;
                this.f4358b = i - 1;
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
