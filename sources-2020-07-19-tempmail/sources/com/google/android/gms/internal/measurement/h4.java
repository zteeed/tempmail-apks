package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class h4 implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f9418b = this.f9419c.f9663b.iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzii f9419c;

    h4(zzii zzii) {
        this.f9419c = zzii;
    }

    public final boolean hasNext() {
        return this.f9418b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f9418b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
