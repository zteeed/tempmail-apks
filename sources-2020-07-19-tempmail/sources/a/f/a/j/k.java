package a.f.a.j;

import a.f.a.e;
import a.f.a.j.f;

/* compiled from: Optimizer */
public class k {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f233a = new boolean[3];

    static void a(int i, f fVar) {
        f fVar2 = fVar;
        fVar.H0();
        l f2 = fVar2.s.f();
        l f3 = fVar2.t.f();
        l f4 = fVar2.u.f();
        l f5 = fVar2.v.f();
        boolean z = (i & 8) == 8;
        boolean z2 = fVar2.C[0] == f.b.MATCH_CONSTRAINT && d(fVar2, 0);
        if (!(f2.h == 4 || f4.h == 4)) {
            if (fVar2.C[0] == f.b.FIXED || (z2 && fVar.C() == 8)) {
                if (fVar2.s.f197d == null && fVar2.u.f197d == null) {
                    f2.p(1);
                    f4.p(1);
                    if (z) {
                        f4.j(f2, 1, fVar.x());
                    } else {
                        f4.i(f2, fVar.D());
                    }
                } else if (fVar2.s.f197d != null && fVar2.u.f197d == null) {
                    f2.p(1);
                    f4.p(1);
                    if (z) {
                        f4.j(f2, 1, fVar.x());
                    } else {
                        f4.i(f2, fVar.D());
                    }
                } else if (fVar2.s.f197d == null && fVar2.u.f197d != null) {
                    f2.p(1);
                    f4.p(1);
                    f2.i(f4, -fVar.D());
                    if (z) {
                        f2.j(f4, -1, fVar.x());
                    } else {
                        f2.i(f4, -fVar.D());
                    }
                } else if (!(fVar2.s.f197d == null || fVar2.u.f197d == null)) {
                    f2.p(2);
                    f4.p(2);
                    if (z) {
                        fVar.x().a(f2);
                        fVar.x().a(f4);
                        f2.o(f4, -1, fVar.x());
                        f4.o(f2, 1, fVar.x());
                    } else {
                        f2.n(f4, (float) (-fVar.D()));
                        f4.n(f2, (float) fVar.D());
                    }
                }
            } else if (z2) {
                int D = fVar.D();
                f2.p(1);
                f4.p(1);
                if (fVar2.s.f197d == null && fVar2.u.f197d == null) {
                    if (z) {
                        f4.j(f2, 1, fVar.x());
                    } else {
                        f4.i(f2, D);
                    }
                } else if (fVar2.s.f197d == null || fVar2.u.f197d != null) {
                    if (fVar2.s.f197d != null || fVar2.u.f197d == null) {
                        if (!(fVar2.s.f197d == null || fVar2.u.f197d == null)) {
                            if (z) {
                                fVar.x().a(f2);
                                fVar.x().a(f4);
                            }
                            if (fVar2.G == 0.0f) {
                                f2.p(3);
                                f4.p(3);
                                f2.n(f4, 0.0f);
                                f4.n(f2, 0.0f);
                            } else {
                                f2.p(2);
                                f4.p(2);
                                f2.n(f4, (float) (-D));
                                f4.n(f2, (float) D);
                                fVar2.y0(D);
                            }
                        }
                    } else if (z) {
                        f2.j(f4, -1, fVar.x());
                    } else {
                        f2.i(f4, -D);
                    }
                } else if (z) {
                    f4.j(f2, 1, fVar.x());
                } else {
                    f4.i(f2, D);
                }
            }
        }
        boolean z3 = fVar2.C[1] == f.b.MATCH_CONSTRAINT && d(fVar2, 1);
        if (f3.h != 4 && f5.h != 4) {
            if (fVar2.C[1] == f.b.FIXED || (z3 && fVar.C() == 8)) {
                if (fVar2.t.f197d == null && fVar2.v.f197d == null) {
                    f3.p(1);
                    f5.p(1);
                    if (z) {
                        f5.j(f3, 1, fVar.w());
                    } else {
                        f5.i(f3, fVar.r());
                    }
                    e eVar = fVar2.w;
                    if (eVar.f197d != null) {
                        eVar.f().p(1);
                        f3.h(1, fVar2.w.f(), -fVar2.Q);
                    }
                } else if (fVar2.t.f197d != null && fVar2.v.f197d == null) {
                    f3.p(1);
                    f5.p(1);
                    if (z) {
                        f5.j(f3, 1, fVar.w());
                    } else {
                        f5.i(f3, fVar.r());
                    }
                    if (fVar2.Q > 0) {
                        fVar2.w.f().h(1, f3, fVar2.Q);
                    }
                } else if (fVar2.t.f197d == null && fVar2.v.f197d != null) {
                    f3.p(1);
                    f5.p(1);
                    if (z) {
                        f3.j(f5, -1, fVar.w());
                    } else {
                        f3.i(f5, -fVar.r());
                    }
                    if (fVar2.Q > 0) {
                        fVar2.w.f().h(1, f3, fVar2.Q);
                    }
                } else if (fVar2.t.f197d != null && fVar2.v.f197d != null) {
                    f3.p(2);
                    f5.p(2);
                    if (z) {
                        f3.o(f5, -1, fVar.w());
                        f5.o(f3, 1, fVar.w());
                        fVar.w().a(f3);
                        fVar.x().a(f5);
                    } else {
                        f3.n(f5, (float) (-fVar.r()));
                        f5.n(f3, (float) fVar.r());
                    }
                    if (fVar2.Q > 0) {
                        fVar2.w.f().h(1, f3, fVar2.Q);
                    }
                }
            } else if (z3) {
                int r = fVar.r();
                f3.p(1);
                f5.p(1);
                if (fVar2.t.f197d == null && fVar2.v.f197d == null) {
                    if (z) {
                        f5.j(f3, 1, fVar.w());
                    } else {
                        f5.i(f3, r);
                    }
                } else if (fVar2.t.f197d == null || fVar2.v.f197d != null) {
                    if (fVar2.t.f197d != null || fVar2.v.f197d == null) {
                        if (fVar2.t.f197d != null && fVar2.v.f197d != null) {
                            if (z) {
                                fVar.w().a(f3);
                                fVar.x().a(f5);
                            }
                            if (fVar2.G == 0.0f) {
                                f3.p(3);
                                f5.p(3);
                                f3.n(f5, 0.0f);
                                f5.n(f3, 0.0f);
                                return;
                            }
                            f3.p(2);
                            f5.p(2);
                            f3.n(f5, (float) (-r));
                            f5.n(f3, (float) r);
                            fVar2.b0(r);
                            if (fVar2.Q > 0) {
                                fVar2.w.f().h(1, f3, fVar2.Q);
                            }
                        }
                    } else if (z) {
                        f3.j(f5, -1, fVar.w());
                    } else {
                        f3.i(f5, -r);
                    }
                } else if (z) {
                    f5.j(f3, 1, fVar.w());
                } else {
                    f5.i(f3, r);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.e0 == 2) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7.f0 == 2) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean b(a.f.a.j.g r24, a.f.a.e r25, int r26, int r27, a.f.a.j.d r28) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            a.f.a.j.f r3 = r2.f188a
            a.f.a.j.f r4 = r2.f190c
            a.f.a.j.f r5 = r2.f189b
            a.f.a.j.f r6 = r2.f191d
            a.f.a.j.f r7 = r2.f192e
            float r8 = r2.k
            a.f.a.j.f r9 = r2.f193f
            a.f.a.j.f r2 = r2.g
            r9 = r24
            a.f.a.j.f$b[] r2 = r9.C
            r2 = r2[r1]
            a.f.a.j.f$b r9 = a.f.a.j.f.b.WRAP_CONTENT
            r2 = 2
            r10 = 1
            if (r1 != 0) goto L_0x0038
            int r11 = r7.e0
            if (r11 != 0) goto L_0x0028
            r11 = 1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            int r12 = r7.e0
            if (r12 != r10) goto L_0x002f
            r12 = 1
            goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            int r7 = r7.e0
            if (r7 != r2) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x004b
        L_0x0036:
            r2 = 0
            goto L_0x004b
        L_0x0038:
            int r11 = r7.f0
            if (r11 != 0) goto L_0x003e
            r11 = 1
            goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            int r12 = r7.f0
            if (r12 != r10) goto L_0x0045
            r12 = 1
            goto L_0x0046
        L_0x0045:
            r12 = 0
        L_0x0046:
            int r7 = r7.f0
            if (r7 != r2) goto L_0x0036
            goto L_0x0034
        L_0x004b:
            r14 = r3
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0053:
            r7 = 8
            if (r13 != 0) goto L_0x010a
            int r9 = r14.C()
            if (r9 == r7) goto L_0x00a1
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x0066
            int r9 = r14.D()
            goto L_0x006a
        L_0x0066:
            int r9 = r14.r()
        L_0x006a:
            float r9 = (float) r9
            float r16 = r16 + r9
            if (r14 == r5) goto L_0x007a
            a.f.a.j.e[] r9 = r14.A
            r9 = r9[r27]
            int r9 = r9.d()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x007a:
            if (r14 == r6) goto L_0x0089
            a.f.a.j.e[] r9 = r14.A
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.d()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x0089:
            a.f.a.j.e[] r9 = r14.A
            r9 = r9[r27]
            int r9 = r9.d()
            float r9 = (float) r9
            float r17 = r17 + r9
            a.f.a.j.e[] r9 = r14.A
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.d()
            float r9 = (float) r9
            float r17 = r17 + r9
        L_0x00a1:
            a.f.a.j.e[] r9 = r14.A
            r9 = r9[r27]
            int r9 = r14.C()
            if (r9 == r7) goto L_0x00df
            a.f.a.j.f$b[] r7 = r14.C
            r7 = r7[r1]
            a.f.a.j.f$b r9 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r7 != r9) goto L_0x00df
            int r10 = r10 + 1
            if (r1 != 0) goto L_0x00c7
            int r7 = r14.f217e
            if (r7 == 0) goto L_0x00bd
            r7 = 0
            return r7
        L_0x00bd:
            r7 = 0
            int r9 = r14.h
            if (r9 != 0) goto L_0x00c6
            int r9 = r14.i
            if (r9 == 0) goto L_0x00d6
        L_0x00c6:
            return r7
        L_0x00c7:
            r7 = 0
            int r9 = r14.f218f
            if (r9 == 0) goto L_0x00cd
            return r7
        L_0x00cd:
            int r9 = r14.k
            if (r9 != 0) goto L_0x00de
            int r9 = r14.l
            if (r9 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            float r9 = r14.G
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x00df
        L_0x00de:
            return r7
        L_0x00df:
            a.f.a.j.e[] r7 = r14.A
            int r9 = r27 + 1
            r7 = r7[r9]
            a.f.a.j.e r7 = r7.f197d
            if (r7 == 0) goto L_0x0101
            a.f.a.j.f r7 = r7.f195b
            a.f.a.j.e[] r9 = r7.A
            r20 = r7
            r7 = r9[r27]
            a.f.a.j.e r7 = r7.f197d
            if (r7 == 0) goto L_0x0101
            r7 = r9[r27]
            a.f.a.j.e r7 = r7.f197d
            a.f.a.j.f r7 = r7.f195b
            if (r7 == r14) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r9 = r20
            goto L_0x0102
        L_0x0101:
            r9 = 0
        L_0x0102:
            if (r9 == 0) goto L_0x0107
            r14 = r9
            goto L_0x0053
        L_0x0107:
            r13 = 1
            goto L_0x0053
        L_0x010a:
            a.f.a.j.e[] r9 = r3.A
            r9 = r9[r27]
            a.f.a.j.l r9 = r9.f()
            a.f.a.j.e[] r13 = r4.A
            int r19 = r27 + 1
            r13 = r13[r19]
            a.f.a.j.l r13 = r13.f()
            a.f.a.j.l r7 = r9.f235d
            if (r7 == 0) goto L_0x0385
            r21 = r3
            a.f.a.j.l r3 = r13.f235d
            if (r3 != 0) goto L_0x0128
            goto L_0x0385
        L_0x0128:
            int r7 = r7.f240b
            r0 = 1
            if (r7 != r0) goto L_0x0383
            int r3 = r3.f240b
            if (r3 == r0) goto L_0x0133
            goto L_0x0383
        L_0x0133:
            if (r10 <= 0) goto L_0x0139
            if (r10 == r15) goto L_0x0139
            r0 = 0
            return r0
        L_0x0139:
            if (r2 != 0) goto L_0x0142
            if (r11 != 0) goto L_0x0142
            if (r12 == 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r0 = 0
            goto L_0x015b
        L_0x0142:
            if (r5 == 0) goto L_0x014e
            a.f.a.j.e[] r0 = r5.A
            r0 = r0[r27]
            int r0 = r0.d()
            float r0 = (float) r0
            goto L_0x014f
        L_0x014e:
            r0 = 0
        L_0x014f:
            if (r6 == 0) goto L_0x015b
            a.f.a.j.e[] r3 = r6.A
            r3 = r3[r19]
            int r3 = r3.d()
            float r3 = (float) r3
            float r0 = r0 + r3
        L_0x015b:
            a.f.a.j.l r3 = r9.f235d
            float r3 = r3.g
            a.f.a.j.l r6 = r13.f235d
            float r6 = r6.g
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0169
            float r6 = r6 - r3
            goto L_0x016b
        L_0x0169:
            float r6 = r3 - r6
        L_0x016b:
            float r6 = r6 - r16
            r22 = 1
            if (r10 <= 0) goto L_0x0225
            if (r10 != r15) goto L_0x0225
            a.f.a.j.f r0 = r14.u()
            if (r0 == 0) goto L_0x0187
            a.f.a.j.f r0 = r14.u()
            a.f.a.j.f$b[] r0 = r0.C
            r0 = r0[r1]
            a.f.a.j.f$b r2 = a.f.a.j.f.b.WRAP_CONTENT
            if (r0 != r2) goto L_0x0187
            r0 = 0
            return r0
        L_0x0187:
            float r6 = r6 + r16
            float r6 = r6 - r17
            r0 = r3
            r3 = r21
        L_0x018e:
            if (r3 == 0) goto L_0x0223
            a.f.a.f r2 = a.f.a.e.q
            if (r2 == 0) goto L_0x01a6
            long r11 = r2.z
            long r11 = r11 - r22
            r2.z = r11
            long r11 = r2.r
            long r11 = r11 + r22
            r2.r = r11
            long r11 = r2.x
            long r11 = r11 + r22
            r2.x = r11
        L_0x01a6:
            a.f.a.j.f[] r2 = r3.i0
            r2 = r2[r1]
            if (r2 != 0) goto L_0x01b2
            if (r3 != r4) goto L_0x01af
            goto L_0x01b2
        L_0x01af:
            r7 = r25
            goto L_0x0220
        L_0x01b2:
            float r5 = (float) r10
            float r5 = r6 / r5
            r7 = 0
            int r11 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x01cc
            float[] r5 = r3.g0
            r7 = r5[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01c7
            r18 = 0
            goto L_0x01ce
        L_0x01c7:
            r5 = r5[r1]
            float r5 = r5 * r6
            float r5 = r5 / r8
        L_0x01cc:
            r18 = r5
        L_0x01ce:
            int r5 = r3.C()
            r7 = 8
            if (r5 != r7) goto L_0x01d8
            r18 = 0
        L_0x01d8:
            a.f.a.j.e[] r5 = r3.A
            r5 = r5[r27]
            int r5 = r5.d()
            float r5 = (float) r5
            float r0 = r0 + r5
            a.f.a.j.e[] r5 = r3.A
            r5 = r5[r27]
            a.f.a.j.l r5 = r5.f()
            a.f.a.j.l r7 = r9.f237f
            r5.l(r7, r0)
            a.f.a.j.e[] r5 = r3.A
            r5 = r5[r19]
            a.f.a.j.l r5 = r5.f()
            a.f.a.j.l r7 = r9.f237f
            float r0 = r0 + r18
            r5.l(r7, r0)
            a.f.a.j.e[] r5 = r3.A
            r5 = r5[r27]
            a.f.a.j.l r5 = r5.f()
            r7 = r25
            r5.g(r7)
            a.f.a.j.e[] r5 = r3.A
            r5 = r5[r19]
            a.f.a.j.l r5 = r5.f()
            r5.g(r7)
            a.f.a.j.e[] r3 = r3.A
            r3 = r3[r19]
            int r3 = r3.d()
            float r3 = (float) r3
            float r0 = r0 + r3
        L_0x0220:
            r3 = r2
            goto L_0x018e
        L_0x0223:
            r0 = 1
            return r0
        L_0x0225:
            r7 = r25
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x022f
            r2 = 1
            r11 = 0
            r12 = 0
        L_0x022f:
            if (r2 == 0) goto L_0x02af
            float r6 = r6 - r0
            r2 = r21
            float r0 = r2.k(r1)
            float r6 = r6 * r0
            float r3 = r3 + r6
            r0 = r3
        L_0x023c:
            r3 = r2
            if (r3 == 0) goto L_0x02b6
            a.f.a.f r2 = a.f.a.e.q
            if (r2 == 0) goto L_0x0255
            long r5 = r2.z
            long r5 = r5 - r22
            r2.z = r5
            long r5 = r2.r
            long r5 = r5 + r22
            r2.r = r5
            long r5 = r2.x
            long r5 = r5 + r22
            r2.x = r5
        L_0x0255:
            a.f.a.j.f[] r2 = r3.i0
            r2 = r2[r1]
            if (r2 != 0) goto L_0x025d
            if (r3 != r4) goto L_0x023c
        L_0x025d:
            if (r1 != 0) goto L_0x0264
            int r5 = r3.D()
            goto L_0x0268
        L_0x0264:
            int r5 = r3.r()
        L_0x0268:
            float r5 = (float) r5
            a.f.a.j.e[] r6 = r3.A
            r6 = r6[r27]
            int r6 = r6.d()
            float r6 = (float) r6
            float r0 = r0 + r6
            a.f.a.j.e[] r6 = r3.A
            r6 = r6[r27]
            a.f.a.j.l r6 = r6.f()
            a.f.a.j.l r8 = r9.f237f
            r6.l(r8, r0)
            a.f.a.j.e[] r6 = r3.A
            r6 = r6[r19]
            a.f.a.j.l r6 = r6.f()
            a.f.a.j.l r8 = r9.f237f
            float r0 = r0 + r5
            r6.l(r8, r0)
            a.f.a.j.e[] r5 = r3.A
            r5 = r5[r27]
            a.f.a.j.l r5 = r5.f()
            r5.g(r7)
            a.f.a.j.e[] r5 = r3.A
            r5 = r5[r19]
            a.f.a.j.l r5 = r5.f()
            r5.g(r7)
            a.f.a.j.e[] r3 = r3.A
            r3 = r3[r19]
            int r3 = r3.d()
            float r3 = (float) r3
            float r0 = r0 + r3
            goto L_0x023c
        L_0x02af:
            r2 = r21
            if (r11 != 0) goto L_0x02b9
            if (r12 == 0) goto L_0x02b6
            goto L_0x02b9
        L_0x02b6:
            r0 = 1
            goto L_0x0382
        L_0x02b9:
            if (r11 == 0) goto L_0x02bd
        L_0x02bb:
            float r6 = r6 - r0
            goto L_0x02c0
        L_0x02bd:
            if (r12 == 0) goto L_0x02c0
            goto L_0x02bb
        L_0x02c0:
            int r0 = r15 + 1
            float r0 = (float) r0
            float r0 = r6 / r0
            if (r12 == 0) goto L_0x02d2
            r8 = 1
            if (r15 <= r8) goto L_0x02ce
            int r0 = r15 + -1
            float r0 = (float) r0
            goto L_0x02d0
        L_0x02ce:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x02d0:
            float r0 = r6 / r0
        L_0x02d2:
            int r6 = r2.C()
            r8 = 8
            if (r6 == r8) goto L_0x02dd
            float r6 = r3 + r0
            goto L_0x02de
        L_0x02dd:
            r6 = r3
        L_0x02de:
            if (r12 == 0) goto L_0x02ed
            r8 = 1
            if (r15 <= r8) goto L_0x02ed
            a.f.a.j.e[] r6 = r5.A
            r6 = r6[r27]
            int r6 = r6.d()
            float r6 = (float) r6
            float r6 = r6 + r3
        L_0x02ed:
            if (r11 == 0) goto L_0x02fb
            if (r5 == 0) goto L_0x02fb
            a.f.a.j.e[] r3 = r5.A
            r3 = r3[r27]
            int r3 = r3.d()
            float r3 = (float) r3
            float r6 = r6 + r3
        L_0x02fb:
            r3 = r2
            if (r3 == 0) goto L_0x02b6
            a.f.a.f r2 = a.f.a.e.q
            if (r2 == 0) goto L_0x0314
            long r10 = r2.z
            long r10 = r10 - r22
            r2.z = r10
            long r10 = r2.r
            long r10 = r10 + r22
            r2.r = r10
            long r10 = r2.x
            long r10 = r10 + r22
            r2.x = r10
        L_0x0314:
            a.f.a.j.f[] r2 = r3.i0
            r2 = r2[r1]
            if (r2 != 0) goto L_0x0320
            if (r3 != r4) goto L_0x031d
            goto L_0x0320
        L_0x031d:
            r8 = 8
            goto L_0x02fb
        L_0x0320:
            if (r1 != 0) goto L_0x0327
            int r8 = r3.D()
            goto L_0x032b
        L_0x0327:
            int r8 = r3.r()
        L_0x032b:
            float r8 = (float) r8
            if (r3 == r5) goto L_0x0338
            a.f.a.j.e[] r10 = r3.A
            r10 = r10[r27]
            int r10 = r10.d()
            float r10 = (float) r10
            float r6 = r6 + r10
        L_0x0338:
            a.f.a.j.e[] r10 = r3.A
            r10 = r10[r27]
            a.f.a.j.l r10 = r10.f()
            a.f.a.j.l r11 = r9.f237f
            r10.l(r11, r6)
            a.f.a.j.e[] r10 = r3.A
            r10 = r10[r19]
            a.f.a.j.l r10 = r10.f()
            a.f.a.j.l r11 = r9.f237f
            float r12 = r6 + r8
            r10.l(r11, r12)
            a.f.a.j.e[] r10 = r3.A
            r10 = r10[r27]
            a.f.a.j.l r10 = r10.f()
            r10.g(r7)
            a.f.a.j.e[] r10 = r3.A
            r10 = r10[r19]
            a.f.a.j.l r10 = r10.f()
            r10.g(r7)
            a.f.a.j.e[] r3 = r3.A
            r3 = r3[r19]
            int r3 = r3.d()
            float r3 = (float) r3
            float r8 = r8 + r3
            float r6 = r6 + r8
            if (r2 == 0) goto L_0x031d
            int r3 = r2.C()
            r8 = 8
            if (r3 == r8) goto L_0x02fb
            float r6 = r6 + r0
            goto L_0x02fb
        L_0x0382:
            return r0
        L_0x0383:
            r0 = 0
            return r0
        L_0x0385:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.k.b(a.f.a.j.g, a.f.a.e, int, int, a.f.a.j.d):boolean");
    }

    static void c(g gVar, e eVar, f fVar) {
        if (gVar.C[0] != f.b.WRAP_CONTENT && fVar.C[0] == f.b.MATCH_PARENT) {
            int i = fVar.s.f198e;
            int D = gVar.D() - fVar.u.f198e;
            e eVar2 = fVar.s;
            eVar2.i = eVar.r(eVar2);
            e eVar3 = fVar.u;
            eVar3.i = eVar.r(eVar3);
            eVar.f(fVar.s.i, i);
            eVar.f(fVar.u.i, D);
            fVar.f213a = 2;
            fVar.f0(i, D);
        }
        if (gVar.C[1] != f.b.WRAP_CONTENT && fVar.C[1] == f.b.MATCH_PARENT) {
            int i2 = fVar.t.f198e;
            int r = gVar.r() - fVar.v.f198e;
            e eVar4 = fVar.t;
            eVar4.i = eVar.r(eVar4);
            e eVar5 = fVar.v;
            eVar5.i = eVar.r(eVar5);
            eVar.f(fVar.t.i, i2);
            eVar.f(fVar.v.i, r);
            if (fVar.Q > 0 || fVar.C() == 8) {
                e eVar6 = fVar.w;
                eVar6.i = eVar.r(eVar6);
                eVar.f(fVar.w.i, fVar.Q + i2);
            }
            fVar.f214b = 2;
            fVar.t0(i2, r);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(a.f.a.j.f r5, int r6) {
        /*
            a.f.a.j.f$b[] r0 = r5.C
            r1 = r0[r6]
            a.f.a.j.f$b r2 = a.f.a.j.f.b.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.G
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001d
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            a.f.a.j.f$b r6 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x001c
        L_0x001c:
            return r3
        L_0x001d:
            if (r6 != 0) goto L_0x002d
            int r6 = r5.f217e
            if (r6 == 0) goto L_0x0024
            return r3
        L_0x0024:
            int r6 = r5.h
            if (r6 != 0) goto L_0x002c
            int r5 = r5.i
            if (r5 == 0) goto L_0x003b
        L_0x002c:
            return r3
        L_0x002d:
            int r6 = r5.f218f
            if (r6 == 0) goto L_0x0032
            return r3
        L_0x0032:
            int r6 = r5.k
            if (r6 != 0) goto L_0x003c
            int r5 = r5.l
            if (r5 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            return r4
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.k.d(a.f.a.j.f, int):boolean");
    }

    static void e(f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.A[i3].f().f237f = fVar.u().s.f();
        fVar.A[i3].f().g = (float) i2;
        fVar.A[i3].f().f240b = 1;
        fVar.A[i4].f().f237f = fVar.A[i3].f();
        fVar.A[i4].f().g = (float) fVar.t(i);
        fVar.A[i4].f().f240b = 1;
    }
}
