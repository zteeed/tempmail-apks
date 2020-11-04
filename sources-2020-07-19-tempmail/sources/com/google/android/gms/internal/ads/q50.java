package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class q50 extends r50 {

    /* renamed from: b  reason: collision with root package name */
    private int f4689b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final int f4690c = this.f4691d.size();

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzeer f4691d;

    q50(zzeer zzeer) {
        this.f4691d = zzeer;
    }

    public final boolean hasNext() {
        return this.f4689b < this.f4690c;
    }

    public final byte nextByte() {
        int i = this.f4689b;
        if (i < this.f4690c) {
            this.f4689b = i + 1;
            return this.f4691d.F(i);
        }
        throw new NoSuchElementException();
    }
}
