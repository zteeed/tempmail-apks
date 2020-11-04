package com.google.android.gms.internal.firebase_messaging;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class g extends f {

    /* renamed from: a  reason: collision with root package name */
    private final e f9481a = new e();

    g() {
    }

    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f9481a.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
