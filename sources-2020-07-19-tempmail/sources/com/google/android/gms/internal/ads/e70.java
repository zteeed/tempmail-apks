package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class e70 implements f70 {
    e70() {
    }

    public final d70<?, ?> a(Object obj) {
        zzehd zzehd = (zzehd) obj;
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> b(Object obj) {
        return (zzehf) obj;
    }

    public final boolean c(Object obj) {
        return !((zzehf) obj).b();
    }

    public final Object d(Object obj) {
        ((zzehf) obj).e();
        return obj;
    }

    public final Object e(Object obj, Object obj2) {
        zzehf zzehf = (zzehf) obj;
        zzehf zzehf2 = (zzehf) obj2;
        if (!zzehf2.isEmpty()) {
            if (!zzehf.b()) {
                zzehf = zzehf.g();
            }
            zzehf.c(zzehf2);
        }
        return zzehf;
    }

    public final Object f(Object obj) {
        return zzehf.f().g();
    }

    public final int g(int i, Object obj, Object obj2) {
        zzehf zzehf = (zzehf) obj;
        zzehd zzehd = (zzehd) obj2;
        if (zzehf.isEmpty()) {
            return 0;
        }
        Iterator it = zzehf.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> h(Object obj) {
        return (zzehf) obj;
    }
}
