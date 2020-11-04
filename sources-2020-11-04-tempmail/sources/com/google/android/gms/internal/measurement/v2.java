package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class v2 implements b3 {

    /* renamed from: a  reason: collision with root package name */
    private b3[] f9694a;

    v2(b3... b3VarArr) {
        this.f9694a = b3VarArr;
    }

    public final boolean a(Class<?> cls) {
        for (b3 a2 : this.f9694a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final z2 b(Class<?> cls) {
        for (b3 b3Var : this.f9694a) {
            if (b3Var.a(cls)) {
                return b3Var.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
