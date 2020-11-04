package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class q50 extends r50 {

    /* renamed from: b  reason: collision with root package name */
    private int f4872b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final int f4873c = this.f4874d.size();

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzeer f4874d;

    q50(zzeer zzeer) {
        this.f4874d = zzeer;
    }

    public final boolean hasNext() {
        return this.f4872b < this.f4873c;
    }

    public final byte nextByte() {
        int i = this.f4872b;
        if (i < this.f4873c) {
            this.f4872b = i + 1;
            return this.f4874d.F(i);
        }
        throw new NoSuchElementException();
    }
}
