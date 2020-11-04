package com.google.zxing.r.f;

import com.google.zxing.t.a;
import java.util.LinkedList;

/* compiled from: State */
final class f {

    /* renamed from: e  reason: collision with root package name */
    static final f f12282e = new f(g.f12287b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f12283a;

    /* renamed from: b  reason: collision with root package name */
    private final g f12284b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12285c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12286d;

    private f(g gVar, int i, int i2, int i3) {
        this.f12284b = gVar;
        this.f12283a = i;
        this.f12285c = i2;
        this.f12286d = i3;
    }

    /* access modifiers changed from: package-private */
    public f a(int i) {
        g gVar = this.f12284b;
        int i2 = this.f12283a;
        int i3 = this.f12286d;
        if (i2 == 4 || i2 == 2) {
            int i4 = d.f12276c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f12285c;
        f fVar = new f(gVar, i2, this.f12285c + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return fVar.f12285c == 2078 ? fVar.b(i + 1) : fVar;
    }

    /* access modifiers changed from: package-private */
    public f b(int i) {
        int i2 = this.f12285c;
        if (i2 == 0) {
            return this;
        }
        return new f(this.f12284b.b(i - i2, i2), this.f12283a, 0, this.f12286d);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f12285c;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f12286d;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f12283a;
    }

    /* access modifiers changed from: package-private */
    public boolean f(f fVar) {
        int i;
        int i2 = this.f12286d + (d.f12276c[this.f12283a][fVar.f12283a] >> 16);
        int i3 = fVar.f12285c;
        if (i3 > 0 && ((i = this.f12285c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= fVar.f12286d;
    }

    /* access modifiers changed from: package-private */
    public f g(int i, int i2) {
        int i3 = this.f12286d;
        g gVar = this.f12284b;
        int i4 = this.f12283a;
        if (i != i4) {
            int i5 = d.f12276c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVar = gVar.a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new f(gVar.a(i2, i8), i, 0, i3 + i8);
    }

    /* access modifiers changed from: package-private */
    public f h(int i, int i2) {
        g gVar = this.f12284b;
        int i3 = this.f12283a == 2 ? 4 : 5;
        return new f(gVar.a(d.f12278e[this.f12283a][i], i3).a(i2, 5), this.f12283a, 0, this.f12286d + i3 + 5);
    }

    /* access modifiers changed from: package-private */
    public a i(byte[] bArr) {
        LinkedList<g> linkedList = new LinkedList<>();
        for (g gVar = b(bArr.length).f12284b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        a aVar = new a();
        for (g c2 : linkedList) {
            c2.c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{d.f12275b[this.f12283a], Integer.valueOf(this.f12286d), Integer.valueOf(this.f12285c)});
    }
}
