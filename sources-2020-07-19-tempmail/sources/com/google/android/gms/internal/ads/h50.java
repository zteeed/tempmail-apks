package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.2.0 */
final class h50 extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f3937a;

    public h50(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f3937a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == h50.class) {
            if (this == obj) {
                return true;
            }
            h50 h50 = (h50) obj;
            return this.f3937a == h50.f3937a && get() == h50.get();
        }
    }

    public final int hashCode() {
        return this.f3937a;
    }
}
