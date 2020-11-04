package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class w80 implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f5199b = this.f5200c.f8597b.iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzeje f5200c;

    w80(zzeje zzeje) {
        this.f5200c = zzeje;
    }

    public final boolean hasNext() {
        return this.f5199b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f5199b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
