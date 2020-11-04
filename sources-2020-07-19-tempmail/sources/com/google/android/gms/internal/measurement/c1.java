package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<b1, List<Throwable>> f9367a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f9368b = new ReferenceQueue<>();

    c1() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f9368b.poll();
        while (poll != null) {
            this.f9367a.remove(poll);
            poll = this.f9368b.poll();
        }
        List<Throwable> list = this.f9367a.get(new b1(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f9367a.putIfAbsent(new b1(th, this.f9368b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}