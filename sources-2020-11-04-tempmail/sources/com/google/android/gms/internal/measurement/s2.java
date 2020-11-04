package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class s2 extends o2 {
    private s2() {
        super();
    }

    private static <E> zzfx<E> f(Object obj, long j) {
        return (zzfx) k4.F(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> b(Object obj, long j) {
        zzfx f2 = f(obj, j);
        if (f2.a()) {
            return f2;
        }
        int size = f2.size();
        zzfx f3 = f2.f(size == 0 ? 10 : size << 1);
        k4.j(obj, j, f3);
        return f3;
    }

    /* access modifiers changed from: package-private */
    public final <E> void c(Object obj, Object obj2, long j) {
        zzfx f2 = f(obj, j);
        zzfx f3 = f(obj2, j);
        int size = f2.size();
        int size2 = f3.size();
        if (size > 0 && size2 > 0) {
            if (!f2.a()) {
                f2 = f2.f(size2 + size);
            }
            f2.addAll(f3);
        }
        if (size > 0) {
            f3 = f2;
        }
        k4.j(obj, j, f3);
    }

    /* access modifiers changed from: package-private */
    public final void e(Object obj, long j) {
        f(obj, j).b();
    }
}
