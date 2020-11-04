package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpz extends zzls {
    private static final int[] B0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private int A0;
    private final Context V;
    private final zzqd W;
    private final zzqe X;
    private final long Y;
    private final int Z;
    private final boolean a0;
    private final long[] b0;
    private zzhq[] c0;
    private zzqb d0;
    private Surface e0;
    private Surface f0;
    private int g0;
    private boolean h0;
    private long i0;
    private long j0;
    private int k0;
    private int l0;
    private int m0;
    private float n0;
    private int o0;
    private int p0;
    private int q0;
    private float r0;
    private int s0;
    private int t0;
    private int u0;
    private float v0;
    private boolean w0;
    private int x0;
    yd0 y0;
    private long z0;

    public zzpz(Context context, zzlu zzlu, long j, Handler handler, zzqf zzqf, int i) {
        this(context, zzlu, 0, (zzjq<zzjs>) null, false, handler, zzqf, -1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a0(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L_0x0086
            if (r9 != r0) goto L_0x0007
            goto L_0x0086
        L_0x0007:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0050
            r7 = 0
            goto L_0x0051
        L_0x0050:
            r7 = -1
        L_0x0051:
            if (r7 == 0) goto L_0x007d
            if (r7 == r3) goto L_0x007d
            if (r7 == r6) goto L_0x0061
            if (r7 == r4) goto L_0x007d
            if (r7 == r5) goto L_0x005e
            if (r7 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r8 = r8 * r9
            goto L_0x0080
        L_0x0061:
            java.lang.String r7 = com.google.android.gms.internal.ads.zzpo.f8998d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x006c
            return r0
        L_0x006c:
            r7 = 16
            int r8 = com.google.android.gms.internal.ads.zzpo.q(r8, r7)
            int r7 = com.google.android.gms.internal.ads.zzpo.q(r9, r7)
            int r8 = r8 * r7
            int r7 = r8 << 4
            int r8 = r7 << 4
            goto L_0x007f
        L_0x007d:
            int r8 = r8 * r9
        L_0x007f:
            r5 = 2
        L_0x0080:
            int r8 = r8 * 3
            int r5 = r5 * 2
            int r8 = r8 / r5
            return r8
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpz.a0(java.lang.String, int, int):int");
    }

    private final void b0(MediaCodec mediaCodec, int i, long j) {
        zzpp.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzpp.b();
        this.T.f8785e++;
    }

    @TargetApi(21)
    private final void c0(MediaCodec mediaCodec, int i, long j, long j2) {
        m0();
        zzpp.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzpp.b();
        this.T.f8784d++;
        this.l0 = 0;
        k0();
    }

    private static boolean d0(boolean z, zzhq zzhq, zzhq zzhq2) {
        if (!zzhq.g.equals(zzhq2.g) || h0(zzhq) != h0(zzhq2)) {
            return false;
        }
        if (!z) {
            return zzhq.k == zzhq2.k && zzhq.l == zzhq2.l;
        }
        return true;
    }

    private final void e0(MediaCodec mediaCodec, int i, long j) {
        m0();
        zzpp.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzpp.b();
        this.T.f8784d++;
        this.l0 = 0;
        k0();
    }

    private static boolean f0(long j) {
        return j < -30000;
    }

    private static int g0(zzhq zzhq) {
        int i = zzhq.h;
        if (i != -1) {
            return i;
        }
        return a0(zzhq.g, zzhq.k, zzhq.l);
    }

    private static int h0(zzhq zzhq) {
        int i = zzhq.n;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private final void i0() {
        this.i0 = this.Y > 0 ? SystemClock.elapsedRealtime() + this.Y : -9223372036854775807L;
    }

    private final void j0() {
        MediaCodec V2;
        this.h0 = false;
        if (zzpo.f8995a >= 23 && this.w0 && (V2 = V()) != null) {
            this.y0 = new yd0(this, V2);
        }
    }

    private final void l0() {
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1.0f;
        this.u0 = -1;
    }

    private final void m0() {
        if (this.s0 != this.o0 || this.t0 != this.p0 || this.u0 != this.q0 || this.v0 != this.r0) {
            this.X.b(this.o0, this.p0, this.q0, this.r0);
            this.s0 = this.o0;
            this.t0 = this.p0;
            this.u0 = this.q0;
            this.v0 = this.r0;
        }
    }

    private final void n0() {
        if (this.s0 != -1 || this.t0 != -1) {
            this.X.b(this.o0, this.p0, this.q0, this.r0);
        }
    }

    private final void o0() {
        if (this.k0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.X.h(this.k0, elapsedRealtime - this.j0);
            this.k0 = 0;
            this.j0 = elapsedRealtime;
        }
    }

    private final boolean p0(boolean z) {
        if (zzpo.f8995a < 23 || this.w0) {
            return false;
        }
        return !z || zzpv.b(this.V);
    }

    /* access modifiers changed from: protected */
    public final void A(long j, boolean z) throws zzhb {
        super.A(j, z);
        j0();
        this.l0 = 0;
        int i = this.A0;
        if (i != 0) {
            this.z0 = this.b0[i - 1];
            this.A0 = 0;
        }
        if (z) {
            i0();
        } else {
            this.i0 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    public final void B(zzhq[] zzhqArr, long j) throws zzhb {
        this.c0 = zzhqArr;
        if (this.z0 == -9223372036854775807L) {
            this.z0 = j;
        } else {
            int i = this.A0;
            long[] jArr = this.b0;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.A0 = i + 1;
            }
            this.b0[this.A0 - 1] = j;
        }
        super.B(zzhqArr, j);
    }

    /* access modifiers changed from: protected */
    public final void D(boolean z) throws zzhb {
        super.D(z);
        int i = F().f8743a;
        this.x0 = i;
        this.w0 = i != 0;
        this.X.d(this.T);
        this.W.b();
    }

    /* access modifiers changed from: protected */
    public final void E() {
        this.o0 = -1;
        this.p0 = -1;
        this.r0 = -1.0f;
        this.n0 = -1.0f;
        this.z0 = -9223372036854775807L;
        this.A0 = 0;
        l0();
        j0();
        this.W.a();
        this.y0 = null;
        this.w0 = false;
        try {
            super.E();
        } finally {
            this.T.a();
            this.X.g(this.T);
        }
    }

    /* access modifiers changed from: protected */
    public final void H(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.o0 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.p0 = i2;
        this.r0 = this.n0;
        if (zzpo.f8995a >= 21) {
            int i3 = this.m0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.o0;
                this.o0 = this.p0;
                this.p0 = i4;
                this.r0 = 1.0f / this.r0;
            }
        } else {
            this.q0 = this.m0;
        }
        mediaCodec.setVideoScalingMode(this.g0);
    }

    /* access modifiers changed from: protected */
    public final int I(zzlu zzlu, zzhq zzhq) throws zzma {
        boolean z;
        int i;
        int i2;
        String str = zzhq.g;
        int i3 = 0;
        if (!zzpe.b(str)) {
            return 0;
        }
        zzjl zzjl = zzhq.j;
        if (zzjl != null) {
            z = false;
            for (int i4 = 0; i4 < zzjl.f8789d; i4++) {
                z |= zzjl.a(i4).f8794f;
            }
        } else {
            z = false;
        }
        zzlt a2 = zzlu.a(str, z);
        boolean z2 = true;
        if (a2 == null) {
            return 1;
        }
        boolean g = a2.g(zzhq.f8734d);
        if (g && (i = zzhq.k) > 0 && (i2 = zzhq.l) > 0) {
            if (zzpo.f8995a >= 21) {
                g = a2.b(i, i2, (double) zzhq.m);
            } else {
                if (i * i2 > zzlw.g()) {
                    z2 = false;
                }
                if (!z2) {
                    int i5 = zzhq.k;
                    int i6 = zzhq.l;
                    String str2 = zzpo.f8999e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
                g = z2;
            }
        }
        int i7 = a2.f8847b ? 8 : 4;
        if (a2.f8848c) {
            i3 = 16;
        }
        return (g ? 3 : 2) | i7 | i3;
    }

    /* access modifiers changed from: protected */
    public final void K(zzjm zzjm) {
        if (zzpo.f8995a < 23 && this.w0) {
            k0();
        }
    }

    /* access modifiers changed from: protected */
    public final void L(zzlt zzlt, MediaCodec mediaCodec, zzhq zzhq, MediaCrypto mediaCrypto) throws zzma {
        zzqb zzqb;
        Point point;
        zzlt zzlt2 = zzlt;
        MediaCodec mediaCodec2 = mediaCodec;
        zzhq zzhq2 = zzhq;
        zzhq[] zzhqArr = this.c0;
        int i = zzhq2.k;
        int i2 = zzhq2.l;
        int g02 = g0(zzhq);
        if (zzhqArr.length == 1) {
            zzqb = new zzqb(i, i2, g02);
        } else {
            boolean z = false;
            for (zzhq zzhq3 : zzhqArr) {
                if (d0(zzlt2.f8847b, zzhq2, zzhq3)) {
                    z |= zzhq3.k == -1 || zzhq3.l == -1;
                    i = Math.max(i, zzhq3.k);
                    i2 = Math.max(i2, zzhq3.l);
                    g02 = Math.max(g02, g0(zzhq3));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzhq2.l > zzhq2.k;
                int i3 = z2 ? zzhq2.l : zzhq2.k;
                int i4 = z2 ? zzhq2.k : zzhq2.l;
                float f2 = ((float) i4) / ((float) i3);
                int[] iArr = B0;
                int length = iArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    int i6 = length;
                    int i7 = iArr[i5];
                    int[] iArr2 = iArr;
                    int i8 = (int) (((float) i7) * f2);
                    if (i7 <= i3 || i8 <= i4) {
                        break;
                    }
                    int i9 = i3;
                    int i10 = i4;
                    if (zzpo.f8995a >= 21) {
                        int i11 = z2 ? i8 : i7;
                        if (!z2) {
                            i7 = i8;
                        }
                        Point i12 = zzlt2.i(i11, i7);
                        Point point2 = i12;
                        if (zzlt2.b(i12.x, i12.y, (double) zzhq2.m)) {
                            point = point2;
                            break;
                        }
                    } else {
                        int q = zzpo.q(i7, 16) << 4;
                        int q2 = zzpo.q(i8, 16) << 4;
                        if (q * q2 <= zzlw.g()) {
                            int i13 = z2 ? q2 : q;
                            if (!z2) {
                                q = q2;
                            }
                            point = new Point(i13, q);
                        }
                    }
                    i5++;
                    length = i6;
                    iArr = iArr2;
                    i3 = i9;
                    i4 = i10;
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    g02 = Math.max(g02, a0(zzhq2.g, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzqb = new zzqb(i, i2, g02);
        }
        this.d0 = zzqb;
        boolean z3 = this.a0;
        int i14 = this.x0;
        MediaFormat o = zzhq.o();
        o.setInteger("max-width", zzqb.f9018a);
        o.setInteger("max-height", zzqb.f9019b);
        int i15 = zzqb.f9020c;
        if (i15 != -1) {
            o.setInteger("max-input-size", i15);
        }
        if (z3) {
            o.setInteger("auto-frc", 0);
        }
        if (i14 != 0) {
            o.setFeatureEnabled("tunneled-playback", true);
            o.setInteger("audio-session-id", i14);
        }
        if (this.e0 == null) {
            zzpb.e(p0(zzlt2.f8849d));
            if (this.f0 == null) {
                this.f0 = zzpv.a(this.V, zzlt2.f8849d);
            }
            this.e0 = this.f0;
        }
        mediaCodec2.configure(o, this.e0, (MediaCrypto) null, 0);
        if (zzpo.f8995a >= 23 && this.w0) {
            this.y0 = new yd0(this, mediaCodec2);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean N(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.A0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.b0;
            if (j4 < jArr[0]) {
                break;
            }
            this.z0 = jArr[0];
            int i5 = i4 - 1;
            this.A0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j5 = j4 - this.z0;
        if (z) {
            b0(mediaCodec2, i3, j5);
            return true;
        }
        long j6 = j4 - j;
        if (this.e0 == this.f0) {
            if (!f0(j6)) {
                return false;
            }
            b0(mediaCodec2, i3, j5);
            return true;
        } else if (!this.h0) {
            if (zzpo.f8995a >= 21) {
                c0(mediaCodec, i, j5, System.nanoTime());
            } else {
                e0(mediaCodec2, i3, j5);
            }
            return true;
        } else if (c() != 2) {
            return false;
        } else {
            long elapsedRealtime = j6 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long c2 = this.W.c(j4, (elapsedRealtime * 1000) + nanoTime);
            long j7 = (c2 - nanoTime) / 1000;
            if (f0(j7)) {
                zzpp.a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                zzpp.b();
                zzjj zzjj = this.T;
                zzjj.f8786f++;
                this.k0++;
                int i6 = this.l0 + 1;
                this.l0 = i6;
                zzjj.g = Math.max(i6, zzjj.g);
                if (this.k0 == this.Z) {
                    o0();
                }
                return true;
            }
            if (zzpo.f8995a >= 21) {
                if (j7 < 50000) {
                    c0(mediaCodec, i, j5, c2);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                e0(mediaCodec2, i3, j5);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean O(MediaCodec mediaCodec, boolean z, zzhq zzhq, zzhq zzhq2) {
        if (!d0(z, zzhq, zzhq2)) {
            return false;
        }
        int i = zzhq2.k;
        zzqb zzqb = this.d0;
        return i <= zzqb.f9018a && zzhq2.l <= zzqb.f9019b && zzhq2.h <= zzqb.f9020c;
    }

    /* access modifiers changed from: protected */
    public final boolean P(zzlt zzlt) {
        return this.e0 != null || p0(zzlt.f8849d);
    }

    /* access modifiers changed from: protected */
    public final void Q(String str, long j, long j2) {
        this.X.e(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void R(zzhq zzhq) throws zzhb {
        super.R(zzhq);
        this.X.f(zzhq);
        float f2 = zzhq.o;
        if (f2 == -1.0f) {
            f2 = 1.0f;
        }
        this.n0 = f2;
        this.m0 = h0(zzhq);
    }

    /* access modifiers changed from: protected */
    public final void X() {
        try {
            super.X();
        } finally {
            Surface surface = this.f0;
            if (surface != null) {
                if (this.e0 == surface) {
                    this.e0 = null;
                }
                this.f0.release();
                this.f0 = null;
            }
        }
    }

    public final void i(int i, Object obj) throws zzhb {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f0;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzlt W2 = W();
                    if (W2 != null && p0(W2.f8849d)) {
                        surface = zzpv.a(this.V, W2.f8849d);
                        this.f0 = surface;
                    }
                }
            }
            if (this.e0 != surface) {
                this.e0 = surface;
                int c2 = c();
                if (c2 == 1 || c2 == 2) {
                    MediaCodec V2 = V();
                    if (zzpo.f8995a < 23 || V2 == null || surface == null) {
                        X();
                        U();
                    } else {
                        V2.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f0) {
                    l0();
                    j0();
                    return;
                }
                n0();
                j0();
                if (c2 == 2) {
                    i0();
                }
            } else if (surface != null && surface != this.f0) {
                n0();
                if (this.h0) {
                    this.X.c(this.e0);
                }
            }
        } else if (i == 4) {
            this.g0 = ((Integer) obj).intValue();
            MediaCodec V3 = V();
            if (V3 != null) {
                V3.setVideoScalingMode(this.g0);
            }
        } else {
            super.i(i, obj);
        }
    }

    public final boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.h0 || (((surface = this.f0) != null && this.e0 == surface) || V() == null))) {
            this.i0 = -9223372036854775807L;
            return true;
        } else if (this.i0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.i0) {
                return true;
            }
            this.i0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void k0() {
        if (!this.h0) {
            this.h0 = true;
            this.X.c(this.e0);
        }
    }

    /* access modifiers changed from: protected */
    public final void x() {
        super.x();
        this.k0 = 0;
        this.j0 = SystemClock.elapsedRealtime();
        this.i0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public final void y() {
        o0();
        super.y();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzpz(Context context, zzlu zzlu, long j, zzjq<zzjs> zzjq, boolean z, Handler handler, zzqf zzqf, int i) {
        super(2, zzlu, (zzjq<zzjs>) null, false);
        boolean z2 = false;
        this.Y = 0;
        this.Z = -1;
        this.V = context.getApplicationContext();
        this.W = new zzqd(context);
        this.X = new zzqe(handler, zzqf);
        if (zzpo.f8995a <= 22 && "foster".equals(zzpo.f8996b) && "NVIDIA".equals(zzpo.f8997c)) {
            z2 = true;
        }
        this.a0 = z2;
        this.b0 = new long[10];
        this.z0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
        this.o0 = -1;
        this.p0 = -1;
        this.r0 = -1.0f;
        this.n0 = -1.0f;
        this.g0 = 1;
        l0();
    }
}
