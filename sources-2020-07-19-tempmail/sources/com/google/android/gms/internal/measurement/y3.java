package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class y3 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f9527b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9528c;

    /* renamed from: d  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f9529d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ q3 f9530e;

    private y3(q3 q3Var) {
        this.f9530e = q3Var;
        this.f9527b = -1;
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f9529d == null) {
            this.f9529d = this.f9530e.f9479d.entrySet().iterator();
        }
        return this.f9529d;
    }

    public final boolean hasNext() {
        if (this.f9527b + 1 < this.f9530e.f9478c.size() || (!this.f9530e.f9479d.isEmpty() && b().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f9528c = true;
        int i = this.f9527b + 1;
        this.f9527b = i;
        if (i < this.f9530e.f9478c.size()) {
            return (Map.Entry) this.f9530e.f9478c.get(this.f9527b);
        }
        return (Map.Entry) b().next();
    }

    public final void remove() {
        if (this.f9528c) {
            this.f9528c = false;
            this.f9530e.p();
            if (this.f9527b < this.f9530e.f9478c.size()) {
                q3 q3Var = this.f9530e;
                int i = this.f9527b;
                this.f9527b = i - 1;
                Object unused = q3Var.k(i);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ y3(q3 q3Var, t3 t3Var) {
        this(q3Var);
    }
}
