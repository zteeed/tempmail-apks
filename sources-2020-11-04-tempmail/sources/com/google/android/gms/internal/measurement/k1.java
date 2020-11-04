package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class k1 extends l1 {

    /* renamed from: b  reason: collision with root package name */
    private int f9616b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final int f9617c = this.f9618d.h();

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzeg f9618d;

    k1(zzeg zzeg) {
        this.f9618d = zzeg;
    }

    public final byte a() {
        int i = this.f9616b;
        if (i < this.f9617c) {
            this.f9616b = i + 1;
            return this.f9618d.v(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f9616b < this.f9617c;
    }
}
