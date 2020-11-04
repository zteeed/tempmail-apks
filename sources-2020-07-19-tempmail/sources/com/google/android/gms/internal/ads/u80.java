package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class u80 implements ListIterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private ListIterator<String> f5047b = this.f5049d.f8597b.listIterator(this.f5048c);

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f5048c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzeje f5049d;

    u80(zzeje zzeje, int i) {
        this.f5049d = zzeje;
        this.f5048c = i;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f5047b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f5047b.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f5047b.next();
    }

    public final int nextIndex() {
        return this.f5047b.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f5047b.previous();
    }

    public final int previousIndex() {
        return this.f5047b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
