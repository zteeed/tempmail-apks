package com.google.zxing.x.e;

/* compiled from: DetectionResultColumn */
class g {

    /* renamed from: a  reason: collision with root package name */
    private final c f12006a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f12007b;

    g(c cVar) {
        this.f12006a = new c(cVar);
        this.f12007b = new d[((cVar.e() - cVar.g()) + 1)];
    }

    /* access modifiers changed from: package-private */
    public final c a() {
        return this.f12006a;
    }

    /* access modifiers changed from: package-private */
    public final d b(int i) {
        return this.f12007b[e(i)];
    }

    /* access modifiers changed from: package-private */
    public final d c(int i) {
        d dVar;
        d dVar2;
        d b2 = b(i);
        if (b2 != null) {
            return b2;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e2 = e(i) - i2;
            if (e2 >= 0 && (dVar2 = this.f12007b[e2]) != null) {
                return dVar2;
            }
            int e3 = e(i) + i2;
            d[] dVarArr = this.f12007b;
            if (e3 < dVarArr.length && (dVar = dVarArr[e3]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final d[] d() {
        return this.f12007b;
    }

    /* access modifiers changed from: package-private */
    public final int e(int i) {
        return i - this.f12006a.g();
    }

    /* access modifiers changed from: package-private */
    public final void f(int i, d dVar) {
        this.f12007b[e(i)] = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            com.google.zxing.x.e.d[] r1 = r11.f12007b     // Catch:{ all -> 0x0054 }
            int r2 = r1.length     // Catch:{ all -> 0x0054 }
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x004c
            r6 = r1[r4]     // Catch:{ all -> 0x0054 }
            r7 = 1
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0054 }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r7[r3] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0054 }
            r5 = r8
            goto L_0x0049
        L_0x0023:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0054 }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r3] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.c()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r7] = r5     // Catch:{ all -> 0x0054 }
            r5 = 2
            int r6 = r6.e()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0054 }
            r9[r5] = r6     // Catch:{ all -> 0x0054 }
            r0.format(r8, r9)     // Catch:{ all -> 0x0054 }
            r5 = r10
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x004c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0054 }
            r0.close()
            return r1
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x005f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.x.e.g.toString():java.lang.String");
    }
}
