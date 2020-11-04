package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class w80 implements Iterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private Iterator<String> f5382b = this.f5383c.f8780b.iterator();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzeje f5383c;

    w80(zzeje zzeje) {
        this.f5383c = zzeje;
    }

    public final boolean hasNext() {
        return this.f5382b.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f5382b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
