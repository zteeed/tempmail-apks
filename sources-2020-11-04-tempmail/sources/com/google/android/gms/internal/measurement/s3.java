package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class s3 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f9675b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f9676c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q3 f9677d;

    private s3(q3 q3Var) {
        this.f9677d = q3Var;
        this.f9675b = this.f9677d.f9661c.size();
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f9676c == null) {
            this.f9676c = this.f9677d.g.entrySet().iterator();
        }
        return this.f9676c;
    }

    public final boolean hasNext() {
        int i = this.f9675b;
        return (i > 0 && i <= this.f9677d.f9661c.size()) || b().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (b().hasNext()) {
            return (Map.Entry) b().next();
        }
        List g = this.f9677d.f9661c;
        int i = this.f9675b - 1;
        this.f9675b = i;
        return (Map.Entry) g.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ s3(q3 q3Var, t3 t3Var) {
        this(q3Var);
    }
}
