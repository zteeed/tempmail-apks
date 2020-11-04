package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class s70 {

    /* renamed from: c  reason: collision with root package name */
    private static final s70 f4867c = new s70();

    /* renamed from: a  reason: collision with root package name */
    private final c80 f4868a = new b70();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, z70<?>> f4869b = new ConcurrentHashMap();

    private s70() {
    }

    public static s70 b() {
        return f4867c;
    }

    public final <T> z70<T> a(T t) {
        return c(t.getClass());
    }

    public final <T> z70<T> c(Class<T> cls) {
        zzegd.d(cls, "messageType");
        z70<T> z70 = (z70) this.f4869b.get(cls);
        if (z70 != null) {
            return z70;
        }
        z70<T> a2 = this.f4868a.a(cls);
        zzegd.d(cls, "messageType");
        zzegd.d(a2, "schema");
        z70<T> putIfAbsent = this.f4869b.putIfAbsent(cls, a2);
        return putIfAbsent != null ? putIfAbsent : a2;
    }
}
