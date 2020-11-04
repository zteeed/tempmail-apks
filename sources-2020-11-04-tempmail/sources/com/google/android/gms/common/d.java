package com.google.android.gms.common;

import java.util.Arrays;

final class d extends c {

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f3109c;

    d(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f3109c = bArr;
    }

    /* access modifiers changed from: package-private */
    public final byte[] V() {
        return this.f3109c;
    }
}
