package com.google.zxing.u.c;

import com.google.zxing.FormatException;

/* compiled from: Version */
public final class e {
    private static final e[] h = a();

    /* renamed from: a  reason: collision with root package name */
    private final int f11828a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11829b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11830c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11831d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11832e;

    /* renamed from: f  reason: collision with root package name */
    private final c f11833f;
    private final int g;

    /* compiled from: Version */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f11834a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11835b;

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f11834a;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f11835b;
        }

        private b(int i, int i2) {
            this.f11834a = i;
            this.f11835b = i2;
        }
    }

    private e(int i, int i2, int i3, int i4, int i5, c cVar) {
        this.f11828a = i;
        this.f11829b = i2;
        this.f11830c = i3;
        this.f11831d = i4;
        this.f11832e = i5;
        this.f11833f = cVar;
        int b2 = cVar.b();
        int i6 = 0;
        for (b bVar : cVar.a()) {
            i6 += bVar.a() * (bVar.b() + b2);
        }
        this.g = i6;
    }

    private static e[] a() {
        return new e[]{new e(1, 10, 10, 8, 8, new c(5, new b(1, 3))), new e(2, 12, 12, 10, 10, new c(7, new b(1, 5))), new e(3, 14, 14, 12, 12, new c(10, new b(1, 8))), new e(4, 16, 16, 14, 14, new c(12, new b(1, 12))), new e(5, 18, 18, 16, 16, new c(14, new b(1, 18))), new e(6, 20, 20, 18, 18, new c(18, new b(1, 22))), new e(7, 22, 22, 20, 20, new c(20, new b(1, 30))), new e(8, 24, 24, 22, 22, new c(24, new b(1, 36))), new e(9, 26, 26, 24, 24, new c(28, new b(1, 44))), new e(10, 32, 32, 14, 14, new c(36, new b(1, 62))), new e(11, 36, 36, 16, 16, new c(42, new b(1, 86))), new e(12, 40, 40, 18, 18, new c(48, new b(1, 114))), new e(13, 44, 44, 20, 20, new c(56, new b(1, 144))), new e(14, 48, 48, 22, 22, new c(68, new b(1, 174))), new e(15, 52, 52, 24, 24, new c(42, new b(2, 102))), new e(16, 64, 64, 14, 14, new c(56, new b(2, 140))), new e(17, 72, 72, 16, 16, new c(36, new b(4, 92))), new e(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new e(19, 88, 88, 20, 20, new c(56, new b(4, 144))), new e(20, 96, 96, 22, 22, new c(68, new b(4, 174))), new e(21, 104, 104, 24, 24, new c(56, new b(6, 136))), new e(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new e(23, 132, 132, 20, 20, new c(62, new b(8, 163))), new e(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(2, 155))), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static e h(int i, int i2) throws FormatException {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (e eVar : h) {
                if (eVar.f11829b == i && eVar.f11830c == i2) {
                    return eVar;
                }
            }
            throw FormatException.a();
        }
        throw FormatException.a();
    }

    public int b() {
        return this.f11832e;
    }

    public int c() {
        return this.f11831d;
    }

    /* access modifiers changed from: package-private */
    public c d() {
        return this.f11833f;
    }

    public int e() {
        return this.f11830c;
    }

    public int f() {
        return this.f11829b;
    }

    public int g() {
        return this.g;
    }

    public int i() {
        return this.f11828a;
    }

    public String toString() {
        return String.valueOf(this.f11828a);
    }

    /* compiled from: Version */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f11836a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f11837b;

        /* access modifiers changed from: package-private */
        public b[] a() {
            return this.f11837b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f11836a;
        }

        private c(int i, b bVar) {
            this.f11836a = i;
            this.f11837b = new b[]{bVar};
        }

        private c(int i, b bVar, b bVar2) {
            this.f11836a = i;
            this.f11837b = new b[]{bVar, bVar2};
        }
    }
}
