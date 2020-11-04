package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzii extends AbstractList<String> implements zzgh, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzgh f9846b;

    public zzii(zzgh zzgh) {
        this.f9846b = zzgh;
    }

    public final void S(zzeg zzeg) {
        throw new UnsupportedOperationException();
    }

    public final List<?> d() {
        return this.f9846b.d();
    }

    public final zzgh e() {
        return this;
    }

    public final Object g(int i) {
        return this.f9846b.g(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f9846b.get(i);
    }

    public final Iterator<String> iterator() {
        return new h4(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new i4(this, i);
    }

    public final int size() {
        return this.f9846b.size();
    }
}
