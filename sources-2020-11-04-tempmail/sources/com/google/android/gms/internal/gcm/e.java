package com.google.android.gms.internal.gcm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<f, List<Throwable>> f9487a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f9488b = new ReferenceQueue<>();

    e() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f9488b.poll();
        while (poll != null) {
            this.f9487a.remove(poll);
            poll = this.f9488b.poll();
        }
        List<Throwable> list = this.f9487a.get(new f(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f9487a.putIfAbsent(new f(th, this.f9488b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
