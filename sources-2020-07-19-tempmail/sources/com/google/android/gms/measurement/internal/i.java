package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f10045b = this.f10046c.f10376b.keySet().iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzan f10046c;

    i(zzan zzan) {
        this.f10046c = zzan;
    }

    public final boolean hasNext() {
        return this.f10045b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f10045b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
