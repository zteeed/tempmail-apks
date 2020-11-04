package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class x2 implements y2 {
    x2() {
    }

    public final w2<?, ?> b(Object obj) {
        zzgo zzgo = (zzgo) obj;
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> c(Object obj) {
        return (zzgq) obj;
    }

    public final Object d(Object obj) {
        ((zzgq) obj).f();
        return obj;
    }

    public final boolean e(Object obj) {
        return !((zzgq) obj).g();
    }

    public final Map<?, ?> f(Object obj) {
        return (zzgq) obj;
    }

    public final Object g(Object obj, Object obj2) {
        zzgq zzgq = (zzgq) obj;
        zzgq zzgq2 = (zzgq) obj2;
        if (!zzgq2.isEmpty()) {
            if (!zzgq.g()) {
                zzgq = zzgq.e();
            }
            zzgq.d(zzgq2);
        }
        return zzgq;
    }

    public final int h(int i, Object obj, Object obj2) {
        zzgq zzgq = (zzgq) obj;
        zzgo zzgo = (zzgo) obj2;
        if (zzgq.isEmpty()) {
            return 0;
        }
        Iterator it = zzgq.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Object zzf(Object obj) {
        return zzgq.c().e();
    }
}
