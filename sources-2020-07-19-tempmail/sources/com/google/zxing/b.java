package com.google.zxing;

import com.google.zxing.t.a;

/* compiled from: Binarizer */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final h f11651a;

    protected b(h hVar) {
        this.f11651a = hVar;
    }

    public abstract b a(h hVar);

    public abstract com.google.zxing.t.b b() throws NotFoundException;

    public abstract a c(int i, a aVar) throws NotFoundException;

    public final int d() {
        return this.f11651a.a();
    }

    public final h e() {
        return this.f11651a;
    }

    public final int f() {
        return this.f11651a.d();
    }
}
