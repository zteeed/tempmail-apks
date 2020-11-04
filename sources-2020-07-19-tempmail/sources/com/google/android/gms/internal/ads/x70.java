package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class x70 implements Iterator<v50> {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<w70> f5286b;

    /* renamed from: c  reason: collision with root package name */
    private v50 f5287c;

    private x70(zzeer zzeer) {
        if (zzeer instanceof w70) {
            w70 w70 = (w70) zzeer;
            ArrayDeque<w70> arrayDeque = new ArrayDeque<>(w70.z());
            this.f5286b = arrayDeque;
            arrayDeque.push(w70);
            this.f5287c = b(w70.f5193f);
            return;
        }
        this.f5286b = null;
        this.f5287c = (v50) zzeer;
    }

    private final v50 b(zzeer zzeer) {
        while (zzeer instanceof w70) {
            w70 w70 = (w70) zzeer;
            this.f5286b.push(w70);
            zzeer = w70.f5193f;
        }
        return (v50) zzeer;
    }

    public final boolean hasNext() {
        return this.f5287c != null;
    }

    public final /* synthetic */ Object next() {
        v50 v50;
        v50 v502 = this.f5287c;
        if (v502 != null) {
            while (true) {
                ArrayDeque<w70> arrayDeque = this.f5286b;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    v50 = b(this.f5286b.pop().g);
                    if (!v50.isEmpty()) {
                        break;
                    }
                } else {
                    v50 = null;
                }
            }
            v50 = null;
            this.f5287c = v50;
            return v502;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ x70(zzeer zzeer, v70 v70) {
        this(zzeer);
    }
}
