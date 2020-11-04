package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class u2 implements o3 {

    /* renamed from: b  reason: collision with root package name */
    private static final b3 f9502b = new t2();

    /* renamed from: a  reason: collision with root package name */
    private final b3 f9503a;

    public u2() {
        this(new v2(i2.c(), b()));
    }

    private static b3 b() {
        try {
            return (b3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f9502b;
        }
    }

    private static boolean c(z2 z2Var) {
        return z2Var.a() == zzfo.zzf.i;
    }

    public final <T> p3<T> a(Class<T> cls) {
        Class<zzfo> cls2 = zzfo.class;
        r3.p(cls);
        z2 b2 = this.f9503a.b(cls);
        if (b2.b()) {
            if (cls2.isAssignableFrom(cls)) {
                return e3.k(r3.B(), d2.a(), b2.c());
            }
            return e3.k(r3.f(), d2.b(), b2.c());
        } else if (cls2.isAssignableFrom(cls)) {
            if (c(b2)) {
                return c3.r(cls, b2, h3.b(), o2.d(), r3.B(), d2.a(), a3.b());
            }
            return c3.r(cls, b2, h3.b(), o2.d(), r3.B(), (b2<?>) null, a3.b());
        } else if (c(b2)) {
            return c3.r(cls, b2, h3.a(), o2.a(), r3.f(), d2.b(), a3.a());
        } else {
            return c3.r(cls, b2, h3.a(), o2.a(), r3.v(), (b2<?>) null, a3.a());
        }
    }

    private u2(b3 b3Var) {
        zzfr.f(b3Var, "messageInfoFactory");
        this.f9503a = b3Var;
    }
}
