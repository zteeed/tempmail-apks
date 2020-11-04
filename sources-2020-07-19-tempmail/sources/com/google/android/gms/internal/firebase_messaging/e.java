package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<h, List<Throwable>> f9296a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f9297b = new ReferenceQueue<>();

    e() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f9297b.poll();
        while (poll != null) {
            this.f9296a.remove(poll);
            poll = this.f9297b.poll();
        }
        List<Throwable> list = this.f9296a.get(new h(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f9296a.putIfAbsent(new h(th, this.f9297b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
