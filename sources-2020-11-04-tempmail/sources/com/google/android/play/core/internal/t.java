package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class t {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<s, List<Throwable>> f11503a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f11504b = new ReferenceQueue<>();

    t() {
    }

    public final List<Throwable> a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f11504b.poll();
            if (poll == null) {
                break;
            }
            this.f11503a.remove(poll);
        }
        List<Throwable> list = this.f11503a.get(new s(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f11503a.putIfAbsent(new s(th, this.f11504b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
