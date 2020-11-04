package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f10231b = this.f10232c.f10562b.keySet().iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzan f10232c;

    i(zzan zzan) {
        this.f10232c = zzan;
    }

    public final boolean hasNext() {
        return this.f10231b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f10231b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
