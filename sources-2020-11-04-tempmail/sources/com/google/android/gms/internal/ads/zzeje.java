package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzeje extends AbstractList<String> implements zzegw, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzegw f8780b;

    public zzeje(zzegw zzegw) {
        this.f8780b = zzegw;
    }

    public final List<?> E() {
        return this.f8780b.E();
    }

    public final zzegw H() {
        return this;
    }

    public final Object I(int i) {
        return this.f8780b.I(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f8780b.get(i);
    }

    public final Iterator<String> iterator() {
        return new w80(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new u80(this, i);
    }

    public final void n(zzeer zzeer) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f8780b.size();
    }
}
