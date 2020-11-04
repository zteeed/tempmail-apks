package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzll implements zzjx, zzkc {
    private static final int p = zzpo.l("qt  ");

    /* renamed from: a  reason: collision with root package name */
    private final zzpi f9015a = new zzpi(zzph.f9159a);

    /* renamed from: b  reason: collision with root package name */
    private final zzpi f9016b = new zzpi(4);

    /* renamed from: c  reason: collision with root package name */
    private final zzpi f9017c = new zzpi(16);

    /* renamed from: d  reason: collision with root package name */
    private final Stack<ac0> f9018d = new Stack<>();

    /* renamed from: e  reason: collision with root package name */
    private int f9019e;

    /* renamed from: f  reason: collision with root package name */
    private int f9020f;
    private long g;
    private int h;
    private zzpi i;
    private int j;
    private int k;
    private zzjz l;
    private qc0[] m;
    private long n;
    private boolean o;

    private final void h(long j2) throws zzht {
        zzme zzme;
        zzkb zzkb;
        zzlp b2;
        while (!this.f9018d.isEmpty() && this.f9018d.peek().P0 == j2) {
            ac0 pop = this.f9018d.pop();
            if (pop.f3640a == bc0.C) {
                long j3 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                long j4 = Long.MAX_VALUE;
                zzme zzme2 = null;
                zzkb zzkb2 = new zzkb();
                dc0 f2 = pop.f(bc0.A0);
                if (!(f2 == null || (zzme2 = cc0.d(f2, this.o)) == null)) {
                    zzkb2.a(zzme2);
                }
                int i2 = 0;
                while (i2 < pop.R0.size()) {
                    ac0 ac0 = pop.R0.get(i2);
                    if (ac0.f3640a == bc0.E && (b2 = cc0.b(ac0, pop.f(bc0.D), -9223372036854775807L, (zzjl) null, this.o)) != null) {
                        rc0 c2 = cc0.c(b2, ac0.g(bc0.F).g(bc0.G).g(bc0.H), zzkb2);
                        if (c2.f4992a != 0) {
                            qc0 qc0 = new qc0(b2, c2, this.l.e(i2, b2.f9024b));
                            zzhq p2 = b2.f9028f.p(c2.f4995d + 30);
                            if (b2.f9024b == 1) {
                                if (zzkb2.c()) {
                                    p2 = p2.l(zzkb2.f8992a, zzkb2.f8993b);
                                }
                                if (zzme2 != null) {
                                    p2 = p2.b(zzme2);
                                }
                            }
                            qc0.f4905c.b(p2);
                            zzme = zzme2;
                            zzkb = zzkb2;
                            j3 = Math.max(j3, b2.f9027e);
                            arrayList.add(qc0);
                            long j5 = c2.f4993b[0];
                            if (j5 < j4) {
                                j4 = j5;
                            }
                            i2++;
                            zzkb2 = zzkb;
                            zzme2 = zzme;
                        }
                    }
                    zzme = zzme2;
                    zzkb = zzkb2;
                    i2++;
                    zzkb2 = zzkb;
                    zzme2 = zzme;
                }
                this.n = j3;
                this.m = (qc0[]) arrayList.toArray(new qc0[arrayList.size()]);
                this.l.f();
                this.l.i(this);
                this.f9018d.clear();
                this.f9019e = 2;
            } else if (!this.f9018d.isEmpty()) {
                this.f9018d.peek().d(pop);
            }
        }
        if (this.f9019e != 2) {
            i();
        }
    }

    private final void i() {
        this.f9019e = 0;
        this.h = 0;
    }

    public final boolean a(zzjw zzjw) throws IOException, InterruptedException {
        return pc0.c(zzjw);
    }

    public final boolean b() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0188 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0295 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(com.google.android.gms.internal.ads.zzjw r24, com.google.android.gms.internal.ads.zzkd r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f9019e
            r4 = -1
            r5 = 8
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x0189
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x0109
            if (r3 != r10) goto L_0x0103
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = -1
        L_0x001e:
            com.google.android.gms.internal.ads.qc0[] r14 = r0.m
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003a
            r14 = r14[r3]
            int r15 = r14.f4906d
            com.google.android.gms.internal.ads.rc0 r14 = r14.f4904b
            int r11 = r14.f4992a
            if (r15 == r11) goto L_0x0037
            long[] r11 = r14.f4993b
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0037
            r5 = r3
            r12 = r14
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x003a:
            if (r5 != r4) goto L_0x003d
            return r4
        L_0x003d:
            r3 = r14[r5]
            com.google.android.gms.internal.ads.zzke r4 = r3.f4905c
            int r5 = r3.f4906d
            com.google.android.gms.internal.ads.rc0 r11 = r3.f4904b
            long[] r12 = r11.f4993b
            r13 = r12[r5]
            int[] r11 = r11.f4994c
            r11 = r11[r5]
            com.google.android.gms.internal.ads.zzlp r12 = r3.f4903a
            int r12 = r12.g
            if (r12 != r6) goto L_0x0059
            r16 = 8
            long r13 = r13 + r16
            int r11 = r11 + -8
        L_0x0059:
            long r16 = r24.getPosition()
            long r16 = r13 - r16
            int r12 = r0.j
            r18 = r11
            long r10 = (long) r12
            long r10 = r16 + r10
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 < 0) goto L_0x0100
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 < 0) goto L_0x0072
            goto L_0x0100
        L_0x0072:
            int r2 = (int) r10
            r1.d(r2)
            com.google.android.gms.internal.ads.zzlp r2 = r3.f4903a
            int r2 = r2.k
            if (r2 == 0) goto L_0x00c8
            com.google.android.gms.internal.ads.zzpi r8 = r0.f9016b
            byte[] r8 = r8.f9163a
            r8[r7] = r7
            r8[r6] = r7
            r9 = 2
            r8[r9] = r7
            int r8 = 4 - r2
            r11 = r18
        L_0x008b:
            int r9 = r0.j
            if (r9 >= r11) goto L_0x00e1
            int r9 = r0.k
            if (r9 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzpi r9 = r0.f9016b
            byte[] r9 = r9.f9163a
            r1.b(r9, r8, r2)
            com.google.android.gms.internal.ads.zzpi r9 = r0.f9016b
            r9.l(r7)
            com.google.android.gms.internal.ads.zzpi r9 = r0.f9016b
            int r9 = r9.v()
            r0.k = r9
            com.google.android.gms.internal.ads.zzpi r9 = r0.f9015a
            r9.l(r7)
            com.google.android.gms.internal.ads.zzpi r9 = r0.f9015a
            r10 = 4
            r4.a(r9, r10)
            int r9 = r0.j
            int r9 = r9 + r10
            r0.j = r9
            int r11 = r11 + r8
            goto L_0x008b
        L_0x00b9:
            int r9 = r4.c(r1, r9, r7)
            int r10 = r0.j
            int r10 = r10 + r9
            r0.j = r10
            int r10 = r0.k
            int r10 = r10 - r9
            r0.k = r10
            goto L_0x008b
        L_0x00c8:
            int r2 = r0.j
            r11 = r18
            if (r2 >= r11) goto L_0x00e1
            int r2 = r11 - r2
            int r2 = r4.c(r1, r2, r7)
            int r8 = r0.j
            int r8 = r8 + r2
            r0.j = r8
            int r8 = r0.k
            int r8 = r8 - r2
            r0.k = r8
            r18 = r11
            goto L_0x00c8
        L_0x00e1:
            r20 = r11
            com.google.android.gms.internal.ads.rc0 r1 = r3.f4904b
            long[] r2 = r1.f4996e
            r17 = r2[r5]
            int[] r1 = r1.f4997f
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.d(r17, r19, r20, r21, r22)
            int r1 = r3.f4906d
            int r1 = r1 + r6
            r3.f4906d = r1
            r0.j = r7
            r0.k = r7
            return r7
        L_0x0100:
            r2.f8994a = r13
            return r6
        L_0x0103:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0109:
            long r3 = r0.g
            int r10 = r0.h
            long r10 = (long) r10
            long r3 = r3 - r10
            long r10 = r24.getPosition()
            long r10 = r10 + r3
            com.google.android.gms.internal.ads.zzpi r12 = r0.i
            if (r12 == 0) goto L_0x0169
            byte[] r8 = r12.f9163a
            int r9 = r0.h
            int r4 = (int) r3
            r1.b(r8, r9, r4)
            int r3 = r0.f9020f
            int r4 = com.google.android.gms.internal.ads.bc0.f3635b
            if (r3 != r4) goto L_0x014c
            com.google.android.gms.internal.ads.zzpi r3 = r0.i
            r3.l(r5)
            int r4 = r3.d()
            int r5 = p
            if (r4 != r5) goto L_0x0135
        L_0x0133:
            r3 = 1
            goto L_0x0149
        L_0x0135:
            r4 = 4
            r3.m(r4)
        L_0x0139:
            int r4 = r3.q()
            if (r4 <= 0) goto L_0x0148
            int r4 = r3.d()
            int r5 = p
            if (r4 != r5) goto L_0x0139
            goto L_0x0133
        L_0x0148:
            r3 = 0
        L_0x0149:
            r0.o = r3
            goto L_0x0171
        L_0x014c:
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r3 = r0.f9018d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0171
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r3 = r0.f9018d
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.ac0 r3 = (com.google.android.gms.internal.ads.ac0) r3
            com.google.android.gms.internal.ads.dc0 r4 = new com.google.android.gms.internal.ads.dc0
            int r5 = r0.f9020f
            com.google.android.gms.internal.ads.zzpi r8 = r0.i
            r4.<init>(r5, r8)
            r3.e(r4)
            goto L_0x0171
        L_0x0169:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0173
            int r4 = (int) r3
            r1.d(r4)
        L_0x0171:
            r3 = 0
            goto L_0x017b
        L_0x0173:
            long r8 = r24.getPosition()
            long r8 = r8 + r3
            r2.f8994a = r8
            r3 = 1
        L_0x017b:
            r0.h(r10)
            if (r3 == 0) goto L_0x0186
            int r3 = r0.f9019e
            r4 = 2
            if (r3 == r4) goto L_0x0186
            r7 = 1
        L_0x0186:
            if (r7 == 0) goto L_0x0006
            return r6
        L_0x0189:
            int r3 = r0.h
            if (r3 != 0) goto L_0x01b1
            com.google.android.gms.internal.ads.zzpi r3 = r0.f9017c
            byte[] r3 = r3.f9163a
            boolean r3 = r1.g(r3, r7, r5, r6)
            if (r3 != 0) goto L_0x019a
            r6 = 0
            goto L_0x0293
        L_0x019a:
            r0.h = r5
            com.google.android.gms.internal.ads.zzpi r3 = r0.f9017c
            r3.l(r7)
            com.google.android.gms.internal.ads.zzpi r3 = r0.f9017c
            long r8 = r3.s()
            r0.g = r8
            com.google.android.gms.internal.ads.zzpi r3 = r0.f9017c
            int r3 = r3.d()
            r0.f9020f = r3
        L_0x01b1:
            long r8 = r0.g
            r10 = 1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x01cd
            com.google.android.gms.internal.ads.zzpi r3 = r0.f9017c
            byte[] r3 = r3.f9163a
            r1.b(r3, r5, r5)
            int r3 = r0.h
            int r3 = r3 + r5
            r0.h = r3
            com.google.android.gms.internal.ads.zzpi r3 = r0.f9017c
            long r8 = r3.w()
            r0.g = r8
        L_0x01cd:
            int r3 = r0.f9020f
            int r8 = com.google.android.gms.internal.ads.bc0.C
            if (r3 == r8) goto L_0x01ea
            int r8 = com.google.android.gms.internal.ads.bc0.E
            if (r3 == r8) goto L_0x01ea
            int r8 = com.google.android.gms.internal.ads.bc0.F
            if (r3 == r8) goto L_0x01ea
            int r8 = com.google.android.gms.internal.ads.bc0.G
            if (r3 == r8) goto L_0x01ea
            int r8 = com.google.android.gms.internal.ads.bc0.H
            if (r3 == r8) goto L_0x01ea
            int r8 = com.google.android.gms.internal.ads.bc0.Q
            if (r3 != r8) goto L_0x01e8
            goto L_0x01ea
        L_0x01e8:
            r3 = 0
            goto L_0x01eb
        L_0x01ea:
            r3 = 1
        L_0x01eb:
            if (r3 == 0) goto L_0x0217
            long r7 = r24.getPosition()
            long r9 = r0.g
            long r7 = r7 + r9
            int r3 = r0.h
            long r9 = (long) r3
            long r7 = r7 - r9
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r3 = r0.f9018d
            com.google.android.gms.internal.ads.ac0 r5 = new com.google.android.gms.internal.ads.ac0
            int r9 = r0.f9020f
            r5.<init>(r9, r7)
            r3.add(r5)
            long r9 = r0.g
            int r3 = r0.h
            long r11 = (long) r3
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0212
            r0.h(r7)
            goto L_0x0293
        L_0x0212:
            r23.i()
            goto L_0x0293
        L_0x0217:
            int r3 = r0.f9020f
            int r8 = com.google.android.gms.internal.ads.bc0.S
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.D
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.T
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.U
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.m0
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.n0
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.o0
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.R
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.p0
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.q0
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.r0
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.s0
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.t0
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.P
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.f3635b
            if (r3 == r8) goto L_0x025c
            int r8 = com.google.android.gms.internal.ads.bc0.A0
            if (r3 != r8) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            r3 = 0
            goto L_0x025d
        L_0x025c:
            r3 = 1
        L_0x025d:
            if (r3 == 0) goto L_0x028e
            int r3 = r0.h
            if (r3 != r5) goto L_0x0265
            r3 = 1
            goto L_0x0266
        L_0x0265:
            r3 = 0
        L_0x0266:
            com.google.android.gms.internal.ads.zzpb.e(r3)
            long r8 = r0.g
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0274
            r3 = 1
            goto L_0x0275
        L_0x0274:
            r3 = 0
        L_0x0275:
            com.google.android.gms.internal.ads.zzpb.e(r3)
            com.google.android.gms.internal.ads.zzpi r3 = new com.google.android.gms.internal.ads.zzpi
            long r8 = r0.g
            int r9 = (int) r8
            r3.<init>((int) r9)
            r0.i = r3
            com.google.android.gms.internal.ads.zzpi r8 = r0.f9017c
            byte[] r8 = r8.f9163a
            byte[] r3 = r3.f9163a
            java.lang.System.arraycopy(r8, r7, r3, r7, r5)
            r0.f9019e = r6
            goto L_0x0293
        L_0x028e:
            r3 = 0
            r0.i = r3
            r0.f9019e = r6
        L_0x0293:
            if (r6 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzll.c(com.google.android.gms.internal.ads.zzjw, com.google.android.gms.internal.ads.zzkd):int");
    }

    public final long d(long j2) {
        long j3 = Long.MAX_VALUE;
        for (qc0 qc0 : this.m) {
            rc0 rc0 = qc0.f4904b;
            int a2 = rc0.a(j2);
            if (a2 == -1) {
                a2 = rc0.b(j2);
            }
            long j4 = rc0.f4993b[a2];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    public final void e(zzjz zzjz) {
        this.l = zzjz;
    }

    public final void f(long j2, long j3) {
        this.f9018d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j2 == 0) {
            i();
            return;
        }
        qc0[] qc0Arr = this.m;
        if (qc0Arr != null) {
            for (qc0 qc0 : qc0Arr) {
                rc0 rc0 = qc0.f4904b;
                int a2 = rc0.a(j3);
                if (a2 == -1) {
                    a2 = rc0.b(j3);
                }
                qc0.f4906d = a2;
            }
        }
    }

    public final long g() {
        return this.n;
    }

    public final void release() {
    }
}
