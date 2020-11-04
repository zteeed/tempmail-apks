package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class i4 implements ListIterator<String> {

    /* renamed from: b  reason: collision with root package name */
    private ListIterator<String> f9605b = this.f9607d.f9846b.listIterator(this.f9606c);

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f9606c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzii f9607d;

    i4(zzii zzii, int i) {
        this.f9607d = zzii;
        this.f9606c = i;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f9605b.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f9605b.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f9605b.next();
    }

    public final int nextIndex() {
        return this.f9605b.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f9605b.previous();
    }

    public final int previousIndex() {
        return this.f9605b.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
