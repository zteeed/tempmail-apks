package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class b1 extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f9363a;

    public b1(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f9363a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == b1.class) {
            if (this == obj) {
                return true;
            }
            b1 b1Var = (b1) obj;
            return this.f9363a == b1Var.f9363a && get() == b1Var.get();
        }
    }

    public final int hashCode() {
        return this.f9363a;
    }
}
