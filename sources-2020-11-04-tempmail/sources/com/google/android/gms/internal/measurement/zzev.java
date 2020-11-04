package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public abstract class zzev extends zzed {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f9797b = Logger.getLogger(zzev.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f9798c = k4.m();

    /* renamed from: a  reason: collision with root package name */
    y1 f9799a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    static class a extends zzev {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f9800d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9801e;

        /* renamed from: f  reason: collision with root package name */
        private int f9802f;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f9800d = bArr;
                    this.f9802f = 0;
                    this.f9801e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        private final void G0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f9800d, this.f9802f, i2);
                this.f9802f += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9802f), Integer.valueOf(this.f9801e), Integer.valueOf(i2)}), e2);
            }
        }

        public final void O(int i) throws IOException {
            if (!zzev.f9798c || f1.b() || b() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f9800d;
                    int i2 = this.f9802f;
                    this.f9802f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f9800d;
                    int i3 = this.f9802f;
                    this.f9802f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9802f), Integer.valueOf(this.f9801e), 1}), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f9800d;
                int i4 = this.f9802f;
                this.f9802f = i4 + 1;
                k4.l(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f9800d;
                int i5 = this.f9802f;
                this.f9802f = i5 + 1;
                k4.l(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f9800d;
                    int i7 = this.f9802f;
                    this.f9802f = i7 + 1;
                    k4.l(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f9800d;
                int i8 = this.f9802f;
                this.f9802f = i8 + 1;
                k4.l(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f9800d;
                    int i10 = this.f9802f;
                    this.f9802f = i10 + 1;
                    k4.l(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f9800d;
                int i11 = this.f9802f;
                this.f9802f = i11 + 1;
                k4.l(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f9800d;
                    int i13 = this.f9802f;
                    this.f9802f = i13 + 1;
                    k4.l(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f9800d;
                int i14 = this.f9802f;
                this.f9802f = i14 + 1;
                k4.l(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f9800d;
                int i15 = this.f9802f;
                this.f9802f = i15 + 1;
                k4.l(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void P(int i, int i2) throws IOException {
            m(i, 0);
            j(i2);
        }

        public final void R(int i, zzeg zzeg) throws IOException {
            m(1, 3);
            Y(2, i);
            o(3, zzeg);
            m(1, 4);
        }

        public final void T(byte[] bArr, int i, int i2) throws IOException {
            O(i2);
            G0(bArr, 0, i2);
        }

        public final void Y(int i, int i2) throws IOException {
            m(i, 0);
            O(i2);
        }

        public final void Z(int i, long j) throws IOException {
            m(i, 1);
            a0(j);
        }

        public final void a(byte[] bArr, int i, int i2) throws IOException {
            G0(bArr, i, i2);
        }

        public final void a0(long j) throws IOException {
            try {
                byte[] bArr = this.f9800d;
                int i = this.f9802f;
                int i2 = i + 1;
                this.f9802f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f9800d;
                int i3 = i2 + 1;
                this.f9802f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f9800d;
                int i4 = i3 + 1;
                this.f9802f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f9800d;
                int i5 = i4 + 1;
                this.f9802f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f9800d;
                int i6 = i5 + 1;
                this.f9802f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f9800d;
                int i7 = i6 + 1;
                this.f9802f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f9800d;
                int i8 = i7 + 1;
                this.f9802f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f9800d;
                this.f9802f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9802f), Integer.valueOf(this.f9801e), 1}), e2);
            }
        }

        public final int b() {
            return this.f9801e - this.f9802f;
        }

        public final void f0(int i) throws IOException {
            try {
                byte[] bArr = this.f9800d;
                int i2 = this.f9802f;
                int i3 = i2 + 1;
                this.f9802f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f9800d;
                int i4 = i3 + 1;
                this.f9802f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f9800d;
                int i5 = i4 + 1;
                this.f9802f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f9800d;
                this.f9802f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9802f), Integer.valueOf(this.f9801e), 1}), e2);
            }
        }

        public final void g(byte b2) throws IOException {
            try {
                byte[] bArr = this.f9800d;
                int i = this.f9802f;
                this.f9802f = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9802f), Integer.valueOf(this.f9801e), 1}), e2);
            }
        }

        public final void j(int i) throws IOException {
            if (i >= 0) {
                O(i);
            } else {
                t((long) i);
            }
        }

        public final void k0(int i, int i2) throws IOException {
            m(i, 5);
            f0(i2);
        }

        public final void m(int i, int i2) throws IOException {
            O((i << 3) | i2);
        }

        public final void n(int i, long j) throws IOException {
            m(i, 0);
            t(j);
        }

        public final void o(int i, zzeg zzeg) throws IOException {
            m(i, 2);
            u(zzeg);
        }

        public final void p(int i, zzgw zzgw) throws IOException {
            m(1, 3);
            Y(2, i);
            m(3, 2);
            v(zzgw);
            m(1, 4);
        }

        /* access modifiers changed from: package-private */
        public final void q(int i, zzgw zzgw, p3 p3Var) throws IOException {
            m(i, 2);
            zzdw zzdw = (zzdw) zzgw;
            int k = zzdw.k();
            if (k == -1) {
                k = p3Var.b(zzdw);
                zzdw.l(k);
            }
            O(k);
            p3Var.i(zzgw, this.f9799a);
        }

        public final void r(int i, String str) throws IOException {
            m(i, 2);
            w(str);
        }

        public final void s(int i, boolean z) throws IOException {
            m(i, 0);
            g(z ? (byte) 1 : 0);
        }

        public final void t(long j) throws IOException {
            if (!zzev.f9798c || b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f9800d;
                    int i = this.f9802f;
                    this.f9802f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f9800d;
                    int i2 = this.f9802f;
                    this.f9802f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f9802f), Integer.valueOf(this.f9801e), 1}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f9800d;
                    int i3 = this.f9802f;
                    this.f9802f = i3 + 1;
                    k4.l(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f9800d;
                int i4 = this.f9802f;
                this.f9802f = i4 + 1;
                k4.l(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void u(zzeg zzeg) throws IOException {
            O(zzeg.h());
            zzeg.u(this);
        }

        public final void v(zzgw zzgw) throws IOException {
            O(zzgw.i());
            zzgw.g(this);
        }

        public final void w(String str) throws IOException {
            int i = this.f9802f;
            try {
                int p0 = zzev.p0(str.length() * 3);
                int p02 = zzev.p0(str.length());
                if (p02 == p0) {
                    int i2 = i + p02;
                    this.f9802f = i2;
                    int e2 = m4.e(str, this.f9800d, i2, b());
                    this.f9802f = i;
                    O((e2 - i) - p02);
                    this.f9802f = e2;
                    return;
                }
                O(m4.d(str));
                this.f9802f = m4.e(str, this.f9800d, this.f9802f, b());
            } catch (q4 e3) {
                this.f9802f = i;
                x(str, e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(e4);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzb(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzev.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzev() {
    }

    public static int A(float f2) {
        return 4;
    }

    public static int A0(int i) {
        return 4;
    }

    public static int B(int i, double d2) {
        return h0(i) + 8;
    }

    public static int B0(int i, int i2) {
        return h0(i) + 4;
    }

    public static int C(int i, float f2) {
        return h0(i) + 4;
    }

    public static int C0(int i) {
        return l0(i);
    }

    public static int D(int i, zzgf zzgf) {
        return (h0(1) << 1) + q0(2, i) + c(3, zzgf);
    }

    public static int D0(int i, int i2) {
        return h0(i) + l0(i2);
    }

    public static int E(int i, zzgw zzgw) {
        return (h0(1) << 1) + q0(2, i) + h0(3) + J(zzgw);
    }

    @Deprecated
    public static int E0(int i) {
        return p0(i);
    }

    static int F(int i, zzgw zzgw, p3 p3Var) {
        return h0(i) + e(zzgw, p3Var);
    }

    private static int F0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int G(int i, String str) {
        return h0(i) + K(str);
    }

    public static int H(int i, boolean z) {
        return h0(i) + 1;
    }

    public static int I(zzeg zzeg) {
        int h = zzeg.h();
        return p0(h) + h;
    }

    public static int J(zzgw zzgw) {
        int i = zzgw.i();
        return p0(i) + i;
    }

    public static int K(String str) {
        int i;
        try {
            i = m4.d(str);
        } catch (q4 unused) {
            i = str.getBytes(zzfr.f9823a).length;
        }
        return p0(i) + i;
    }

    public static int L(boolean z) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return p0(length) + length;
    }

    public static int U(int i, zzeg zzeg) {
        int h0 = h0(i);
        int h = zzeg.h();
        return h0 + p0(h) + h;
    }

    @Deprecated
    static int V(int i, zzgw zzgw, p3 p3Var) {
        int h0 = h0(i) << 1;
        zzdw zzdw = (zzdw) zzgw;
        int k = zzdw.k();
        if (k == -1) {
            k = p3Var.b(zzdw);
            zzdw.l(k);
        }
        return h0 + k;
    }

    @Deprecated
    public static int W(zzgw zzgw) {
        return zzgw.i();
    }

    public static int c(int i, zzgf zzgf) {
        int h0 = h0(i);
        int b2 = zzgf.b();
        return h0 + p0(b2) + b2;
    }

    public static int c0(int i, long j) {
        return h0(i) + j0(j);
    }

    public static int d(zzgf zzgf) {
        int b2 = zzgf.b();
        return p0(b2) + b2;
    }

    public static int d0(int i, zzeg zzeg) {
        return (h0(1) << 1) + q0(2, i) + U(3, zzeg);
    }

    static int e(zzgw zzgw, p3 p3Var) {
        zzdw zzdw = (zzdw) zzgw;
        int k = zzdw.k();
        if (k == -1) {
            k = p3Var.b(zzdw);
            zzdw.l(k);
        }
        return p0(k) + k;
    }

    public static int e0(long j) {
        return j0(j);
    }

    public static zzev f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int h0(int i) {
        return p0(i << 3);
    }

    public static int i0(int i, long j) {
        return h0(i) + j0(j);
    }

    public static int j0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int l0(int i) {
        if (i >= 0) {
            return p0(i);
        }
        return 10;
    }

    public static int m0(int i, int i2) {
        return h0(i) + l0(i2);
    }

    public static int n0(int i, long j) {
        return h0(i) + j0(z0(j));
    }

    public static int o0(long j) {
        return j0(z0(j));
    }

    public static int p0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int q0(int i, int i2) {
        return h0(i) + p0(i2);
    }

    public static int r0(int i, long j) {
        return h0(i) + 8;
    }

    public static int s0(long j) {
        return 8;
    }

    public static int t0(int i) {
        return p0(F0(i));
    }

    public static int u0(int i, int i2) {
        return h0(i) + p0(F0(i2));
    }

    public static int v0(int i, long j) {
        return h0(i) + 8;
    }

    public static int w0(long j) {
        return 8;
    }

    public static int x0(int i) {
        return 4;
    }

    public static int y0(int i, int i2) {
        return h0(i) + 4;
    }

    public static int z(double d2) {
        return 8;
    }

    private static long z0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public final void N() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void O(int i) throws IOException;

    public abstract void P(int i, int i2) throws IOException;

    public final void Q(int i, long j) throws IOException {
        n(i, z0(j));
    }

    public abstract void R(int i, zzeg zzeg) throws IOException;

    public final void S(long j) throws IOException {
        t(z0(j));
    }

    /* access modifiers changed from: package-private */
    public abstract void T(byte[] bArr, int i, int i2) throws IOException;

    public final void X(int i) throws IOException {
        O(F0(i));
    }

    public abstract void Y(int i, int i2) throws IOException;

    public abstract void Z(int i, long j) throws IOException;

    public abstract void a0(long j) throws IOException;

    public abstract int b();

    public abstract void f0(int i) throws IOException;

    public abstract void g(byte b2) throws IOException;

    public final void g0(int i, int i2) throws IOException {
        Y(i, F0(i2));
    }

    public final void h(double d2) throws IOException {
        a0(Double.doubleToRawLongBits(d2));
    }

    public final void i(float f2) throws IOException {
        f0(Float.floatToRawIntBits(f2));
    }

    public abstract void j(int i) throws IOException;

    public final void k(int i, double d2) throws IOException {
        Z(i, Double.doubleToRawLongBits(d2));
    }

    public abstract void k0(int i, int i2) throws IOException;

    public final void l(int i, float f2) throws IOException {
        k0(i, Float.floatToRawIntBits(f2));
    }

    public abstract void m(int i, int i2) throws IOException;

    public abstract void n(int i, long j) throws IOException;

    public abstract void o(int i, zzeg zzeg) throws IOException;

    public abstract void p(int i, zzgw zzgw) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void q(int i, zzgw zzgw, p3 p3Var) throws IOException;

    public abstract void r(int i, String str) throws IOException;

    public abstract void s(int i, boolean z) throws IOException;

    public abstract void t(long j) throws IOException;

    public abstract void u(zzeg zzeg) throws IOException;

    public abstract void v(zzgw zzgw) throws IOException;

    public abstract void w(String str) throws IOException;

    /* access modifiers changed from: package-private */
    public final void x(String str, q4 q4Var) throws IOException {
        f9797b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", q4Var);
        byte[] bytes = str.getBytes(zzfr.f9823a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        } catch (zzb e3) {
            throw e3;
        }
    }

    public final void y(boolean z) throws IOException {
        g(z ? (byte) 1 : 0);
    }
}
