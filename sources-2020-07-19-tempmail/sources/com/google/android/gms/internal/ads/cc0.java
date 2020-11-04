package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzme;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class cc0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f3542a = zzpo.l("vide");

    /* renamed from: b  reason: collision with root package name */
    private static final int f3543b = zzpo.l("soun");

    /* renamed from: c  reason: collision with root package name */
    private static final int f3544c = zzpo.l("text");

    /* renamed from: d  reason: collision with root package name */
    private static final int f3545d = zzpo.l("sbtl");

    /* renamed from: e  reason: collision with root package name */
    private static final int f3546e = zzpo.l("subt");

    /* renamed from: f  reason: collision with root package name */
    private static final int f3547f = zzpo.l("clcp");
    private static final int g = zzpo.l("cenc");
    private static final int h = zzpo.l("meta");

    private static int a(zzpi zzpi, int i, int i2, hc0 hc0, int i3) {
        zzpi zzpi2 = zzpi;
        int b2 = zzpi.b();
        while (true) {
            boolean z = false;
            if (b2 - i >= i2) {
                return 0;
            }
            zzpi.l(b2);
            int d2 = zzpi.d();
            zzpb.b(d2 > 0, "childAtomSize should be positive");
            if (zzpi.d() == bc0.W) {
                int i4 = b2 + 8;
                Pair pair = null;
                Integer num = null;
                zzlo zzlo = null;
                boolean z2 = false;
                while (i4 - b2 < d2) {
                    zzpi.l(i4);
                    int d3 = zzpi.d();
                    int d4 = zzpi.d();
                    if (d4 == bc0.c0) {
                        num = Integer.valueOf(zzpi.d());
                    } else if (d4 == bc0.X) {
                        zzpi.m(4);
                        z2 = zzpi.d() == g;
                    } else if (d4 == bc0.Y) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= d3) {
                                zzlo = null;
                                break;
                            }
                            zzpi.l(i5);
                            int d5 = zzpi.d();
                            if (zzpi.d() == bc0.Z) {
                                zzpi.m(6);
                                boolean z3 = zzpi.g() == 1;
                                int g2 = zzpi.g();
                                byte[] bArr = new byte[16];
                                zzpi.p(bArr, 0, 16);
                                zzlo = new zzlo(z3, g2, bArr);
                            } else {
                                i5 += d5;
                            }
                        }
                    }
                    i4 += d3;
                }
                if (z2) {
                    zzpb.b(num != null, "frma atom is mandatory");
                    if (zzlo != null) {
                        z = true;
                    }
                    zzpb.b(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzlo);
                }
                if (pair != null) {
                    hc0.f3954a[i3] = (zzlo) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            hc0 hc02 = hc0;
            b2 += d2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v11, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0551: MOVE  (r7v16 java.lang.String) = (r45v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x07c5  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0817  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0820 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0821  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b6  */
    public static com.google.android.gms.internal.ads.zzlp b(com.google.android.gms.internal.ads.ac0 r49, com.google.android.gms.internal.ads.dc0 r50, long r51, com.google.android.gms.internal.ads.zzjl r53, boolean r54) throws com.google.android.gms.internal.ads.zzht {
        /*
            r0 = r49
            r15 = r53
            int r1 = com.google.android.gms.internal.ads.bc0.F
            com.google.android.gms.internal.ads.ac0 r1 = r0.g(r1)
            int r2 = com.google.android.gms.internal.ads.bc0.T
            com.google.android.gms.internal.ads.dc0 r2 = r1.f(r2)
            com.google.android.gms.internal.ads.zzpi r2 = r2.P0
            r14 = 16
            r2.l(r14)
            int r2 = r2.d()
            int r3 = f3543b
            r4 = 4
            r11 = -1
            if (r2 != r3) goto L_0x0023
            r10 = 1
            goto L_0x0043
        L_0x0023:
            int r3 = f3542a
            if (r2 != r3) goto L_0x0029
            r10 = 2
            goto L_0x0043
        L_0x0029:
            int r3 = f3544c
            if (r2 == r3) goto L_0x0042
            int r3 = f3545d
            if (r2 == r3) goto L_0x0042
            int r3 = f3546e
            if (r2 == r3) goto L_0x0042
            int r3 = f3547f
            if (r2 != r3) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r3 = h
            if (r2 != r3) goto L_0x0040
            r10 = 4
            goto L_0x0043
        L_0x0040:
            r10 = -1
            goto L_0x0043
        L_0x0042:
            r10 = 3
        L_0x0043:
            r8 = 0
            if (r10 != r11) goto L_0x0047
            return r8
        L_0x0047:
            int r2 = com.google.android.gms.internal.ads.bc0.P
            com.google.android.gms.internal.ads.dc0 r2 = r0.f(r2)
            com.google.android.gms.internal.ads.zzpi r2 = r2.P0
            r7 = 8
            r2.l(r7)
            int r3 = r2.d()
            int r3 = com.google.android.gms.internal.ads.bc0.a(r3)
            if (r3 != 0) goto L_0x0061
            r5 = 8
            goto L_0x0063
        L_0x0061:
            r5 = 16
        L_0x0063:
            r2.m(r5)
            int r5 = r2.d()
            r2.m(r4)
            int r6 = r2.b()
            if (r3 != 0) goto L_0x0075
            r12 = 4
            goto L_0x0077
        L_0x0075:
            r12 = 8
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 >= r12) goto L_0x0088
            byte[] r8 = r2.f8980a
            int r20 = r6 + r9
            byte r8 = r8[r20]
            if (r8 == r11) goto L_0x0084
            r6 = 0
            goto L_0x0089
        L_0x0084:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x0078
        L_0x0088:
            r6 = 1
        L_0x0089:
            r20 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0097
            r2.m(r12)
        L_0x0095:
            r11 = r8
            goto L_0x00a9
        L_0x0097:
            if (r3 != 0) goto L_0x009e
            long r22 = r2.s()
            goto L_0x00a2
        L_0x009e:
            long r22 = r2.w()
        L_0x00a2:
            int r3 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x00a7
            goto L_0x0095
        L_0x00a7:
            r11 = r22
        L_0x00a9:
            r2.m(r14)
            int r3 = r2.d()
            int r6 = r2.d()
            r2.m(r4)
            int r4 = r2.d()
            int r2 = r2.d()
            r14 = 65536(0x10000, float:9.18355E-41)
            r13 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00ce
            if (r6 != r14) goto L_0x00ce
            if (r4 != r13) goto L_0x00ce
            if (r2 != 0) goto L_0x00ce
            r2 = 90
            goto L_0x00e5
        L_0x00ce:
            if (r3 != 0) goto L_0x00d9
            if (r6 != r13) goto L_0x00d9
            if (r4 != r14) goto L_0x00d9
            if (r2 != 0) goto L_0x00d9
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e5
        L_0x00d9:
            if (r3 != r13) goto L_0x00e4
            if (r6 != 0) goto L_0x00e4
            if (r4 != 0) goto L_0x00e4
            if (r2 != r13) goto L_0x00e4
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e5
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            com.google.android.gms.internal.ads.ic0 r14 = new com.google.android.gms.internal.ads.ic0
            r14.<init>(r5, r11, r2)
            int r2 = (r51 > r8 ? 1 : (r51 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x00f7
            long r2 = com.google.android.gms.internal.ads.ic0.a(r14)
            r26 = r2
            r2 = r50
            goto L_0x00fb
        L_0x00f7:
            r2 = r50
            r26 = r51
        L_0x00fb:
            com.google.android.gms.internal.ads.zzpi r2 = r2.P0
            r2.l(r7)
            int r3 = r2.d()
            int r3 = com.google.android.gms.internal.ads.bc0.a(r3)
            if (r3 != 0) goto L_0x010d
            r3 = 8
            goto L_0x010f
        L_0x010d:
            r3 = 16
        L_0x010f:
            r2.m(r3)
            long r32 = r2.s()
            int r2 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x011d
            r26 = r8
            goto L_0x0128
        L_0x011d:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r32
            long r2 = com.google.android.gms.internal.ads.zzpo.c(r26, r28, r30)
            r26 = r2
        L_0x0128:
            int r2 = com.google.android.gms.internal.ads.bc0.G
            com.google.android.gms.internal.ads.ac0 r2 = r1.g(r2)
            int r3 = com.google.android.gms.internal.ads.bc0.H
            com.google.android.gms.internal.ads.ac0 r2 = r2.g(r3)
            int r3 = com.google.android.gms.internal.ads.bc0.S
            com.google.android.gms.internal.ads.dc0 r1 = r1.f(r3)
            com.google.android.gms.internal.ads.zzpi r1 = r1.P0
            r1.l(r7)
            int r3 = r1.d()
            int r3 = com.google.android.gms.internal.ads.bc0.a(r3)
            if (r3 != 0) goto L_0x014c
            r4 = 8
            goto L_0x014e
        L_0x014c:
            r4 = 16
        L_0x014e:
            r1.m(r4)
            long r4 = r1.s()
            if (r3 != 0) goto L_0x0159
            r3 = 4
            goto L_0x015b
        L_0x0159:
            r3 = 8
        L_0x015b:
            r1.m(r3)
            int r1 = r1.h()
            int r3 = r1 >> 10
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 3
            r8.<init>(r9)
            r8.append(r3)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            android.util.Pair r13 = android.util.Pair.create(r3, r1)
            int r1 = com.google.android.gms.internal.ads.bc0.U
            com.google.android.gms.internal.ads.dc0 r1 = r2.f(r1)
            com.google.android.gms.internal.ads.zzpi r12 = r1.P0
            int r22 = com.google.android.gms.internal.ads.ic0.b(r14)
            int r28 = com.google.android.gms.internal.ads.ic0.c(r14)
            java.lang.Object r1 = r13.second
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            r1 = 12
            r12.l(r1)
            int r9 = r12.d()
            com.google.android.gms.internal.ads.hc0 r8 = new com.google.android.gms.internal.ads.hc0
            r8.<init>(r9)
            r6 = 0
        L_0x01b4:
            if (r6 >= r9) goto L_0x07a9
            int r5 = r12.b()
            int r4 = r12.d()
            if (r4 <= 0) goto L_0x01c2
            r1 = 1
            goto L_0x01c3
        L_0x01c2:
            r1 = 0
        L_0x01c3:
            java.lang.String r3 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzpb.b(r1, r3)
            int r1 = r12.d()
            int r2 = com.google.android.gms.internal.ads.bc0.f3453c
            if (r1 == r2) goto L_0x05a2
            int r2 = com.google.android.gms.internal.ads.bc0.f3454d
            if (r1 == r2) goto L_0x05a2
            int r2 = com.google.android.gms.internal.ads.bc0.a0
            if (r1 == r2) goto L_0x05a2
            int r2 = com.google.android.gms.internal.ads.bc0.l0
            if (r1 == r2) goto L_0x05a2
            int r2 = com.google.android.gms.internal.ads.bc0.f3455e
            if (r1 == r2) goto L_0x05a2
            int r2 = com.google.android.gms.internal.ads.bc0.f3456f
            if (r1 == r2) goto L_0x05a2
            int r2 = com.google.android.gms.internal.ads.bc0.g
            if (r1 == r2) goto L_0x05a2
            int r2 = com.google.android.gms.internal.ads.bc0.K0
            if (r1 == r2) goto L_0x05a2
            int r2 = com.google.android.gms.internal.ads.bc0.L0
            if (r1 != r2) goto L_0x01f2
            goto L_0x05a2
        L_0x01f2:
            int r2 = com.google.android.gms.internal.ads.bc0.j
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.b0
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.o
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.q
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.s
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.v
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.t
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.u
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.y0
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.z0
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.m
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.n
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.k
            if (r1 == r2) goto L_0x030c
            int r2 = com.google.android.gms.internal.ads.bc0.O0
            if (r1 != r2) goto L_0x022c
            goto L_0x030c
        L_0x022c:
            int r2 = com.google.android.gms.internal.ads.bc0.k0
            if (r1 == r2) goto L_0x026a
            int r2 = com.google.android.gms.internal.ads.bc0.u0
            if (r1 == r2) goto L_0x026a
            int r2 = com.google.android.gms.internal.ads.bc0.v0
            if (r1 == r2) goto L_0x026a
            int r2 = com.google.android.gms.internal.ads.bc0.w0
            if (r1 == r2) goto L_0x026a
            int r2 = com.google.android.gms.internal.ads.bc0.x0
            if (r1 != r2) goto L_0x0241
            goto L_0x026a
        L_0x0241:
            int r2 = com.google.android.gms.internal.ads.bc0.N0
            if (r1 != r2) goto L_0x0254
            java.lang.String r1 = java.lang.Integer.toString(r22)
            java.lang.String r2 = "application/x-camera-motion"
            r3 = -1
            r7 = 0
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.i(r1, r2, r7, r3, r15)
            r8.f3955b = r1
            goto L_0x0255
        L_0x0254:
            r7 = 0
        L_0x0255:
            r23 = r4
            r24 = r5
            r37 = r6
            r0 = r8
            r31 = r9
            r19 = r10
            r36 = r11
            r16 = r12
            r48 = r13
            r18 = r14
            goto L_0x0365
        L_0x026a:
            r3 = -1
            r7 = 0
            int r2 = r5 + 8
            r19 = 8
            int r2 = r2 + 8
            r12.l(r2)
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.google.android.gms.internal.ads.bc0.k0
            java.lang.String r24 = "application/ttml+xml"
            if (r1 != r2) goto L_0x0285
            r17 = r7
            r2 = 1
            r7 = 0
            goto L_0x02bf
        L_0x0285:
            int r2 = com.google.android.gms.internal.ads.bc0.u0
            if (r1 != r2) goto L_0x029f
            int r1 = r4 + -8
            int r1 = r1 + -8
            byte[] r2 = new byte[r1]
            r7 = 0
            r12.p(r2, r7, r1)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            java.lang.String r2 = "application/x-quicktime-tx3g"
            r17 = r1
            r24 = r2
            r2 = 1
            goto L_0x02bf
        L_0x029f:
            r7 = 0
            int r2 = com.google.android.gms.internal.ads.bc0.v0
            if (r1 != r2) goto L_0x02ac
            java.lang.String r1 = "application/x-mp4-vtt"
            r24 = r1
        L_0x02a8:
            r2 = 1
        L_0x02a9:
            r17 = 0
            goto L_0x02bf
        L_0x02ac:
            int r2 = com.google.android.gms.internal.ads.bc0.w0
            if (r1 != r2) goto L_0x02b3
            r29 = r20
            goto L_0x02a8
        L_0x02b3:
            int r2 = com.google.android.gms.internal.ads.bc0.x0
            if (r1 != r2) goto L_0x0306
            r2 = 1
            r8.f3957d = r2
            java.lang.String r1 = "application/x-mp4-cea-608"
            r24 = r1
            goto L_0x02a9
        L_0x02bf:
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r18 = 0
            r34 = -1
            r35 = 0
            r36 = -1
            r37 = 1
            r2 = r24
            r24 = -1
            r3 = r18
            r18 = r14
            r14 = r4
            r4 = r34
            r38 = r5
            r5 = r35
            r39 = r6
            r6 = r11
            r19 = 0
            r31 = 0
            r7 = r36
            r40 = r8
            r8 = r53
            r31 = r9
            r19 = r10
            r9 = r29
            r0 = r11
            r11 = r17
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r11 = r40
            r11.f3955b = r1
            r36 = r0
            r0 = r11
            r16 = r12
            r48 = r13
            r23 = r14
            r24 = r38
            goto L_0x0363
        L_0x0306:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x030c:
            r38 = r5
            r39 = r6
            r31 = r9
            r19 = r10
            r0 = r11
            r18 = r14
            r14 = r4
            r11 = r8
            r10 = r38
            int r5 = r10 + 8
            r9 = 8
            int r5 = r5 + r9
            r12.l(r5)
            r2 = 6
            if (r54 == 0) goto L_0x032e
            int r4 = r12.h()
            r12.m(r2)
            goto L_0x0332
        L_0x032e:
            r12.m(r9)
            r4 = 0
        L_0x0332:
            if (r4 == 0) goto L_0x036f
            r8 = 1
            if (r4 != r8) goto L_0x0339
            r7 = 2
            goto L_0x0371
        L_0x0339:
            r7 = 2
            if (r4 != r7) goto L_0x0358
            r2 = 16
            r12.m(r2)
            long r4 = r12.e()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            long r4 = java.lang.Math.round(r4)
            int r2 = (int) r4
            int r4 = r12.v()
            r5 = 20
            r12.m(r5)
            goto L_0x0384
        L_0x0358:
            r36 = r0
            r24 = r10
            r0 = r11
            r16 = r12
            r48 = r13
            r23 = r14
        L_0x0363:
            r37 = r39
        L_0x0365:
            r17 = -1
            r25 = 3
            r29 = 0
        L_0x036b:
            r30 = 16
            goto L_0x078c
        L_0x036f:
            r7 = 2
            r8 = 1
        L_0x0371:
            int r5 = r12.h()
            r12.m(r2)
            int r2 = r12.u()
            if (r4 != r8) goto L_0x0383
            r4 = 16
            r12.m(r4)
        L_0x0383:
            r4 = r5
        L_0x0384:
            int r5 = r12.b()
            int r6 = com.google.android.gms.internal.ads.bc0.b0
            if (r1 != r6) goto L_0x0396
            r6 = r39
            int r1 = a(r12, r10, r14, r11, r6)
            r12.l(r5)
            goto L_0x0398
        L_0x0396:
            r6 = r39
        L_0x0398:
            int r7 = com.google.android.gms.internal.ads.bc0.o
            java.lang.String r8 = "audio/raw"
            if (r1 != r7) goto L_0x03a1
            java.lang.String r1 = "audio/ac3"
            goto L_0x03ea
        L_0x03a1:
            int r7 = com.google.android.gms.internal.ads.bc0.q
            if (r1 != r7) goto L_0x03a8
            java.lang.String r1 = "audio/eac3"
            goto L_0x03ea
        L_0x03a8:
            int r7 = com.google.android.gms.internal.ads.bc0.s
            if (r1 != r7) goto L_0x03af
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x03ea
        L_0x03af:
            int r7 = com.google.android.gms.internal.ads.bc0.t
            if (r1 == r7) goto L_0x03e8
            int r7 = com.google.android.gms.internal.ads.bc0.u
            if (r1 != r7) goto L_0x03b8
            goto L_0x03e8
        L_0x03b8:
            int r7 = com.google.android.gms.internal.ads.bc0.v
            if (r1 != r7) goto L_0x03bf
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03ea
        L_0x03bf:
            int r7 = com.google.android.gms.internal.ads.bc0.y0
            if (r1 != r7) goto L_0x03c6
            java.lang.String r1 = "audio/3gpp"
            goto L_0x03ea
        L_0x03c6:
            int r7 = com.google.android.gms.internal.ads.bc0.z0
            if (r1 != r7) goto L_0x03cd
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x03ea
        L_0x03cd:
            int r7 = com.google.android.gms.internal.ads.bc0.m
            if (r1 == r7) goto L_0x03e6
            int r7 = com.google.android.gms.internal.ads.bc0.n
            if (r1 != r7) goto L_0x03d6
            goto L_0x03e6
        L_0x03d6:
            int r7 = com.google.android.gms.internal.ads.bc0.k
            if (r1 != r7) goto L_0x03dd
            java.lang.String r1 = "audio/mpeg"
            goto L_0x03ea
        L_0x03dd:
            int r7 = com.google.android.gms.internal.ads.bc0.O0
            if (r1 != r7) goto L_0x03e4
            java.lang.String r1 = "audio/alac"
            goto L_0x03ea
        L_0x03e4:
            r1 = 0
            goto L_0x03ea
        L_0x03e6:
            r1 = r8
            goto L_0x03ea
        L_0x03e8:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x03ea:
            r7 = r1
            r29 = r2
            r17 = r4
            r30 = 0
        L_0x03f1:
            int r1 = r5 - r10
            if (r1 >= r14) goto L_0x0540
            r12.l(r5)
            int r4 = r12.d()
            if (r4 <= 0) goto L_0x0400
            r1 = 1
            goto L_0x0401
        L_0x0400:
            r1 = 0
        L_0x0401:
            com.google.android.gms.internal.ads.zzpb.b(r1, r3)
            int r1 = r12.d()
            int r2 = com.google.android.gms.internal.ads.bc0.K
            if (r1 == r2) goto L_0x04b9
            if (r54 == 0) goto L_0x0414
            int r2 = com.google.android.gms.internal.ads.bc0.l
            if (r1 != r2) goto L_0x0414
            goto L_0x04b9
        L_0x0414:
            int r2 = com.google.android.gms.internal.ads.bc0.p
            if (r1 != r2) goto L_0x0438
            int r1 = r5 + 8
            r12.l(r1)
            java.lang.String r1 = java.lang.Integer.toString(r22)
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzie.a(r12, r1, r0, r15)
            r11.f3955b = r1
        L_0x0427:
            r41 = r3
            r2 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r11 = 0
            r16 = 2
            goto L_0x04b2
        L_0x0438:
            int r2 = com.google.android.gms.internal.ads.bc0.r
            if (r1 != r2) goto L_0x044c
            int r1 = r5 + 8
            r12.l(r1)
            java.lang.String r1 = java.lang.Integer.toString(r22)
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzie.b(r12, r1, r0, r15)
            r11.f3955b = r1
            goto L_0x0427
        L_0x044c:
            int r2 = com.google.android.gms.internal.ads.bc0.w
            if (r1 != r2) goto L_0x0488
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r34 = 0
            r35 = -1
            r36 = -1
            r37 = 0
            r38 = 0
            r2 = r7
            r41 = r3
            r3 = r34
            r42 = r4
            r4 = r35
            r43 = r5
            r5 = r36
            r44 = r6
            r6 = r17
            r45 = r7
            r16 = 2
            r7 = r29
            r46 = r8
            r8 = r37
            r9 = r53
            r47 = r10
            r10 = r38
            r15 = r11
            r11 = r0
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.f3955b = r1
            goto L_0x04ad
        L_0x0488:
            r41 = r3
            r42 = r4
            r43 = r5
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r16 = 2
            int r2 = com.google.android.gms.internal.ads.bc0.O0
            if (r1 != r2) goto L_0x04ad
            r2 = r42
            byte[] r1 = new byte[r2]
            r5 = r43
            r12.l(r5)
            r11 = 0
            r12.p(r1, r11, r2)
            r30 = r1
            goto L_0x04b2
        L_0x04ad:
            r2 = r42
            r5 = r43
            r11 = 0
        L_0x04b2:
            r4 = r41
            r7 = r45
            r10 = -1
            goto L_0x0531
        L_0x04b9:
            r41 = r3
            r2 = r4
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r11 = 0
            r16 = 2
            int r3 = com.google.android.gms.internal.ads.bc0.K
            if (r1 != r3) goto L_0x04d1
            r1 = r5
            r4 = r41
        L_0x04cf:
            r10 = -1
            goto L_0x04fb
        L_0x04d1:
            int r1 = r12.b()
        L_0x04d5:
            int r3 = r1 - r5
            if (r3 >= r2) goto L_0x04f7
            r12.l(r1)
            int r3 = r12.d()
            r4 = r41
            if (r3 <= 0) goto L_0x04e6
            r9 = 1
            goto L_0x04e7
        L_0x04e6:
            r9 = 0
        L_0x04e7:
            com.google.android.gms.internal.ads.zzpb.b(r9, r4)
            int r6 = r12.d()
            int r7 = com.google.android.gms.internal.ads.bc0.K
            if (r6 != r7) goto L_0x04f3
            goto L_0x04cf
        L_0x04f3:
            int r1 = r1 + r3
            r41 = r4
            goto L_0x04d5
        L_0x04f7:
            r4 = r41
            r1 = -1
            goto L_0x04cf
        L_0x04fb:
            if (r1 == r10) goto L_0x052f
            android.util.Pair r1 = e(r12, r1)
            java.lang.Object r3 = r1.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.second
            r30 = r1
            byte[] r30 = (byte[]) r30
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x052d
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzpa.d(r30)
            java.lang.Object r6 = r1.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r17 = r1
            r7 = r3
            r29 = r6
            goto L_0x0531
        L_0x052d:
            r7 = r3
            goto L_0x0531
        L_0x052f:
            r7 = r45
        L_0x0531:
            int r5 = r5 + r2
            r3 = r4
            r11 = r15
            r6 = r44
            r8 = r46
            r10 = r47
            r9 = 8
            r15 = r53
            goto L_0x03f1
        L_0x0540:
            r44 = r6
            r45 = r7
            r46 = r8
            r47 = r10
            r15 = r11
            r10 = -1
            r11 = 0
            r16 = 2
            com.google.android.gms.internal.ads.zzhq r1 = r15.f3955b
            if (r1 != 0) goto L_0x058a
            r7 = r45
            if (r7 == 0) goto L_0x058a
            r1 = r46
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x055f
            r8 = 2
            goto L_0x0560
        L_0x055f:
            r8 = -1
        L_0x0560:
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r3 = 0
            r4 = -1
            r5 = -1
            if (r30 != 0) goto L_0x056b
            r9 = 0
            goto L_0x0570
        L_0x056b:
            java.util.List r2 = java.util.Collections.singletonList(r30)
            r9 = r2
        L_0x0570:
            r24 = 0
            r2 = r7
            r6 = r17
            r7 = r29
            r17 = -1
            r10 = r53
            r29 = 0
            r11 = r24
            r50 = r13
            r13 = r12
            r12 = r0
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.f3955b = r1
            goto L_0x0591
        L_0x058a:
            r50 = r13
            r17 = -1
            r29 = 0
            r13 = r12
        L_0x0591:
            r48 = r50
            r36 = r0
            r16 = r13
            r23 = r14
            r0 = r15
            r37 = r44
            r24 = r47
        L_0x059e:
            r25 = 3
            goto L_0x036b
        L_0x05a2:
            r47 = r5
            r44 = r6
            r15 = r8
            r31 = r9
            r19 = r10
            r0 = r11
            r50 = r13
            r18 = r14
            r17 = -1
            r29 = 0
            r14 = r4
            r13 = r12
            r4 = r3
            r12 = r47
            int r5 = r12 + 8
            r11 = 8
            int r5 = r5 + r11
            r13.l(r5)
            r10 = 16
            r13.m(r10)
            int r6 = r13.h()
            int r7 = r13.h()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 50
            r13.m(r3)
            int r3 = r13.b()
            int r5 = com.google.android.gms.internal.ads.bc0.a0
            r9 = r44
            if (r1 != r5) goto L_0x05e6
            int r1 = a(r13, r12, r14, r15, r9)
            r13.l(r3)
        L_0x05e6:
            r2 = 0
            r5 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r30 = 0
            r34 = -1
        L_0x05f0:
            int r8 = r3 - r12
            if (r8 >= r14) goto L_0x073d
            r13.l(r3)
            int r8 = r13.b()
            int r10 = r13.d()
            if (r10 != 0) goto L_0x0609
            int r36 = r13.b()
            int r11 = r36 - r12
            if (r11 == r14) goto L_0x073d
        L_0x0609:
            if (r10 <= 0) goto L_0x060d
            r11 = 1
            goto L_0x060e
        L_0x060d:
            r11 = 0
        L_0x060e:
            com.google.android.gms.internal.ads.zzpb.b(r11, r4)
            int r11 = r13.d()
            r36 = r0
            int r0 = com.google.android.gms.internal.ads.bc0.I
            if (r11 != r0) goto L_0x063b
            if (r2 != 0) goto L_0x061f
            r0 = 1
            goto L_0x0620
        L_0x061f:
            r0 = 0
        L_0x0620:
            com.google.android.gms.internal.ads.zzpb.e(r0)
            int r8 = r8 + 8
            r13.l(r8)
            com.google.android.gms.internal.ads.zzpq r0 = com.google.android.gms.internal.ads.zzpq.a(r13)
            java.util.List<byte[]> r2 = r0.f9000a
            int r8 = r0.f9001b
            r15.f3956c = r8
            if (r5 != 0) goto L_0x0638
            float r0 = r0.f9002c
            r24 = r0
        L_0x0638:
            java.lang.String r0 = "video/avc"
            goto L_0x0658
        L_0x063b:
            int r0 = com.google.android.gms.internal.ads.bc0.J
            if (r11 != r0) goto L_0x0664
            if (r2 != 0) goto L_0x0643
            r0 = 1
            goto L_0x0644
        L_0x0643:
            r0 = 0
        L_0x0644:
            com.google.android.gms.internal.ads.zzpb.e(r0)
            int r8 = r8 + 8
            r13.l(r8)
            com.google.android.gms.internal.ads.zzpw r0 = com.google.android.gms.internal.ads.zzpw.a(r13)
            java.util.List<byte[]> r2 = r0.f9012a
            int r0 = r0.f9013b
            r15.f3956c = r0
            java.lang.String r0 = "video/hevc"
        L_0x0658:
            r37 = r1
            r23 = r2
            r41 = r4
            r4 = 2
            r8 = 1
            r11 = 3
            r2 = r0
            goto L_0x0730
        L_0x0664:
            int r0 = com.google.android.gms.internal.ads.bc0.M0
            if (r11 != r0) goto L_0x067b
            if (r2 != 0) goto L_0x066c
            r0 = 1
            goto L_0x066d
        L_0x066c:
            r0 = 0
        L_0x066d:
            com.google.android.gms.internal.ads.zzpb.e(r0)
            int r0 = com.google.android.gms.internal.ads.bc0.K0
            if (r1 != r0) goto L_0x0677
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0679
        L_0x0677:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x0679:
            r2 = r0
            goto L_0x0689
        L_0x067b:
            int r0 = com.google.android.gms.internal.ads.bc0.h
            if (r11 != r0) goto L_0x068f
            if (r2 != 0) goto L_0x0683
            r0 = 1
            goto L_0x0684
        L_0x0683:
            r0 = 0
        L_0x0684:
            com.google.android.gms.internal.ads.zzpb.e(r0)
            java.lang.String r2 = "video/3gpp"
        L_0x0689:
            r37 = r1
            r41 = r4
        L_0x068d:
            r4 = 2
            goto L_0x06c7
        L_0x068f:
            int r0 = com.google.android.gms.internal.ads.bc0.K
            if (r11 != r0) goto L_0x06ac
            if (r2 != 0) goto L_0x0697
            r0 = 1
            goto L_0x0698
        L_0x0697:
            r0 = 0
        L_0x0698:
            com.google.android.gms.internal.ads.zzpb.e(r0)
            android.util.Pair r0 = e(r13, r8)
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r23 = java.util.Collections.singletonList(r0)
            goto L_0x0689
        L_0x06ac:
            int r0 = com.google.android.gms.internal.ads.bc0.j0
            if (r11 != r0) goto L_0x06cb
            int r8 = r8 + 8
            r13.l(r8)
            int r0 = r13.v()
            int r5 = r13.v()
            float r0 = (float) r0
            float r5 = (float) r5
            float r24 = r0 / r5
            r37 = r1
            r41 = r4
            r4 = 2
            r5 = 1
        L_0x06c7:
            r8 = 1
            r11 = 3
            goto L_0x0730
        L_0x06cb:
            int r0 = com.google.android.gms.internal.ads.bc0.I0
            if (r11 != r0) goto L_0x06fe
            int r0 = r8 + 8
        L_0x06d1:
            int r11 = r0 - r8
            if (r11 >= r10) goto L_0x06f6
            r13.l(r0)
            int r11 = r13.d()
            r37 = r1
            int r1 = r13.d()
            r41 = r4
            int r4 = com.google.android.gms.internal.ads.bc0.J0
            if (r1 != r4) goto L_0x06f0
            byte[] r1 = r13.f8980a
            int r11 = r11 + r0
            byte[] r8 = java.util.Arrays.copyOfRange(r1, r0, r11)
            goto L_0x06fb
        L_0x06f0:
            int r0 = r0 + r11
            r1 = r37
            r4 = r41
            goto L_0x06d1
        L_0x06f6:
            r37 = r1
            r41 = r4
            r8 = 0
        L_0x06fb:
            r30 = r8
            goto L_0x068d
        L_0x06fe:
            r37 = r1
            r41 = r4
            int r0 = com.google.android.gms.internal.ads.bc0.H0
            if (r11 != r0) goto L_0x068d
            int r0 = r13.g()
            r11 = 3
            r13.m(r11)
            if (r0 != 0) goto L_0x072e
            int r0 = r13.g()
            if (r0 == 0) goto L_0x0729
            r8 = 1
            if (r0 == r8) goto L_0x0725
            r4 = 2
            if (r0 == r4) goto L_0x0722
            if (r0 == r11) goto L_0x071f
            goto L_0x0730
        L_0x071f:
            r34 = 3
            goto L_0x0730
        L_0x0722:
            r34 = 2
            goto L_0x0730
        L_0x0725:
            r4 = 2
            r34 = 1
            goto L_0x0730
        L_0x0729:
            r4 = 2
            r8 = 1
            r34 = 0
            goto L_0x0730
        L_0x072e:
            r4 = 2
            r8 = 1
        L_0x0730:
            int r3 = r3 + r10
            r0 = r36
            r1 = r37
            r4 = r41
            r10 = 16
            r11 = 8
            goto L_0x05f0
        L_0x073d:
            r36 = r0
            r4 = 2
            r8 = 1
            r11 = 3
            if (r2 == 0) goto L_0x077f
            java.lang.String r1 = java.lang.Integer.toString(r22)
            r3 = 0
            r0 = -1
            r5 = -1
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r16 = 0
            r25 = 2
            r4 = r0
            r0 = 1
            r8 = r10
            r37 = r9
            r9 = r23
            r23 = 16
            r10 = r28
            r0 = 8
            r35 = 3
            r11 = r24
            r24 = r12
            r12 = r30
            r48 = r50
            r0 = r13
            r25 = 3
            r13 = r34
            r23 = r14
            r30 = 16
            r14 = r16
            r16 = r0
            r0 = r15
            r15 = r53
            com.google.android.gms.internal.ads.zzhq r1 = com.google.android.gms.internal.ads.zzhq.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f3955b = r1
            goto L_0x078c
        L_0x077f:
            r48 = r50
            r37 = r9
            r24 = r12
            r16 = r13
            r23 = r14
            r0 = r15
            goto L_0x059e
        L_0x078c:
            int r5 = r24 + r23
            r1 = r16
            r1.l(r5)
            int r6 = r37 + 1
            r15 = r53
            r8 = r0
            r12 = r1
            r14 = r18
            r10 = r19
            r9 = r31
            r11 = r36
            r13 = r48
            r7 = 8
            r0 = r49
            goto L_0x01b4
        L_0x07a9:
            r0 = r8
            r19 = r10
            r48 = r13
            r18 = r14
            r29 = 0
            int r1 = com.google.android.gms.internal.ads.bc0.Q
            r2 = r49
            com.google.android.gms.internal.ads.ac0 r1 = r2.g(r1)
            if (r1 == 0) goto L_0x0817
            int r2 = com.google.android.gms.internal.ads.bc0.R
            com.google.android.gms.internal.ads.dc0 r1 = r1.f(r2)
            if (r1 != 0) goto L_0x07c5
            goto L_0x0817
        L_0x07c5:
            com.google.android.gms.internal.ads.zzpi r1 = r1.P0
            r2 = 8
            r1.l(r2)
            int r2 = r1.d()
            int r2 = com.google.android.gms.internal.ads.bc0.a(r2)
            int r3 = r1.v()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r9 = 0
        L_0x07dd:
            if (r9 >= r3) goto L_0x0810
            r6 = 1
            if (r2 != r6) goto L_0x07e7
            long r7 = r1.w()
            goto L_0x07eb
        L_0x07e7:
            long r7 = r1.s()
        L_0x07eb:
            r4[r9] = r7
            if (r2 != r6) goto L_0x07f4
            long r7 = r1.e()
            goto L_0x07f9
        L_0x07f4:
            int r7 = r1.d()
            long r7 = (long) r7
        L_0x07f9:
            r5[r9] = r7
            short r7 = r1.f()
            if (r7 != r6) goto L_0x0808
            r7 = 2
            r1.m(r7)
            int r9 = r9 + 1
            goto L_0x07dd
        L_0x0808:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0810:
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            r2 = r1
            r1 = 0
            goto L_0x081c
        L_0x0817:
            r1 = 0
            android.util.Pair r2 = android.util.Pair.create(r1, r1)
        L_0x081c:
            com.google.android.gms.internal.ads.zzhq r3 = r0.f3955b
            if (r3 != 0) goto L_0x0821
            return r1
        L_0x0821:
            com.google.android.gms.internal.ads.zzlp r1 = new com.google.android.gms.internal.ads.zzlp
            int r16 = com.google.android.gms.internal.ads.ic0.b(r18)
            r3 = r48
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.google.android.gms.internal.ads.zzhq r5 = r0.f3955b
            int r6 = r0.f3957d
            com.google.android.gms.internal.ads.zzlo[] r7 = r0.f3954a
            int r0 = r0.f3956c
            java.lang.Object r8 = r2.first
            r28 = r8
            long[] r28 = (long[]) r28
            java.lang.Object r2 = r2.second
            r29 = r2
            long[] r29 = (long[]) r29
            r15 = r1
            r17 = r19
            r18 = r3
            r20 = r32
            r22 = r26
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cc0.b(com.google.android.gms.internal.ads.ac0, com.google.android.gms.internal.ads.dc0, long, com.google.android.gms.internal.ads.zzjl, boolean):com.google.android.gms.internal.ads.zzlp");
    }

    public static rc0 c(zzlp zzlp, ac0 ac0, zzkb zzkb) throws zzht {
        ec0 ec0;
        boolean z;
        int i;
        int i2;
        long j;
        int i3;
        int[] iArr;
        int i4;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        zzlp zzlp2;
        long j2;
        long[] jArr3;
        boolean z2;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i5;
        int i6;
        int i7;
        int i8;
        zzlp zzlp3 = zzlp;
        ac0 ac02 = ac0;
        zzkb zzkb2 = zzkb;
        dc0 f2 = ac02.f(bc0.q0);
        if (f2 != null) {
            ec0 = new gc0(f2);
        } else {
            dc0 f3 = ac02.f(bc0.r0);
            if (f3 != null) {
                ec0 = new jc0(f3);
            } else {
                throw new zzht("Track has no sample table size information");
            }
        }
        int c2 = ec0.c();
        if (c2 == 0) {
            return new rc0(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        dc0 f4 = ac02.f(bc0.s0);
        if (f4 == null) {
            f4 = ac02.f(bc0.t0);
            z = true;
        } else {
            z = false;
        }
        zzpi zzpi = f4.P0;
        zzpi zzpi2 = ac02.f(bc0.p0).P0;
        zzpi zzpi3 = ac02.f(bc0.m0).P0;
        dc0 f5 = ac02.f(bc0.n0);
        zzpi zzpi4 = null;
        zzpi zzpi5 = f5 != null ? f5.P0 : null;
        dc0 f6 = ac02.f(bc0.o0);
        zzpi zzpi6 = f6 != null ? f6.P0 : null;
        fc0 fc0 = new fc0(zzpi2, zzpi, z);
        zzpi3.l(12);
        int v = zzpi3.v() - 1;
        int v2 = zzpi3.v();
        int v3 = zzpi3.v();
        if (zzpi6 != null) {
            zzpi6.l(12);
            i = zzpi6.v();
        } else {
            i = 0;
        }
        int i9 = -1;
        if (zzpi5 != null) {
            zzpi5.l(12);
            i2 = zzpi5.v();
            if (i2 > 0) {
                i9 = zzpi5.v() - 1;
                zzpi4 = zzpi5;
            }
        } else {
            zzpi4 = zzpi5;
            i2 = 0;
        }
        long j3 = 0;
        if (!(ec0.b() && "audio/raw".equals(zzlp3.f8845f.g) && v == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[c2];
            iArr = new int[c2];
            jArr = new long[c2];
            int i10 = i2;
            iArr2 = new int[c2];
            zzpi zzpi7 = zzpi3;
            int i11 = i9;
            long j4 = 0;
            j = 0;
            int i12 = 0;
            i4 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = i;
            int i17 = v3;
            int i18 = v2;
            int i19 = v;
            int i20 = i10;
            while (i12 < c2) {
                while (i14 == 0) {
                    zzpb.e(fc0.a());
                    j4 = fc0.f3787d;
                    i14 = fc0.f3786c;
                    i17 = i17;
                    i18 = i18;
                }
                int i21 = i18;
                int i22 = i17;
                if (zzpi6 != null) {
                    while (i13 == 0 && i16 > 0) {
                        i13 = zzpi6.v();
                        i15 = zzpi6.d();
                        i16--;
                    }
                    i13--;
                }
                int i23 = i15;
                jArr5[i12] = j4;
                iArr[i12] = ec0.a();
                if (iArr[i12] > i4) {
                    i4 = iArr[i12];
                }
                int i24 = c2;
                ec0 ec02 = ec0;
                jArr[i12] = j + ((long) i23);
                iArr2[i12] = zzpi4 == null ? 1 : 0;
                if (i12 == i11) {
                    iArr2[i12] = 1;
                    i20--;
                    if (i20 > 0) {
                        i11 = zzpi4.v() - 1;
                    }
                }
                int i25 = i22;
                long[] jArr6 = jArr5;
                j += (long) i25;
                int i26 = i21 - 1;
                if (i26 != 0 || i19 <= 0) {
                    int i27 = i26;
                    i7 = i25;
                    i8 = i27;
                } else {
                    i8 = zzpi7.v();
                    i7 = zzpi7.v();
                    i19--;
                }
                int i28 = i8;
                j4 += (long) iArr[i12];
                i14--;
                i12++;
                c2 = i24;
                jArr5 = jArr6;
                i11 = i11;
                i15 = i23;
                i18 = i28;
                ec0 ec03 = ec02;
                i17 = i7;
                ec0 = ec03;
            }
            i3 = c2;
            long[] jArr7 = jArr5;
            int i29 = i18;
            zzpb.a(i13 == 0);
            while (i16 > 0) {
                zzpb.a(zzpi6.v() == 0);
                zzpi6.d();
                i16--;
            }
            if (i20 == 0 && i29 == 0) {
                i6 = i14;
                if (i6 == 0 && i19 == 0) {
                    zzlp2 = zzlp;
                    jArr2 = jArr7;
                }
            } else {
                i6 = i14;
            }
            zzlp2 = zzlp;
            int i30 = zzlp2.f8840a;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i30);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i20);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i29);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i6);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i19);
            Log.w("AtomParsers", sb.toString());
            jArr2 = jArr7;
        } else {
            zzlp2 = zzlp3;
            i3 = c2;
            ec0 ec04 = ec0;
            int i31 = fc0.f3784a;
            long[] jArr8 = new long[i31];
            int[] iArr6 = new int[i31];
            while (fc0.a()) {
                int i32 = fc0.f3785b;
                jArr8[i32] = fc0.f3787d;
                iArr6[i32] = fc0.f3786c;
            }
            int a2 = ec04.a();
            long j5 = (long) v3;
            int i33 = 8192 / a2;
            int i34 = 0;
            for (int i35 = 0; i35 < i31; i35++) {
                i34 += zzpo.q(iArr6[i35], i33);
            }
            long[] jArr9 = new long[i34];
            int[] iArr7 = new int[i34];
            long[] jArr10 = new long[i34];
            int[] iArr8 = new int[i34];
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            while (i36 < i31) {
                int i40 = iArr6[i36];
                long j6 = jArr8[i36];
                int i41 = i40;
                int i42 = i31;
                int i43 = i41;
                while (i43 > 0) {
                    int min = Math.min(i33, i43);
                    jArr9[i38] = j6;
                    iArr7[i38] = a2 * min;
                    i39 = Math.max(i39, iArr7[i38]);
                    jArr10[i38] = ((long) i37) * j5;
                    iArr8[i38] = 1;
                    j6 += (long) iArr7[i38];
                    i37 += min;
                    i43 -= min;
                    i38++;
                    jArr8 = jArr8;
                    iArr6 = iArr6;
                }
                long[] jArr11 = jArr8;
                int[] iArr9 = iArr6;
                i36++;
                i31 = i42;
            }
            zzlf zzlf = new zzlf(jArr9, iArr7, i39, jArr10, iArr8);
            jArr2 = zzlf.f8827a;
            iArr = zzlf.f8828b;
            i4 = zzlf.f8829c;
            jArr = zzlf.f8830d;
            iArr2 = zzlf.f8831e;
            j = 0;
        }
        if (zzlp2.i == null || zzkb.c()) {
            zzpo.f(jArr, 1000000, zzlp2.f8842c);
            return new rc0(jArr2, iArr, i4, jArr, iArr2);
        }
        long[] jArr12 = zzlp2.i;
        if (jArr12.length == 1 && zzlp2.f8841b == 1 && jArr.length >= 2) {
            long j7 = zzlp2.j[0];
            long c3 = zzpo.c(jArr12[0], zzlp2.f8842c, zzlp2.f8843d) + j7;
            if (jArr[0] <= j7 && j7 < jArr[1] && jArr[jArr.length - 1] < c3 && c3 <= j) {
                long j8 = j - c3;
                long c4 = zzpo.c(j7 - jArr[0], (long) zzlp2.f8845f.t, zzlp2.f8842c);
                long c5 = zzpo.c(j8, (long) zzlp2.f8845f.t, zzlp2.f8842c);
                if (!(c4 == 0 && c5 == 0) && c4 <= 2147483647L && c5 <= 2147483647L) {
                    int i44 = (int) c4;
                    zzkb zzkb3 = zzkb;
                    zzkb3.f8809a = i44;
                    zzkb3.f8810b = (int) c5;
                    zzpo.f(jArr, 1000000, zzlp2.f8842c);
                    return new rc0(jArr2, iArr, i4, jArr, iArr2);
                }
            }
        }
        long[] jArr13 = zzlp2.i;
        if (jArr13.length == 1) {
            char c6 = 0;
            if (jArr13[0] == 0) {
                int i45 = 0;
                while (i45 < jArr.length) {
                    jArr[i45] = zzpo.c(jArr[i45] - zzlp2.j[c6], 1000000, zzlp2.f8842c);
                    i45++;
                    c6 = 0;
                }
                return new rc0(jArr2, iArr, i4, jArr, iArr2);
            }
        }
        boolean z3 = zzlp2.f8841b == 1;
        boolean z4 = false;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        while (true) {
            long[] jArr14 = zzlp2.i;
            j2 = -1;
            if (i48 >= jArr14.length) {
                break;
            }
            int i49 = i4;
            int[] iArr10 = iArr;
            long j9 = zzlp2.j[i48];
            if (j9 != -1) {
                i5 = i49;
                long c7 = zzpo.c(jArr14[i48], zzlp2.f8842c, zzlp2.f8843d);
                int h2 = zzpo.h(jArr, j9, true, true);
                int h3 = zzpo.h(jArr, j9 + c7, z3, false);
                i46 += h3 - h2;
                z4 |= i47 != h2;
                i47 = h3;
            } else {
                i5 = i49;
            }
            i48++;
            iArr = iArr10;
            i4 = i5;
        }
        int i50 = i4;
        int[] iArr11 = iArr;
        boolean z5 = z4 | (i46 != i3);
        long[] jArr15 = z5 ? new long[i46] : jArr2;
        int[] iArr12 = z5 ? new int[i46] : iArr11;
        int i51 = z5 ? 0 : i50;
        int[] iArr13 = z5 ? new int[i46] : iArr2;
        long[] jArr16 = new long[i46];
        int i52 = i51;
        int i53 = 0;
        int i54 = 0;
        while (true) {
            long[] jArr17 = zzlp2.i;
            if (i53 >= jArr17.length) {
                break;
            }
            int[] iArr14 = iArr12;
            int[] iArr15 = iArr13;
            long j10 = zzlp2.j[i53];
            long j11 = jArr17[i53];
            if (j10 != j2) {
                long j12 = zzlp2.f8842c;
                jArr4 = jArr15;
                long[] jArr18 = jArr2;
                int h4 = zzpo.h(jArr, j10, true, true);
                int h5 = zzpo.h(jArr, zzpo.c(j11, j12, zzlp2.f8843d) + j10, z3, false);
                if (z5) {
                    int i55 = h5 - h4;
                    System.arraycopy(jArr18, h4, jArr4, i54, i55);
                    iArr4 = iArr11;
                    int[] iArr16 = iArr14;
                    z2 = z3;
                    iArr3 = iArr16;
                    System.arraycopy(iArr4, h4, iArr3, i54, i55);
                    jArr3 = jArr18;
                    iArr5 = iArr15;
                    System.arraycopy(iArr2, h4, iArr5, i54, i55);
                } else {
                    iArr4 = iArr11;
                    jArr3 = jArr18;
                    iArr5 = iArr15;
                    int[] iArr17 = iArr14;
                    z2 = z3;
                    iArr3 = iArr17;
                }
                int i56 = i52;
                while (h4 < h5) {
                    int[] iArr18 = iArr5;
                    int[] iArr19 = iArr4;
                    long j13 = j10;
                    jArr16[i54] = zzpo.c(j3, 1000000, zzlp2.f8843d) + zzpo.c(jArr[h4] - j10, 1000000, zzlp2.f8842c);
                    if (z5 && iArr3[i54] > i56) {
                        i56 = iArr19[h4];
                    }
                    i54++;
                    h4++;
                    iArr4 = iArr19;
                    j10 = j13;
                    iArr5 = iArr18;
                }
                iArr15 = iArr5;
                iArr11 = iArr4;
                i52 = i56;
            } else {
                jArr4 = jArr15;
                jArr3 = jArr2;
                int[] iArr20 = iArr14;
                z2 = z3;
                iArr3 = iArr20;
            }
            j3 += j11;
            i53++;
            iArr12 = iArr3;
            jArr15 = jArr4;
            z3 = z2;
            iArr13 = iArr15;
            jArr2 = jArr3;
            j2 = -1;
        }
        long[] jArr19 = jArr15;
        int[] iArr21 = iArr12;
        int[] iArr22 = iArr13;
        boolean z6 = false;
        for (int i57 = 0; i57 < iArr22.length && !z6; i57++) {
            z6 |= (iArr22[i57] & 1) != 0;
        }
        if (z6) {
            return new rc0(jArr19, iArr21, i52, jArr16, iArr22);
        }
        throw new zzht("The edited sample sequence does not contain a sync sample.");
    }

    public static zzme d(dc0 dc0, boolean z) {
        if (z) {
            return null;
        }
        zzpi zzpi = dc0.P0;
        zzpi.l(8);
        while (zzpi.q() >= 8) {
            int b2 = zzpi.b();
            int d2 = zzpi.d();
            if (zzpi.d() == bc0.B0) {
                zzpi.l(b2);
                int i = b2 + d2;
                zzpi.m(12);
                while (true) {
                    if (zzpi.b() >= i) {
                        break;
                    }
                    int b3 = zzpi.b();
                    int d3 = zzpi.d();
                    if (zzpi.d() == bc0.C0) {
                        zzpi.l(b3);
                        int i2 = b3 + d3;
                        zzpi.m(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzpi.b() < i2) {
                            zzme.zza d4 = nc0.d(zzpi);
                            if (d4 != null) {
                                arrayList.add(d4);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzme((List<? extends zzme.zza>) arrayList);
                        }
                    } else {
                        zzpi.m(d3 - 8);
                    }
                }
                return null;
            }
            zzpi.m(d2 - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> e(zzpi zzpi, int i) {
        zzpi.l(i + 8 + 4);
        zzpi.m(1);
        f(zzpi);
        zzpi.m(2);
        int g2 = zzpi.g();
        if ((g2 & 128) != 0) {
            zzpi.m(2);
        }
        if ((g2 & 64) != 0) {
            zzpi.m(zzpi.h());
        }
        if ((g2 & 32) != 0) {
            zzpi.m(2);
        }
        zzpi.m(1);
        f(zzpi);
        int g3 = zzpi.g();
        String str = null;
        if (g3 == 32) {
            str = "video/mp4v-es";
        } else if (g3 == 33) {
            str = "video/avc";
        } else if (g3 != 35) {
            if (g3 != 64) {
                if (g3 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (g3 == 165) {
                    str = "audio/ac3";
                } else if (g3 != 166) {
                    switch (g3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzpi.m(12);
        zzpi.m(1);
        int f2 = f(zzpi);
        byte[] bArr = new byte[f2];
        zzpi.p(bArr, 0, f2);
        return Pair.create(str, bArr);
    }

    private static int f(zzpi zzpi) {
        int g2 = zzpi.g();
        int i = g2 & 127;
        while ((g2 & 128) == 128) {
            g2 = zzpi.g();
            i = (i << 7) | (g2 & 127);
        }
        return i;
    }
}
