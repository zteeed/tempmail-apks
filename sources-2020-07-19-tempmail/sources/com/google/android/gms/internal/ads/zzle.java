package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzle implements zzjx {
    private static final int D = zzpo.l("seig");
    private static final byte[] E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private zzke A;
    private zzke[] B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    private final int f8821a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<oc0> f8822b;

    /* renamed from: c  reason: collision with root package name */
    private final zzpi f8823c;

    /* renamed from: d  reason: collision with root package name */
    private final zzpi f8824d;

    /* renamed from: e  reason: collision with root package name */
    private final zzpi f8825e;

    /* renamed from: f  reason: collision with root package name */
    private final zzpi f8826f;
    private final zzpm g;
    private final zzpi h;
    private final byte[] i;
    private final Stack<ac0> j;
    private final LinkedList<mc0> k;
    private int l;
    private int m;
    private long n;
    private int o;
    private zzpi p;
    private long q;
    private int r;
    private long s;
    private long t;
    private oc0 u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private zzjz z;

    public zzle() {
        this(0);
    }

    private static void b(zzpi zzpi, int i2, sc0 sc0) throws zzht {
        zzpi.l(i2 + 8);
        int b2 = bc0.b(zzpi.d());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int v2 = zzpi.v();
            if (v2 == sc0.f4899f) {
                Arrays.fill(sc0.n, 0, v2, z2);
                sc0.a(zzpi.q());
                zzpi.p(sc0.q.f8980a, 0, sc0.p);
                sc0.q.l(0);
                sc0.r = false;
                return;
            }
            int i3 = sc0.f4899f;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(v2);
            sb.append(", ");
            sb.append(i3);
            throw new zzht(sb.toString());
        }
        throw new zzht("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzjl d(java.util.List<com.google.android.gms.internal.ads.dc0> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b9
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.dc0 r5 = (com.google.android.gms.internal.ads.dc0) r5
            int r6 = r5.f3457a
            int r7 = com.google.android.gms.internal.ads.bc0.V
            if (r6 != r7) goto L_0x00b5
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.google.android.gms.internal.ads.zzpi r5 = r5.P0
            byte[] r5 = r5.f8980a
            com.google.android.gms.internal.ads.zzpi r6 = new com.google.android.gms.internal.ads.zzpi
            r6.<init>((byte[]) r5)
            int r7 = r6.c()
            r8 = 32
            if (r7 >= r8) goto L_0x0030
        L_0x002e:
            r6 = r2
            goto L_0x0099
        L_0x0030:
            r6.l(r1)
            int r7 = r6.d()
            int r8 = r6.q()
            int r8 = r8 + 4
            if (r7 == r8) goto L_0x0040
            goto L_0x002e
        L_0x0040:
            int r7 = r6.d()
            int r8 = com.google.android.gms.internal.ads.bc0.V
            if (r7 == r8) goto L_0x0049
            goto L_0x002e
        L_0x0049:
            int r7 = r6.d()
            int r7 = com.google.android.gms.internal.ads.bc0.a(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x006d
            r6 = 37
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "Unsupported pssh version: "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x002e
        L_0x006d:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.e()
            long r12 = r6.e()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0085
            int r7 = r6.v()
            int r7 = r7 << 4
            r6.m(r7)
        L_0x0085:
            int r7 = r6.v()
            int r8 = r6.q()
            if (r7 == r8) goto L_0x0090
            goto L_0x002e
        L_0x0090:
            byte[] r8 = new byte[r7]
            r6.p(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x0099:
            if (r6 != 0) goto L_0x009d
            r6 = r2
            goto L_0x00a1
        L_0x009d:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x00a1:
            if (r6 != 0) goto L_0x00ab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b5
        L_0x00ab:
            com.google.android.gms.internal.ads.zzjl$zza r7 = new com.google.android.gms.internal.ads.zzjl$zza
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        L_0x00b5:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b9:
            if (r4 != 0) goto L_0x00bc
            return r2
        L_0x00bc:
            com.google.android.gms.internal.ads.zzjl r14 = new com.google.android.gms.internal.ads.zzjl
            r14.<init>((java.util.List<com.google.android.gms.internal.ads.zzjl.zza>) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzle.d(java.util.List):com.google.android.gms.internal.ads.zzjl");
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x064b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g(long r54) throws com.google.android.gms.internal.ads.zzht {
        /*
            r53 = this;
            r0 = r53
        L_0x0002:
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r1 = r0.j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x06ea
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r1 = r0.j
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.ac0 r1 = (com.google.android.gms.internal.ads.ac0) r1
            long r1 = r1.P0
            int r3 = (r1 > r54 ? 1 : (r1 == r54 ? 0 : -1))
            if (r3 != 0) goto L_0x06ea
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r1 = r0.j
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.ac0 r1 = (com.google.android.gms.internal.ads.ac0) r1
            int r2 = r1.f3457a
            int r3 = com.google.android.gms.internal.ads.bc0.C
            r4 = 0
            r5 = 12
            r6 = 4
            r7 = 8
            r9 = 1
            if (r2 != r3) goto L_0x01c6
            java.lang.String r2 = "Unexpected moov box."
            com.google.android.gms.internal.ads.zzpb.f(r9, r2)
            java.util.List<com.google.android.gms.internal.ads.dc0> r2 = r1.Q0
            com.google.android.gms.internal.ads.zzjl r2 = d(r2)
            int r3 = com.google.android.gms.internal.ads.bc0.N
            com.google.android.gms.internal.ads.ac0 r3 = r1.g(r3)
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.gms.internal.ads.dc0> r12 = r3.Q0
            int r12 = r12.size()
            r16 = r10
            r10 = 0
        L_0x0051:
            if (r10 >= r12) goto L_0x00bc
            java.util.List<com.google.android.gms.internal.ads.dc0> r11 = r3.Q0
            java.lang.Object r11 = r11.get(r10)
            com.google.android.gms.internal.ads.dc0 r11 = (com.google.android.gms.internal.ads.dc0) r11
            int r13 = r11.f3457a
            int r14 = com.google.android.gms.internal.ads.bc0.z
            if (r13 != r14) goto L_0x0098
            com.google.android.gms.internal.ads.zzpi r11 = r11.P0
            r11.l(r5)
            int r13 = r11.d()
            int r14 = r11.v()
            int r14 = r14 - r9
            int r5 = r11.v()
            int r8 = r11.v()
            int r11 = r11.d()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.google.android.gms.internal.ads.lc0 r9 = new com.google.android.gms.internal.ads.lc0
            r9.<init>(r14, r5, r8, r11)
            android.util.Pair r5 = android.util.Pair.create(r13, r9)
            java.lang.Object r8 = r5.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r5 = r5.second
            com.google.android.gms.internal.ads.lc0 r5 = (com.google.android.gms.internal.ads.lc0) r5
            r15.put(r8, r5)
            goto L_0x00b6
        L_0x0098:
            int r5 = com.google.android.gms.internal.ads.bc0.O
            if (r13 != r5) goto L_0x00b6
            com.google.android.gms.internal.ads.zzpi r5 = r11.P0
            r5.l(r7)
            int r8 = r5.d()
            int r8 = com.google.android.gms.internal.ads.bc0.a(r8)
            if (r8 != 0) goto L_0x00b0
            long r8 = r5.s()
            goto L_0x00b4
        L_0x00b0:
            long r8 = r5.w()
        L_0x00b4:
            r16 = r8
        L_0x00b6:
            int r10 = r10 + 1
            r5 = 12
            r9 = 1
            goto L_0x0051
        L_0x00bc:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.google.android.gms.internal.ads.ac0> r5 = r1.R0
            int r5 = r5.size()
            r8 = 0
        L_0x00c8:
            if (r8 >= r5) goto L_0x00f8
            java.util.List<com.google.android.gms.internal.ads.ac0> r9 = r1.R0
            java.lang.Object r9 = r9.get(r8)
            r10 = r9
            com.google.android.gms.internal.ads.ac0 r10 = (com.google.android.gms.internal.ads.ac0) r10
            int r9 = r10.f3457a
            int r11 = com.google.android.gms.internal.ads.bc0.E
            if (r9 != r11) goto L_0x00f1
            int r9 = com.google.android.gms.internal.ads.bc0.D
            com.google.android.gms.internal.ads.dc0 r11 = r1.f(r9)
            r9 = 0
            r12 = r16
            r14 = r2
            r7 = r15
            r15 = r9
            com.google.android.gms.internal.ads.zzlp r9 = com.google.android.gms.internal.ads.cc0.b(r10, r11, r12, r14, r15)
            if (r9 == 0) goto L_0x00f2
            int r10 = r9.f8840a
            r3.put(r10, r9)
            goto L_0x00f2
        L_0x00f1:
            r7 = r15
        L_0x00f2:
            int r8 = r8 + 1
            r15 = r7
            r7 = 8
            goto L_0x00c8
        L_0x00f8:
            r7 = r15
            int r1 = r3.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r2 = r0.f8822b
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0197
            r2 = 0
        L_0x0106:
            if (r2 >= r1) goto L_0x013a
            java.lang.Object r5 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzlp r5 = (com.google.android.gms.internal.ads.zzlp) r5
            com.google.android.gms.internal.ads.oc0 r8 = new com.google.android.gms.internal.ads.oc0
            com.google.android.gms.internal.ads.zzjz r9 = r0.z
            int r10 = r5.f8841b
            com.google.android.gms.internal.ads.zzke r9 = r9.e(r2, r10)
            r8.<init>(r9)
            int r9 = r5.f8840a
            java.lang.Object r9 = r7.get(r9)
            com.google.android.gms.internal.ads.lc0 r9 = (com.google.android.gms.internal.ads.lc0) r9
            r8.b(r5, r9)
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r9 = r0.f8822b
            int r10 = r5.f8840a
            r9.put(r10, r8)
            long r8 = r0.s
            long r10 = r5.f8844e
            long r8 = java.lang.Math.max(r8, r10)
            r0.s = r8
            int r2 = r2 + 1
            goto L_0x0106
        L_0x013a:
            int r1 = r0.f8821a
            r1 = r1 & r6
            if (r1 == 0) goto L_0x015f
            com.google.android.gms.internal.ads.zzke r1 = r0.A
            if (r1 != 0) goto L_0x015f
            com.google.android.gms.internal.ads.zzjz r1 = r0.z
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r2 = r0.f8822b
            int r2 = r2.size()
            com.google.android.gms.internal.ads.zzke r1 = r1.e(r2, r6)
            r0.A = r1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r5 = "application/x-emsg"
            com.google.android.gms.internal.ads.zzhq r2 = com.google.android.gms.internal.ads.zzhq.c(r4, r5, r2)
            r1.b(r2)
        L_0x015f:
            int r1 = r0.f8821a
            r2 = 8
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0190
            com.google.android.gms.internal.ads.zzke[] r1 = r0.B
            if (r1 != 0) goto L_0x0190
            com.google.android.gms.internal.ads.zzjz r1 = r0.z
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r2 = r0.f8822b
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 + r3
            r3 = 3
            com.google.android.gms.internal.ads.zzke r1 = r1.e(r2, r3)
            r2 = 0
            r4 = 0
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = "application/cea-608"
            com.google.android.gms.internal.ads.zzhq r2 = com.google.android.gms.internal.ads.zzhq.h(r2, r3, r4, r5, r6, r7, r8)
            r1.b(r2)
            r2 = 1
            com.google.android.gms.internal.ads.zzke[] r2 = new com.google.android.gms.internal.ads.zzke[r2]
            r3 = 0
            r2[r3] = r1
            r0.B = r2
        L_0x0190:
            com.google.android.gms.internal.ads.zzjz r1 = r0.z
            r1.f()
            goto L_0x0002
        L_0x0197:
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r2 = r0.f8822b
            int r2 = r2.size()
            if (r2 != r1) goto L_0x01a1
            r9 = 1
            goto L_0x01a2
        L_0x01a1:
            r9 = 0
        L_0x01a2:
            com.google.android.gms.internal.ads.zzpb.e(r9)
            r8 = 0
        L_0x01a6:
            if (r8 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r8)
            com.google.android.gms.internal.ads.zzlp r2 = (com.google.android.gms.internal.ads.zzlp) r2
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r4 = r0.f8822b
            int r5 = r2.f8840a
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.ads.oc0 r4 = (com.google.android.gms.internal.ads.oc0) r4
            int r5 = r2.f8840a
            java.lang.Object r5 = r7.get(r5)
            com.google.android.gms.internal.ads.lc0 r5 = (com.google.android.gms.internal.ads.lc0) r5
            r4.b(r2, r5)
            int r8 = r8 + 1
            goto L_0x01a6
        L_0x01c6:
            int r3 = com.google.android.gms.internal.ads.bc0.L
            if (r2 != r3) goto L_0x06d3
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r2 = r0.f8822b
            int r3 = r0.f8821a
            byte[] r5 = r0.i
            java.util.List<com.google.android.gms.internal.ads.ac0> r7 = r1.R0
            int r7 = r7.size()
            r8 = 0
        L_0x01d7:
            if (r8 >= r7) goto L_0x06a7
            java.util.List<com.google.android.gms.internal.ads.ac0> r9 = r1.R0
            java.lang.Object r9 = r9.get(r8)
            com.google.android.gms.internal.ads.ac0 r9 = (com.google.android.gms.internal.ads.ac0) r9
            int r10 = r9.f3457a
            int r11 = com.google.android.gms.internal.ads.bc0.M
            if (r10 != r11) goto L_0x0686
            int r10 = com.google.android.gms.internal.ads.bc0.y
            com.google.android.gms.internal.ads.dc0 r10 = r9.f(r10)
            com.google.android.gms.internal.ads.zzpi r10 = r10.P0
            r11 = 8
            r10.l(r11)
            int r11 = r10.d()
            int r11 = com.google.android.gms.internal.ads.bc0.b(r11)
            int r12 = r10.d()
            r13 = r3 & 16
            if (r13 != 0) goto L_0x0205
            goto L_0x0206
        L_0x0205:
            r12 = 0
        L_0x0206:
            java.lang.Object r12 = r2.get(r12)
            com.google.android.gms.internal.ads.oc0 r12 = (com.google.android.gms.internal.ads.oc0) r12
            if (r12 != 0) goto L_0x0210
            r12 = r4
            goto L_0x0259
        L_0x0210:
            r13 = r11 & 1
            if (r13 == 0) goto L_0x021e
            long r13 = r10.w()
            com.google.android.gms.internal.ads.sc0 r15 = r12.f4545a
            r15.f4896c = r13
            r15.f4897d = r13
        L_0x021e:
            com.google.android.gms.internal.ads.lc0 r13 = r12.f4548d
            r14 = r11 & 2
            if (r14 == 0) goto L_0x022b
            int r14 = r10.v()
            r15 = 1
            int r14 = r14 - r15
            goto L_0x022d
        L_0x022b:
            int r14 = r13.f4294a
        L_0x022d:
            r15 = r11 & 8
            if (r15 == 0) goto L_0x0236
            int r15 = r10.v()
            goto L_0x0238
        L_0x0236:
            int r15 = r13.f4295b
        L_0x0238:
            r16 = r11 & 16
            if (r16 == 0) goto L_0x0243
            int r16 = r10.v()
            r4 = r16
            goto L_0x0245
        L_0x0243:
            int r4 = r13.f4296c
        L_0x0245:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x024e
            int r10 = r10.v()
            goto L_0x0250
        L_0x024e:
            int r10 = r13.f4297d
        L_0x0250:
            com.google.android.gms.internal.ads.sc0 r11 = r12.f4545a
            com.google.android.gms.internal.ads.lc0 r13 = new com.google.android.gms.internal.ads.lc0
            r13.<init>(r14, r15, r4, r10)
            r11.f4894a = r13
        L_0x0259:
            if (r12 == 0) goto L_0x0686
            com.google.android.gms.internal.ads.sc0 r4 = r12.f4545a
            long r10 = r4.s
            r12.a()
            int r13 = com.google.android.gms.internal.ads.bc0.x
            com.google.android.gms.internal.ads.dc0 r13 = r9.f(r13)
            if (r13 == 0) goto L_0x028f
            r13 = r3 & 2
            if (r13 != 0) goto L_0x028f
            int r10 = com.google.android.gms.internal.ads.bc0.x
            com.google.android.gms.internal.ads.dc0 r10 = r9.f(r10)
            com.google.android.gms.internal.ads.zzpi r10 = r10.P0
            r11 = 8
            r10.l(r11)
            int r11 = r10.d()
            int r11 = com.google.android.gms.internal.ads.bc0.a(r11)
            r13 = 1
            if (r11 != r13) goto L_0x028b
            long r10 = r10.w()
            goto L_0x028f
        L_0x028b:
            long r10 = r10.s()
        L_0x028f:
            java.util.List<com.google.android.gms.internal.ads.dc0> r13 = r9.Q0
            int r14 = r13.size()
            r19 = r2
            r2 = 0
            r6 = 0
            r15 = 0
        L_0x029a:
            if (r15 >= r14) goto L_0x02c8
            java.lang.Object r20 = r13.get(r15)
            r21 = r7
            r7 = r20
            com.google.android.gms.internal.ads.dc0 r7 = (com.google.android.gms.internal.ads.dc0) r7
            r22 = r10
            int r10 = r7.f3457a
            int r11 = com.google.android.gms.internal.ads.bc0.A
            if (r10 != r11) goto L_0x02bf
            com.google.android.gms.internal.ads.zzpi r7 = r7.P0
            r10 = 12
            r7.l(r10)
            int r7 = r7.v()
            if (r7 <= 0) goto L_0x02c1
            int r2 = r2 + r7
            int r6 = r6 + 1
            goto L_0x02c1
        L_0x02bf:
            r10 = 12
        L_0x02c1:
            int r15 = r15 + 1
            r7 = r21
            r10 = r22
            goto L_0x029a
        L_0x02c8:
            r21 = r7
            r22 = r10
            r7 = 0
            r10 = 12
            r12.g = r7
            r12.f4550f = r7
            r12.f4549e = r7
            com.google.android.gms.internal.ads.sc0 r7 = r12.f4545a
            r7.f4898e = r6
            r7.f4899f = r2
            int[] r11 = r7.h
            if (r11 == 0) goto L_0x02e2
            int r11 = r11.length
            if (r11 >= r6) goto L_0x02ea
        L_0x02e2:
            long[] r11 = new long[r6]
            r7.g = r11
            int[] r6 = new int[r6]
            r7.h = r6
        L_0x02ea:
            int[] r6 = r7.i
            if (r6 == 0) goto L_0x02f1
            int r6 = r6.length
            if (r6 >= r2) goto L_0x0309
        L_0x02f1:
            int r2 = r2 * 125
            int r2 = r2 / 100
            int[] r6 = new int[r2]
            r7.i = r6
            int[] r6 = new int[r2]
            r7.j = r6
            long[] r6 = new long[r2]
            r7.k = r6
            boolean[] r6 = new boolean[r2]
            r7.l = r6
            boolean[] r2 = new boolean[r2]
            r7.n = r2
        L_0x0309:
            r2 = 0
            r6 = 0
            r7 = 0
        L_0x030c:
            r24 = 0
            if (r2 >= r14) goto L_0x04a4
            java.lang.Object r18 = r13.get(r2)
            r10 = r18
            com.google.android.gms.internal.ads.dc0 r10 = (com.google.android.gms.internal.ads.dc0) r10
            int r15 = r10.f3457a
            int r11 = com.google.android.gms.internal.ads.bc0.A
            if (r15 != r11) goto L_0x0475
            int r11 = r6 + 1
            com.google.android.gms.internal.ads.zzpi r10 = r10.P0
            r15 = 8
            r10.l(r15)
            int r15 = r10.d()
            int r15 = com.google.android.gms.internal.ads.bc0.b(r15)
            r27 = r11
            com.google.android.gms.internal.ads.zzlp r11 = r12.f4547c
            r28 = r13
            com.google.android.gms.internal.ads.sc0 r13 = r12.f4545a
            r29 = r14
            com.google.android.gms.internal.ads.lc0 r14 = r13.f4894a
            int[] r0 = r13.h
            int r30 = r10.v()
            r0[r6] = r30
            long[] r0 = r13.g
            r31 = r4
            r30 = r5
            long r4 = r13.f4896c
            r0[r6] = r4
            r4 = r15 & 1
            if (r4 == 0) goto L_0x0362
            r4 = r0[r6]
            r32 = r1
            int r1 = r10.d()
            r33 = r8
            r34 = r9
            long r8 = (long) r1
            long r4 = r4 + r8
            r0[r6] = r4
            goto L_0x0368
        L_0x0362:
            r32 = r1
            r33 = r8
            r34 = r9
        L_0x0368:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x036e
            r0 = 1
            goto L_0x036f
        L_0x036e:
            r0 = 0
        L_0x036f:
            int r1 = r14.f4297d
            if (r0 == 0) goto L_0x0377
            int r1 = r10.v()
        L_0x0377:
            r4 = r15 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x037d
            r4 = 1
            goto L_0x037e
        L_0x037d:
            r4 = 0
        L_0x037e:
            r5 = r15 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0384
            r5 = 1
            goto L_0x0385
        L_0x0384:
            r5 = 0
        L_0x0385:
            r8 = r15 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x038b
            r8 = 1
            goto L_0x038c
        L_0x038b:
            r8 = 0
        L_0x038c:
            r9 = r15 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0392
            r9 = 1
            goto L_0x0393
        L_0x0392:
            r9 = 0
        L_0x0393:
            long[] r15 = r11.i
            r35 = r1
            if (r15 == 0) goto L_0x03b6
            int r1 = r15.length
            r36 = r12
            r12 = 1
            if (r1 != r12) goto L_0x03b8
            r1 = 0
            r37 = r15[r1]
            int r12 = (r37 > r24 ? 1 : (r37 == r24 ? 0 : -1))
            if (r12 != 0) goto L_0x03b8
            long[] r12 = r11.j
            r37 = r12[r1]
            r39 = 1000(0x3e8, double:4.94E-321)
            r12 = r2
            long r1 = r11.f8842c
            r41 = r1
            long r24 = com.google.android.gms.internal.ads.zzpo.c(r37, r39, r41)
            goto L_0x03b9
        L_0x03b6:
            r36 = r12
        L_0x03b8:
            r12 = r2
        L_0x03b9:
            int[] r1 = r13.i
            int[] r2 = r13.j
            long[] r15 = r13.k
            r37 = r12
            boolean[] r12 = r13.l
            r38 = r12
            int r12 = r11.f8841b
            r39 = r1
            r1 = 2
            if (r12 != r1) goto L_0x03d2
            r1 = r3 & 1
            if (r1 == 0) goto L_0x03d2
            r1 = 1
            goto L_0x03d3
        L_0x03d2:
            r1 = 0
        L_0x03d3:
            int[] r12 = r13.h
            r12 = r12[r6]
            int r12 = r12 + r7
            r46 = r1
            r26 = r2
            long r1 = r11.f8842c
            r11 = r7
            if (r6 <= 0) goto L_0x03e4
            long r6 = r13.s
            goto L_0x03e6
        L_0x03e4:
            r6 = r22
        L_0x03e6:
            if (r11 >= r12) goto L_0x046d
            if (r4 == 0) goto L_0x03f3
            int r40 = r10.v()
            r47 = r3
            r3 = r40
            goto L_0x03f7
        L_0x03f3:
            r47 = r3
            int r3 = r14.f4295b
        L_0x03f7:
            if (r5 == 0) goto L_0x0402
            int r40 = r10.v()
            r48 = r4
            r4 = r40
            goto L_0x0406
        L_0x0402:
            r48 = r4
            int r4 = r14.f4296c
        L_0x0406:
            if (r11 != 0) goto L_0x040f
            if (r0 == 0) goto L_0x040f
            r49 = r0
            r0 = r35
            goto L_0x041e
        L_0x040f:
            if (r8 == 0) goto L_0x041a
            int r40 = r10.d()
            r49 = r0
            r0 = r40
            goto L_0x041e
        L_0x041a:
            r49 = r0
            int r0 = r14.f4297d
        L_0x041e:
            if (r9 == 0) goto L_0x0432
            r50 = r5
            int r5 = r10.d()
            int r5 = r5 * 1000
            r51 = r8
            r52 = r9
            long r8 = (long) r5
            long r8 = r8 / r1
            int r5 = (int) r8
            r26[r11] = r5
            goto L_0x043b
        L_0x0432:
            r50 = r5
            r51 = r8
            r52 = r9
            r5 = 0
            r26[r11] = r5
        L_0x043b:
            r42 = 1000(0x3e8, double:4.94E-321)
            r40 = r6
            r44 = r1
            long r8 = com.google.android.gms.internal.ads.zzpo.c(r40, r42, r44)
            long r8 = r8 - r24
            r15[r11] = r8
            r39[r11] = r4
            r4 = 16
            int r0 = r0 >> r4
            r4 = 1
            r0 = r0 & r4
            if (r0 != 0) goto L_0x0458
            if (r46 == 0) goto L_0x0456
            if (r11 != 0) goto L_0x0458
        L_0x0456:
            r0 = 1
            goto L_0x0459
        L_0x0458:
            r0 = 0
        L_0x0459:
            r38[r11] = r0
            long r3 = (long) r3
            long r6 = r6 + r3
            int r11 = r11 + 1
            r3 = r47
            r4 = r48
            r0 = r49
            r5 = r50
            r8 = r51
            r9 = r52
            goto L_0x03e6
        L_0x046d:
            r47 = r3
            r13.s = r6
            r7 = r12
            r6 = r27
            goto L_0x048a
        L_0x0475:
            r32 = r1
            r37 = r2
            r47 = r3
            r31 = r4
            r30 = r5
            r11 = r7
            r33 = r8
            r34 = r9
            r36 = r12
            r28 = r13
            r29 = r14
        L_0x048a:
            int r2 = r37 + 1
            r0 = r53
            r13 = r28
            r14 = r29
            r5 = r30
            r4 = r31
            r1 = r32
            r8 = r33
            r9 = r34
            r12 = r36
            r3 = r47
            r10 = 12
            goto L_0x030c
        L_0x04a4:
            r32 = r1
            r47 = r3
            r31 = r4
            r30 = r5
            r33 = r8
            r34 = r9
            r36 = r12
            int r0 = com.google.android.gms.internal.ads.bc0.d0
            com.google.android.gms.internal.ads.dc0 r0 = r9.f(r0)
            if (r0 == 0) goto L_0x0539
            r4 = r36
            com.google.android.gms.internal.ads.zzlp r1 = r4.f4547c
            com.google.android.gms.internal.ads.zzlo[] r1 = r1.h
            r2 = r31
            com.google.android.gms.internal.ads.lc0 r3 = r2.f4894a
            int r3 = r3.f4294a
            r1 = r1[r3]
            com.google.android.gms.internal.ads.zzpi r0 = r0.P0
            int r1 = r1.f8838a
            r3 = 8
            r0.l(r3)
            int r4 = r0.d()
            int r4 = com.google.android.gms.internal.ads.bc0.b(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04e0
            r0.m(r3)
        L_0x04e0:
            int r3 = r0.g()
            int r4 = r0.v()
            int r5 = r2.f4899f
            if (r4 != r5) goto L_0x0516
            if (r3 != 0) goto L_0x0503
            boolean[] r3 = r2.n
            r5 = 0
            r6 = 0
        L_0x04f2:
            if (r5 >= r4) goto L_0x0512
            int r7 = r0.g()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x04fd
            r7 = 1
            goto L_0x04fe
        L_0x04fd:
            r7 = 0
        L_0x04fe:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x04f2
        L_0x0503:
            if (r3 <= r1) goto L_0x0507
            r0 = 1
            goto L_0x0508
        L_0x0507:
            r0 = 0
        L_0x0508:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.n
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x0512:
            r2.a(r6)
            goto L_0x053b
        L_0x0516:
            com.google.android.gms.internal.ads.zzht r0 = new com.google.android.gms.internal.ads.zzht
            int r1 = r2.f4899f
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Length mismatch: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ", "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0539:
            r2 = r31
        L_0x053b:
            int r0 = com.google.android.gms.internal.ads.bc0.e0
            com.google.android.gms.internal.ads.dc0 r0 = r9.f(r0)
            if (r0 == 0) goto L_0x058d
            com.google.android.gms.internal.ads.zzpi r0 = r0.P0
            r1 = 8
            r0.l(r1)
            int r3 = r0.d()
            int r4 = com.google.android.gms.internal.ads.bc0.b(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0559
            r0.m(r1)
        L_0x0559:
            int r1 = r0.v()
            if (r1 != r5) goto L_0x0574
            int r1 = com.google.android.gms.internal.ads.bc0.a(r3)
            long r3 = r2.f4897d
            if (r1 != 0) goto L_0x056c
            long r0 = r0.s()
            goto L_0x0570
        L_0x056c:
            long r0 = r0.w()
        L_0x0570:
            long r3 = r3 + r0
            r2.f4897d = r3
            goto L_0x058d
        L_0x0574:
            com.google.android.gms.internal.ads.zzht r0 = new com.google.android.gms.internal.ads.zzht
            r2 = 40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected saio entry count: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x058d:
            int r0 = com.google.android.gms.internal.ads.bc0.i0
            com.google.android.gms.internal.ads.dc0 r0 = r9.f(r0)
            if (r0 == 0) goto L_0x059b
            com.google.android.gms.internal.ads.zzpi r0 = r0.P0
            r1 = 0
            b(r0, r1, r2)
        L_0x059b:
            int r0 = com.google.android.gms.internal.ads.bc0.f0
            com.google.android.gms.internal.ads.dc0 r0 = r9.f(r0)
            int r1 = com.google.android.gms.internal.ads.bc0.g0
            com.google.android.gms.internal.ads.dc0 r1 = r9.f(r1)
            if (r0 == 0) goto L_0x0640
            if (r1 == 0) goto L_0x0640
            com.google.android.gms.internal.ads.zzpi r0 = r0.P0
            com.google.android.gms.internal.ads.zzpi r1 = r1.P0
            r3 = 8
            r0.l(r3)
            int r3 = r0.d()
            int r4 = r0.d()
            int r5 = D
            if (r4 != r5) goto L_0x0640
            int r3 = com.google.android.gms.internal.ads.bc0.a(r3)
            r4 = 1
            if (r3 != r4) goto L_0x05cb
            r3 = 4
            r0.m(r3)
        L_0x05cb:
            int r0 = r0.d()
            if (r0 != r4) goto L_0x0638
            r0 = 8
            r1.l(r0)
            int r0 = r1.d()
            int r3 = r1.d()
            int r5 = D
            if (r3 != r5) goto L_0x0636
            int r0 = com.google.android.gms.internal.ads.bc0.a(r0)
            if (r0 != r4) goto L_0x05fb
            long r3 = r1.s()
            int r0 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x05f3
            r0 = 4
            r3 = 2
            goto L_0x0604
        L_0x05f3:
            com.google.android.gms.internal.ads.zzht r0 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x05fb:
            r3 = 2
            if (r0 < r3) goto L_0x0603
            r0 = 4
            r1.m(r0)
            goto L_0x0604
        L_0x0603:
            r0 = 4
        L_0x0604:
            long r4 = r1.s()
            r6 = 1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x062e
            r1.m(r3)
            int r3 = r1.g()
            r4 = 1
            if (r3 != r4) goto L_0x0642
            int r3 = r1.g()
            r5 = 16
            byte[] r6 = new byte[r5]
            r7 = 0
            r1.p(r6, r7, r5)
            r2.m = r4
            com.google.android.gms.internal.ads.zzlo r1 = new com.google.android.gms.internal.ads.zzlo
            r1.<init>(r4, r3, r6)
            r2.o = r1
            goto L_0x0642
        L_0x062e:
            com.google.android.gms.internal.ads.zzht r0 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0636:
            r0 = 4
            goto L_0x0642
        L_0x0638:
            com.google.android.gms.internal.ads.zzht r0 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0640:
            r0 = 4
            r4 = 1
        L_0x0642:
            java.util.List<com.google.android.gms.internal.ads.dc0> r1 = r9.Q0
            int r1 = r1.size()
            r3 = 0
        L_0x0649:
            if (r3 >= r1) goto L_0x0680
            java.util.List<com.google.android.gms.internal.ads.dc0> r5 = r9.Q0
            java.lang.Object r5 = r5.get(r3)
            com.google.android.gms.internal.ads.dc0 r5 = (com.google.android.gms.internal.ads.dc0) r5
            int r6 = r5.f3457a
            int r7 = com.google.android.gms.internal.ads.bc0.h0
            if (r6 != r7) goto L_0x0674
            com.google.android.gms.internal.ads.zzpi r5 = r5.P0
            r6 = 8
            r5.l(r6)
            r7 = r30
            r8 = 16
            r10 = 0
            r5.p(r7, r10, r8)
            byte[] r11 = E
            boolean r11 = java.util.Arrays.equals(r7, r11)
            if (r11 == 0) goto L_0x067b
            b(r5, r8, r2)
            goto L_0x067b
        L_0x0674:
            r7 = r30
            r6 = 8
            r8 = 16
            r10 = 0
        L_0x067b:
            int r3 = r3 + 1
            r30 = r7
            goto L_0x0649
        L_0x0680:
            r7 = r30
            r6 = 8
            r10 = 0
            goto L_0x0696
        L_0x0686:
            r32 = r1
            r19 = r2
            r47 = r3
            r21 = r7
            r33 = r8
            r0 = 4
            r4 = 1
            r6 = 8
            r10 = 0
            r7 = r5
        L_0x0696:
            int r8 = r33 + 1
            r0 = r53
            r5 = r7
            r2 = r19
            r7 = r21
            r1 = r32
            r3 = r47
            r4 = 0
            r6 = 4
            goto L_0x01d7
        L_0x06a7:
            r10 = 0
            java.util.List<com.google.android.gms.internal.ads.dc0> r0 = r1.Q0
            com.google.android.gms.internal.ads.zzjl r0 = d(r0)
            r2 = r53
            if (r0 == 0) goto L_0x06e7
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r1 = r2.f8822b
            int r1 = r1.size()
            r8 = 0
        L_0x06b9:
            if (r8 >= r1) goto L_0x06e7
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r3 = r2.f8822b
            java.lang.Object r3 = r3.valueAt(r8)
            com.google.android.gms.internal.ads.oc0 r3 = (com.google.android.gms.internal.ads.oc0) r3
            com.google.android.gms.internal.ads.zzke r4 = r3.f4546b
            com.google.android.gms.internal.ads.zzlp r3 = r3.f4547c
            com.google.android.gms.internal.ads.zzhq r3 = r3.f8845f
            com.google.android.gms.internal.ads.zzhq r3 = r3.a(r0)
            r4.b(r3)
            int r8 = r8 + 1
            goto L_0x06b9
        L_0x06d3:
            r2 = r0
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r0 = r2.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06e7
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r0 = r2.j
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.ac0 r0 = (com.google.android.gms.internal.ads.ac0) r0
            r0.d(r1)
        L_0x06e7:
            r0 = r2
            goto L_0x0002
        L_0x06ea:
            r2 = r0
            r53.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzle.g(long):void");
    }

    private final void h() {
        this.l = 0;
        this.o = 0;
    }

    public final boolean a(zzjw zzjw) throws IOException, InterruptedException {
        return pc0.b(zzjw);
    }

    /* JADX WARNING: Removed duplicated region for block: B:255:0x0268 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x05ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(com.google.android.gms.internal.ads.zzjw r26, com.google.android.gms.internal.ads.zzkd r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
        L_0x0004:
            int r2 = r0.l
            r3 = 2
            r5 = 8
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0425
            if (r2 == r6) goto L_0x02c8
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x026f
            if (r2 != r11) goto L_0x00fa
            com.google.android.gms.internal.ads.oc0 r2 = r0.u
            if (r2 != 0) goto L_0x007f
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r2 = r0.f8822b
            int r12 = r2.size()
            r13 = 0
            r14 = 0
        L_0x0025:
            if (r13 >= r12) goto L_0x0044
            java.lang.Object r15 = r2.valueAt(r13)
            com.google.android.gms.internal.ads.oc0 r15 = (com.google.android.gms.internal.ads.oc0) r15
            int r11 = r15.g
            com.google.android.gms.internal.ads.sc0 r4 = r15.f4545a
            int r8 = r4.f4898e
            if (r11 == r8) goto L_0x0040
            long[] r4 = r4.g
            r17 = r4[r11]
            int r4 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0040
            r14 = r15
            r9 = r17
        L_0x0040:
            int r13 = r13 + 1
            r11 = 3
            goto L_0x0025
        L_0x0044:
            if (r14 != 0) goto L_0x0062
            long r2 = r0.q
            long r4 = r26.getPosition()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x005a
            r1.d(r3)
            r25.h()
            r3 = 0
            r6 = 0
            goto L_0x0266
        L_0x005a:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x0062:
            com.google.android.gms.internal.ads.sc0 r2 = r14.f4545a
            long[] r2 = r2.g
            int r4 = r14.g
            r8 = r2[r4]
            long r10 = r26.getPosition()
            long r8 = r8 - r10
            int r2 = (int) r8
            if (r2 >= 0) goto L_0x007a
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r4 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r4)
            r2 = 0
        L_0x007a:
            r1.d(r2)
            r0.u = r14
        L_0x007f:
            com.google.android.gms.internal.ads.oc0 r2 = r0.u
            com.google.android.gms.internal.ads.sc0 r4 = r2.f4545a
            int[] r8 = r4.i
            int r9 = r2.f4549e
            r8 = r8[r9]
            r0.v = r8
            boolean r8 = r4.m
            if (r8 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzpi r8 = r4.q
            com.google.android.gms.internal.ads.lc0 r9 = r4.f4894a
            int r9 = r9.f4294a
            com.google.android.gms.internal.ads.zzlo r10 = r4.o
            if (r10 == 0) goto L_0x009a
            goto L_0x00a0
        L_0x009a:
            com.google.android.gms.internal.ads.zzlp r10 = r2.f4547c
            com.google.android.gms.internal.ads.zzlo[] r10 = r10.h
            r10 = r10[r9]
        L_0x00a0:
            int r9 = r10.f8838a
            boolean[] r4 = r4.n
            int r10 = r2.f4549e
            boolean r4 = r4[r10]
            com.google.android.gms.internal.ads.zzpi r10 = r0.f8826f
            byte[] r10 = r10.f8980a
            if (r4 == 0) goto L_0x00b1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00b2
        L_0x00b1:
            r11 = 0
        L_0x00b2:
            r11 = r11 | r9
            byte r11 = (byte) r11
            r10[r7] = r11
            com.google.android.gms.internal.ads.zzpi r10 = r0.f8826f
            r10.l(r7)
            com.google.android.gms.internal.ads.zzke r2 = r2.f4546b
            com.google.android.gms.internal.ads.zzpi r10 = r0.f8826f
            r2.a(r10, r6)
            r2.a(r8, r9)
            if (r4 != 0) goto L_0x00ca
            int r9 = r9 + 1
            goto L_0x00db
        L_0x00ca:
            int r4 = r8.h()
            r10 = -2
            r8.m(r10)
            int r4 = r4 * 6
            int r4 = r4 + r3
            r2.a(r8, r4)
            int r9 = r9 + 1
            int r9 = r9 + r4
        L_0x00db:
            r0.w = r9
            int r2 = r0.v
            int r2 = r2 + r9
            r0.v = r2
            goto L_0x00e5
        L_0x00e3:
            r0.w = r7
        L_0x00e5:
            com.google.android.gms.internal.ads.oc0 r2 = r0.u
            com.google.android.gms.internal.ads.zzlp r2 = r2.f4547c
            int r2 = r2.g
            if (r2 != r6) goto L_0x00f5
            int r2 = r0.v
            int r2 = r2 - r5
            r0.v = r2
            r1.d(r5)
        L_0x00f5:
            r2 = 4
            r0.l = r2
            r0.x = r7
        L_0x00fa:
            com.google.android.gms.internal.ads.oc0 r2 = r0.u
            com.google.android.gms.internal.ads.sc0 r4 = r2.f4545a
            com.google.android.gms.internal.ads.zzlp r5 = r2.f4547c
            com.google.android.gms.internal.ads.zzke r8 = r2.f4546b
            int r2 = r2.f4549e
            int r9 = r5.k
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r9 == 0) goto L_0x01c0
            com.google.android.gms.internal.ads.zzpi r12 = r0.f8824d
            byte[] r12 = r12.f8980a
            r12[r7] = r7
            r12[r6] = r7
            r12[r3] = r7
            int r3 = r9 + 1
            int r9 = 4 - r9
        L_0x0118:
            int r13 = r0.w
            int r14 = r0.v
            if (r13 >= r14) goto L_0x01d2
            int r13 = r0.x
            if (r13 != 0) goto L_0x0164
            r1.b(r12, r9, r3)
            com.google.android.gms.internal.ads.zzpi r13 = r0.f8824d
            r13.l(r7)
            com.google.android.gms.internal.ads.zzpi r13 = r0.f8824d
            int r13 = r13.v()
            int r13 = r13 - r6
            r0.x = r13
            com.google.android.gms.internal.ads.zzpi r13 = r0.f8823c
            r13.l(r7)
            com.google.android.gms.internal.ads.zzpi r13 = r0.f8823c
            r14 = 4
            r8.a(r13, r14)
            com.google.android.gms.internal.ads.zzpi r13 = r0.f8824d
            r8.a(r13, r6)
            com.google.android.gms.internal.ads.zzke[] r13 = r0.B
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzhq r13 = r5.f8845f
            java.lang.String r13 = r13.g
            byte r15 = r12[r14]
            boolean r13 = com.google.android.gms.internal.ads.zzph.a(r13, r15)
            if (r13 == 0) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            r0.y = r13
            int r13 = r0.w
            int r13 = r13 + 5
            r0.w = r13
            int r13 = r0.v
            int r13 = r13 + r9
            r0.v = r13
            goto L_0x0118
        L_0x0164:
            boolean r14 = r0.y
            if (r14 == 0) goto L_0x01ad
            com.google.android.gms.internal.ads.zzpi r14 = r0.f8825e
            r14.j(r13)
            com.google.android.gms.internal.ads.zzpi r13 = r0.f8825e
            byte[] r13 = r13.f8980a
            int r14 = r0.x
            r1.b(r13, r7, r14)
            com.google.android.gms.internal.ads.zzpi r13 = r0.f8825e
            int r14 = r0.x
            r8.a(r13, r14)
            int r13 = r0.x
            com.google.android.gms.internal.ads.zzpi r14 = r0.f8825e
            byte[] r15 = r14.f8980a
            int r14 = r14.c()
            int r14 = com.google.android.gms.internal.ads.zzph.b(r15, r14)
            com.google.android.gms.internal.ads.zzpi r15 = r0.f8825e
            com.google.android.gms.internal.ads.zzhq r6 = r5.f8845f
            java.lang.String r6 = r6.g
            java.lang.String r7 = "video/hevc"
            boolean r6 = r7.equals(r6)
            r15.l(r6)
            com.google.android.gms.internal.ads.zzpi r6 = r0.f8825e
            r6.k(r14)
            long r6 = r4.b(r2)
            long r6 = r6 * r10
            com.google.android.gms.internal.ads.zzpi r14 = r0.f8825e
            com.google.android.gms.internal.ads.zzke[] r15 = r0.B
            com.google.android.gms.internal.ads.zznt.a(r6, r14, r15)
            goto L_0x01b2
        L_0x01ad:
            r6 = 0
            int r13 = r8.c(r1, r13, r6)
        L_0x01b2:
            int r6 = r0.w
            int r6 = r6 + r13
            r0.w = r6
            int r6 = r0.x
            int r6 = r6 - r13
            r0.x = r6
            r6 = 1
            r7 = 0
            goto L_0x0118
        L_0x01c0:
            int r3 = r0.w
            int r6 = r0.v
            if (r3 >= r6) goto L_0x01d2
            int r6 = r6 - r3
            r3 = 0
            int r6 = r8.c(r1, r6, r3)
            int r3 = r0.w
            int r3 = r3 + r6
            r0.w = r3
            goto L_0x01c0
        L_0x01d2:
            long r6 = r4.b(r2)
            long r6 = r6 * r10
            com.google.android.gms.internal.ads.zzpm r3 = r0.g
            if (r3 != 0) goto L_0x0269
            boolean r3 = r4.m
            if (r3 == 0) goto L_0x01e3
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            boolean[] r9 = r4.l
            boolean r2 = r9[r2]
            r11 = r3 | r2
            boolean r2 = r4.m
            if (r2 == 0) goto L_0x020e
            com.google.android.gms.internal.ads.zzlo r2 = r4.o
            if (r2 == 0) goto L_0x01f3
            goto L_0x01fb
        L_0x01f3:
            com.google.android.gms.internal.ads.zzlo[] r2 = r5.h
            com.google.android.gms.internal.ads.lc0 r3 = r4.f4894a
            int r3 = r3.f4294a
            r2 = r2[r3]
        L_0x01fb:
            com.google.android.gms.internal.ads.oc0 r3 = r0.u
            com.google.android.gms.internal.ads.zzlo r5 = r3.i
            if (r2 == r5) goto L_0x020a
            com.google.android.gms.internal.ads.zzkh r3 = new com.google.android.gms.internal.ads.zzkh
            byte[] r5 = r2.f8839b
            r9 = 1
            r3.<init>(r9, r5)
            goto L_0x020c
        L_0x020a:
            com.google.android.gms.internal.ads.zzkh r3 = r3.h
        L_0x020c:
            r14 = r3
            goto L_0x0210
        L_0x020e:
            r2 = 0
            r14 = 0
        L_0x0210:
            com.google.android.gms.internal.ads.oc0 r3 = r0.u
            r3.h = r14
            r3.i = r2
            int r12 = r0.v
            r13 = 0
            r9 = r6
            r8.d(r9, r11, r12, r13, r14)
        L_0x021d:
            java.util.LinkedList<com.google.android.gms.internal.ads.mc0> r2 = r0.k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0241
            java.util.LinkedList<com.google.android.gms.internal.ads.mc0> r2 = r0.k
            java.lang.Object r2 = r2.removeFirst()
            com.google.android.gms.internal.ads.mc0 r2 = (com.google.android.gms.internal.ads.mc0) r2
            int r3 = r0.r
            int r12 = r2.f4380b
            int r13 = r3 - r12
            r0.r = r13
            com.google.android.gms.internal.ads.zzke r8 = r0.A
            long r2 = r2.f4379a
            long r9 = r6 + r2
            r11 = 1
            r14 = 0
            r8.d(r9, r11, r12, r13, r14)
            goto L_0x021d
        L_0x0241:
            com.google.android.gms.internal.ads.oc0 r2 = r0.u
            int r3 = r2.f4549e
            r5 = 1
            int r3 = r3 + r5
            r2.f4549e = r3
            int r3 = r2.f4550f
            int r3 = r3 + r5
            r2.f4550f = r3
            int[] r4 = r4.h
            int r5 = r2.g
            r4 = r4[r5]
            if (r3 != r4) goto L_0x0261
            int r5 = r5 + 1
            r2.g = r5
            r3 = 0
            r2.f4550f = r3
            r2 = 0
            r0.u = r2
            goto L_0x0262
        L_0x0261:
            r3 = 0
        L_0x0262:
            r2 = 3
            r0.l = r2
            r6 = 1
        L_0x0266:
            if (r6 == 0) goto L_0x0004
            return r3
        L_0x0269:
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x026f:
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r2 = r0.f8822b
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L_0x0277:
            if (r3 >= r2) goto L_0x0299
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r5 = r0.f8822b
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.oc0 r5 = (com.google.android.gms.internal.ads.oc0) r5
            com.google.android.gms.internal.ads.sc0 r5 = r5.f4545a
            boolean r6 = r5.r
            if (r6 == 0) goto L_0x0296
            long r5 = r5.f4897d
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0296
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r4 = r0.f8822b
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.oc0 r4 = (com.google.android.gms.internal.ads.oc0) r4
            r9 = r5
        L_0x0296:
            int r3 = r3 + 1
            goto L_0x0277
        L_0x0299:
            if (r4 != 0) goto L_0x02a0
            r2 = 3
            r0.l = r2
            goto L_0x0004
        L_0x02a0:
            long r2 = r26.getPosition()
            long r9 = r9 - r2
            int r2 = (int) r9
            if (r2 < 0) goto L_0x02c0
            r1.d(r2)
            com.google.android.gms.internal.ads.sc0 r2 = r4.f4545a
            com.google.android.gms.internal.ads.zzpi r3 = r2.q
            byte[] r3 = r3.f8980a
            int r4 = r2.p
            r5 = 0
            r1.b(r3, r5, r4)
            com.google.android.gms.internal.ads.zzpi r3 = r2.q
            r3.l(r5)
            r2.r = r5
            goto L_0x0004
        L_0x02c0:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x02c8:
            long r6 = r0.n
            int r2 = (int) r6
            int r4 = r0.o
            int r2 = r2 - r4
            com.google.android.gms.internal.ads.zzpi r4 = r0.p
            if (r4 == 0) goto L_0x0419
            byte[] r4 = r4.f8980a
            r1.b(r4, r5, r2)
            com.google.android.gms.internal.ads.dc0 r2 = new com.google.android.gms.internal.ads.dc0
            int r4 = r0.m
            com.google.android.gms.internal.ads.zzpi r6 = r0.p
            r2.<init>(r4, r6)
            long r6 = r26.getPosition()
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r4 = r0.j
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x02f9
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r3 = r0.j
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.ac0 r3 = (com.google.android.gms.internal.ads.ac0) r3
            r3.e(r2)
            goto L_0x041c
        L_0x02f9:
            int r4 = r2.f3457a
            int r8 = com.google.android.gms.internal.ads.bc0.B
            if (r4 != r8) goto L_0x03c1
            com.google.android.gms.internal.ads.zzpi r2 = r2.P0
            r2.l(r5)
            int r4 = r2.d()
            int r4 = com.google.android.gms.internal.ads.bc0.a(r4)
            r5 = 4
            r2.m(r5)
            long r14 = r2.s()
            if (r4 != 0) goto L_0x031f
            long r4 = r2.s()
            long r8 = r2.s()
            goto L_0x0327
        L_0x031f:
            long r4 = r2.w()
            long r8 = r2.w()
        L_0x0327:
            long r6 = r6 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r4
            r12 = r14
            long r19 = com.google.android.gms.internal.ads.zzpo.c(r8, r10, r12)
            r2.m(r3)
            int r3 = r2.h()
            int[] r12 = new int[r3]
            long[] r13 = new long[r3]
            long[] r10 = new long[r3]
            long[] r11 = new long[r3]
            r21 = r19
            r8 = 0
        L_0x0343:
            if (r8 >= r3) goto L_0x0399
            int r9 = r2.d()
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x0391
            long r23 = r2.s()
            r16 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r16
            r12[r8] = r9
            r13[r8] = r6
            r11[r8] = r21
            long r4 = r4 + r23
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r18 = r8
            r8 = r4
            r27 = r3
            r23 = r4
            r3 = r10
            r4 = r11
            r10 = r21
            r5 = r12
            r1 = r13
            r12 = r14
            long r21 = com.google.android.gms.internal.ads.zzpo.c(r8, r10, r12)
            r8 = r4[r18]
            long r8 = r21 - r8
            r3[r18] = r8
            r8 = 4
            r2.m(r8)
            r9 = r5[r18]
            long r9 = (long) r9
            long r6 = r6 + r9
            int r9 = r18 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r12 = r5
            r8 = r9
            r4 = r23
            r1 = r26
            r3 = r27
            goto L_0x0343
        L_0x0391:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>(r2)
            throw r1
        L_0x0399:
            r3 = r10
            r4 = r11
            r5 = r12
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.zzjv r6 = new com.google.android.gms.internal.ads.zzjv
            r6.<init>(r5, r1, r3, r4)
            android.util.Pair r1 = android.util.Pair.create(r2, r6)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.t = r2
            com.google.android.gms.internal.ads.zzjz r2 = r0.z
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.zzkc r1 = (com.google.android.gms.internal.ads.zzkc) r1
            r2.i(r1)
            r1 = 1
            r0.C = r1
            goto L_0x0416
        L_0x03c1:
            int r1 = com.google.android.gms.internal.ads.bc0.G0
            if (r4 != r1) goto L_0x0416
            com.google.android.gms.internal.ads.zzpi r1 = r2.P0
            com.google.android.gms.internal.ads.zzke r2 = r0.A
            if (r2 == 0) goto L_0x0416
            r2 = 12
            r1.l(r2)
            r1.x()
            r1.x()
            long r7 = r1.s()
            long r3 = r1.s()
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = com.google.android.gms.internal.ads.zzpo.c(r3, r5, r7)
            r1.l(r2)
            int r9 = r1.q()
            com.google.android.gms.internal.ads.zzke r2 = r0.A
            r2.a(r1, r9)
            long r1 = r0.t
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0407
            com.google.android.gms.internal.ads.zzke r5 = r0.A
            long r6 = r1 + r3
            r8 = 1
            r10 = 0
            r11 = 0
            r5.d(r6, r8, r9, r10, r11)
            goto L_0x0416
        L_0x0407:
            java.util.LinkedList<com.google.android.gms.internal.ads.mc0> r1 = r0.k
            com.google.android.gms.internal.ads.mc0 r2 = new com.google.android.gms.internal.ads.mc0
            r2.<init>(r3, r9)
            r1.addLast(r2)
            int r1 = r0.r
            int r1 = r1 + r9
            r0.r = r1
        L_0x0416:
            r1 = r26
            goto L_0x041c
        L_0x0419:
            r1.d(r2)
        L_0x041c:
            long r2 = r26.getPosition()
            r0.g(r2)
            goto L_0x0004
        L_0x0425:
            int r2 = r0.o
            if (r2 != 0) goto L_0x044e
            com.google.android.gms.internal.ads.zzpi r2 = r0.h
            byte[] r2 = r2.f8980a
            r4 = 1
            r6 = 0
            boolean r2 = r1.g(r2, r6, r5, r4)
            if (r2 != 0) goto L_0x0437
            goto L_0x05ac
        L_0x0437:
            r0.o = r5
            com.google.android.gms.internal.ads.zzpi r2 = r0.h
            r2.l(r6)
            com.google.android.gms.internal.ads.zzpi r2 = r0.h
            long r6 = r2.s()
            r0.n = r6
            com.google.android.gms.internal.ads.zzpi r2 = r0.h
            int r2 = r2.d()
            r0.m = r2
        L_0x044e:
            long r6 = r0.n
            r8 = 1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x046a
            com.google.android.gms.internal.ads.zzpi r2 = r0.h
            byte[] r2 = r2.f8980a
            r1.b(r2, r5, r5)
            int r2 = r0.o
            int r2 = r2 + r5
            r0.o = r2
            com.google.android.gms.internal.ads.zzpi r2 = r0.h
            long r6 = r2.w()
            r0.n = r6
        L_0x046a:
            long r6 = r0.n
            int r2 = r0.o
            long r8 = (long) r2
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x05b8
            long r6 = r26.getPosition()
            int r2 = r0.o
            long r8 = (long) r2
            long r6 = r6 - r8
            int r2 = r0.m
            int r4 = com.google.android.gms.internal.ads.bc0.L
            if (r2 != r4) goto L_0x049d
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r2 = r0.f8822b
            int r2 = r2.size()
            r4 = 0
        L_0x0488:
            if (r4 >= r2) goto L_0x049d
            android.util.SparseArray<com.google.android.gms.internal.ads.oc0> r8 = r0.f8822b
            java.lang.Object r8 = r8.valueAt(r4)
            com.google.android.gms.internal.ads.oc0 r8 = (com.google.android.gms.internal.ads.oc0) r8
            com.google.android.gms.internal.ads.sc0 r8 = r8.f4545a
            r8.f4895b = r6
            r8.f4897d = r6
            r8.f4896c = r6
            int r4 = r4 + 1
            goto L_0x0488
        L_0x049d:
            int r2 = r0.m
            int r4 = com.google.android.gms.internal.ads.bc0.i
            if (r2 != r4) goto L_0x04c3
            r4 = 0
            r0.u = r4
            long r4 = r0.n
            long r6 = r6 + r4
            r0.q = r6
            boolean r2 = r0.C
            if (r2 != 0) goto L_0x04be
            com.google.android.gms.internal.ads.zzjz r2 = r0.z
            com.google.android.gms.internal.ads.zzkf r4 = new com.google.android.gms.internal.ads.zzkf
            long r5 = r0.s
            r4.<init>(r5)
            r2.i(r4)
            r2 = 1
            r0.C = r2
        L_0x04be:
            r0.l = r3
        L_0x04c0:
            r2 = 1
            goto L_0x05ab
        L_0x04c3:
            int r3 = com.google.android.gms.internal.ads.bc0.C
            if (r2 == r3) goto L_0x04ea
            int r3 = com.google.android.gms.internal.ads.bc0.E
            if (r2 == r3) goto L_0x04ea
            int r3 = com.google.android.gms.internal.ads.bc0.F
            if (r2 == r3) goto L_0x04ea
            int r3 = com.google.android.gms.internal.ads.bc0.G
            if (r2 == r3) goto L_0x04ea
            int r3 = com.google.android.gms.internal.ads.bc0.H
            if (r2 == r3) goto L_0x04ea
            int r3 = com.google.android.gms.internal.ads.bc0.L
            if (r2 == r3) goto L_0x04ea
            int r3 = com.google.android.gms.internal.ads.bc0.M
            if (r2 == r3) goto L_0x04ea
            int r3 = com.google.android.gms.internal.ads.bc0.N
            if (r2 == r3) goto L_0x04ea
            int r3 = com.google.android.gms.internal.ads.bc0.Q
            if (r2 != r3) goto L_0x04e8
            goto L_0x04ea
        L_0x04e8:
            r2 = 0
            goto L_0x04eb
        L_0x04ea:
            r2 = 1
        L_0x04eb:
            if (r2 == 0) goto L_0x0514
            long r2 = r26.getPosition()
            long r4 = r0.n
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.Stack<com.google.android.gms.internal.ads.ac0> r4 = r0.j
            com.google.android.gms.internal.ads.ac0 r5 = new com.google.android.gms.internal.ads.ac0
            int r6 = r0.m
            r5.<init>(r6, r2)
            r4.add(r5)
            long r4 = r0.n
            int r6 = r0.o
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0510
            r0.g(r2)
            goto L_0x04c0
        L_0x0510:
            r25.h()
            goto L_0x04c0
        L_0x0514:
            int r2 = r0.m
            int r3 = com.google.android.gms.internal.ads.bc0.T
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.S
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.D
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.B
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.U
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.x
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.y
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.P
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.z
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.A
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.V
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.d0
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.e0
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.i0
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.h0
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.f0
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.g0
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.R
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.O
            if (r2 == r3) goto L_0x0569
            int r3 = com.google.android.gms.internal.ads.bc0.G0
            if (r2 != r3) goto L_0x0567
            goto L_0x0569
        L_0x0567:
            r2 = 0
            goto L_0x056a
        L_0x0569:
            r2 = 1
        L_0x056a:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == 0) goto L_0x059f
            int r2 = r0.o
            if (r2 != r5) goto L_0x0597
            long r6 = r0.n
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x058f
            com.google.android.gms.internal.ads.zzpi r2 = new com.google.android.gms.internal.ads.zzpi
            int r3 = (int) r6
            r2.<init>((int) r3)
            r0.p = r2
            com.google.android.gms.internal.ads.zzpi r3 = r0.h
            byte[] r3 = r3.f8980a
            byte[] r2 = r2.f8980a
            r4 = 0
            java.lang.System.arraycopy(r3, r4, r2, r4, r5)
            r2 = 1
            r0.l = r2
            goto L_0x05ab
        L_0x058f:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x0597:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x059f:
            long r5 = r0.n
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x05b0
            r2 = 0
            r0.p = r2
            r2 = 1
            r0.l = r2
        L_0x05ab:
            r6 = 1
        L_0x05ac:
            if (r6 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x05b0:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x05b8:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzle.c(com.google.android.gms.internal.ads.zzjw, com.google.android.gms.internal.ads.zzkd):int");
    }

    public final void e(zzjz zzjz) {
        this.z = zzjz;
    }

    public final void f(long j2, long j3) {
        int size = this.f8822b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f8822b.valueAt(i2).a();
        }
        this.k.clear();
        this.r = 0;
        this.j.clear();
        h();
    }

    public final void release() {
    }

    private zzle(int i2) {
        this(0, (zzpm) null);
    }

    private zzle(int i2, zzpm zzpm) {
        this(0, (zzpm) null, (zzlp) null);
    }

    private zzle(int i2, zzpm zzpm, zzlp zzlp) {
        this.f8821a = i2;
        this.g = null;
        this.h = new zzpi(16);
        this.f8823c = new zzpi(zzph.f8976a);
        this.f8824d = new zzpi(5);
        this.f8825e = new zzpi();
        this.f8826f = new zzpi(1);
        this.i = new byte[16];
        this.j = new Stack<>();
        this.k = new LinkedList<>();
        this.f8822b = new SparseArray<>();
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        h();
    }
}
