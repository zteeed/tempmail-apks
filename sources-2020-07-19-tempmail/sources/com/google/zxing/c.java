package com.google.zxing;

import com.google.zxing.t.a;
import com.google.zxing.t.b;

/* compiled from: BinaryBitmap */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f11652a;

    /* renamed from: b  reason: collision with root package name */
    private b f11653b;

    public c(b bVar) {
        if (bVar != null) {
            this.f11652a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public b a() throws NotFoundException {
        if (this.f11653b == null) {
            this.f11653b = this.f11652a.b();
        }
        return this.f11653b;
    }

    public a b(int i, a aVar) throws NotFoundException {
        return this.f11652a.c(i, aVar);
    }

    public int c() {
        return this.f11652a.d();
    }

    public int d() {
        return this.f11652a.f();
    }

    public boolean e() {
        return this.f11652a.e().f();
    }

    public c f() {
        return new c(this.f11652a.a(this.f11652a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
