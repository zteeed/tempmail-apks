package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class l3 {

    /* renamed from: c  reason: collision with root package name */
    private static final l3 f9450c = new l3();

    /* renamed from: a  reason: collision with root package name */
    private final o3 f9451a = new u2();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, p3<?>> f9452b = new ConcurrentHashMap();

    private l3() {
    }

    public static l3 a() {
        return f9450c;
    }

    public final <T> p3<T> b(Class<T> cls) {
        zzfr.f(cls, "messageType");
        p3<T> p3Var = (p3) this.f9452b.get(cls);
        if (p3Var != null) {
            return p3Var;
        }
        p3<T> a2 = this.f9451a.a(cls);
        zzfr.f(cls, "messageType");
        zzfr.f(a2, "schema");
        p3<T> putIfAbsent = this.f9452b.putIfAbsent(cls, a2);
        return putIfAbsent != null ? putIfAbsent : a2;
    }

    public final <T> p3<T> c(T t) {
        return b(t.getClass());
    }
}
