package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class h extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f9482a;

    public h(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f9482a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == h.class) {
            if (this == obj) {
                return true;
            }
            h hVar = (h) obj;
            return this.f9482a == hVar.f9482a && get() == hVar.get();
        }
    }

    public final int hashCode() {
        return this.f9482a;
    }
}
