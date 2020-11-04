package com.google.zxing.u.e;

import com.google.zxing.e;

/* compiled from: SymbolInfo */
public class k {
    private static k[] i = {new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12406a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12407b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12408c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12409d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12410e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12411f;
    private final int g;
    private final int h;

    public k(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    private int e() {
        int i2 = this.f12411f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (!(i2 == 2 || i2 == 4)) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    private int k() {
        int i2 = this.f12411f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static k l(int i2, l lVar, e eVar, e eVar2, boolean z) {
        for (k kVar : i) {
            if ((lVar != l.FORCE_SQUARE || !kVar.f12406a) && ((lVar != l.FORCE_RECTANGLE || kVar.f12406a) && ((eVar == null || (kVar.j() >= eVar.b() && kVar.i() >= eVar.a())) && ((eVar2 == null || (kVar.j() <= eVar2.b() && kVar.i() <= eVar2.a())) && i2 <= kVar.f12407b)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
    }

    public final int a() {
        return this.f12407b;
    }

    public int b(int i2) {
        return this.g;
    }

    public final int c() {
        return this.f12408c;
    }

    public final int d(int i2) {
        return this.h;
    }

    public int f() {
        return this.f12407b / this.g;
    }

    public final int g() {
        return k() * this.f12410e;
    }

    public final int h() {
        return e() * this.f12409d;
    }

    public final int i() {
        return g() + (k() << 1);
    }

    public final int j() {
        return h() + (e() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12406a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f12409d);
        sb.append('x');
        sb.append(this.f12410e);
        sb.append(", symbol size ");
        sb.append(j());
        sb.append('x');
        sb.append(i());
        sb.append(", symbol data size ");
        sb.append(h());
        sb.append('x');
        sb.append(g());
        sb.append(", codewords ");
        sb.append(this.f12407b);
        sb.append('+');
        sb.append(this.f12408c);
        return sb.toString();
    }

    k(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f12406a = z;
        this.f12407b = i2;
        this.f12408c = i3;
        this.f12409d = i4;
        this.f12410e = i5;
        this.f12411f = i6;
        this.g = i7;
        this.h = i8;
    }
}
