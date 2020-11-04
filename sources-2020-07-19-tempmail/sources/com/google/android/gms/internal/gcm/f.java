package com.google.android.gms.internal.gcm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class f extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f9306a;

    public f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f9306a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == f.class) {
            if (this == obj) {
                return true;
            }
            f fVar = (f) obj;
            return this.f9306a == fVar.f9306a && get() == fVar.get();
        }
    }

    public final int hashCode() {
        return this.f9306a;
    }
}
