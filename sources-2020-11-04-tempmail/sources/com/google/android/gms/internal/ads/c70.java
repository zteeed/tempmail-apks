package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class c70 implements i70 {

    /* renamed from: a  reason: collision with root package name */
    private i70[] f3704a;

    c70(i70... i70Arr) {
        this.f3704a = i70Arr;
    }

    public final g70 a(Class<?> cls) {
        for (i70 i70 : this.f3704a) {
            if (i70.b(cls)) {
                return i70.a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    public final boolean b(Class<?> cls) {
        for (i70 b2 : this.f3704a) {
            if (b2.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
