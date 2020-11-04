package com.google.zxing.x.e;

import com.google.zxing.NotFoundException;
import com.google.zxing.o;
import com.google.zxing.t.b;

/* compiled from: BoundingBox */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f12531a;

    /* renamed from: b  reason: collision with root package name */
    private final o f12532b;

    /* renamed from: c  reason: collision with root package name */
    private final o f12533c;

    /* renamed from: d  reason: collision with root package name */
    private final o f12534d;

    /* renamed from: e  reason: collision with root package name */
    private final o f12535e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12536f;
    private final int g;
    private final int h;
    private final int i;

    c(b bVar, o oVar, o oVar2, o oVar3, o oVar4) throws NotFoundException {
        boolean z = false;
        boolean z2 = oVar == null || oVar2 == null;
        z = (oVar3 == null || oVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                oVar = new o(0.0f, oVar3.d());
                oVar2 = new o(0.0f, oVar4.d());
            } else if (z) {
                oVar3 = new o((float) (bVar.n() - 1), oVar.d());
                oVar4 = new o((float) (bVar.n() - 1), oVar2.d());
            }
            this.f12531a = bVar;
            this.f12532b = oVar;
            this.f12533c = oVar2;
            this.f12534d = oVar3;
            this.f12535e = oVar4;
            this.f12536f = (int) Math.min(oVar.c(), oVar2.c());
            this.g = (int) Math.max(oVar3.c(), oVar4.c());
            this.h = (int) Math.min(oVar.d(), oVar3.d());
            this.i = (int) Math.max(oVar2.d(), oVar4.d());
            return;
        }
        throw NotFoundException.a();
    }

    static c j(c cVar, c cVar2) throws NotFoundException {
        if (cVar == null) {
            return cVar2;
        }
        return cVar2 == null ? cVar : new c(cVar.f12531a, cVar.f12532b, cVar.f12533c, cVar2.f12534d, cVar2.f12535e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.x.e.c a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.o r0 = r12.f12532b
            com.google.zxing.o r1 = r12.f12533c
            com.google.zxing.o r2 = r12.f12534d
            com.google.zxing.o r3 = r12.f12535e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            com.google.zxing.o r13 = new com.google.zxing.o
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            com.google.zxing.o r13 = r12.f12533c
            goto L_0x0034
        L_0x0032:
            com.google.zxing.o r13 = r12.f12535e
        L_0x0034:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.google.zxing.t.b r14 = r12.f12531a
            int r14 = r14.j()
            if (r0 < r14) goto L_0x004a
            com.google.zxing.t.b r14 = r12.f12531a
            int r14 = r14.j()
            int r0 = r14 + -1
        L_0x004a:
            com.google.zxing.o r14 = new com.google.zxing.o
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            com.google.zxing.x.e.c r13 = new com.google.zxing.x.e.c
            com.google.zxing.t.b r7 = r12.f12531a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.x.e.c.a(int, int, boolean):com.google.zxing.x.e.c");
    }

    /* access modifiers changed from: package-private */
    public o b() {
        return this.f12533c;
    }

    /* access modifiers changed from: package-private */
    public o c() {
        return this.f12535e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f12536f;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public o h() {
        return this.f12532b;
    }

    /* access modifiers changed from: package-private */
    public o i() {
        return this.f12534d;
    }

    c(c cVar) {
        this.f12531a = cVar.f12531a;
        this.f12532b = cVar.h();
        this.f12533c = cVar.b();
        this.f12534d = cVar.i();
        this.f12535e = cVar.c();
        this.f12536f = cVar.f();
        this.g = cVar.d();
        this.h = cVar.g();
        this.i = cVar.e();
    }
}
