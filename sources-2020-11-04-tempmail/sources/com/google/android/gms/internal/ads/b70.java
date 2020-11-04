package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class b70 implements c80 {

    /* renamed from: b  reason: collision with root package name */
    private static final i70 f3613b = new a70();

    /* renamed from: a  reason: collision with root package name */
    private final i70 f3614a;

    public b70() {
        this(new c70(q60.c(), c()));
    }

    private static boolean b(g70 g70) {
        return g70.a() == zzegb.zze.i;
    }

    private static i70 c() {
        try {
            return (i70) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f3613b;
        }
    }

    public final <T> z70<T> a(Class<T> cls) {
        Class<zzegb> cls2 = zzegb.class;
        b80.O(cls);
        g70 a2 = this.f3614a.a(cls);
        if (a2.b()) {
            if (cls2.isAssignableFrom(cls)) {
                return l70.k(b80.x(), i60.b(), a2.c());
            }
            return l70.k(b80.v(), i60.c(), a2.c());
        } else if (cls2.isAssignableFrom(cls)) {
            if (b(a2)) {
                return j70.q(cls, a2, o70.b(), v60.e(), b80.x(), i60.b(), h70.b());
            }
            return j70.q(cls, a2, o70.b(), v60.e(), b80.x(), (h60<?>) null, h70.b());
        } else if (b(a2)) {
            return j70.q(cls, a2, o70.a(), v60.d(), b80.v(), i60.c(), h70.a());
        } else {
            return j70.q(cls, a2, o70.a(), v60.d(), b80.w(), (h60<?>) null, h70.a());
        }
    }

    private b70(i70 i70) {
        zzegd.d(i70, "messageInfoFactory");
        this.f3614a = i70;
    }
}
