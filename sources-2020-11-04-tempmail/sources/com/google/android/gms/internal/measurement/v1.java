package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class v1 extends zzes {

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f9691d;

    /* renamed from: e  reason: collision with root package name */
    private int f9692e;

    /* renamed from: f  reason: collision with root package name */
    private int f9693f;
    private int g;
    private int h;
    private int i;
    private int j;

    private v1(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.j = Integer.MAX_VALUE;
        this.f9691d = bArr;
        this.f9692e = i3 + i2;
        this.g = i2;
        this.h = i2;
    }

    private final byte B() throws IOException {
        int i2 = this.g;
        if (i2 != this.f9692e) {
            byte[] bArr = this.f9691d;
            this.g = i2 + 1;
            return bArr[i2];
        }
        throw zzfw.a();
    }

    private final void C(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f9692e;
            int i4 = this.g;
            if (i2 <= i3 - i4) {
                this.g = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzfw.b();
        }
        throw zzfw.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int E() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.g
            int r1 = r5.f9692e
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f9691d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.g = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.g = r1
            return r0
        L_0x006b:
            long r0 = r5.D()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v1.E():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long F() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.g
            int r1 = r11.f9692e
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f9691d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.g = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r2 = r3 ^ r5
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x00b4
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            r2 = r3
        L_0x00b5:
            r11.g = r1
            return r2
        L_0x00b8:
            long r0 = r11.D()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v1.F():long");
    }

    private final int G() throws IOException {
        int i2 = this.g;
        if (this.f9692e - i2 >= 4) {
            byte[] bArr = this.f9691d;
            this.g = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw zzfw.a();
    }

    private final long H() throws IOException {
        int i2 = this.g;
        if (this.f9692e - i2 >= 8) {
            byte[] bArr = this.f9691d;
            this.g = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw zzfw.a();
    }

    private final void I() {
        int i2 = this.f9692e + this.f9693f;
        this.f9692e = i2;
        int i3 = i2 - this.h;
        int i4 = this.j;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f9693f = i5;
            this.f9692e = i2 - i5;
            return;
        }
        this.f9693f = 0;
    }

    public final int A() {
        return this.g - this.h;
    }

    /* access modifiers changed from: package-private */
    public final long D() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte B = B();
            j2 |= ((long) (B & Byte.MAX_VALUE)) << i2;
            if ((B & 128) == 0) {
                return j2;
            }
        }
        throw zzfw.c();
    }

    public final int a() throws IOException {
        if (z()) {
            this.i = 0;
            return 0;
        }
        int E = E();
        this.i = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw zzfw.d();
    }

    public final void d(int i2) throws zzfw {
        if (this.i != i2) {
            throw zzfw.e();
        }
    }

    public final double e() throws IOException {
        return Double.longBitsToDouble(H());
    }

    public final boolean f(int i2) throws IOException {
        int a2;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f9692e - this.g >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f9691d;
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw zzfw.c();
            }
            while (i4 < 10) {
                if (B() < 0) {
                    i4++;
                }
            }
            throw zzfw.c();
            return true;
        } else if (i3 == 1) {
            C(8);
            return true;
        } else if (i3 == 2) {
            C(E());
            return true;
        } else if (i3 == 3) {
            do {
                a2 = a();
                if (a2 == 0 || !f(a2)) {
                    d(((i2 >>> 3) << 3) | 4);
                }
                a2 = a();
                break;
            } while (!f(a2));
            d(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                C(4);
                return true;
            }
            throw zzfw.f();
        }
    }

    public final float g() throws IOException {
        return Float.intBitsToFloat(G());
    }

    public final int h(int i2) throws zzfw {
        if (i2 >= 0) {
            int A = i2 + A();
            int i3 = this.j;
            if (A <= i3) {
                this.j = A;
                I();
                return i3;
            }
            throw zzfw.a();
        }
        throw zzfw.b();
    }

    public final long i() throws IOException {
        return F();
    }

    public final void j(int i2) {
        this.j = i2;
        I();
    }

    public final long l() throws IOException {
        return F();
    }

    public final int m() throws IOException {
        return E();
    }

    public final long n() throws IOException {
        return H();
    }

    public final int o() throws IOException {
        return G();
    }

    public final boolean p() throws IOException {
        return F() != 0;
    }

    public final String q() throws IOException {
        int E = E();
        if (E > 0 && E <= this.f9692e - this.g) {
            String str = new String(this.f9691d, this.g, E, zzfr.f9823a);
            this.g += E;
            return str;
        } else if (E == 0) {
            return "";
        } else {
            if (E < 0) {
                throw zzfw.b();
            }
            throw zzfw.a();
        }
    }

    public final String r() throws IOException {
        int E = E();
        if (E > 0) {
            int i2 = this.f9692e;
            int i3 = this.g;
            if (E <= i2 - i3) {
                String k = m4.k(this.f9691d, i3, E);
                this.g += E;
                return k;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E <= 0) {
            throw zzfw.b();
        }
        throw zzfw.a();
    }

    public final zzeg s() throws IOException {
        byte[] bArr;
        int E = E();
        if (E > 0) {
            int i2 = this.f9692e;
            int i3 = this.g;
            if (E <= i2 - i3) {
                zzeg q = zzeg.q(this.f9691d, i3, E);
                this.g += E;
                return q;
            }
        }
        if (E == 0) {
            return zzeg.f9791c;
        }
        if (E > 0) {
            int i4 = this.f9692e;
            int i5 = this.g;
            if (E <= i4 - i5) {
                int i6 = E + i5;
                this.g = i6;
                bArr = Arrays.copyOfRange(this.f9691d, i5, i6);
                return zzeg.m(bArr);
            }
        }
        if (E > 0) {
            throw zzfw.a();
        } else if (E == 0) {
            bArr = zzfr.f9824b;
            return zzeg.m(bArr);
        } else {
            throw zzfw.b();
        }
    }

    public final int t() throws IOException {
        return E();
    }

    public final int u() throws IOException {
        return E();
    }

    public final int v() throws IOException {
        return G();
    }

    public final long w() throws IOException {
        return H();
    }

    public final int x() throws IOException {
        return zzes.k(E());
    }

    public final long y() throws IOException {
        return zzes.b(F());
    }

    public final boolean z() throws IOException {
        return this.g == this.f9692e;
    }
}
