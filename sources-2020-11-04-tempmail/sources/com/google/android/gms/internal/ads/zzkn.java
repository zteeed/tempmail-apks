package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzjl;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzkn implements zzjx {
    private static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID b0 = new UUID(72057594037932032L, -9223371306706625679L);
    private long A;
    private zzpc B;
    private zzpc C;
    private boolean D;
    private int E;
    private long F;
    private long G;
    private int H;
    private int I;
    private int[] J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private byte S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private zzjz Y;

    /* renamed from: a  reason: collision with root package name */
    private final ub0 f8998a;

    /* renamed from: b  reason: collision with root package name */
    private final yb0 f8999b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<wb0> f9000c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9001d;

    /* renamed from: e  reason: collision with root package name */
    private final zzpi f9002e;

    /* renamed from: f  reason: collision with root package name */
    private final zzpi f9003f;
    private final zzpi g;
    private final zzpi h;
    private final zzpi i;
    private final zzpi j;
    private final zzpi k;
    private final zzpi l;
    private final zzpi m;
    private ByteBuffer n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private wb0 t;
    private boolean u;
    private int v;
    private long w;
    private boolean x;
    private long y;
    private long z;

    public zzkn() {
        this(0);
    }

    private final int b(zzjw zzjw, zzke zzke, int i2) throws IOException, InterruptedException {
        int i3;
        int q2 = this.j.q();
        if (q2 > 0) {
            i3 = Math.min(i2, q2);
            zzke.a(this.j, i3);
        } else {
            i3 = zzke.c(zzjw, i2, false);
        }
        this.N += i3;
        this.V += i3;
        return i3;
    }

    private final void i(zzjw zzjw, wb0 wb0, int i2) throws IOException, InterruptedException {
        int i3;
        if ("S_TEXT/UTF8".equals(wb0.f5400a)) {
            int length = Z.length + i2;
            if (this.k.a() < length) {
                this.k.f9163a = Arrays.copyOf(Z, length + i2);
            }
            zzjw.b(this.k.f9163a, Z.length, i2);
            this.k.l(0);
            this.k.k(length);
            return;
        }
        zzke zzke = wb0.O;
        if (!this.O) {
            if (wb0.f5404e) {
                this.M &= -1073741825;
                int i4 = 128;
                if (!this.P) {
                    zzjw.b(this.g.f9163a, 0, 1);
                    this.N++;
                    byte[] bArr = this.g.f9163a;
                    if ((bArr[0] & 128) != 128) {
                        this.S = bArr[0];
                        this.P = true;
                    } else {
                        throw new zzht("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.S;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        zzjw.b(this.l.f9163a, 0, 8);
                        this.N += 8;
                        this.Q = true;
                        byte[] bArr2 = this.g.f9163a;
                        if (!z2) {
                            i4 = 0;
                        }
                        bArr2[0] = (byte) (i4 | 8);
                        this.g.l(0);
                        zzke.a(this.g, 1);
                        this.V++;
                        this.l.l(0);
                        zzke.a(this.l, 8);
                        this.V += 8;
                    }
                    if (z2) {
                        if (!this.R) {
                            zzjw.b(this.g.f9163a, 0, 1);
                            this.N++;
                            this.g.l(0);
                            this.T = this.g.g();
                            this.R = true;
                        }
                        int i5 = this.T << 2;
                        this.g.j(i5);
                        zzjw.b(this.g.f9163a, 0, i5);
                        this.N += i5;
                        short s2 = (short) ((this.T / 2) + 1);
                        int i6 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < i6) {
                            this.n = ByteBuffer.allocate(i6);
                        }
                        this.n.position(0);
                        this.n.putShort(s2);
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            i3 = this.T;
                            if (i7 >= i3) {
                                break;
                            }
                            int v2 = this.g.v();
                            if (i7 % 2 == 0) {
                                this.n.putShort((short) (v2 - i8));
                            } else {
                                this.n.putInt(v2 - i8);
                            }
                            i7++;
                            i8 = v2;
                        }
                        int i9 = (i2 - this.N) - i8;
                        if (i3 % 2 == 1) {
                            this.n.putInt(i9);
                        } else {
                            this.n.putShort((short) i9);
                            this.n.putInt(0);
                        }
                        this.m.o(this.n.array(), i6);
                        zzke.a(this.m, i6);
                        this.V += i6;
                    }
                }
            } else {
                byte[] bArr3 = wb0.f5405f;
                if (bArr3 != null) {
                    this.j.o(bArr3, bArr3.length);
                }
            }
            this.O = true;
        }
        int c2 = i2 + this.j.c();
        if (!"V_MPEG4/ISO/AVC".equals(wb0.f5400a) && !"V_MPEGH/ISO/HEVC".equals(wb0.f5400a)) {
            while (true) {
                int i10 = this.N;
                if (i10 >= c2) {
                    break;
                }
                b(zzjw, zzke, c2 - i10);
            }
        } else {
            byte[] bArr4 = this.f9003f.f9163a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i11 = wb0.P;
            int i12 = 4 - i11;
            while (this.N < c2) {
                int i13 = this.U;
                if (i13 == 0) {
                    int min = Math.min(i11, this.j.q());
                    zzjw.b(bArr4, i12 + min, i11 - min);
                    if (min > 0) {
                        this.j.p(bArr4, i12, min);
                    }
                    this.N += i11;
                    this.f9003f.l(0);
                    this.U = this.f9003f.v();
                    this.f9002e.l(0);
                    zzke.a(this.f9002e, 4);
                    this.V += 4;
                } else {
                    this.U = i13 - b(zzjw, zzke, i13);
                }
            }
        }
        if ("A_VORBIS".equals(wb0.f5400a)) {
            this.h.l(0);
            zzke.a(this.h, 4);
            this.V += 4;
        }
    }

    private final void j(wb0 wb0, long j2) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(wb0.f5400a)) {
            byte[] bArr2 = this.k.f9163a;
            long j3 = this.G;
            if (j3 == -9223372036854775807L) {
                bArr = a0;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (((long) i2) * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - ((long) (60000000 * i3));
                int i4 = (int) (j5 / 1000000);
                bArr = zzpo.k(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - ((long) (1000000 * i4))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            zzke zzke = wb0.O;
            zzpi zzpi = this.k;
            zzke.a(zzpi, zzpi.c());
            this.V += this.k.c();
        }
        wb0.O.d(j2, this.M, this.V, 0, wb0.g);
        this.W = true;
        s();
    }

    private static int[] k(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        if (iArr.length >= i2) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i2)];
    }

    static int l(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static boolean m(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    private final void o(zzjw zzjw, int i2) throws IOException, InterruptedException {
        if (this.g.c() < i2) {
            if (this.g.a() < i2) {
                zzpi zzpi = this.g;
                byte[] bArr = zzpi.f9163a;
                zzpi.o(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i2)), this.g.c());
            }
            zzpi zzpi2 = this.g;
            zzjw.b(zzpi2.f9163a, zzpi2.c(), i2 - this.g.c());
            this.g.k(i2);
        }
    }

    private final long r(long j2) throws zzht {
        long j3 = this.q;
        if (j3 != -9223372036854775807L) {
            return zzpo.c(j2, j3, 1000);
        }
        throw new zzht("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void s() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = 0;
        this.Q = false;
        this.j.i();
    }

    public final boolean a(zzjw zzjw) throws IOException, InterruptedException {
        return new zb0().a(zzjw);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(com.google.android.gms.internal.ads.zzjw r9, com.google.android.gms.internal.ads.zzkd r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.W = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r8.W
            if (r3 != 0) goto L_0x003a
            com.google.android.gms.internal.ads.ub0 r2 = r8.f8998a
            boolean r2 = r2.c(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.getPosition()
            boolean r5 = r8.x
            if (r5 == 0) goto L_0x0025
            r8.z = r3
            long r3 = r8.y
            r10.f8994a = r3
            r8.x = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r8.u
            if (r3 == 0) goto L_0x0036
            long r3 = r8.z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r10.f8994a = r3
            r8.z = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkn.c(com.google.android.gms.internal.ads.zzjw, com.google.android.gms.internal.ads.zzkd):int");
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2, double d2) {
        if (i2 == 181) {
            this.t.I = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.t.w = (float) d2;
                    return;
                case 21970:
                    this.t.x = (float) d2;
                    return;
                case 21971:
                    this.t.y = (float) d2;
                    return;
                case 21972:
                    this.t.z = (float) d2;
                    return;
                case 21973:
                    this.t.A = (float) d2;
                    return;
                case 21974:
                    this.t.B = (float) d2;
                    return;
                case 21975:
                    this.t.C = (float) d2;
                    return;
                case 21976:
                    this.t.D = (float) d2;
                    return;
                case 21977:
                    this.t.E = (float) d2;
                    return;
                case 21978:
                    this.t.F = (float) d2;
                    return;
                default:
                    return;
            }
        } else {
            this.r = (long) d2;
        }
    }

    public final void e(zzjz zzjz) {
        this.Y = zzjz;
    }

    public final void f(long j2, long j3) {
        this.A = -9223372036854775807L;
        this.E = 0;
        this.f8998a.a();
        this.f8999b.a();
        s();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f2, code lost:
        throw new com.google.android.gms.internal.ads.zzht("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r22, int r23, com.google.android.gms.internal.ads.zzjw r24) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            if (r1 == r4) goto L_0x008b
            if (r1 == r5) goto L_0x008b
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0081
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0072
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0053
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0049
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0030
            com.google.android.gms.internal.ads.wb0 r1 = r0.t
            byte[] r4 = new byte[r2]
            r1.o = r4
            r3.b(r4, r6, r2)
            return
        L_0x0030:
            com.google.android.gms.internal.ads.zzht r2 = new com.google.android.gms.internal.ads.zzht
            r3 = 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected id: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x0049:
            com.google.android.gms.internal.ads.wb0 r1 = r0.t
            byte[] r4 = new byte[r2]
            r1.h = r4
            r3.b(r4, r6, r2)
            return
        L_0x0053:
            com.google.android.gms.internal.ads.zzpi r1 = r0.i
            byte[] r1 = r1.f9163a
            java.util.Arrays.fill(r1, r6)
            com.google.android.gms.internal.ads.zzpi r1 = r0.i
            byte[] r1 = r1.f9163a
            int r4 = 4 - r2
            r3.b(r1, r4, r2)
            com.google.android.gms.internal.ads.zzpi r1 = r0.i
            r1.l(r6)
            com.google.android.gms.internal.ads.zzpi r1 = r0.i
            long r1 = r1.s()
            int r2 = (int) r1
            r0.v = r2
            return
        L_0x0072:
            byte[] r1 = new byte[r2]
            r3.b(r1, r6, r2)
            com.google.android.gms.internal.ads.wb0 r2 = r0.t
            com.google.android.gms.internal.ads.zzkh r3 = new com.google.android.gms.internal.ads.zzkh
            r3.<init>(r7, r1)
            r2.g = r3
            return
        L_0x0081:
            com.google.android.gms.internal.ads.wb0 r1 = r0.t
            byte[] r4 = new byte[r2]
            r1.f5405f = r4
            r3.b(r4, r6, r2)
            return
        L_0x008b:
            int r4 = r0.E
            r8 = 8
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.ads.yb0 r4 = r0.f8999b
            long r9 = r4.b(r3, r6, r7, r8)
            int r4 = (int) r9
            r0.K = r4
            com.google.android.gms.internal.ads.yb0 r4 = r0.f8999b
            int r4 = r4.e()
            r0.L = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.G = r9
            r0.E = r7
            com.google.android.gms.internal.ads.zzpi r4 = r0.g
            r4.i()
        L_0x00b0:
            android.util.SparseArray<com.google.android.gms.internal.ads.wb0> r4 = r0.f9000c
            int r9 = r0.K
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.internal.ads.wb0 r4 = (com.google.android.gms.internal.ads.wb0) r4
            if (r4 != 0) goto L_0x00c6
            int r1 = r0.L
            int r1 = r2 - r1
            r3.d(r1)
            r0.E = r6
            return
        L_0x00c6:
            int r9 = r0.E
            if (r9 != r7) goto L_0x0274
            r9 = 3
            r0.o(r3, r9)
            com.google.android.gms.internal.ads.zzpi r10 = r0.g
            byte[] r10 = r10.f9163a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r7
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00ef
            r0.I = r7
            int[] r10 = r0.J
            int[] r10 = k(r10, r7)
            r0.J = r10
            int r13 = r0.L
            int r2 = r2 - r13
            int r2 = r2 - r9
            r10[r6] = r2
        L_0x00ec:
            r6 = 1
            goto L_0x0206
        L_0x00ef:
            if (r1 != r5) goto L_0x026c
            r13 = 4
            r0.o(r3, r13)
            com.google.android.gms.internal.ads.zzpi r14 = r0.g
            byte[] r14 = r14.f9163a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r7
            r0.I = r14
            int[] r15 = r0.J
            int[] r14 = k(r15, r14)
            r0.J = r14
            if (r10 != r11) goto L_0x0114
            int r9 = r0.L
            int r2 = r2 - r9
            int r2 = r2 - r13
            int r9 = r0.I
            int r2 = r2 / r9
            java.util.Arrays.fill(r14, r6, r9, r2)
            goto L_0x00ec
        L_0x0114:
            if (r10 != r7) goto L_0x014a
            r9 = 0
            r10 = 0
        L_0x0118:
            int r14 = r0.I
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x013f
            int[] r14 = r0.J
            r14[r9] = r6
        L_0x0122:
            int r13 = r13 + r7
            r0.o(r3, r13)
            com.google.android.gms.internal.ads.zzpi r14 = r0.g
            byte[] r14 = r14.f9163a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.J
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0122
            r14 = r15[r9]
            int r10 = r10 + r14
            int r9 = r9 + 1
            goto L_0x0118
        L_0x013f:
            int[] r9 = r0.J
            int r14 = r14 - r7
            int r15 = r0.L
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x00ec
        L_0x014a:
            if (r10 != r9) goto L_0x0253
            r9 = 0
            r10 = 0
        L_0x014e:
            int r14 = r0.I
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x01fb
            int[] r14 = r0.J
            r14[r9] = r6
            int r13 = r13 + 1
            r0.o(r3, r13)
            com.google.android.gms.internal.ads.zzpi r14 = r0.g
            byte[] r14 = r14.f9163a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01f3
            r16 = 0
            r14 = 0
        L_0x016a:
            if (r14 >= r8) goto L_0x01be
            int r18 = 7 - r14
            int r5 = r7 << r18
            com.google.android.gms.internal.ads.zzpi r11 = r0.g
            byte[] r11 = r11.f9163a
            byte r11 = r11[r15]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01b4
            int r13 = r13 + r14
            r0.o(r3, r13)
            com.google.android.gms.internal.ads.zzpi r11 = r0.g
            byte[] r11 = r11.f9163a
            int r16 = r15 + 1
            byte r11 = r11[r15]
            r11 = r11 & r12
            int r5 = ~r5
            r5 = r5 & r11
            long r6 = (long) r5
            r5 = r16
            r16 = r6
        L_0x018d:
            if (r5 >= r13) goto L_0x01a6
            long r6 = r16 << r8
            com.google.android.gms.internal.ads.zzpi r15 = r0.g
            byte[] r15 = r15.f9163a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r12
            long r11 = (long) r5
            long r5 = r6 | r11
            r12 = 255(0xff, float:3.57E-43)
            r19 = r5
            r5 = r16
            r16 = r19
            goto L_0x018d
        L_0x01a6:
            if (r9 <= 0) goto L_0x01be
            int r14 = r14 * 7
            int r14 = r14 + 6
            r5 = 1
            long r11 = r5 << r14
            long r11 = r11 - r5
            long r16 = r16 - r11
            goto L_0x01be
        L_0x01b4:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x016a
        L_0x01be:
            r5 = r16
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01eb
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01eb
            int r6 = (int) r5
            int[] r5 = r0.J
            if (r9 != 0) goto L_0x01d4
            goto L_0x01d9
        L_0x01d4:
            int r7 = r9 + -1
            r7 = r5[r7]
            int r6 = r6 + r7
        L_0x01d9:
            r5[r9] = r6
            int[] r5 = r0.J
            r5 = r5[r9]
            int r10 = r10 + r5
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x014e
        L_0x01eb:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01f3:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01fb:
            int[] r5 = r0.J
            r6 = 1
            int r14 = r14 - r6
            int r7 = r0.L
            int r2 = r2 - r7
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x0206:
            com.google.android.gms.internal.ads.zzpi r2 = r0.g
            byte[] r2 = r2.f9163a
            r5 = 0
            byte r7 = r2[r5]
            int r5 = r7 << 8
            byte r2 = r2[r6]
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = r0.A
            long r9 = (long) r2
            long r9 = r0.r(r9)
            long r5 = r5 + r9
            r0.F = r5
            com.google.android.gms.internal.ads.zzpi r2 = r0.g
            byte[] r2 = r2.f9163a
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r8
            if (r2 != r8) goto L_0x022b
            r2 = 1
            goto L_0x022c
        L_0x022b:
            r2 = 0
        L_0x022c:
            int r6 = r4.f5402c
            if (r6 == r5) goto L_0x0242
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x0240
            com.google.android.gms.internal.ads.zzpi r6 = r0.g
            byte[] r6 = r6.f9163a
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x0240
            goto L_0x0242
        L_0x0240:
            r5 = 0
            goto L_0x0243
        L_0x0242:
            r5 = 1
        L_0x0243:
            if (r2 == 0) goto L_0x0248
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0249
        L_0x0248:
            r2 = 0
        L_0x0249:
            r2 = r2 | r5
            r0.M = r2
            r2 = 2
            r0.E = r2
            r2 = 0
            r0.H = r2
            goto L_0x0274
        L_0x0253:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            r2 = 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected lacing value: "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x026c:
            com.google.android.gms.internal.ads.zzht r1 = new com.google.android.gms.internal.ads.zzht
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0274:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x029f
        L_0x0278:
            int r1 = r0.H
            int r2 = r0.I
            if (r1 >= r2) goto L_0x029b
            int[] r2 = r0.J
            r1 = r2[r1]
            r0.i(r3, r4, r1)
            long r1 = r0.F
            int r5 = r0.H
            int r6 = r4.f5403d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.j(r4, r1)
            int r1 = r0.H
            r2 = 1
            int r1 = r1 + r2
            r0.H = r1
            goto L_0x0278
        L_0x029b:
            r1 = 0
            r0.E = r1
            return
        L_0x029f:
            r1 = 0
            int[] r2 = r0.J
            r1 = r2[r1]
            r0.i(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkn.g(int, int, com.google.android.gms.internal.ads.zzjw):void");
    }

    /* access modifiers changed from: package-private */
    public final void h(int i2, String str) throws zzht {
        if (i2 == 134) {
            this.t.f5400a = str;
        } else if (i2 != 17026) {
            if (i2 == 2274716) {
                String unused = this.t.N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzht(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void n(int i2) throws zzht {
        zzkc zzkc;
        zzpc zzpc;
        zzpc zzpc2;
        int i3;
        int i4 = 0;
        if (i2 != 160) {
            if (i2 == 174) {
                String str = this.t.f5400a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i4 = 1;
                }
                if (i4 != 0) {
                    wb0 wb0 = this.t;
                    wb0.c(this.Y, wb0.f5401b);
                    SparseArray<wb0> sparseArray = this.f9000c;
                    wb0 wb02 = this.t;
                    sparseArray.put(wb02.f5401b, wb02);
                }
                this.t = null;
            } else if (i2 == 19899) {
                int i5 = this.v;
                if (i5 != -1) {
                    long j2 = this.w;
                    if (j2 != -1) {
                        if (i5 == 475249515) {
                            this.y = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new zzht("Mandatory element SeekID or SeekPosition not found");
            } else if (i2 == 25152) {
                wb0 wb03 = this.t;
                if (!wb03.f5404e) {
                    return;
                }
                if (wb03.g != null) {
                    wb03.i = new zzjl(new zzjl.zza(zzhc.f8903b, "video/webm", this.t.g.f8997b));
                    return;
                }
                throw new zzht("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i2 == 28032) {
                wb0 wb04 = this.t;
                if (wb04.f5404e && wb04.f5405f != null) {
                    throw new zzht("Combining encryption and compression is not supported");
                }
            } else if (i2 == 357149030) {
                if (this.q == -9223372036854775807L) {
                    this.q = 1000000;
                }
                long j3 = this.r;
                if (j3 != -9223372036854775807L) {
                    this.s = r(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515 && !this.u) {
                    zzjz zzjz = this.Y;
                    if (this.p == -1 || this.s == -9223372036854775807L || (zzpc = this.B) == null || zzpc.c() == 0 || (zzpc2 = this.C) == null || zzpc2.c() != this.B.c()) {
                        this.B = null;
                        this.C = null;
                        zzkc = new zzkf(this.s);
                    } else {
                        int c2 = this.B.c();
                        int[] iArr = new int[c2];
                        long[] jArr = new long[c2];
                        long[] jArr2 = new long[c2];
                        long[] jArr3 = new long[c2];
                        for (int i6 = 0; i6 < c2; i6++) {
                            jArr3[i6] = this.B.b(i6);
                            jArr[i6] = this.p + this.C.b(i6);
                        }
                        while (true) {
                            i3 = c2 - 1;
                            if (i4 >= i3) {
                                break;
                            }
                            int i7 = i4 + 1;
                            iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                            jArr2[i4] = jArr3[i7] - jArr3[i4];
                            i4 = i7;
                        }
                        iArr[i3] = (int) ((this.p + this.o) - jArr[i3]);
                        jArr2[i3] = this.s - jArr3[i3];
                        this.B = null;
                        this.C = null;
                        zzkc = new zzjv(iArr, jArr, jArr2, jArr3);
                    }
                    zzjz.i(zzkc);
                    this.u = true;
                }
            } else if (this.f9000c.size() != 0) {
                this.Y.f();
            } else {
                throw new zzht("No valid tracks were found");
            }
        } else if (this.E == 2) {
            if (!this.X) {
                this.M |= 1;
            }
            j(this.f9000c.get(this.K), this.F);
            this.E = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void p(int i2, long j2) throws zzht {
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        this.t.f5402c = (int) j2;
                        return;
                    case 136:
                        wb0 wb0 = this.t;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        wb0.L = z2;
                        return;
                    case 155:
                        this.G = r(j2);
                        return;
                    case 159:
                        this.t.G = (int) j2;
                        return;
                    case 176:
                        this.t.j = (int) j2;
                        return;
                    case 179:
                        this.B.a(r(j2));
                        return;
                    case 186:
                        this.t.k = (int) j2;
                        return;
                    case 215:
                        this.t.f5401b = (int) j2;
                        return;
                    case 231:
                        this.A = r(j2);
                        return;
                    case 241:
                        if (!this.D) {
                            this.C.a(j2);
                            this.D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.X = true;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j2);
                            sb.append(" not supported");
                            throw new zzht(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j2);
                            sb2.append(" not supported");
                            throw new zzht(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j2);
                            sb3.append(" not supported");
                            throw new zzht(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j2);
                            sb4.append(" not supported");
                            throw new zzht(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j2);
                            sb5.append(" not supported");
                            throw new zzht(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.w = j2 + this.p;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        if (i3 == 0) {
                            this.t.p = 0;
                            return;
                        } else if (i3 == 1) {
                            this.t.p = 2;
                            return;
                        } else if (i3 == 3) {
                            this.t.p = 1;
                            return;
                        } else if (i3 == 15) {
                            this.t.p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.t.l = (int) j2;
                        return;
                    case 21682:
                        this.t.n = (int) j2;
                        return;
                    case 21690:
                        this.t.m = (int) j2;
                        return;
                    case 21930:
                        wb0 wb02 = this.t;
                        if (j2 == 1) {
                            z2 = true;
                        }
                        wb02.M = z2;
                        return;
                    case 22186:
                        this.t.J = j2;
                        return;
                    case 22203:
                        this.t.K = j2;
                        return;
                    case 25188:
                        this.t.H = (int) j2;
                        return;
                    case 2352003:
                        this.t.f5403d = (int) j2;
                        return;
                    case 2807729:
                        this.q = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                int i4 = (int) j2;
                                if (i4 == 1) {
                                    this.t.t = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.t.t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j2;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.t.s = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.t.s = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.t.s = 3;
                                return;
                            case 21947:
                                wb0 wb03 = this.t;
                                wb03.q = true;
                                int i6 = (int) j2;
                                if (i6 == 1) {
                                    wb03.r = 1;
                                    return;
                                } else if (i6 == 9) {
                                    wb03.r = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    this.t.r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.t.u = (int) j2;
                                return;
                            case 21949:
                                this.t.v = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw new zzht(sb6.toString());
            }
        } else if (j2 != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j2);
            sb7.append(" not supported");
            throw new zzht(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void q(int i2, long j2, long j3) throws zzht {
        if (i2 == 160) {
            this.X = false;
        } else if (i2 == 174) {
            this.t = new wb0((vb0) null);
        } else if (i2 == 187) {
            this.D = false;
        } else if (i2 == 19899) {
            this.v = -1;
            this.w = -1;
        } else if (i2 == 20533) {
            this.t.f5404e = true;
        } else if (i2 == 21968) {
            this.t.q = true;
        } else if (i2 == 408125543) {
            long j4 = this.p;
            if (j4 == -1 || j4 == j2) {
                this.p = j2;
                this.o = j3;
                return;
            }
            throw new zzht("Multiple Segment elements not supported");
        } else if (i2 == 475249515) {
            this.B = new zzpc();
            this.C = new zzpc();
        } else if (i2 != 524531317 || this.u) {
        } else {
            if (!this.f9001d || this.y == -1) {
                this.Y.i(new zzkf(this.s));
                this.u = true;
                return;
            }
            this.x = true;
        }
    }

    public final void release() {
    }

    private zzkn(int i2) {
        this(new qb0(), 0);
    }

    private zzkn(ub0 ub0, int i2) {
        this.p = -1;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1;
        this.z = -1;
        this.A = -9223372036854775807L;
        this.f8998a = ub0;
        ub0.b(new xb0(this, (vb0) null));
        this.f9001d = true;
        this.f8999b = new yb0();
        this.f9000c = new SparseArray<>();
        this.g = new zzpi(4);
        this.h = new zzpi(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new zzpi(4);
        this.f9002e = new zzpi(zzph.f9159a);
        this.f9003f = new zzpi(4);
        this.j = new zzpi();
        this.k = new zzpi();
        this.l = new zzpi(8);
        this.m = new zzpi();
    }
}
