package com.google.zxing.w;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.m;
import com.google.zxing.t.a;

/* compiled from: UPCEANExtensionSupport */
final class x {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f12512c = {1, 1, 2};

    /* renamed from: a  reason: collision with root package name */
    private final v f12513a = new v();

    /* renamed from: b  reason: collision with root package name */
    private final w f12514b = new w();

    x() {
    }

    /* access modifiers changed from: package-private */
    public m a(int i, a aVar, int i2) throws NotFoundException {
        int[] o = y.o(aVar, i2, false, f12512c);
        try {
            return this.f12514b.b(i, aVar, o);
        } catch (ReaderException unused) {
            return this.f12513a.b(i, aVar, o);
        }
    }
}
