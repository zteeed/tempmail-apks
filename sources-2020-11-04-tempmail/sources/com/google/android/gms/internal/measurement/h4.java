package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class h4 implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f9601b = this.f9602c.f9846b.iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzii f9602c;

    h4(zzii zzii) {
        this.f9602c = zzii;
    }

    public final boolean hasNext() {
        return this.f9601b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f9601b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
