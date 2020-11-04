package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.2.0 */
final class i50 {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<h50, List<Throwable>> f4202a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f4203b = new ReferenceQueue<>();

    i50() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f4203b.poll();
        while (poll != null) {
            this.f4202a.remove(poll);
            poll = this.f4203b.poll();
        }
        List<Throwable> list = this.f4202a.get(new h50(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f4202a.putIfAbsent(new h50(th, this.f4203b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
