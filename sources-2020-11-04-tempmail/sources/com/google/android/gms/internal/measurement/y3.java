package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class y3 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f9710b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9711c;

    /* renamed from: d  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f9712d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ q3 f9713e;

    private y3(q3 q3Var) {
        this.f9713e = q3Var;
        this.f9710b = -1;
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f9712d == null) {
            this.f9712d = this.f9713e.f9662d.entrySet().iterator();
        }
        return this.f9712d;
    }

    public final boolean hasNext() {
        if (this.f9710b + 1 < this.f9713e.f9661c.size() || (!this.f9713e.f9662d.isEmpty() && b().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f9711c = true;
        int i = this.f9710b + 1;
        this.f9710b = i;
        if (i < this.f9713e.f9661c.size()) {
            return (Map.Entry) this.f9713e.f9661c.get(this.f9710b);
        }
        return (Map.Entry) b().next();
    }

    public final void remove() {
        if (this.f9711c) {
            this.f9711c = false;
            this.f9713e.p();
            if (this.f9710b < this.f9713e.f9661c.size()) {
                q3 q3Var = this.f9713e;
                int i = this.f9710b;
                this.f9710b = i - 1;
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
