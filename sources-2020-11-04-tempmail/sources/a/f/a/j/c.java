package a.f.a.j;

import a.f.a.e;

/* compiled from: Chain */
class c {
    static void a(g gVar, e eVar, int i) {
        d[] dVarArr;
        int i2;
        int i3;
        if (i == 0) {
            int i4 = gVar.s0;
            dVarArr = gVar.v0;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            i2 = gVar.t0;
            dVarArr = gVar.u0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            d dVar = dVarArr[i5];
            dVar.a();
            if (!gVar.X0(4)) {
                b(gVar, eVar, i, i3, dVar);
            } else if (!k.b(gVar, eVar, i, i3, dVar)) {
                b(gVar, eVar, i, i3, dVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: a.f.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: a.f.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: a.f.a.j.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: a.f.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: a.f.a.j.f} */
    /* JADX WARNING: type inference failed for: r4v11, types: [a.f.a.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.e0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.f0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0370 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void b(a.f.a.j.g r37, a.f.a.e r38, int r39, int r40, a.f.a.j.d r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            a.f.a.j.f r10 = r1.f189a
            a.f.a.j.f r11 = r1.f191c
            a.f.a.j.f r12 = r1.f190b
            a.f.a.j.f r13 = r1.f192d
            a.f.a.j.f r2 = r1.f193e
            float r3 = r1.k
            a.f.a.j.f r4 = r1.f194f
            a.f.a.j.f r4 = r1.g
            a.f.a.j.f$b[] r4 = r0.C
            r4 = r4[r39]
            a.f.a.j.f$b r5 = a.f.a.j.f.b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r39 != 0) goto L_0x0038
            int r8 = r2.e0
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.e0
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.e0
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f0
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f0
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f0
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r7 = r10
            r15 = r14
            r14 = r8
            r8 = 0
        L_0x0051:
            r21 = 0
            if (r8 != 0) goto L_0x0126
            a.f.a.j.e[] r6 = r7.A
            r6 = r6[r40]
            if (r4 != 0) goto L_0x0061
            if (r5 == 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r23 = 4
            goto L_0x0063
        L_0x0061:
            r23 = 1
        L_0x0063:
            int r24 = r6.d()
            r25 = r3
            a.f.a.j.e r3 = r6.f198d
            if (r3 == 0) goto L_0x0075
            if (r7 == r10) goto L_0x0075
            int r3 = r3.d()
            int r24 = r24 + r3
        L_0x0075:
            r3 = r24
            if (r5 == 0) goto L_0x0083
            if (r7 == r10) goto L_0x0083
            if (r7 == r12) goto L_0x0083
            r24 = r8
            r23 = r15
            r8 = 6
            goto L_0x0093
        L_0x0083:
            if (r14 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r8
            r23 = r15
            r8 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r8
            r8 = r23
            r23 = r15
        L_0x0093:
            a.f.a.j.e r15 = r6.f198d
            if (r15 == 0) goto L_0x00bc
            if (r7 != r12) goto L_0x00a6
            r26 = r14
            a.f.a.i r14 = r6.i
            a.f.a.i r15 = r15.i
            r27 = r2
            r2 = 5
            r9.i(r14, r15, r3, r2)
            goto L_0x00b2
        L_0x00a6:
            r27 = r2
            r26 = r14
            a.f.a.i r2 = r6.i
            a.f.a.i r14 = r15.i
            r15 = 6
            r9.i(r2, r14, r3, r15)
        L_0x00b2:
            a.f.a.i r2 = r6.i
            a.f.a.j.e r6 = r6.f198d
            a.f.a.i r6 = r6.i
            r9.e(r2, r6, r3, r8)
            goto L_0x00c0
        L_0x00bc:
            r27 = r2
            r26 = r14
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r7.C()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            a.f.a.j.f$b[] r2 = r7.C
            r2 = r2[r39]
            a.f.a.j.f$b r3 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e4
            a.f.a.j.e[] r2 = r7.A
            int r3 = r40 + 1
            r3 = r2[r3]
            a.f.a.i r3 = r3.i
            r2 = r2[r40]
            a.f.a.i r2 = r2.i
            r6 = 5
            r8 = 0
            r9.i(r3, r2, r8, r6)
            goto L_0x00e5
        L_0x00e4:
            r8 = 0
        L_0x00e5:
            a.f.a.j.e[] r2 = r7.A
            r2 = r2[r40]
            a.f.a.i r2 = r2.i
            a.f.a.j.e[] r3 = r0.A
            r3 = r3[r40]
            a.f.a.i r3 = r3.i
            r6 = 6
            r9.i(r2, r3, r8, r6)
        L_0x00f5:
            a.f.a.j.e[] r2 = r7.A
            int r3 = r40 + 1
            r2 = r2[r3]
            a.f.a.j.e r2 = r2.f198d
            if (r2 == 0) goto L_0x0114
            a.f.a.j.f r2 = r2.f196b
            a.f.a.j.e[] r3 = r2.A
            r6 = r3[r40]
            a.f.a.j.e r6 = r6.f198d
            if (r6 == 0) goto L_0x0114
            r3 = r3[r40]
            a.f.a.j.e r3 = r3.f198d
            a.f.a.j.f r3 = r3.f196b
            if (r3 == r7) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r7 = r21
            r8 = r24
            goto L_0x011c
        L_0x011b:
            r8 = 1
        L_0x011c:
            r15 = r23
            r3 = r25
            r14 = r26
            r2 = r27
            goto L_0x0051
        L_0x0126:
            r27 = r2
            r25 = r3
            r26 = r14
            r23 = r15
            if (r13 == 0) goto L_0x0150
            a.f.a.j.e[] r2 = r11.A
            int r3 = r40 + 1
            r6 = r2[r3]
            a.f.a.j.e r6 = r6.f198d
            if (r6 == 0) goto L_0x0150
            a.f.a.j.e[] r6 = r13.A
            r6 = r6[r3]
            a.f.a.i r7 = r6.i
            r2 = r2[r3]
            a.f.a.j.e r2 = r2.f198d
            a.f.a.i r2 = r2.i
            int r3 = r6.d()
            int r3 = -r3
            r6 = 5
            r9.k(r7, r2, r3, r6)
            goto L_0x0151
        L_0x0150:
            r6 = 5
        L_0x0151:
            if (r4 == 0) goto L_0x016b
            a.f.a.j.e[] r0 = r0.A
            int r2 = r40 + 1
            r0 = r0[r2]
            a.f.a.i r0 = r0.i
            a.f.a.j.e[] r3 = r11.A
            r4 = r3[r2]
            a.f.a.i r4 = r4.i
            r2 = r3[r2]
            int r2 = r2.d()
            r3 = 6
            r9.i(r0, r4, r2, r3)
        L_0x016b:
            java.util.ArrayList<a.f.a.j.f> r0 = r1.h
            if (r0 == 0) goto L_0x021a
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x021a
            boolean r4 = r1.n
            if (r4 == 0) goto L_0x0182
            boolean r4 = r1.p
            if (r4 != 0) goto L_0x0182
            int r4 = r1.j
            float r4 = (float) r4
            goto L_0x0184
        L_0x0182:
            r4 = r25
        L_0x0184:
            r7 = 0
            r14 = r21
            r8 = 0
            r29 = 0
        L_0x018a:
            if (r8 >= r2) goto L_0x021a
            java.lang.Object r15 = r0.get(r8)
            a.f.a.j.f r15 = (a.f.a.j.f) r15
            float[] r3 = r15.g0
            r3 = r3[r39]
            int r19 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r19 >= 0) goto L_0x01b6
            boolean r3 = r1.p
            if (r3 == 0) goto L_0x01b1
            a.f.a.j.e[] r3 = r15.A
            int r15 = r40 + 1
            r15 = r3[r15]
            a.f.a.i r15 = r15.i
            r3 = r3[r40]
            a.f.a.i r3 = r3.i
            r6 = 4
            r7 = 0
            r9.e(r15, r3, r7, r6)
            r6 = 6
            goto L_0x01cc
        L_0x01b1:
            r6 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            goto L_0x01b7
        L_0x01b6:
            r6 = 4
        L_0x01b7:
            int r20 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r20 != 0) goto L_0x01d1
            a.f.a.j.e[] r3 = r15.A
            int r15 = r40 + 1
            r15 = r3[r15]
            a.f.a.i r15 = r15.i
            r3 = r3[r40]
            a.f.a.i r3 = r3.i
            r6 = 6
            r7 = 0
            r9.e(r15, r3, r7, r6)
        L_0x01cc:
            r25 = r0
            r17 = r2
            goto L_0x020f
        L_0x01d1:
            r6 = 6
            r7 = 0
            if (r14 == 0) goto L_0x0208
            a.f.a.j.e[] r14 = r14.A
            r6 = r14[r40]
            a.f.a.i r6 = r6.i
            int r17 = r40 + 1
            r14 = r14[r17]
            a.f.a.i r14 = r14.i
            a.f.a.j.e[] r7 = r15.A
            r25 = r0
            r0 = r7[r40]
            a.f.a.i r0 = r0.i
            r7 = r7[r17]
            a.f.a.i r7 = r7.i
            r17 = r2
            a.f.a.b r2 = r38.s()
            r28 = r2
            r30 = r4
            r31 = r3
            r32 = r6
            r33 = r14
            r34 = r0
            r35 = r7
            r28.k(r29, r30, r31, r32, r33, r34, r35)
            r9.d(r2)
            goto L_0x020c
        L_0x0208:
            r25 = r0
            r17 = r2
        L_0x020c:
            r29 = r3
            r14 = r15
        L_0x020f:
            int r8 = r8 + 1
            r2 = r17
            r0 = r25
            r3 = 1
            r6 = 5
            r7 = 0
            goto L_0x018a
        L_0x021a:
            if (r12 == 0) goto L_0x027c
            if (r12 == r13) goto L_0x0220
            if (r5 == 0) goto L_0x027c
        L_0x0220:
            a.f.a.j.e[] r0 = r10.A
            r1 = r0[r40]
            a.f.a.j.e[] r2 = r11.A
            int r3 = r40 + 1
            r2 = r2[r3]
            r4 = r0[r40]
            a.f.a.j.e r4 = r4.f198d
            if (r4 == 0) goto L_0x0238
            r0 = r0[r40]
            a.f.a.j.e r0 = r0.f198d
            a.f.a.i r0 = r0.i
            r4 = r0
            goto L_0x023a
        L_0x0238:
            r4 = r21
        L_0x023a:
            a.f.a.j.e[] r0 = r11.A
            r5 = r0[r3]
            a.f.a.j.e r5 = r5.f198d
            if (r5 == 0) goto L_0x024a
            r0 = r0[r3]
            a.f.a.j.e r0 = r0.f198d
            a.f.a.i r0 = r0.i
            r5 = r0
            goto L_0x024c
        L_0x024a:
            r5 = r21
        L_0x024c:
            if (r12 != r13) goto L_0x0254
            a.f.a.j.e[] r0 = r12.A
            r1 = r0[r40]
            r2 = r0[r3]
        L_0x0254:
            if (r4 == 0) goto L_0x04a3
            if (r5 == 0) goto L_0x04a3
            if (r39 != 0) goto L_0x025f
            r0 = r27
            float r0 = r0.V
            goto L_0x0263
        L_0x025f:
            r0 = r27
            float r0 = r0.W
        L_0x0263:
            r6 = r0
            int r3 = r1.d()
            int r7 = r2.d()
            a.f.a.i r1 = r1.i
            a.f.a.i r8 = r2.i
            r10 = 5
            r0 = r38
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04a3
        L_0x027c:
            if (r26 == 0) goto L_0x0374
            if (r12 == 0) goto L_0x0374
            int r0 = r1.j
            if (r0 <= 0) goto L_0x028b
            int r1 = r1.i
            if (r1 != r0) goto L_0x028b
            r16 = 1
            goto L_0x028d
        L_0x028b:
            r16 = 0
        L_0x028d:
            r14 = r12
            r15 = r14
        L_0x028f:
            if (r14 == 0) goto L_0x04a3
            a.f.a.j.f[] r0 = r14.i0
            r0 = r0[r39]
            r8 = r0
        L_0x0296:
            if (r8 == 0) goto L_0x02a5
            int r0 = r8.C()
            r6 = 8
            if (r0 != r6) goto L_0x02a7
            a.f.a.j.f[] r0 = r8.i0
            r8 = r0[r39]
            goto L_0x0296
        L_0x02a5:
            r6 = 8
        L_0x02a7:
            if (r8 != 0) goto L_0x02b4
            if (r14 != r13) goto L_0x02ac
            goto L_0x02b4
        L_0x02ac:
            r17 = r8
            r18 = 4
            r20 = 6
            goto L_0x0367
        L_0x02b4:
            a.f.a.j.e[] r0 = r14.A
            r0 = r0[r40]
            a.f.a.i r1 = r0.i
            a.f.a.j.e r2 = r0.f198d
            if (r2 == 0) goto L_0x02c1
            a.f.a.i r2 = r2.i
            goto L_0x02c3
        L_0x02c1:
            r2 = r21
        L_0x02c3:
            if (r15 == r14) goto L_0x02ce
            a.f.a.j.e[] r2 = r15.A
            int r3 = r40 + 1
            r2 = r2[r3]
            a.f.a.i r2 = r2.i
            goto L_0x02e3
        L_0x02ce:
            if (r14 != r12) goto L_0x02e3
            if (r15 != r14) goto L_0x02e3
            a.f.a.j.e[] r2 = r10.A
            r3 = r2[r40]
            a.f.a.j.e r3 = r3.f198d
            if (r3 == 0) goto L_0x02e1
            r2 = r2[r40]
            a.f.a.j.e r2 = r2.f198d
            a.f.a.i r2 = r2.i
            goto L_0x02e3
        L_0x02e1:
            r2 = r21
        L_0x02e3:
            int r0 = r0.d()
            a.f.a.j.e[] r3 = r14.A
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.d()
            if (r8 == 0) goto L_0x0305
            a.f.a.j.e[] r5 = r8.A
            r5 = r5[r40]
            a.f.a.i r7 = r5.i
            a.f.a.j.e[] r6 = r14.A
            r6 = r6[r4]
            a.f.a.i r6 = r6.i
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x0318
        L_0x0305:
            a.f.a.j.e[] r5 = r11.A
            r5 = r5[r4]
            a.f.a.j.e r5 = r5.f198d
            if (r5 == 0) goto L_0x0310
            a.f.a.i r6 = r5.i
            goto L_0x0312
        L_0x0310:
            r6 = r21
        L_0x0312:
            a.f.a.j.e[] r7 = r14.A
            r7 = r7[r4]
            a.f.a.i r7 = r7.i
        L_0x0318:
            if (r5 == 0) goto L_0x031f
            int r5 = r5.d()
            int r3 = r3 + r5
        L_0x031f:
            if (r15 == 0) goto L_0x032a
            a.f.a.j.e[] r5 = r15.A
            r5 = r5[r4]
            int r5 = r5.d()
            int r0 = r0 + r5
        L_0x032a:
            if (r1 == 0) goto L_0x02ac
            if (r2 == 0) goto L_0x02ac
            if (r6 == 0) goto L_0x02ac
            if (r7 == 0) goto L_0x02ac
            if (r14 != r12) goto L_0x033c
            a.f.a.j.e[] r0 = r12.A
            r0 = r0[r40]
            int r0 = r0.d()
        L_0x033c:
            r5 = r0
            if (r14 != r13) goto L_0x034a
            a.f.a.j.e[] r0 = r13.A
            r0 = r0[r4]
            int r0 = r0.d()
            r17 = r0
            goto L_0x034c
        L_0x034a:
            r17 = r3
        L_0x034c:
            if (r16 == 0) goto L_0x0351
            r19 = 6
            goto L_0x0353
        L_0x0351:
            r19 = 4
        L_0x0353:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r18 = 4
            r20 = 6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r19
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0367:
            int r0 = r14.C()
            r8 = 8
            if (r0 == r8) goto L_0x0370
            r15 = r14
        L_0x0370:
            r14 = r17
            goto L_0x028f
        L_0x0374:
            r8 = 8
            r18 = 4
            r20 = 6
            if (r23 == 0) goto L_0x04a3
            if (r12 == 0) goto L_0x04a3
            int r0 = r1.j
            if (r0 <= 0) goto L_0x0389
            int r1 = r1.i
            if (r1 != r0) goto L_0x0389
            r16 = 1
            goto L_0x038b
        L_0x0389:
            r16 = 0
        L_0x038b:
            r14 = r12
            r15 = r14
        L_0x038d:
            if (r14 == 0) goto L_0x0445
            a.f.a.j.f[] r0 = r14.i0
            r0 = r0[r39]
        L_0x0393:
            if (r0 == 0) goto L_0x03a0
            int r1 = r0.C()
            if (r1 != r8) goto L_0x03a0
            a.f.a.j.f[] r0 = r0.i0
            r0 = r0[r39]
            goto L_0x0393
        L_0x03a0:
            if (r14 == r12) goto L_0x0432
            if (r14 == r13) goto L_0x0432
            if (r0 == 0) goto L_0x0432
            if (r0 != r13) goto L_0x03ab
            r7 = r21
            goto L_0x03ac
        L_0x03ab:
            r7 = r0
        L_0x03ac:
            a.f.a.j.e[] r0 = r14.A
            r0 = r0[r40]
            a.f.a.i r1 = r0.i
            a.f.a.j.e r2 = r0.f198d
            if (r2 == 0) goto L_0x03b8
            a.f.a.i r2 = r2.i
        L_0x03b8:
            a.f.a.j.e[] r2 = r15.A
            int r3 = r40 + 1
            r2 = r2[r3]
            a.f.a.i r2 = r2.i
            int r0 = r0.d()
            a.f.a.j.e[] r4 = r14.A
            r4 = r4[r3]
            int r4 = r4.d()
            if (r7 == 0) goto L_0x03de
            a.f.a.j.e[] r5 = r7.A
            r5 = r5[r40]
            a.f.a.i r6 = r5.i
            a.f.a.j.e r8 = r5.f198d
            if (r8 == 0) goto L_0x03db
            a.f.a.i r8 = r8.i
            goto L_0x03f1
        L_0x03db:
            r8 = r21
            goto L_0x03f1
        L_0x03de:
            a.f.a.j.e[] r5 = r14.A
            r5 = r5[r3]
            a.f.a.j.e r5 = r5.f198d
            if (r5 == 0) goto L_0x03e9
            a.f.a.i r6 = r5.i
            goto L_0x03eb
        L_0x03e9:
            r6 = r21
        L_0x03eb:
            a.f.a.j.e[] r8 = r14.A
            r8 = r8[r3]
            a.f.a.i r8 = r8.i
        L_0x03f1:
            if (r5 == 0) goto L_0x03f8
            int r5 = r5.d()
            int r4 = r4 + r5
        L_0x03f8:
            r17 = r4
            if (r15 == 0) goto L_0x0405
            a.f.a.j.e[] r4 = r15.A
            r3 = r4[r3]
            int r3 = r3.d()
            int r0 = r0 + r3
        L_0x0405:
            r3 = r0
            if (r16 == 0) goto L_0x040b
            r22 = 6
            goto L_0x040d
        L_0x040b:
            r22 = 4
        L_0x040d:
            if (r1 == 0) goto L_0x0429
            if (r2 == 0) goto L_0x0429
            if (r6 == 0) goto L_0x0429
            if (r8 == 0) goto L_0x0429
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r6 = r8
            r19 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r22
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x042f
        L_0x0429:
            r19 = r7
            r17 = r15
            r15 = 8
        L_0x042f:
            r0 = r19
            goto L_0x0436
        L_0x0432:
            r17 = r15
            r15 = 8
        L_0x0436:
            int r1 = r14.C()
            if (r1 == r15) goto L_0x043d
            goto L_0x043f
        L_0x043d:
            r14 = r17
        L_0x043f:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x038d
        L_0x0445:
            a.f.a.j.e[] r0 = r12.A
            r0 = r0[r40]
            a.f.a.j.e[] r1 = r10.A
            r1 = r1[r40]
            a.f.a.j.e r1 = r1.f198d
            a.f.a.j.e[] r2 = r13.A
            int r3 = r40 + 1
            r10 = r2[r3]
            a.f.a.j.e[] r2 = r11.A
            r2 = r2[r3]
            a.f.a.j.e r14 = r2.f198d
            if (r1 == 0) goto L_0x0492
            if (r12 == r13) goto L_0x046c
            a.f.a.i r2 = r0.i
            a.f.a.i r1 = r1.i
            int r0 = r0.d()
            r15 = 5
            r9.e(r2, r1, r0, r15)
            goto L_0x0493
        L_0x046c:
            r15 = 5
            if (r14 == 0) goto L_0x0493
            a.f.a.i r2 = r0.i
            a.f.a.i r3 = r1.i
            int r4 = r0.d()
            r5 = 1056964608(0x3f000000, float:0.5)
            a.f.a.i r6 = r10.i
            a.f.a.i r7 = r14.i
            int r8 = r10.d()
            r16 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0493
        L_0x0492:
            r15 = 5
        L_0x0493:
            if (r14 == 0) goto L_0x04a3
            if (r12 == r13) goto L_0x04a3
            a.f.a.i r0 = r10.i
            a.f.a.i r1 = r14.i
            int r2 = r10.d()
            int r2 = -r2
            r9.e(r0, r1, r2, r15)
        L_0x04a3:
            if (r26 != 0) goto L_0x04a7
            if (r23 == 0) goto L_0x0509
        L_0x04a7:
            if (r12 == 0) goto L_0x0509
            a.f.a.j.e[] r0 = r12.A
            r0 = r0[r40]
            a.f.a.j.e[] r1 = r13.A
            int r2 = r40 + 1
            r1 = r1[r2]
            a.f.a.j.e r3 = r0.f198d
            if (r3 == 0) goto L_0x04ba
            a.f.a.i r3 = r3.i
            goto L_0x04bc
        L_0x04ba:
            r3 = r21
        L_0x04bc:
            a.f.a.j.e r4 = r1.f198d
            if (r4 == 0) goto L_0x04c3
            a.f.a.i r4 = r4.i
            goto L_0x04c5
        L_0x04c3:
            r4 = r21
        L_0x04c5:
            if (r11 == r13) goto L_0x04d6
            a.f.a.j.e[] r4 = r11.A
            r4 = r4[r2]
            a.f.a.j.e r4 = r4.f198d
            if (r4 == 0) goto L_0x04d3
            a.f.a.i r4 = r4.i
            r21 = r4
        L_0x04d3:
            r5 = r21
            goto L_0x04d7
        L_0x04d6:
            r5 = r4
        L_0x04d7:
            if (r12 != r13) goto L_0x04e4
            a.f.a.j.e[] r0 = r12.A
            r1 = r0[r40]
            r0 = r0[r2]
            r36 = r1
            r1 = r0
            r0 = r36
        L_0x04e4:
            if (r3 == 0) goto L_0x0509
            if (r5 == 0) goto L_0x0509
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.d()
            if (r13 != 0) goto L_0x04f1
            goto L_0x04f2
        L_0x04f1:
            r11 = r13
        L_0x04f2:
            a.f.a.j.e[] r7 = r11.A
            r2 = r7[r2]
            int r7 = r2.d()
            a.f.a.i r2 = r0.i
            a.f.a.i r8 = r1.i
            r10 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0509:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.c.b(a.f.a.j.g, a.f.a.e, int, int, a.f.a.j.d):void");
    }
}
