package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class qz extends zzdtn<T> {

    /* renamed from: b  reason: collision with root package name */
    private boolean f4759b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f4760c;

    qz(Object obj) {
        this.f4760c = obj;
    }

    public final boolean hasNext() {
        return !this.f4759b;
    }

    public final T next() {
        if (!this.f4759b) {
            this.f4759b = true;
            return this.f4760c;
        }
        throw new NoSuchElementException();
    }
}
