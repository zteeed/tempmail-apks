package com.google.zxing.x.e;

/* compiled from: DetectionResult */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f12551a;

    /* renamed from: b  reason: collision with root package name */
    private final g[] f12552b;

    /* renamed from: c  reason: collision with root package name */
    private c f12553c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12554d;

    f(a aVar, c cVar) {
        this.f12551a = aVar;
        int a2 = aVar.a();
        this.f12554d = a2;
        this.f12553c = cVar;
        this.f12552b = new g[(a2 + 2)];
    }

    private void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f12551a);
        }
    }

    private static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    private static int c(int i, int i2, d dVar) {
        if (dVar == null || dVar.g()) {
            return i2;
        }
        if (!dVar.h(i)) {
            return i2 + 1;
        }
        dVar.i(i);
        return 0;
    }

    private int d() {
        int f2 = f();
        if (f2 == 0) {
            return 0;
        }
        for (int i = 1; i < this.f12554d + 1; i++) {
            d[] d2 = this.f12552b[i].d();
            for (int i2 = 0; i2 < d2.length; i2++) {
                if (d2[i2] != null && !d2[i2].g()) {
                    e(i, i2, d2);
                }
            }
        }
        return f2;
    }

    private void e(int i, int i2, d[] dVarArr) {
        d dVar = dVarArr[i2];
        d[] d2 = this.f12552b[i - 1].d();
        g[] gVarArr = this.f12552b;
        int i3 = i + 1;
        d[] d3 = gVarArr[i3] != null ? gVarArr[i3].d() : d2;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d2[i2];
        dVarArr2[3] = d3[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = d2[i5];
            dVarArr2[5] = d3[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = d2[i6];
            dVarArr2[11] = d3[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = d2[i7];
            dVarArr2[7] = d3[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = d2[i8];
            dVarArr2[13] = d3[i8];
        }
        while (i4 < 14 && !b(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        g[] gVarArr = this.f12552b;
        if (gVarArr[0] != null && gVarArr[this.f12554d + 1] != null) {
            d[] d2 = gVarArr[0].d();
            d[] d3 = this.f12552b[this.f12554d + 1].d();
            for (int i = 0; i < d2.length; i++) {
                if (!(d2[i] == null || d3[i] == null || d2[i].c() != d3[i].c())) {
                    for (int i2 = 1; i2 <= this.f12554d; i2++) {
                        d dVar = this.f12552b[i2].d()[i];
                        if (dVar != null) {
                            dVar.i(d2[i].c());
                            if (!dVar.g()) {
                                this.f12552b[i2].d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    private int h() {
        g[] gVarArr = this.f12552b;
        if (gVarArr[0] == null) {
            return 0;
        }
        d[] d2 = gVarArr[0].d();
        int i = 0;
        for (int i2 = 0; i2 < d2.length; i2++) {
            if (d2[i2] != null) {
                int c2 = d2[i2].c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f12554d + 1 && i3 < 2; i4++) {
                    d dVar = this.f12552b[i4].d()[i2];
                    if (dVar != null) {
                        i3 = c(c2, i3, dVar);
                        if (!dVar.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    private int i() {
        g[] gVarArr = this.f12552b;
        int i = this.f12554d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        d[] d2 = gVarArr[i + 1].d();
        int i2 = 0;
        for (int i3 = 0; i3 < d2.length; i3++) {
            if (d2[i3] != null) {
                int c2 = d2[i3].c();
                int i4 = 0;
                for (int i5 = this.f12554d + 1; i5 > 0 && i4 < 2; i5--) {
                    d dVar = this.f12552b[i5].d()[i3];
                    if (dVar != null) {
                        i4 = c(c2, i4, dVar);
                        if (!dVar.g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f12554d;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f12551a.b();
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f12551a.c();
    }

    /* access modifiers changed from: package-private */
    public c m() {
        return this.f12553c;
    }

    /* access modifiers changed from: package-private */
    public g n(int i) {
        return this.f12552b[i];
    }

    /* access modifiers changed from: package-private */
    public g[] o() {
        a(this.f12552b[0]);
        a(this.f12552b[this.f12554d + 1]);
        int i = 928;
        while (true) {
            int d2 = d();
            if (d2 > 0 && d2 < i) {
                i = d2;
            }
        }
        return this.f12552b;
    }

    /* access modifiers changed from: package-private */
    public void p(c cVar) {
        this.f12553c = cVar;
    }

    /* access modifiers changed from: package-private */
    public void q(int i, g gVar) {
        this.f12552b[i] = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            com.google.zxing.x.e.g[] r0 = r10.f12552b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f12554d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = 0
        L_0x0013:
            com.google.zxing.x.e.d[] r5 = r2.d()     // Catch:{ all -> 0x007e }
            int r5 = r5.length     // Catch:{ all -> 0x007e }
            if (r4 >= r5) goto L_0x0076
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007e }
            r6[r1] = r7     // Catch:{ all -> 0x007e }
            r0.format(r5, r6)     // Catch:{ all -> 0x007e }
            r5 = 0
        L_0x0028:
            int r6 = r10.f12554d     // Catch:{ all -> 0x007e }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x006c
            com.google.zxing.x.e.g[] r6 = r10.f12552b     // Catch:{ all -> 0x007e }
            r6 = r6[r5]     // Catch:{ all -> 0x007e }
            java.lang.String r8 = "    |   "
            if (r6 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r0.format(r8, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0069
        L_0x003c:
            com.google.zxing.x.e.g[] r6 = r10.f12552b     // Catch:{ all -> 0x007e }
            r6 = r6[r5]     // Catch:{ all -> 0x007e }
            com.google.zxing.x.e.d[] r6 = r6.d()     // Catch:{ all -> 0x007e }
            r6 = r6[r4]     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x004e
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r0.format(r8, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0069
        L_0x004e:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007e }
            int r9 = r6.c()     // Catch:{ all -> 0x007e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007e }
            r7[r1] = r9     // Catch:{ all -> 0x007e }
            int r6 = r6.e()     // Catch:{ all -> 0x007e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007e }
            r7[r3] = r6     // Catch:{ all -> 0x007e }
            r0.format(r8, r7)     // Catch:{ all -> 0x007e }
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x006c:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007e }
            r0.format(r5, r6)     // Catch:{ all -> 0x007e }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0076:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007e }
            r0.close()
            return r1
        L_0x007e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0089:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.x.e.f.toString():java.lang.String");
    }
}
