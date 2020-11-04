package com.google.zxing;

import com.google.zxing.t.a;
import com.google.zxing.t.b;

/* compiled from: BinaryBitmap */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f12201a;

    /* renamed from: b  reason: collision with root package name */
    private b f12202b;

    public c(b bVar) {
        if (bVar != null) {
            this.f12201a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public b a() throws NotFoundException {
        if (this.f12202b == null) {
            this.f12202b = this.f12201a.b();
        }
        return this.f12202b;
    }

    public a b(int i, a aVar) throws NotFoundException {
        return this.f12201a.c(i, aVar);
    }

    public int c() {
        return this.f12201a.d();
    }

    public int d() {
        return this.f12201a.f();
    }

    public boolean e() {
        return this.f12201a.e().f();
    }

    public c f() {
        return new c(this.f12201a.a(this.f12201a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
