package a.f.a.j;

import a.f.a.e;
import a.f.a.j.e;
import a.f.a.j.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: ConstraintWidgetContainer */
public class g extends p {
    public int A0 = 0;
    public int B0 = 0;
    private int C0 = 7;
    public boolean D0 = false;
    private boolean E0 = false;
    private boolean F0 = false;
    private boolean l0 = false;
    protected e m0 = new e();
    private o n0;
    int o0;
    int p0;
    int q0;
    int r0;
    int s0 = 0;
    int t0 = 0;
    d[] u0 = new d[4];
    d[] v0 = new d[4];
    public List<h> w0 = new ArrayList();
    public boolean x0 = false;
    public boolean y0 = false;
    public boolean z0 = false;

    private void P0(f fVar) {
        int i = this.s0 + 1;
        d[] dVarArr = this.v0;
        if (i >= dVarArr.length) {
            this.v0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.v0[this.s0] = new d(fVar, 0, U0());
        this.s0++;
    }

    private void Q0(f fVar) {
        int i = this.t0 + 1;
        d[] dVarArr = this.u0;
        if (i >= dVarArr.length) {
            this.u0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.u0[this.t0] = new d(fVar, 1, U0());
        this.t0++;
    }

    private void b1() {
        this.s0 = 0;
        this.t0 = 0;
    }

    /* JADX WARNING: type inference failed for: r8v17, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K0() {
        /*
            r21 = this;
            r1 = r21
            int r2 = r1.I
            int r3 = r1.J
            int r0 = r21.D()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r21.r()
            int r6 = java.lang.Math.max(r4, r0)
            r1.E0 = r4
            r1.F0 = r4
            a.f.a.j.f r0 = r1.D
            if (r0 == 0) goto L_0x0046
            a.f.a.j.o r0 = r1.n0
            if (r0 != 0) goto L_0x002a
            a.f.a.j.o r0 = new a.f.a.j.o
            r0.<init>(r1)
            r1.n0 = r0
        L_0x002a:
            a.f.a.j.o r0 = r1.n0
            r0.b(r1)
            int r0 = r1.o0
            r1.C0(r0)
            int r0 = r1.p0
            r1.D0(r0)
            r21.R()
            a.f.a.e r0 = r1.m0
            a.f.a.c r0 = r0.w()
            r1.T(r0)
            goto L_0x004a
        L_0x0046:
            r1.I = r4
            r1.J = r4
        L_0x004a:
            int r0 = r1.C0
            r7 = 32
            r8 = 8
            r9 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r1.X0(r8)
            if (r0 != 0) goto L_0x005c
            r21.Z0()
        L_0x005c:
            boolean r0 = r1.X0(r7)
            if (r0 != 0) goto L_0x0065
            r21.W0()
        L_0x0065:
            a.f.a.e r0 = r1.m0
            r0.g = r9
            goto L_0x006e
        L_0x006a:
            a.f.a.e r0 = r1.m0
            r0.g = r4
        L_0x006e:
            a.f.a.j.f$b[] r0 = r1.C
            r10 = r0[r9]
            r11 = r0[r4]
            r21.b1()
            java.util.List<a.f.a.j.h> r0 = r1.w0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0090
            java.util.List<a.f.a.j.h> r0 = r1.w0
            r0.clear()
            java.util.List<a.f.a.j.h> r0 = r1.w0
            a.f.a.j.h r12 = new a.f.a.j.h
            java.util.ArrayList<a.f.a.j.f> r13 = r1.k0
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x0090:
            java.util.List<a.f.a.j.h> r0 = r1.w0
            int r12 = r0.size()
            java.util.ArrayList<a.f.a.j.f> r13 = r1.k0
            a.f.a.j.f$b r0 = r21.s()
            a.f.a.j.f$b r14 = a.f.a.j.f.b.WRAP_CONTENT
            if (r0 == r14) goto L_0x00ab
            a.f.a.j.f$b r0 = r21.B()
            a.f.a.j.f$b r14 = a.f.a.j.f.b.WRAP_CONTENT
            if (r0 != r14) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r14 = 0
            goto L_0x00ac
        L_0x00ab:
            r14 = 1
        L_0x00ac:
            r0 = 0
            r15 = 0
        L_0x00ae:
            if (r15 >= r12) goto L_0x02f4
            boolean r8 = r1.D0
            if (r8 != 0) goto L_0x02f4
            java.util.List<a.f.a.j.h> r8 = r1.w0
            java.lang.Object r8 = r8.get(r15)
            a.f.a.j.h r8 = (a.f.a.j.h) r8
            boolean r8 = r8.f229d
            if (r8 == 0) goto L_0x00c4
            r19 = r12
            goto L_0x02e8
        L_0x00c4:
            boolean r8 = r1.X0(r7)
            if (r8 == 0) goto L_0x00f9
            a.f.a.j.f$b r8 = r21.s()
            a.f.a.j.f$b r7 = a.f.a.j.f.b.FIXED
            if (r8 != r7) goto L_0x00eb
            a.f.a.j.f$b r7 = r21.B()
            a.f.a.j.f$b r8 = a.f.a.j.f.b.FIXED
            if (r7 != r8) goto L_0x00eb
            java.util.List<a.f.a.j.h> r7 = r1.w0
            java.lang.Object r7 = r7.get(r15)
            a.f.a.j.h r7 = (a.f.a.j.h) r7
            java.util.List r7 = r7.d()
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.k0 = r7
            goto L_0x00f9
        L_0x00eb:
            java.util.List<a.f.a.j.h> r7 = r1.w0
            java.lang.Object r7 = r7.get(r15)
            a.f.a.j.h r7 = (a.f.a.j.h) r7
            java.util.List<a.f.a.j.f> r7 = r7.f226a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.k0 = r7
        L_0x00f9:
            r21.b1()
            java.util.ArrayList<a.f.a.j.f> r7 = r1.k0
            int r7 = r7.size()
            r8 = 0
        L_0x0103:
            if (r8 >= r7) goto L_0x011b
            java.util.ArrayList<a.f.a.j.f> r4 = r1.k0
            java.lang.Object r4 = r4.get(r8)
            a.f.a.j.f r4 = (a.f.a.j.f) r4
            boolean r9 = r4 instanceof a.f.a.j.p
            if (r9 == 0) goto L_0x0116
            a.f.a.j.p r4 = (a.f.a.j.p) r4
            r4.K0()
        L_0x0116:
            int r8 = r8 + 1
            r4 = 0
            r9 = 1
            goto L_0x0103
        L_0x011b:
            r4 = r0
            r0 = 0
            r8 = 1
        L_0x011e:
            if (r8 == 0) goto L_0x02d7
            r17 = r4
            r9 = 1
            int r4 = r0 + 1
            a.f.a.e r0 = r1.m0     // Catch:{ Exception -> 0x0162 }
            r0.E()     // Catch:{ Exception -> 0x0162 }
            r21.b1()     // Catch:{ Exception -> 0x0162 }
            a.f.a.e r0 = r1.m0     // Catch:{ Exception -> 0x0162 }
            r1.g(r0)     // Catch:{ Exception -> 0x0162 }
            r0 = 0
        L_0x0133:
            if (r0 >= r7) goto L_0x0149
            java.util.ArrayList<a.f.a.j.f> r9 = r1.k0     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ Exception -> 0x0162 }
            a.f.a.j.f r9 = (a.f.a.j.f) r9     // Catch:{ Exception -> 0x0162 }
            r18 = r8
            a.f.a.e r8 = r1.m0     // Catch:{ Exception -> 0x015e }
            r9.g(r8)     // Catch:{ Exception -> 0x015e }
            int r0 = r0 + 1
            r8 = r18
            goto L_0x0133
        L_0x0149:
            r18 = r8
            a.f.a.e r0 = r1.m0     // Catch:{ Exception -> 0x015e }
            boolean r8 = r1.O0(r0)     // Catch:{ Exception -> 0x015e }
            if (r8 == 0) goto L_0x015b
            a.f.a.e r0 = r1.m0     // Catch:{ Exception -> 0x0159 }
            r0.A()     // Catch:{ Exception -> 0x0159 }
            goto L_0x015b
        L_0x0159:
            r0 = move-exception
            goto L_0x0165
        L_0x015b:
            r19 = r12
            goto L_0x0184
        L_0x015e:
            r0 = move-exception
            r8 = r18
            goto L_0x0165
        L_0x0162:
            r0 = move-exception
            r18 = r8
        L_0x0165:
            r0.printStackTrace()
            java.io.PrintStream r9 = java.lang.System.out
            r18 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r8.append(r12)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r9.println(r0)
            r8 = r18
        L_0x0184:
            if (r8 == 0) goto L_0x018f
            a.f.a.e r8 = r1.m0
            boolean[] r9 = a.f.a.j.k.f233a
            r1.f1(r8, r9)
        L_0x018d:
            r9 = 2
            goto L_0x01d8
        L_0x018f:
            a.f.a.e r8 = r1.m0
            r1.G0(r8)
            r8 = 0
        L_0x0195:
            if (r8 >= r7) goto L_0x018d
            java.util.ArrayList<a.f.a.j.f> r9 = r1.k0
            java.lang.Object r9 = r9.get(r8)
            a.f.a.j.f r9 = (a.f.a.j.f) r9
            a.f.a.j.f$b[] r12 = r9.C
            r16 = 0
            r12 = r12[r16]
            a.f.a.j.f$b r0 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r12 != r0) goto L_0x01ba
            int r0 = r9.D()
            int r12 = r9.F()
            if (r0 >= r12) goto L_0x01ba
            boolean[] r0 = a.f.a.j.k.f233a
            r8 = 2
            r12 = 1
            r0[r8] = r12
            goto L_0x018d
        L_0x01ba:
            r12 = 1
            a.f.a.j.f$b[] r0 = r9.C
            r0 = r0[r12]
            a.f.a.j.f$b r12 = a.f.a.j.f.b.MATCH_CONSTRAINT
            if (r0 != r12) goto L_0x01d4
            int r0 = r9.r()
            int r9 = r9.E()
            if (r0 >= r9) goto L_0x01d4
            boolean[] r0 = a.f.a.j.k.f233a
            r8 = 1
            r9 = 2
            r0[r9] = r8
            goto L_0x01d8
        L_0x01d4:
            r9 = 2
            int r8 = r8 + 1
            goto L_0x0195
        L_0x01d8:
            if (r14 == 0) goto L_0x0250
            r8 = 8
            if (r4 >= r8) goto L_0x0250
            boolean[] r0 = a.f.a.j.k.f233a
            boolean r0 = r0[r9]
            if (r0 == 0) goto L_0x0250
            r0 = 0
            r9 = 0
            r12 = 0
        L_0x01e7:
            if (r0 >= r7) goto L_0x0211
            java.util.ArrayList<a.f.a.j.f> r8 = r1.k0
            java.lang.Object r8 = r8.get(r0)
            a.f.a.j.f r8 = (a.f.a.j.f) r8
            r18 = r4
            int r4 = r8.I
            int r20 = r8.D()
            int r4 = r4 + r20
            int r9 = java.lang.Math.max(r9, r4)
            int r4 = r8.J
            int r8 = r8.r()
            int r4 = r4 + r8
            int r12 = java.lang.Math.max(r12, r4)
            int r0 = r0 + 1
            r4 = r18
            r8 = 8
            goto L_0x01e7
        L_0x0211:
            r18 = r4
            int r0 = r1.R
            int r0 = java.lang.Math.max(r0, r9)
            int r4 = r1.S
            int r4 = java.lang.Math.max(r4, r12)
            a.f.a.j.f$b r8 = a.f.a.j.f.b.WRAP_CONTENT
            if (r11 != r8) goto L_0x0237
            int r8 = r21.D()
            if (r8 >= r0) goto L_0x0237
            r1.y0(r0)
            a.f.a.j.f$b[] r0 = r1.C
            a.f.a.j.f$b r8 = a.f.a.j.f.b.WRAP_CONTENT
            r9 = 0
            r0[r9] = r8
            r0 = 1
            r17 = 1
            goto L_0x0238
        L_0x0237:
            r0 = 0
        L_0x0238:
            a.f.a.j.f$b r8 = a.f.a.j.f.b.WRAP_CONTENT
            if (r10 != r8) goto L_0x0253
            int r8 = r21.r()
            if (r8 >= r4) goto L_0x0253
            r1.b0(r4)
            a.f.a.j.f$b[] r0 = r1.C
            a.f.a.j.f$b r4 = a.f.a.j.f.b.WRAP_CONTENT
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r17 = 1
            goto L_0x0253
        L_0x0250:
            r18 = r4
            r0 = 0
        L_0x0253:
            int r4 = r1.R
            int r8 = r21.D()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.D()
            if (r4 <= r8) goto L_0x0270
            r1.y0(r4)
            a.f.a.j.f$b[] r0 = r1.C
            a.f.a.j.f$b r4 = a.f.a.j.f.b.FIXED
            r8 = 0
            r0[r8] = r4
            r0 = 1
            r17 = 1
        L_0x0270:
            int r4 = r1.S
            int r8 = r21.r()
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r21.r()
            if (r4 <= r8) goto L_0x028d
            r1.b0(r4)
            a.f.a.j.f$b[] r0 = r1.C
            a.f.a.j.f$b r4 = a.f.a.j.f.b.FIXED
            r8 = 1
            r0[r8] = r4
            r0 = 1
            r9 = 1
            goto L_0x0290
        L_0x028d:
            r8 = 1
            r9 = r17
        L_0x0290:
            if (r9 != 0) goto L_0x02cf
            a.f.a.j.f$b[] r4 = r1.C
            r12 = 0
            r4 = r4[r12]
            a.f.a.j.f$b r12 = a.f.a.j.f.b.WRAP_CONTENT
            if (r4 != r12) goto L_0x02b1
            if (r5 <= 0) goto L_0x02b1
            int r4 = r21.D()
            if (r4 <= r5) goto L_0x02b1
            r1.E0 = r8
            a.f.a.j.f$b[] r0 = r1.C
            a.f.a.j.f$b r4 = a.f.a.j.f.b.FIXED
            r9 = 0
            r0[r9] = r4
            r1.y0(r5)
            r0 = 1
            r9 = 1
        L_0x02b1:
            a.f.a.j.f$b[] r4 = r1.C
            r4 = r4[r8]
            a.f.a.j.f$b r12 = a.f.a.j.f.b.WRAP_CONTENT
            if (r4 != r12) goto L_0x02cf
            if (r6 <= 0) goto L_0x02cf
            int r4 = r21.r()
            if (r4 <= r6) goto L_0x02cf
            r1.F0 = r8
            a.f.a.j.f$b[] r0 = r1.C
            a.f.a.j.f$b r4 = a.f.a.j.f.b.FIXED
            r0[r8] = r4
            r1.b0(r6)
            r4 = 1
            r8 = 1
            goto L_0x02d1
        L_0x02cf:
            r8 = r0
            r4 = r9
        L_0x02d1:
            r0 = r18
            r12 = r19
            goto L_0x011e
        L_0x02d7:
            r17 = r4
            r19 = r12
            java.util.List<a.f.a.j.h> r0 = r1.w0
            java.lang.Object r0 = r0.get(r15)
            a.f.a.j.h r0 = (a.f.a.j.h) r0
            r0.g()
            r0 = r17
        L_0x02e8:
            int r15 = r15 + 1
            r12 = r19
            r4 = 0
            r7 = 32
            r8 = 8
            r9 = 1
            goto L_0x00ae
        L_0x02f4:
            r1.k0 = r13
            a.f.a.j.f r4 = r1.D
            if (r4 == 0) goto L_0x0326
            int r2 = r1.R
            int r3 = r21.D()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.S
            int r4 = r21.r()
            int r3 = java.lang.Math.max(r3, r4)
            a.f.a.j.o r4 = r1.n0
            r4.a(r1)
            int r4 = r1.o0
            int r2 = r2 + r4
            int r4 = r1.q0
            int r2 = r2 + r4
            r1.y0(r2)
            int r2 = r1.p0
            int r3 = r3 + r2
            int r2 = r1.r0
            int r3 = r3 + r2
            r1.b0(r3)
            goto L_0x032a
        L_0x0326:
            r1.I = r2
            r1.J = r3
        L_0x032a:
            if (r0 == 0) goto L_0x0334
            a.f.a.j.f$b[] r0 = r1.C
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r10
        L_0x0334:
            a.f.a.e r0 = r1.m0
            a.f.a.c r0 = r0.w()
            r1.T(r0)
            a.f.a.j.g r0 = r21.J0()
            if (r1 != r0) goto L_0x0346
            r21.F0()
        L_0x0346:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.j.g.K0():void");
    }

    /* access modifiers changed from: package-private */
    public void N0(f fVar, int i) {
        if (i == 0) {
            P0(fVar);
        } else if (i == 1) {
            Q0(fVar);
        }
    }

    public boolean O0(e eVar) {
        b(eVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.k0.get(i);
            if (fVar instanceof g) {
                f.b[] bVarArr = fVar.C;
                f.b bVar = bVarArr[0];
                f.b bVar2 = bVarArr[1];
                if (bVar == f.b.WRAP_CONTENT) {
                    fVar.g0(f.b.FIXED);
                }
                if (bVar2 == f.b.WRAP_CONTENT) {
                    fVar.u0(f.b.FIXED);
                }
                fVar.b(eVar);
                if (bVar == f.b.WRAP_CONTENT) {
                    fVar.g0(bVar);
                }
                if (bVar2 == f.b.WRAP_CONTENT) {
                    fVar.u0(bVar2);
                }
            } else {
                k.c(this, eVar, fVar);
                fVar.b(eVar);
            }
        }
        if (this.s0 > 0) {
            c.a(this, eVar, 0);
        }
        if (this.t0 > 0) {
            c.a(this, eVar, 1);
        }
        return true;
    }

    public void Q() {
        this.m0.E();
        this.o0 = 0;
        this.q0 = 0;
        this.p0 = 0;
        this.r0 = 0;
        this.w0.clear();
        this.D0 = false;
        super.Q();
    }

    public int R0() {
        return this.C0;
    }

    public boolean S0() {
        return false;
    }

    public boolean T0() {
        return this.F0;
    }

    public boolean U0() {
        return this.l0;
    }

    public boolean V0() {
        return this.E0;
    }

    public void W0() {
        if (!X0(8)) {
            d(this.C0);
        }
        e1();
    }

    public boolean X0(int i) {
        return (this.C0 & i) == i;
    }

    public void Y0(int i, int i2) {
        m mVar;
        m mVar2;
        if (!(this.C[0] == f.b.WRAP_CONTENT || (mVar2 = this.f215c) == null)) {
            mVar2.h(i);
        }
        if (this.C[1] != f.b.WRAP_CONTENT && (mVar = this.f216d) != null) {
            mVar.h(i2);
        }
    }

    public void Z0() {
        int size = this.k0.size();
        S();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).S();
        }
    }

    public void a1() {
        Z0();
        d(this.C0);
    }

    public void c1(int i) {
        this.C0 = i;
    }

    public void d(int i) {
        super.d(i);
        int size = this.k0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k0.get(i2).d(i);
        }
    }

    public void d1(boolean z) {
        this.l0 = z;
    }

    public void e1() {
        l f2 = h(e.d.LEFT).f();
        l f3 = h(e.d.TOP).f();
        f2.l((l) null, 0.0f);
        f3.l((l) null, 0.0f);
    }

    public void f1(a.f.a.e eVar, boolean[] zArr) {
        zArr[2] = false;
        G0(eVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.k0.get(i);
            fVar.G0(eVar);
            if (fVar.C[0] == f.b.MATCH_CONSTRAINT && fVar.D() < fVar.F()) {
                zArr[2] = true;
            }
            if (fVar.C[1] == f.b.MATCH_CONSTRAINT && fVar.r() < fVar.E()) {
                zArr[2] = true;
            }
        }
    }
}
