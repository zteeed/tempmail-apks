package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;

final class p1 {

    /* renamed from: d  reason: collision with root package name */
    private static final a f11355d = new a("ExtractorTaskFinder");

    /* renamed from: a  reason: collision with root package name */
    private final m1 f11356a;

    /* renamed from: b  reason: collision with root package name */
    private final b0 f11357b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f11358c;

    p1(m1 m1Var, b0 b0Var, k0 k0Var) {
        this.f11356a = m1Var;
        this.f11357b = b0Var;
        this.f11358c = k0Var;
    }

    private final boolean b(j1 j1Var, k1 k1Var) {
        b0 b0Var = this.f11357b;
        i1 i1Var = j1Var.f11303c;
        String str = i1Var.f11285a;
        return b0Var.w(str, j1Var.f11302b, i1Var.f11286b, k1Var.f11307a).exists();
    }

    private static boolean c(k1 k1Var) {
        int i = k1Var.f11312f;
        return i == 1 || i == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.play.core.assetpacks.a2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.play.core.assetpacks.a2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.play.core.assetpacks.x1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.x1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.play.core.assetpacks.n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: com.google.android.play.core.assetpacks.n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: com.google.android.play.core.assetpacks.x1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: com.google.android.play.core.assetpacks.a2} */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.play.core.assetpacks.o1] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        f11355d.c("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r4.f11301a), r4.f11303c.f11285a);
        r11 = r4.f11301a;
        r8 = r4.f11303c;
        r10 = new com.google.android.play.core.assetpacks.a2(r11, r8.f11285a, r4.f11302b, r8.f11286b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02d0, code lost:
        f11355d.c("Found extraction task for patch for session %s, pack %s, slice %s.", java.lang.Integer.valueOf(r6.f11301a), r6.f11303c.f11285a, r10.f11307a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r11 = r1.f11357b;
        r3 = r6.f11303c;
        r0 = new java.io.FileInputStream(r11.w(r3.f11285a, r6.f11302b, r3.f11286b, r10.f11307a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r3 = r6.f11301a;
        r4 = r6.f11303c;
        r19 = new com.google.android.play.core.assetpacks.s0(r3, r4.f11285a, r6.f11302b, r4.f11286b, r10.f11307a, 0, 0, 1, r4.f11288d, r4.f11287c, r0);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.o1 a() {
        /*
            r33 = this;
            r1 = r33
            com.google.android.play.core.assetpacks.m1 r0 = r1.f11356a     // Catch:{ all -> 0x0433 }
            r0.b()     // Catch:{ all -> 0x0433 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0433 }
            r2.<init>()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.m1 r0 = r1.f11356a     // Catch:{ all -> 0x0433 }
            java.util.Map r0 = r0.k()     // Catch:{ all -> 0x0433 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0433 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0433 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0433 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.j1 r3 = (com.google.android.play.core.assetpacks.j1) r3     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r4 = r3.f11303c     // Catch:{ all -> 0x0433 }
            int r4 = r4.f11287c     // Catch:{ all -> 0x0433 }
            boolean r4 = com.google.android.play.core.assetpacks.w1.h(r4)     // Catch:{ all -> 0x0433 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0433 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0433 }
            if (r0 != 0) goto L_0x042c
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0433 }
        L_0x003e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0433 }
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.j1 r4 = (com.google.android.play.core.assetpacks.j1) r4     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.b0 r8 = r1.f11357b     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ IOException -> 0x008d }
            java.lang.String r10 = r9.f11285a     // Catch:{ IOException -> 0x008d }
            int r11 = r4.f11302b     // Catch:{ IOException -> 0x008d }
            long r12 = r9.f11286b     // Catch:{ IOException -> 0x008d }
            int r8 = r8.r(r10, r11, r12)     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ IOException -> 0x008d }
            java.util.List<com.google.android.play.core.assetpacks.k1> r9 = r9.f11289e     // Catch:{ IOException -> 0x008d }
            int r9 = r9.size()     // Catch:{ IOException -> 0x008d }
            if (r8 != r9) goto L_0x003e
            com.google.android.play.core.internal.a r0 = f11355d     // Catch:{ all -> 0x0433 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0433 }
            int r9 = r4.f11301a     // Catch:{ all -> 0x0433 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0433 }
            r8[r7] = r9     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r9.f11285a     // Catch:{ all -> 0x0433 }
            r8[r6] = r9     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.c(r9, r8)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.a2 r0 = new com.google.android.play.core.assetpacks.a2     // Catch:{ all -> 0x0433 }
            int r11 = r4.f11301a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r8 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r12 = r8.f11285a     // Catch:{ all -> 0x0433 }
            int r13 = r4.f11302b     // Catch:{ all -> 0x0433 }
            long r14 = r8.f11286b     // Catch:{ all -> 0x0433 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x0433 }
            goto L_0x00ad
        L_0x008d:
            r0 = move-exception
            com.google.android.play.core.assetpacks.v0 r2 = new com.google.android.play.core.assetpacks.v0     // Catch:{ all -> 0x0433 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0433 }
            int r5 = r4.f11301a     // Catch:{ all -> 0x0433 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0433 }
            r3[r7] = r5     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r5 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r5 = r5.f11285a     // Catch:{ all -> 0x0433 }
            r3[r6] = r5     // Catch:{ all -> 0x0433 }
            java.lang.String r5 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x0433 }
            int r4 = r4.f11301a     // Catch:{ all -> 0x0433 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0433 }
            throw r2     // Catch:{ all -> 0x0433 }
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 != 0) goto L_0x0426
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0433 }
        L_0x00b3:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0433 }
            r8 = 3
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.j1 r4 = (com.google.android.play.core.assetpacks.j1) r4     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ all -> 0x0433 }
            int r9 = r9.f11287c     // Catch:{ all -> 0x0433 }
            boolean r9 = com.google.android.play.core.assetpacks.w1.h(r9)     // Catch:{ all -> 0x0433 }
            if (r9 == 0) goto L_0x00b3
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.util.List<com.google.android.play.core.assetpacks.k1> r9 = r9.f11289e     // Catch:{ all -> 0x0433 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0433 }
        L_0x00d2:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0433 }
            if (r10 == 0) goto L_0x00b3
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.k1 r10 = (com.google.android.play.core.assetpacks.k1) r10     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.b0 r11 = r1.f11357b     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r12 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r13 = r12.f11285a     // Catch:{ all -> 0x0433 }
            int r14 = r4.f11302b     // Catch:{ all -> 0x0433 }
            long r5 = r12.f11286b     // Catch:{ all -> 0x0433 }
            java.lang.String r15 = r10.f11307a     // Catch:{ all -> 0x0433 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.k(r12, r13, r14, r16)     // Catch:{ all -> 0x0433 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0433 }
            if (r5 == 0) goto L_0x0134
            com.google.android.play.core.internal.a r0 = f11355d     // Catch:{ all -> 0x0433 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0433 }
            int r6 = r4.f11301a     // Catch:{ all -> 0x0433 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0433 }
            r5[r7] = r6     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r6 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r6 = r6.f11285a     // Catch:{ all -> 0x0433 }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x0433 }
            java.lang.String r6 = r10.f11307a     // Catch:{ all -> 0x0433 }
            r9 = 2
            r5[r9] = r6     // Catch:{ all -> 0x0433 }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.c(r6, r5)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.x1 r0 = new com.google.android.play.core.assetpacks.x1     // Catch:{ all -> 0x0433 }
            int r5 = r4.f11301a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r6 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r6.f11285a     // Catch:{ all -> 0x0433 }
            int r4 = r4.f11302b     // Catch:{ all -> 0x0433 }
            long r11 = r6.f11286b     // Catch:{ all -> 0x0433 }
            java.lang.String r6 = r10.f11307a     // Catch:{ all -> 0x0433 }
            r19 = r0
            r20 = r5
            r21 = r9
            r22 = r4
            r23 = r11
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0433 }
            goto L_0x0138
        L_0x0134:
            r5 = 2
            r6 = 1
            goto L_0x00d2
        L_0x0137:
            r0 = 0
        L_0x0138:
            if (r0 != 0) goto L_0x0426
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0433 }
        L_0x013e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0433 }
            if (r4 == 0) goto L_0x01d8
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.j1 r4 = (com.google.android.play.core.assetpacks.j1) r4     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r5 = r4.f11303c     // Catch:{ all -> 0x0433 }
            int r5 = r5.f11287c     // Catch:{ all -> 0x0433 }
            boolean r5 = com.google.android.play.core.assetpacks.w1.h(r5)     // Catch:{ all -> 0x0433 }
            if (r5 == 0) goto L_0x013e
            com.google.android.play.core.assetpacks.i1 r5 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.util.List<com.google.android.play.core.assetpacks.k1> r5 = r5.f11289e     // Catch:{ all -> 0x0433 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0433 }
        L_0x015c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0433 }
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.k1 r6 = (com.google.android.play.core.assetpacks.k1) r6     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.k2 r16 = new com.google.android.play.core.assetpacks.k2     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.b0 r10 = r1.f11357b     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r11 = r9.f11285a     // Catch:{ all -> 0x0433 }
            int r12 = r4.f11302b     // Catch:{ all -> 0x0433 }
            long r13 = r9.f11286b     // Catch:{ all -> 0x0433 }
            java.lang.String r15 = r6.f11307a     // Catch:{ all -> 0x0433 }
            r9 = r16
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x0433 }
            boolean r9 = r16.k()     // Catch:{ all -> 0x0433 }
            if (r9 == 0) goto L_0x015c
            com.google.android.play.core.assetpacks.b0 r10 = r1.f11357b     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r11 = r9.f11285a     // Catch:{ all -> 0x0433 }
            int r12 = r4.f11302b     // Catch:{ all -> 0x0433 }
            long r13 = r9.f11286b     // Catch:{ all -> 0x0433 }
            java.lang.String r15 = r6.f11307a     // Catch:{ all -> 0x0433 }
            java.io.File r9 = r10.c(r11, r12, r13, r15)     // Catch:{ all -> 0x0433 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0433 }
            if (r9 == 0) goto L_0x015c
            com.google.android.play.core.internal.a r0 = f11355d     // Catch:{ all -> 0x0433 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0433 }
            int r9 = r4.f11301a     // Catch:{ all -> 0x0433 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0433 }
            r5[r7] = r9     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r9.f11285a     // Catch:{ all -> 0x0433 }
            r10 = 1
            r5[r10] = r9     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r6.f11307a     // Catch:{ all -> 0x0433 }
            r10 = 2
            r5[r10] = r9     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.c(r9, r5)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.n2 r0 = new com.google.android.play.core.assetpacks.n2     // Catch:{ all -> 0x0433 }
            int r5 = r4.f11301a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r4.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r10 = r9.f11285a     // Catch:{ all -> 0x0433 }
            int r4 = r4.f11302b     // Catch:{ all -> 0x0433 }
            long r11 = r9.f11286b     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r6.f11307a     // Catch:{ all -> 0x0433 }
            java.lang.String r13 = r6.f11308b     // Catch:{ all -> 0x0433 }
            long r14 = r6.f11309c     // Catch:{ all -> 0x0433 }
            r19 = r0
            r20 = r5
            r21 = r10
            r22 = r4
            r23 = r11
            r25 = r9
            r26 = r13
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ all -> 0x0433 }
            goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            if (r0 != 0) goto L_0x0426
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0433 }
        L_0x01df:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0433 }
            r5 = 4
            if (r0 == 0) goto L_0x0361
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0433 }
            r6 = r0
            com.google.android.play.core.assetpacks.j1 r6 = (com.google.android.play.core.assetpacks.j1) r6     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r0 = r6.f11303c     // Catch:{ all -> 0x0433 }
            int r0 = r0.f11287c     // Catch:{ all -> 0x0433 }
            boolean r0 = com.google.android.play.core.assetpacks.w1.h(r0)     // Catch:{ all -> 0x0433 }
            if (r0 == 0) goto L_0x01df
            com.google.android.play.core.assetpacks.i1 r0 = r6.f11303c     // Catch:{ all -> 0x0433 }
            java.util.List<com.google.android.play.core.assetpacks.k1> r0 = r0.f11289e     // Catch:{ all -> 0x0433 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0433 }
        L_0x01ff:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0433 }
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0433 }
            r10 = r0
            com.google.android.play.core.assetpacks.k1 r10 = (com.google.android.play.core.assetpacks.k1) r10     // Catch:{ all -> 0x0433 }
            boolean r0 = c(r10)     // Catch:{ all -> 0x0433 }
            if (r0 != 0) goto L_0x02c8
            com.google.android.play.core.assetpacks.k2 r0 = new com.google.android.play.core.assetpacks.k2     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.b0 r11 = r1.f11357b     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r12 = r6.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r13 = r12.f11285a     // Catch:{ all -> 0x0433 }
            int r14 = r6.f11302b     // Catch:{ all -> 0x0433 }
            r16 = r4
            long r3 = r12.f11286b     // Catch:{ all -> 0x0433 }
            java.lang.String r12 = r10.f11307a     // Catch:{ all -> 0x0433 }
            r19 = r0
            r20 = r11
            r21 = r13
            r22 = r14
            r23 = r3
            r25 = r12
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0433 }
            int r0 = r0.j()     // Catch:{ IOException -> 0x0236 }
            goto L_0x0245
        L_0x0236:
            r0 = move-exception
            r3 = r0
            com.google.android.play.core.internal.a r0 = f11355d     // Catch:{ all -> 0x0433 }
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0433 }
            r11[r7] = r3     // Catch:{ all -> 0x0433 }
            java.lang.String r3 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.e(r3, r11)     // Catch:{ all -> 0x0433 }
            r0 = 0
        L_0x0245:
            r3 = -1
            if (r0 == r3) goto L_0x02c4
            java.util.List<com.google.android.play.core.assetpacks.h1> r3 = r10.f11310d     // Catch:{ all -> 0x0433 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.h1 r3 = (com.google.android.play.core.assetpacks.h1) r3     // Catch:{ all -> 0x0433 }
            boolean r3 = r3.f11272a     // Catch:{ all -> 0x0433 }
            if (r3 == 0) goto L_0x02c4
            com.google.android.play.core.internal.a r3 = f11355d     // Catch:{ all -> 0x0433 }
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0433 }
            int r9 = r10.f11311e     // Catch:{ all -> 0x0433 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0433 }
            r4[r7] = r9     // Catch:{ all -> 0x0433 }
            int r9 = r6.f11301a     // Catch:{ all -> 0x0433 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0433 }
            r11 = 1
            r4[r11] = r9     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r6.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r9.f11285a     // Catch:{ all -> 0x0433 }
            r11 = 2
            r4[r11] = r9     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r10.f11307a     // Catch:{ all -> 0x0433 }
            r4[r8] = r9     // Catch:{ all -> 0x0433 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0433 }
            r4[r5] = r9     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.c(r9, r4)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.k0 r3 = r1.f11358c     // Catch:{ all -> 0x0433 }
            int r4 = r6.f11301a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r6.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r9.f11285a     // Catch:{ all -> 0x0433 }
            java.lang.String r11 = r10.f11307a     // Catch:{ all -> 0x0433 }
            java.io.InputStream r32 = r3.a(r4, r9, r11, r0)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.s0 r3 = new com.google.android.play.core.assetpacks.s0     // Catch:{ all -> 0x0433 }
            int r4 = r6.f11301a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r9 = r6.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r11 = r9.f11285a     // Catch:{ all -> 0x0433 }
            int r12 = r6.f11302b     // Catch:{ all -> 0x0433 }
            long r13 = r9.f11286b     // Catch:{ all -> 0x0433 }
            java.lang.String r9 = r10.f11307a     // Catch:{ all -> 0x0433 }
            int r15 = r10.f11311e     // Catch:{ all -> 0x0433 }
            java.util.List<com.google.android.play.core.assetpacks.h1> r10 = r10.f11310d     // Catch:{ all -> 0x0433 }
            int r28 = r10.size()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r6 = r6.f11303c     // Catch:{ all -> 0x0433 }
            long r7 = r6.f11288d     // Catch:{ all -> 0x0433 }
            int r6 = r6.f11287c     // Catch:{ all -> 0x0433 }
            r19 = r3
            r20 = r4
            r21 = r11
            r22 = r12
            r23 = r13
            r25 = r9
            r26 = r15
            r27 = r0
            r29 = r7
            r31 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0433 }
            r15 = r3
            goto L_0x0362
        L_0x02c4:
            r4 = r16
            goto L_0x01ff
        L_0x02c8:
            r16 = r4
            boolean r0 = r1.b(r6, r10)     // Catch:{ all -> 0x0433 }
            if (r0 == 0) goto L_0x035b
            com.google.android.play.core.internal.a r0 = f11355d     // Catch:{ all -> 0x0433 }
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0433 }
            int r3 = r6.f11301a     // Catch:{ all -> 0x0433 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0433 }
            r7 = 0
            r4[r7] = r3     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r3 = r6.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r3 = r3.f11285a     // Catch:{ all -> 0x0433 }
            r7 = 1
            r4[r7] = r3     // Catch:{ all -> 0x0433 }
            java.lang.String r3 = r10.f11307a     // Catch:{ all -> 0x0433 }
            r7 = 2
            r4[r7] = r3     // Catch:{ all -> 0x0433 }
            java.lang.String r3 = "Found extraction task for patch for session %s, pack %s, slice %s."
            r0.c(r3, r4)     // Catch:{ all -> 0x0433 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0334 }
            com.google.android.play.core.assetpacks.b0 r11 = r1.f11357b     // Catch:{ FileNotFoundException -> 0x0334 }
            com.google.android.play.core.assetpacks.i1 r3 = r6.f11303c     // Catch:{ FileNotFoundException -> 0x0334 }
            java.lang.String r12 = r3.f11285a     // Catch:{ FileNotFoundException -> 0x0334 }
            int r13 = r6.f11302b     // Catch:{ FileNotFoundException -> 0x0334 }
            long r14 = r3.f11286b     // Catch:{ FileNotFoundException -> 0x0334 }
            java.lang.String r3 = r10.f11307a     // Catch:{ FileNotFoundException -> 0x0334 }
            r16 = r3
            java.io.File r3 = r11.w(r12, r13, r14, r16)     // Catch:{ FileNotFoundException -> 0x0334 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0334 }
            com.google.android.play.core.assetpacks.s0 r15 = new com.google.android.play.core.assetpacks.s0     // Catch:{ all -> 0x0433 }
            int r3 = r6.f11301a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r4 = r6.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r7 = r4.f11285a     // Catch:{ all -> 0x0433 }
            int r6 = r6.f11302b     // Catch:{ all -> 0x0433 }
            long r8 = r4.f11286b     // Catch:{ all -> 0x0433 }
            java.lang.String r10 = r10.f11307a     // Catch:{ all -> 0x0433 }
            long r11 = r4.f11288d     // Catch:{ all -> 0x0433 }
            r26 = 0
            r27 = 0
            r28 = 1
            int r4 = r4.f11287c     // Catch:{ all -> 0x0433 }
            r19 = r15
            r20 = r3
            r21 = r7
            r22 = r6
            r23 = r8
            r25 = r10
            r29 = r11
            r31 = r4
            r32 = r0
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0433 }
            goto L_0x0362
        L_0x0334:
            r0 = move-exception
            com.google.android.play.core.assetpacks.v0 r2 = new com.google.android.play.core.assetpacks.v0     // Catch:{ all -> 0x0433 }
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0433 }
            int r4 = r6.f11301a     // Catch:{ all -> 0x0433 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0433 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r4 = r6.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r4 = r4.f11285a     // Catch:{ all -> 0x0433 }
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x0433 }
            java.lang.String r4 = r10.f11307a     // Catch:{ all -> 0x0433 }
            r5 = 2
            r3[r5] = r4     // Catch:{ all -> 0x0433 }
            java.lang.String r4 = "Error finding patch, session %s packName %s sliceId %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0433 }
            int r4 = r6.f11301a     // Catch:{ all -> 0x0433 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0433 }
            throw r2     // Catch:{ all -> 0x0433 }
        L_0x035b:
            r4 = r16
            r7 = 0
            r8 = 3
            goto L_0x01ff
        L_0x0361:
            r15 = 0
        L_0x0362:
            if (r15 != 0) goto L_0x0420
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0433 }
        L_0x0368:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0433 }
            if (r2 == 0) goto L_0x0415
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.j1 r2 = (com.google.android.play.core.assetpacks.j1) r2     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r3 = r2.f11303c     // Catch:{ all -> 0x0433 }
            int r3 = r3.f11287c     // Catch:{ all -> 0x0433 }
            boolean r3 = com.google.android.play.core.assetpacks.w1.h(r3)     // Catch:{ all -> 0x0433 }
            if (r3 == 0) goto L_0x0368
            com.google.android.play.core.assetpacks.i1 r3 = r2.f11303c     // Catch:{ all -> 0x0433 }
            java.util.List<com.google.android.play.core.assetpacks.k1> r3 = r3.f11289e     // Catch:{ all -> 0x0433 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0433 }
        L_0x0386:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0433 }
            if (r4 == 0) goto L_0x0368
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.k1 r4 = (com.google.android.play.core.assetpacks.k1) r4     // Catch:{ all -> 0x0433 }
            boolean r6 = c(r4)     // Catch:{ all -> 0x0433 }
            if (r6 == 0) goto L_0x0386
            java.util.List<com.google.android.play.core.assetpacks.h1> r6 = r4.f11310d     // Catch:{ all -> 0x0433 }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.h1 r6 = (com.google.android.play.core.assetpacks.h1) r6     // Catch:{ all -> 0x0433 }
            boolean r6 = r6.f11272a     // Catch:{ all -> 0x0433 }
            if (r6 == 0) goto L_0x0386
            boolean r6 = r1.b(r2, r4)     // Catch:{ all -> 0x0433 }
            if (r6 != 0) goto L_0x0386
            com.google.android.play.core.internal.a r0 = f11355d     // Catch:{ all -> 0x0433 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0433 }
            int r5 = r4.f11312f     // Catch:{ all -> 0x0433 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0433 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0433 }
            int r5 = r2.f11301a     // Catch:{ all -> 0x0433 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0433 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r5 = r2.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r5 = r5.f11285a     // Catch:{ all -> 0x0433 }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x0433 }
            java.lang.String r5 = r4.f11307a     // Catch:{ all -> 0x0433 }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x0433 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.c(r5, r3)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.k0 r0 = r1.f11358c     // Catch:{ all -> 0x0433 }
            int r3 = r2.f11301a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r5 = r2.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r5 = r5.f11285a     // Catch:{ all -> 0x0433 }
            java.lang.String r6 = r4.f11307a     // Catch:{ all -> 0x0433 }
            r9 = 0
            java.io.InputStream r23 = r0.a(r3, r5, r6, r9)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.g2 r0 = new com.google.android.play.core.assetpacks.g2     // Catch:{ all -> 0x0433 }
            int r11 = r2.f11301a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r3 = r2.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r12 = r3.f11285a     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.b0 r3 = r1.f11357b     // Catch:{ all -> 0x0433 }
            int r13 = r3.u(r12)     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.b0 r3 = r1.f11357b     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r5 = r2.f11303c     // Catch:{ all -> 0x0433 }
            java.lang.String r5 = r5.f11285a     // Catch:{ all -> 0x0433 }
            long r14 = r3.x(r5)     // Catch:{ all -> 0x0433 }
            int r3 = r2.f11302b     // Catch:{ all -> 0x0433 }
            com.google.android.play.core.assetpacks.i1 r2 = r2.f11303c     // Catch:{ all -> 0x0433 }
            long r5 = r2.f11286b     // Catch:{ all -> 0x0433 }
            int r2 = r4.f11312f     // Catch:{ all -> 0x0433 }
            java.lang.String r7 = r4.f11307a     // Catch:{ all -> 0x0433 }
            long r8 = r4.f11309c     // Catch:{ all -> 0x0433 }
            r10 = r0
            r16 = r3
            r17 = r5
            r19 = r2
            r20 = r7
            r21 = r8
            r10.<init>(r11, r12, r13, r14, r16, r17, r19, r20, r21, r23)     // Catch:{ all -> 0x0433 }
            r15 = r0
            goto L_0x0416
        L_0x0415:
            r15 = 0
        L_0x0416:
            com.google.android.play.core.assetpacks.m1 r0 = r1.f11356a
            r0.f()
            if (r15 != 0) goto L_0x041f
            r2 = 0
            return r2
        L_0x041f:
            return r15
        L_0x0420:
            com.google.android.play.core.assetpacks.m1 r0 = r1.f11356a
            r0.f()
            return r15
        L_0x0426:
            com.google.android.play.core.assetpacks.m1 r2 = r1.f11356a
            r2.f()
            return r0
        L_0x042c:
            com.google.android.play.core.assetpacks.m1 r0 = r1.f11356a
            r0.f()
            r2 = 0
            return r2
        L_0x0433:
            r0 = move-exception
            com.google.android.play.core.assetpacks.m1 r2 = r1.f11356a
            r2.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.p1.a():com.google.android.play.core.assetpacks.o1");
    }
}
