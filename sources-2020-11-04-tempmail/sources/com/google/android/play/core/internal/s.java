package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class s extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f11502a;

    public s(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f11502a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != s.class) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        s sVar = (s) obj;
        return this.f11502a == sVar.f11502a && get() == sVar.get();
    }

    public final int hashCode() {
        return this.f11502a;
    }
}
