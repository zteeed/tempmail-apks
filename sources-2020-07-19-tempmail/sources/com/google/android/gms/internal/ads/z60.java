package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class z60 extends v60 {
    private z60() {
        super();
    }

    private static <E> zzegm<E> f(Object obj, long j) {
        return (zzegm) v80.G(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> a(Object obj, long j) {
        zzegm f2 = f(obj, j);
        if (f2.p()) {
            return f2;
        }
        int size = f2.size();
        zzegm r = f2.r(size == 0 ? 10 : size << 1);
        v80.f(obj, j, r);
        return r;
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j) {
        zzegm f2 = f(obj, j);
        zzegm f3 = f(obj2, j);
        int size = f2.size();
        int size2 = f3.size();
        if (size > 0 && size2 > 0) {
            if (!f2.p()) {
                f2 = f2.r(size2 + size);
            }
            f2.addAll(f3);
        }
        if (size > 0) {
            f3 = f2;
        }
        v80.f(obj, j, f3);
    }

    /* access modifiers changed from: package-private */
    public final void c(Object obj, long j) {
        f(obj, j).k();
    }
}
