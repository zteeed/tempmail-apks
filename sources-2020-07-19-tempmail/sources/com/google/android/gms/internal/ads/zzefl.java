package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzefl extends zzeeo {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f8545b = Logger.getLogger(zzefl.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f8546c = v80.m();

    /* renamed from: a  reason: collision with root package name */
    g60 f8547a;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static class a extends zzefl {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f8548d;

        /* renamed from: e  reason: collision with root package name */
        private final int f8549e;

        /* renamed from: f  reason: collision with root package name */
        private int f8550f;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.f8548d = bArr;
                    this.f8550f = 0;
                    this.f8549e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        private final void G0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f8548d, this.f8550f, i2);
                this.f8550f += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8550f), Integer.valueOf(this.f8549e), Integer.valueOf(i2)}), e2);
            }
        }

        public final void C(int i, zzeer zzeer) throws IOException {
            b(1, 3);
            l(2, i);
            g(3, zzeer);
            b(1, 4);
        }

        public final int D() {
            return this.f8549e - this.f8550f;
        }

        public final void N(byte b2) throws IOException {
            try {
                byte[] bArr = this.f8548d;
                int i = this.f8550f;
                this.f8550f = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8550f), Integer.valueOf(this.f8549e), 1}), e2);
            }
        }

        public final void P(long j) throws IOException {
            if (!zzefl.f8546c || D() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f8548d;
                    int i = this.f8550f;
                    this.f8550f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f8548d;
                    int i2 = this.f8550f;
                    this.f8550f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8550f), Integer.valueOf(this.f8549e), 1}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f8548d;
                    int i3 = this.f8550f;
                    this.f8550f = i3 + 1;
                    v80.h(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f8548d;
                int i4 = this.f8550f;
                this.f8550f = i4 + 1;
                v80.h(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void R(long j) throws IOException {
            try {
                byte[] bArr = this.f8548d;
                int i = this.f8550f;
                int i2 = i + 1;
                this.f8550f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f8548d;
                int i3 = i2 + 1;
                this.f8550f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f8548d;
                int i4 = i3 + 1;
                this.f8550f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f8548d;
                int i5 = i4 + 1;
                this.f8550f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f8548d;
                int i6 = i5 + 1;
                this.f8550f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f8548d;
                int i7 = i6 + 1;
                this.f8550f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f8548d;
                int i8 = i7 + 1;
                this.f8550f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f8548d;
                this.f8550f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8550f), Integer.valueOf(this.f8549e), 1}), e2);
            }
        }

        public final void Z(zzehl zzehl) throws IOException {
            b0(zzehl.f());
            zzehl.i(this);
        }

        public final void a(byte[] bArr, int i, int i2) throws IOException {
            G0(bArr, i, i2);
        }

        public final void a0(int i) throws IOException {
            if (i >= 0) {
                b0(i);
            } else {
                P((long) i);
            }
        }

        public final void b(int i, int i2) throws IOException {
            b0((i << 3) | i2);
        }

        public final void b0(int i) throws IOException {
            if (!zzefl.f8546c || l50.a() || D() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f8548d;
                    int i2 = this.f8550f;
                    this.f8550f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f8548d;
                    int i3 = this.f8550f;
                    this.f8550f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8550f), Integer.valueOf(this.f8549e), 1}), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f8548d;
                int i4 = this.f8550f;
                this.f8550f = i4 + 1;
                v80.h(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f8548d;
                int i5 = this.f8550f;
                this.f8550f = i5 + 1;
                v80.h(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f8548d;
                    int i7 = this.f8550f;
                    this.f8550f = i7 + 1;
                    v80.h(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f8548d;
                int i8 = this.f8550f;
                this.f8550f = i8 + 1;
                v80.h(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f8548d;
                    int i10 = this.f8550f;
                    this.f8550f = i10 + 1;
                    v80.h(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f8548d;
                int i11 = this.f8550f;
                this.f8550f = i11 + 1;
                v80.h(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f8548d;
                    int i13 = this.f8550f;
                    this.f8550f = i13 + 1;
                    v80.h(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f8548d;
                int i14 = this.f8550f;
                this.f8550f = i14 + 1;
                v80.h(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f8548d;
                int i15 = this.f8550f;
                this.f8550f = i15 + 1;
                v80.h(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void d0(int i) throws IOException {
            try {
                byte[] bArr = this.f8548d;
                int i2 = this.f8550f;
                int i3 = i2 + 1;
                this.f8550f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f8548d;
                int i4 = i3 + 1;
                this.f8550f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f8548d;
                int i5 = i4 + 1;
                this.f8550f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f8548d;
                this.f8550f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8550f), Integer.valueOf(this.f8549e), 1}), e2);
            }
        }

        public final void g(int i, zzeer zzeer) throws IOException {
            b(i, 2);
            r(zzeer);
        }

        public final void h(int i, zzehl zzehl) throws IOException {
            b(1, 3);
            l(2, i);
            b(3, 2);
            Z(zzehl);
            b(1, 4);
        }

        /* access modifiers changed from: package-private */
        public final void i(int i, zzehl zzehl, z70 z70) throws IOException {
            b(i, 2);
            zzeeh zzeeh = (zzeeh) zzehl;
            int h = zzeeh.h();
            if (h == -1) {
                h = z70.c(zzeeh);
                zzeeh.j(h);
            }
            b0(h);
            z70.d(zzehl, this.f8547a);
        }

        public final void k(int i, int i2) throws IOException {
            b(i, 0);
            a0(i2);
        }

        public final void l(int i, int i2) throws IOException {
            b(i, 0);
            b0(i2);
        }

        public final void n(int i, int i2) throws IOException {
            b(i, 5);
            d0(i2);
        }

        public final void o0(int i, long j) throws IOException {
            b(i, 0);
            P(j);
        }

        public final void p0(int i, boolean z) throws IOException {
            b(i, 0);
            N(z ? (byte) 1 : 0);
        }

        public final void q0(String str) throws IOException {
            int i = this.f8550f;
            try {
                int g0 = zzefl.g0(str.length() * 3);
                int g02 = zzefl.g0(str.length());
                if (g02 == g0) {
                    int i2 = i + g02;
                    this.f8550f = i2;
                    int b2 = y80.b(str, this.f8548d, i2, D());
                    this.f8550f = i;
                    b0((b2 - i) - g02);
                    this.f8550f = b2;
                    return;
                }
                b0(y80.a(str));
                this.f8550f = y80.b(str, this.f8548d, this.f8550f, D());
            } catch (b90 e2) {
                this.f8550f = i;
                j(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zza(e3);
            }
        }

        public final void r(zzeer zzeer) throws IOException {
            b0(zzeer.size());
            zzeer.j(this);
        }

        public final void v0(int i, long j) throws IOException {
            b(i, 1);
            R(j);
        }

        public final void x0(int i, String str) throws IOException {
            b(i, 2);
            q0(str);
        }

        public final void y0(byte[] bArr, int i, int i2) throws IOException {
            b0(i2);
            G0(bArr, 0, i2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zza(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefl.zza.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzefl() {
    }

    public static int A0(int i, String str) {
        return e0(i) + r0(str);
    }

    public static int B0(int i, long j) {
        return e0(i) + T(X(j));
    }

    public static int C0(int i, long j) {
        return e0(i) + 8;
    }

    public static int D0(int i, long j) {
        return e0(i) + 8;
    }

    public static zzefl E0(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int F0(byte[] bArr) {
        int length = bArr.length;
        return g0(length) + length;
    }

    public static int H(boolean z) {
        return 1;
    }

    public static int I(double d2) {
        return 8;
    }

    public static int J(int i, double d2) {
        return e0(i) + 8;
    }

    public static int K(int i, zzeer zzeer) {
        int e0 = e0(i);
        int size = zzeer.size();
        return e0 + g0(size) + size;
    }

    @Deprecated
    static int L(int i, zzehl zzehl, z70 z70) {
        int e0 = e0(i) << 1;
        zzeeh zzeeh = (zzeeh) zzehl;
        int h = zzeeh.h();
        if (h == -1) {
            h = z70.c(zzeeh);
            zzeeh.j(h);
        }
        return e0 + h;
    }

    public static int M(int i, zzeer zzeer) {
        return (e0(1) << 1) + p(2, i) + K(3, zzeer);
    }

    public static int S(long j) {
        return T(j);
    }

    public static int T(long j) {
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

    public static int U(long j) {
        return T(X(j));
    }

    public static int V(long j) {
        return 8;
    }

    public static int W(long j) {
        return 8;
    }

    private static long X(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int Y(float f2) {
        return 4;
    }

    public static int c(int i, zzegu zzegu) {
        int e0 = e0(i);
        int b2 = zzegu.b();
        return e0 + g0(b2) + b2;
    }

    public static int d(zzegu zzegu) {
        int b2 = zzegu.b();
        return g0(b2) + b2;
    }

    static int e(zzehl zzehl, z70 z70) {
        zzeeh zzeeh = (zzeeh) zzehl;
        int h = zzeeh.h();
        if (h == -1) {
            h = z70.c(zzeeh);
            zzeeh.j(h);
        }
        return g0(h) + h;
    }

    public static int e0(int i) {
        return g0(i << 3);
    }

    public static int f0(int i) {
        if (i >= 0) {
            return g0(i);
        }
        return 10;
    }

    public static int g0(int i) {
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

    public static int h0(int i) {
        return g0(l0(i));
    }

    public static int i0(int i) {
        return 4;
    }

    public static int j0(int i) {
        return 4;
    }

    public static int k0(int i) {
        return f0(i);
    }

    private static int l0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int m0(int i) {
        return g0(i);
    }

    public static int n0(zzehl zzehl) {
        int f2 = zzehl.f();
        return g0(f2) + f2;
    }

    public static int o(int i, int i2) {
        return e0(i) + f0(i2);
    }

    public static int p(int i, int i2) {
        return e0(i) + g0(i2);
    }

    public static int q(int i, int i2) {
        return e0(i) + g0(l0(i2));
    }

    public static int r0(String str) {
        int i;
        try {
            i = y80.a(str);
        } catch (b90 unused) {
            i = str.getBytes(zzegd.f8575a).length;
        }
        return g0(i) + i;
    }

    public static int s(int i, int i2) {
        return e0(i) + 4;
    }

    public static int s0(int i, boolean z) {
        return e0(i) + 1;
    }

    public static int t(zzeer zzeer) {
        int size = zzeer.size();
        return g0(size) + size;
    }

    @Deprecated
    public static int t0(zzehl zzehl) {
        return zzehl.f();
    }

    public static int u(int i, int i2) {
        return e0(i) + 4;
    }

    public static int v(int i, int i2) {
        return e0(i) + f0(i2);
    }

    public static int w(int i, float f2) {
        return e0(i) + 4;
    }

    public static int w0(int i, long j) {
        return e0(i) + T(j);
    }

    public static int x(int i, zzegu zzegu) {
        return (e0(1) << 1) + p(2, i) + c(3, zzegu);
    }

    public static int y(int i, zzehl zzehl) {
        return (e0(1) << 1) + p(2, i) + e0(3) + n0(zzehl);
    }

    static int z(int i, zzehl zzehl, z70 z70) {
        return e0(i) + e(zzehl, z70);
    }

    public static int z0(int i, long j) {
        return e0(i) + T(j);
    }

    public final void A(double d2) throws IOException {
        R(Double.doubleToRawLongBits(d2));
    }

    public final void B(int i, double d2) throws IOException {
        v0(i, Double.doubleToRawLongBits(d2));
    }

    public abstract void C(int i, zzeer zzeer) throws IOException;

    public abstract int D();

    public final void E() {
        if (D() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void G(boolean z) throws IOException {
        N(z ? (byte) 1 : 0);
    }

    public abstract void N(byte b2) throws IOException;

    public final void O(float f2) throws IOException {
        d0(Float.floatToRawIntBits(f2));
    }

    public abstract void P(long j) throws IOException;

    public final void Q(long j) throws IOException {
        P(X(j));
    }

    public abstract void R(long j) throws IOException;

    public abstract void Z(zzehl zzehl) throws IOException;

    public abstract void a0(int i) throws IOException;

    public abstract void b(int i, int i2) throws IOException;

    public abstract void b0(int i) throws IOException;

    public final void c0(int i) throws IOException {
        b0(l0(i));
    }

    public abstract void d0(int i) throws IOException;

    public final void f(int i, float f2) throws IOException {
        n(i, Float.floatToRawIntBits(f2));
    }

    public abstract void g(int i, zzeer zzeer) throws IOException;

    public abstract void h(int i, zzehl zzehl) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void i(int i, zzehl zzehl, z70 z70) throws IOException;

    /* access modifiers changed from: package-private */
    public final void j(String str, b90 b90) throws IOException {
        f8545b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", b90);
        byte[] bytes = str.getBytes(zzegd.f8575a);
        try {
            b0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zza(e2);
        } catch (zza e3) {
            throw e3;
        }
    }

    public abstract void k(int i, int i2) throws IOException;

    public abstract void l(int i, int i2) throws IOException;

    public final void m(int i, int i2) throws IOException {
        l(i, l0(i2));
    }

    public abstract void n(int i, int i2) throws IOException;

    public abstract void o0(int i, long j) throws IOException;

    public abstract void p0(int i, boolean z) throws IOException;

    public abstract void q0(String str) throws IOException;

    public abstract void r(zzeer zzeer) throws IOException;

    public final void u0(int i, long j) throws IOException {
        o0(i, X(j));
    }

    public abstract void v0(int i, long j) throws IOException;

    public abstract void x0(int i, String str) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void y0(byte[] bArr, int i, int i2) throws IOException;
}
