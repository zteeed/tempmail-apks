package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public abstract class zzdst<E> {
    zzdst() {
    }

    public zzdst<E> a(Iterator<? extends E> it) {
        while (it.hasNext()) {
            b(it.next());
        }
        return this;
    }

    public abstract zzdst<E> b(E e2);

    public zzdst<E> c(Iterable<? extends E> iterable) {
        for (Object b2 : iterable) {
            b(b2);
        }
        return this;
    }
}
