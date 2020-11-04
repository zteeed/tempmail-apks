package com.google.zxing;

import com.google.zxing.t.a;

/* compiled from: Binarizer */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final h f12200a;

    protected b(h hVar) {
        this.f12200a = hVar;
    }

    public abstract b a(h hVar);

    public abstract com.google.zxing.t.b b() throws NotFoundException;

    public abstract a c(int i, a aVar) throws NotFoundException;

    public final int d() {
        return this.f12200a.a();
    }

    public final h e() {
        return this.f12200a;
    }

    public final int f() {
        return this.f12200a.d();
    }
}
