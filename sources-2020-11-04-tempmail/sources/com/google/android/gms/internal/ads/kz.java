package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
abstract class kz<E> extends zzdtm<E> {

    /* renamed from: b  reason: collision with root package name */
    private final int f4432b;

    /* renamed from: c  reason: collision with root package name */
    private int f4433c;

    protected kz(int i, int i2) {
        zzdsh.h(i2, i);
        this.f4432b = i;
        this.f4433c = i2;
    }

    /* access modifiers changed from: protected */
    public abstract E b(int i);

    public final boolean hasNext() {
        return this.f4433c < this.f4432b;
    }

    public final boolean hasPrevious() {
        return this.f4433c > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f4433c;
            this.f4433c = i + 1;
            return b(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f4433c;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f4433c - 1;
            this.f4433c = i;
            return b(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f4433c - 1;
    }
}
