package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class qz extends zzdtn<T> {

    /* renamed from: b  reason: collision with root package name */
    private boolean f4942b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f4943c;

    qz(Object obj) {
        this.f4943c = obj;
    }

    public final boolean hasNext() {
        return !this.f4942b;
    }

    public final T next() {
        if (!this.f4942b) {
            this.f4942b = true;
            return this.f4943c;
        }
        throw new NoSuchElementException();
    }
}
