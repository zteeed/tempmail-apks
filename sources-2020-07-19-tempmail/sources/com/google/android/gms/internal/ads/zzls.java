package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzls extends zzha {
    private static final byte[] U = zzpo.m("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private ByteBuffer[] E;
    private ByteBuffer[] F;
    private long G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    protected zzjj T;
    private final zzlu i;
    private final zzjq<zzjs> j;
    private final boolean k;
    private final zzjm l;
    private final zzjm m;
    private final zzhs n;
    private final List<Long> o;
    private final MediaCodec.BufferInfo p;
    private zzhq q;
    private zzjo<zzjs> r;
    private zzjo<zzjs> s;
    private MediaCodec t;
    private zzlt u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public zzls(int i2, zzlu zzlu, zzjq<zzjs> zzjq, boolean z2) {
        super(i2);
        zzpb.e(zzpo.f8995a >= 16);
        zzpb.d(zzlu);
        this.i = zzlu;
        this.j = zzjq;
        this.k = z2;
        this.l = new zzjm(0);
        this.m = new zzjm(0);
        this.n = new zzhs();
        this.o = new ArrayList();
        this.p = new MediaCodec.BufferInfo();
        this.L = 0;
        this.M = 0;
    }

    private final void M(zzlv zzlv) throws zzhb {
        throw zzhb.b(zzlv, w());
    }

    private final boolean S(long j2, long j3) throws zzhb {
        boolean z2;
        boolean z3;
        if (this.I < 0) {
            if (!this.A || !this.O) {
                this.I = this.t.dequeueOutputBuffer(this.p, 0);
            } else {
                try {
                    this.I = this.t.dequeueOutputBuffer(this.p, 0);
                } catch (IllegalStateException unused) {
                    Z();
                    if (this.Q) {
                        X();
                    }
                    return false;
                }
            }
            int i2 = this.I;
            if (i2 >= 0) {
                if (this.D) {
                    this.D = false;
                    this.t.releaseOutputBuffer(i2, false);
                    this.I = -1;
                    return true;
                }
                MediaCodec.BufferInfo bufferInfo = this.p;
                if ((bufferInfo.flags & 4) != 0) {
                    Z();
                    this.I = -1;
                    return false;
                }
                ByteBuffer byteBuffer = this.F[i2];
                if (byteBuffer != null) {
                    byteBuffer.position(bufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo2 = this.p;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                long j4 = this.p.presentationTimeUs;
                int size = this.o.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z3 = false;
                        break;
                    } else if (this.o.get(i3).longValue() == j4) {
                        this.o.remove(i3);
                        z3 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                this.J = z3;
            } else if (i2 == -2) {
                MediaFormat outputFormat = this.t.getOutputFormat();
                if (this.x && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.D = true;
                } else {
                    if (this.B) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    H(this.t, outputFormat);
                }
                return true;
            } else if (i2 == -3) {
                this.F = this.t.getOutputBuffers();
                return true;
            } else {
                if (this.y && (this.P || this.M == 2)) {
                    Z();
                }
                return false;
            }
        }
        if (!this.A || !this.O) {
            MediaCodec mediaCodec = this.t;
            ByteBuffer[] byteBufferArr = this.F;
            int i4 = this.I;
            ByteBuffer byteBuffer2 = byteBufferArr[i4];
            MediaCodec.BufferInfo bufferInfo3 = this.p;
            z2 = N(j2, j3, mediaCodec, byteBuffer2, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.J);
        } else {
            try {
                z2 = N(j2, j3, this.t, this.F[this.I], this.I, this.p.flags, this.p.presentationTimeUs, this.J);
            } catch (IllegalStateException unused2) {
                Z();
                if (this.Q) {
                    X();
                }
                return false;
            }
        }
        if (!z2) {
            return false;
        }
        long j5 = this.p.presentationTimeUs;
        this.I = -1;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0147 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean Y() throws com.google.android.gms.internal.ads.zzhb {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.t
            r1 = 0
            if (r0 == 0) goto L_0x01d2
            int r2 = r14.M
            r3 = 2
            if (r2 == r3) goto L_0x01d2
            boolean r2 = r14.P
            if (r2 == 0) goto L_0x0010
            goto L_0x01d2
        L_0x0010:
            int r2 = r14.H
            if (r2 >= 0) goto L_0x002a
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r14.H = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.google.android.gms.internal.ads.zzjm r2 = r14.l
            java.nio.ByteBuffer[] r4 = r14.E
            r0 = r4[r0]
            r2.f8796c = r0
            r2.a()
        L_0x002a:
            int r0 = r14.M
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0047
            boolean r0 = r14.y
            if (r0 != 0) goto L_0x0044
            r14.O = r4
            android.media.MediaCodec r5 = r14.t
            int r6 = r14.H
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.H = r2
        L_0x0044:
            r14.M = r3
            return r1
        L_0x0047:
            boolean r0 = r14.C
            if (r0 == 0) goto L_0x0069
            r14.C = r1
            com.google.android.gms.internal.ads.zzjm r0 = r14.l
            java.nio.ByteBuffer r0 = r0.f8796c
            byte[] r1 = U
            r0.put(r1)
            android.media.MediaCodec r5 = r14.t
            int r6 = r14.H
            r7 = 0
            byte[] r0 = U
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.H = r2
            r14.N = r4
            return r4
        L_0x0069:
            boolean r0 = r14.R
            if (r0 == 0) goto L_0x0070
            r0 = -4
            r5 = 0
            goto L_0x00a8
        L_0x0070:
            int r0 = r14.L
            if (r0 != r4) goto L_0x0095
            r0 = 0
        L_0x0075:
            com.google.android.gms.internal.ads.zzhq r5 = r14.q
            java.util.List<byte[]> r5 = r5.i
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0093
            com.google.android.gms.internal.ads.zzhq r5 = r14.q
            java.util.List<byte[]> r5 = r5.i
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.zzjm r6 = r14.l
            java.nio.ByteBuffer r6 = r6.f8796c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0075
        L_0x0093:
            r14.L = r3
        L_0x0095:
            com.google.android.gms.internal.ads.zzjm r0 = r14.l
            java.nio.ByteBuffer r0 = r0.f8796c
            int r0 = r0.position()
            com.google.android.gms.internal.ads.zzhs r5 = r14.n
            com.google.android.gms.internal.ads.zzjm r6 = r14.l
            int r5 = r14.z(r5, r6, r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00a8:
            r6 = -3
            if (r0 != r6) goto L_0x00ac
            return r1
        L_0x00ac:
            r6 = -5
            if (r0 != r6) goto L_0x00c2
            int r0 = r14.L
            if (r0 != r3) goto L_0x00ba
            com.google.android.gms.internal.ads.zzjm r0 = r14.l
            r0.a()
            r14.L = r4
        L_0x00ba:
            com.google.android.gms.internal.ads.zzhs r0 = r14.n
            com.google.android.gms.internal.ads.zzhq r0 = r0.f8737a
            r14.R(r0)
            return r4
        L_0x00c2:
            com.google.android.gms.internal.ads.zzjm r0 = r14.l
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00fe
            int r0 = r14.L
            if (r0 != r3) goto L_0x00d5
            com.google.android.gms.internal.ads.zzjm r0 = r14.l
            r0.a()
            r14.L = r4
        L_0x00d5:
            r14.P = r4
            boolean r0 = r14.N
            if (r0 != 0) goto L_0x00df
            r14.Z()
            return r1
        L_0x00df:
            boolean r0 = r14.y     // Catch:{ CryptoException -> 0x00f4 }
            if (r0 != 0) goto L_0x00f3
            r14.O = r4     // Catch:{ CryptoException -> 0x00f4 }
            android.media.MediaCodec r5 = r14.t     // Catch:{ CryptoException -> 0x00f4 }
            int r6 = r14.H     // Catch:{ CryptoException -> 0x00f4 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f4 }
            r14.H = r2     // Catch:{ CryptoException -> 0x00f4 }
        L_0x00f3:
            return r1
        L_0x00f4:
            r0 = move-exception
            int r1 = r14.w()
            com.google.android.gms.internal.ads.zzhb r0 = com.google.android.gms.internal.ads.zzhb.b(r0, r1)
            throw r0
        L_0x00fe:
            boolean r0 = r14.S
            if (r0 == 0) goto L_0x0116
            com.google.android.gms.internal.ads.zzjm r0 = r14.l
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0116
            com.google.android.gms.internal.ads.zzjm r0 = r14.l
            r0.a()
            int r0 = r14.L
            if (r0 != r3) goto L_0x0115
            r14.L = r4
        L_0x0115:
            return r4
        L_0x0116:
            r14.S = r1
            com.google.android.gms.internal.ads.zzjm r0 = r14.l
            boolean r0 = r0.h()
            com.google.android.gms.internal.ads.zzjo<com.google.android.gms.internal.ads.zzjs> r3 = r14.r
            if (r3 == 0) goto L_0x0142
            int r3 = r3.c()
            if (r3 == 0) goto L_0x0133
            r6 = 4
            if (r3 == r6) goto L_0x0142
            if (r0 != 0) goto L_0x0131
            boolean r3 = r14.k
            if (r3 != 0) goto L_0x0142
        L_0x0131:
            r3 = 1
            goto L_0x0143
        L_0x0133:
            com.google.android.gms.internal.ads.zzjo<com.google.android.gms.internal.ads.zzjs> r0 = r14.r
            com.google.android.gms.internal.ads.zzjr r0 = r0.a()
            int r1 = r14.w()
            com.google.android.gms.internal.ads.zzhb r0 = com.google.android.gms.internal.ads.zzhb.b(r0, r1)
            throw r0
        L_0x0142:
            r3 = 0
        L_0x0143:
            r14.R = r3
            if (r3 == 0) goto L_0x0148
            return r1
        L_0x0148:
            boolean r3 = r14.v
            if (r3 == 0) goto L_0x0162
            if (r0 != 0) goto L_0x0162
            com.google.android.gms.internal.ads.zzjm r3 = r14.l
            java.nio.ByteBuffer r3 = r3.f8796c
            com.google.android.gms.internal.ads.zzph.d(r3)
            com.google.android.gms.internal.ads.zzjm r3 = r14.l
            java.nio.ByteBuffer r3 = r3.f8796c
            int r3 = r3.position()
            if (r3 != 0) goto L_0x0160
            return r4
        L_0x0160:
            r14.v = r1
        L_0x0162:
            com.google.android.gms.internal.ads.zzjm r3 = r14.l     // Catch:{ CryptoException -> 0x01c8 }
            long r10 = r3.f8797d     // Catch:{ CryptoException -> 0x01c8 }
            com.google.android.gms.internal.ads.zzjm r3 = r14.l     // Catch:{ CryptoException -> 0x01c8 }
            boolean r3 = r3.e()     // Catch:{ CryptoException -> 0x01c8 }
            if (r3 == 0) goto L_0x0177
            java.util.List<java.lang.Long> r3 = r14.o     // Catch:{ CryptoException -> 0x01c8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01c8 }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01c8 }
        L_0x0177:
            com.google.android.gms.internal.ads.zzjm r3 = r14.l     // Catch:{ CryptoException -> 0x01c8 }
            java.nio.ByteBuffer r3 = r3.f8796c     // Catch:{ CryptoException -> 0x01c8 }
            r3.flip()     // Catch:{ CryptoException -> 0x01c8 }
            com.google.android.gms.internal.ads.zzjm r3 = r14.l     // Catch:{ CryptoException -> 0x01c8 }
            r14.K(r3)     // Catch:{ CryptoException -> 0x01c8 }
            if (r0 == 0) goto L_0x01a9
            com.google.android.gms.internal.ads.zzjm r0 = r14.l     // Catch:{ CryptoException -> 0x01c8 }
            com.google.android.gms.internal.ads.zzji r0 = r0.f8795b     // Catch:{ CryptoException -> 0x01c8 }
            android.media.MediaCodec$CryptoInfo r9 = r0.b()     // Catch:{ CryptoException -> 0x01c8 }
            if (r5 != 0) goto L_0x0190
            goto L_0x019f
        L_0x0190:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01c8 }
            if (r0 != 0) goto L_0x0198
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01c8 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01c8 }
        L_0x0198:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01c8 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01c8 }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01c8 }
        L_0x019f:
            android.media.MediaCodec r6 = r14.t     // Catch:{ CryptoException -> 0x01c8 }
            int r7 = r14.H     // Catch:{ CryptoException -> 0x01c8 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01c8 }
            goto L_0x01ba
        L_0x01a9:
            android.media.MediaCodec r6 = r14.t     // Catch:{ CryptoException -> 0x01c8 }
            int r7 = r14.H     // Catch:{ CryptoException -> 0x01c8 }
            r8 = 0
            com.google.android.gms.internal.ads.zzjm r0 = r14.l     // Catch:{ CryptoException -> 0x01c8 }
            java.nio.ByteBuffer r0 = r0.f8796c     // Catch:{ CryptoException -> 0x01c8 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01c8 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01c8 }
        L_0x01ba:
            r14.H = r2     // Catch:{ CryptoException -> 0x01c8 }
            r14.N = r4     // Catch:{ CryptoException -> 0x01c8 }
            r14.L = r1     // Catch:{ CryptoException -> 0x01c8 }
            com.google.android.gms.internal.ads.zzjj r0 = r14.T     // Catch:{ CryptoException -> 0x01c8 }
            int r1 = r0.f8783c     // Catch:{ CryptoException -> 0x01c8 }
            int r1 = r1 + r4
            r0.f8783c = r1     // Catch:{ CryptoException -> 0x01c8 }
            return r4
        L_0x01c8:
            r0 = move-exception
            int r1 = r14.w()
            com.google.android.gms.internal.ads.zzhb r0 = com.google.android.gms.internal.ads.zzhb.b(r0, r1)
            throw r0
        L_0x01d2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzls.Y():boolean");
    }

    private final void Z() throws zzhb {
        if (this.M == 2) {
            X();
            U();
            return;
        }
        this.Q = true;
        T();
    }

    /* access modifiers changed from: protected */
    public void A(long j2, boolean z2) throws zzhb {
        this.P = false;
        this.Q = false;
        if (this.t != null) {
            this.G = -9223372036854775807L;
            this.H = -1;
            this.I = -1;
            this.S = true;
            this.R = false;
            this.J = false;
            this.o.clear();
            this.C = false;
            this.D = false;
            if (this.w || (this.z && this.O)) {
                X();
                U();
            } else if (this.M != 0) {
                X();
                U();
            } else {
                this.t.flush();
                this.N = false;
            }
            if (this.K && this.q != null) {
                this.L = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void D(boolean z2) throws zzhb {
        this.T = new zzjj();
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.q = null;
        try {
            X();
            try {
                if (this.r != null) {
                    this.j.a(this.r);
                }
                try {
                    if (!(this.s == null || this.s == this.r)) {
                        this.j.a(this.s);
                    }
                } finally {
                    this.r = null;
                    this.s = null;
                }
            } catch (Throwable th) {
                if (!(this.s == null || this.s == this.r)) {
                    this.j.a(this.s);
                }
                throw th;
            } finally {
                this.r = null;
                this.s = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.s == null || this.s == this.r)) {
                    this.j.a(this.s);
                }
                throw th2;
            } finally {
                this.r = null;
                this.s = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void H(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzhb {
    }

    /* access modifiers changed from: protected */
    public abstract int I(zzlu zzlu, zzhq zzhq) throws zzma;

    /* access modifiers changed from: protected */
    public zzlt J(zzlu zzlu, zzhq zzhq, boolean z2) throws zzma {
        return zzlu.a(zzhq.g, z2);
    }

    /* access modifiers changed from: protected */
    public void K(zzjm zzjm) {
    }

    /* access modifiers changed from: protected */
    public abstract void L(zzlt zzlt, MediaCodec mediaCodec, zzhq zzhq, MediaCrypto mediaCrypto) throws zzma;

    /* access modifiers changed from: protected */
    public abstract boolean N(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z2) throws zzhb;

    /* access modifiers changed from: protected */
    public boolean O(MediaCodec mediaCodec, boolean z2, zzhq zzhq, zzhq zzhq2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean P(zzlt zzlt) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void Q(String str, long j2, long j3) {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r5.l == r0.l) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void R(com.google.android.gms.internal.ads.zzhq r5) throws com.google.android.gms.internal.ads.zzhb {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzhq r0 = r4.q
            r4.q = r5
            com.google.android.gms.internal.ads.zzjl r5 = r5.j
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x000d
        L_0x000b:
            com.google.android.gms.internal.ads.zzjl r2 = r0.j
        L_0x000d:
            boolean r5 = com.google.android.gms.internal.ads.zzpo.g(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.zzhq r5 = r4.q
            com.google.android.gms.internal.ads.zzjl r5 = r5.j
            if (r5 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.zzjq<com.google.android.gms.internal.ads.zzjs> r5 = r4.j
            if (r5 == 0) goto L_0x0037
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.zzhq r3 = r4.q
            com.google.android.gms.internal.ads.zzjl r3 = r3.j
            com.google.android.gms.internal.ads.zzjo r5 = r5.b(r1, r3)
            r4.s = r5
            com.google.android.gms.internal.ads.zzjo<com.google.android.gms.internal.ads.zzjs> r1 = r4.r
            if (r5 != r1) goto L_0x0049
            com.google.android.gms.internal.ads.zzjq<com.google.android.gms.internal.ads.zzjs> r1 = r4.j
            r1.a(r5)
            goto L_0x0049
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.w()
            com.google.android.gms.internal.ads.zzhb r5 = com.google.android.gms.internal.ads.zzhb.b(r5, r0)
            throw r5
        L_0x0047:
            r4.s = r1
        L_0x0049:
            com.google.android.gms.internal.ads.zzjo<com.google.android.gms.internal.ads.zzjs> r5 = r4.s
            com.google.android.gms.internal.ads.zzjo<com.google.android.gms.internal.ads.zzjs> r1 = r4.r
            if (r5 != r1) goto L_0x007a
            android.media.MediaCodec r5 = r4.t
            if (r5 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.zzlt r1 = r4.u
            boolean r1 = r1.f8847b
            com.google.android.gms.internal.ads.zzhq r3 = r4.q
            boolean r5 = r4.O(r5, r1, r0, r3)
            if (r5 == 0) goto L_0x007a
            r4.K = r2
            r4.L = r2
            boolean r5 = r4.x
            if (r5 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.zzhq r5 = r4.q
            int r1 = r5.k
            int r3 = r0.k
            if (r1 != r3) goto L_0x0076
            int r5 = r5.l
            int r0 = r0.l
            if (r5 != r0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            r4.C = r2
            return
        L_0x007a:
            boolean r5 = r4.N
            if (r5 == 0) goto L_0x0081
            r4.M = r2
            return
        L_0x0081:
            r4.X()
            r4.U()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzls.R(com.google.android.gms.internal.ads.zzhq):void");
    }

    /* access modifiers changed from: protected */
    public void T() throws zzhb {
    }

    /* access modifiers changed from: protected */
    public final void U() throws zzhb {
        zzhq zzhq;
        if (this.t == null && (zzhq = this.q) != null) {
            zzjo<zzjs> zzjo = this.s;
            this.r = zzjo;
            String str = zzhq.g;
            if (zzjo != null) {
                int c2 = zzjo.c();
                if (c2 == 0) {
                    throw zzhb.b(this.r.a(), w());
                } else if (c2 == 3 || c2 == 4) {
                    zzjs b2 = this.r.b();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.u == null) {
                    try {
                        this.u = J(this.i, zzhq, false);
                        if (this.u == null) {
                            M(new zzlv(this.q, (Throwable) null, false, -49999));
                            throw null;
                        }
                    } catch (zzma e2) {
                        M(new zzlv(this.q, (Throwable) e2, false, -49998));
                        throw null;
                    }
                }
                if (P(this.u)) {
                    String str2 = this.u.f8846a;
                    this.v = zzpo.f8995a < 21 && this.q.i.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    int i2 = zzpo.f8995a;
                    this.w = i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzpo.f8995a == 19 && zzpo.f8998d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.x = zzpo.f8995a < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzpo.f8996b) || "flounder_lte".equals(zzpo.f8996b) || "grouper".equals(zzpo.f8996b) || "tilapia".equals(zzpo.f8996b));
                    this.y = zzpo.f8995a <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.z = (zzpo.f8995a <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzpo.f8995a <= 19 && "hb2000".equals(zzpo.f8996b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.A = zzpo.f8995a == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.B = zzpo.f8995a <= 18 && this.q.s == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        zzpp.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.t = MediaCodec.createByCodecName(str2);
                        zzpp.b();
                        zzpp.a("configureCodec");
                        L(this.u, this.t, this.q, (MediaCrypto) null);
                        zzpp.b();
                        zzpp.a("startCodec");
                        this.t.start();
                        zzpp.b();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        Q(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.E = this.t.getInputBuffers();
                        this.F = this.t.getOutputBuffers();
                        this.G = c() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                        this.H = -1;
                        this.I = -1;
                        this.S = true;
                        this.T.f8781a++;
                    } catch (Exception e3) {
                        M(new zzlv(this.q, (Throwable) e3, false, str2));
                        throw null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final MediaCodec V() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public final zzlt W() {
        return this.u;
    }

    /* access modifiers changed from: protected */
    public void X() {
        this.G = -9223372036854775807L;
        this.H = -1;
        this.I = -1;
        this.R = false;
        this.J = false;
        this.o.clear();
        this.E = null;
        this.F = null;
        this.u = null;
        this.K = false;
        this.N = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.O = false;
        this.L = 0;
        this.M = 0;
        this.l.f8796c = null;
        MediaCodec mediaCodec = this.t;
        if (mediaCodec != null) {
            this.T.f8782b++;
            try {
                mediaCodec.stop();
                try {
                    this.t.release();
                    this.t = null;
                    zzjo<zzjs> zzjo = this.r;
                    if (zzjo != null && this.s != zzjo) {
                        try {
                            this.j.a(zzjo);
                        } finally {
                            this.r = null;
                        }
                    }
                } catch (Throwable th) {
                    this.t = null;
                    zzjo<zzjs> zzjo2 = this.r;
                    if (!(zzjo2 == null || this.s == zzjo2)) {
                        this.j.a(zzjo2);
                    }
                    throw th;
                } finally {
                    this.r = null;
                }
            } catch (Throwable th2) {
                this.t = null;
                zzjo<zzjs> zzjo3 = this.r;
                if (!(zzjo3 == null || this.s == zzjo3)) {
                    try {
                        this.j.a(zzjo3);
                    } finally {
                        this.r = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    public final int a(zzhq zzhq) throws zzhb {
        try {
            return I(this.i, zzhq);
        } catch (zzma e2) {
            throw zzhb.b(e2, w());
        }
    }

    public boolean b() {
        return this.Q;
    }

    public boolean isReady() {
        if (this.q == null || this.R) {
            return false;
        }
        if (G() || this.I >= 0) {
            return true;
        }
        return this.G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.G;
    }

    public final void m(long j2, long j3) throws zzhb {
        if (this.Q) {
            T();
            return;
        }
        if (this.q == null) {
            this.m.a();
            int z2 = z(this.n, this.m, true);
            if (z2 == -5) {
                R(this.n.f8737a);
            } else if (z2 == -4) {
                zzpb.e(this.m.f());
                this.P = true;
                Z();
                return;
            } else {
                return;
            }
        }
        U();
        if (this.t != null) {
            zzpp.a("drainAndFeed");
            do {
            } while (S(j2, j3));
            do {
            } while (Y());
            zzpp.b();
        } else {
            C(j2);
            this.m.a();
            int z3 = z(this.n, this.m, false);
            if (z3 == -5) {
                R(this.n.f8737a);
            } else if (z3 == -4) {
                zzpb.e(this.m.f());
                this.P = true;
                Z();
            }
        }
        this.T.a();
    }

    public final int v() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public void x() {
    }

    /* access modifiers changed from: protected */
    public void y() {
    }
}
