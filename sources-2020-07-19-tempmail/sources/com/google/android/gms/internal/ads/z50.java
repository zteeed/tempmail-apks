package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class z50 extends zzefc {

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f5435e;

    /* renamed from: f  reason: collision with root package name */
    private int f5436f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private z50(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.k = Integer.MAX_VALUE;
        this.f5435e = bArr;
        this.f5436f = i3 + i2;
        this.h = i2;
        this.i = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int C() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f5436f
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f5435e
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.h = r3
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
            r5.h = r1
            return r0
        L_0x006b:
            long r0 = r5.B()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z50.C():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long D() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.h
            int r1 = r11.f5436f
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f5435e
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.h = r3
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
            r11.h = r1
            return r2
        L_0x00b8:
            long r0 = r11.B()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z50.D():long");
    }

    private final int E() throws IOException {
        int i2 = this.h;
        if (this.f5436f - i2 >= 4) {
            byte[] bArr = this.f5435e;
            this.h = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw zzegl.a();
    }

    private final long F() throws IOException {
        int i2 = this.h;
        if (this.f5436f - i2 >= 8) {
            byte[] bArr = this.f5435e;
            this.h = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw zzegl.a();
    }

    private final void G() {
        int i2 = this.f5436f + this.g;
        this.f5436f = i2;
        int i3 = i2 - this.i;
        int i4 = this.k;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.g = i5;
            this.f5436f = i2 - i5;
            return;
        }
        this.g = 0;
    }

    private final byte H() throws IOException {
        int i2 = this.h;
        if (i2 != this.f5436f) {
            byte[] bArr = this.f5435e;
            this.h = i2 + 1;
            return bArr[i2];
        }
        throw zzegl.a();
    }

    private final void I(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f5436f;
            int i4 = this.h;
            if (i2 <= i3 - i4) {
                this.h = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzegl.b();
        }
        throw zzegl.a();
    }

    /* access modifiers changed from: package-private */
    public final long B() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte H = H();
            j2 |= ((long) (H & Byte.MAX_VALUE)) << i2;
            if ((H & 128) == 0) {
                return j2;
            }
        }
        throw zzegl.c();
    }

    public final double a() throws IOException {
        return Double.longBitsToDouble(F());
    }

    public final float b() throws IOException {
        return Float.intBitsToFloat(E());
    }

    public final String c() throws IOException {
        int C = C();
        if (C > 0 && C <= this.f5436f - this.h) {
            String str = new String(this.f5435e, this.h, C, zzegd.f8575a);
            this.h += C;
            return str;
        } else if (C == 0) {
            return "";
        } else {
            if (C < 0) {
                throw zzegl.b();
            }
            throw zzegl.a();
        }
    }

    public final int e() throws IOException {
        if (t()) {
            this.j = 0;
            return 0;
        }
        int C = C();
        this.j = C;
        if ((C >>> 3) != 0) {
            return C;
        }
        throw zzegl.d();
    }

    public final long f() throws IOException {
        return D();
    }

    public final long g() throws IOException {
        return D();
    }

    public final int h() throws IOException {
        return C();
    }

    public final long i() throws IOException {
        return F();
    }

    public final int j() throws IOException {
        return E();
    }

    public final boolean k() throws IOException {
        return D() != 0;
    }

    public final String l() throws IOException {
        int C = C();
        if (C > 0) {
            int i2 = this.f5436f;
            int i3 = this.h;
            if (C <= i2 - i3) {
                String l = y80.l(this.f5435e, i3, C);
                this.h += C;
                return l;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C <= 0) {
            throw zzegl.b();
        }
        throw zzegl.a();
    }

    public final zzeer m() throws IOException {
        byte[] bArr;
        int C = C();
        if (C > 0) {
            int i2 = this.f5436f;
            int i3 = this.h;
            if (C <= i2 - i3) {
                zzeer P = zzeer.P(this.f5435e, i3, C);
                this.h += C;
                return P;
            }
        }
        if (C == 0) {
            return zzeer.f8533c;
        }
        if (C > 0) {
            int i4 = this.f5436f;
            int i5 = this.h;
            if (C <= i4 - i5) {
                int i6 = C + i5;
                this.h = i6;
                bArr = Arrays.copyOfRange(this.f5435e, i5, i6);
                return zzeer.V(bArr);
            }
        }
        if (C > 0) {
            throw zzegl.a();
        } else if (C == 0) {
            bArr = zzegd.f8576b;
            return zzeer.V(bArr);
        } else {
            throw zzegl.b();
        }
    }

    public final int n() throws IOException {
        return C();
    }

    public final int o() throws IOException {
        return C();
    }

    public final int p() throws IOException {
        return E();
    }

    public final long q() throws IOException {
        return F();
    }

    public final int r() throws IOException {
        return zzefc.A(C());
    }

    public final long s() throws IOException {
        return zzefc.v(D());
    }

    public final boolean t() throws IOException {
        return this.h == this.f5436f;
    }

    public final int u() {
        return this.h - this.i;
    }

    public final void w(int i2) throws zzegl {
        if (this.j != i2) {
            throw zzegl.e();
        }
    }

    public final boolean x(int i2) throws IOException {
        int e2;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f5436f - this.h >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f5435e;
                    int i5 = this.h;
                    this.h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw zzegl.c();
            }
            while (i4 < 10) {
                if (H() < 0) {
                    i4++;
                }
            }
            throw zzegl.c();
            return true;
        } else if (i3 == 1) {
            I(8);
            return true;
        } else if (i3 == 2) {
            I(C());
            return true;
        } else if (i3 == 3) {
            do {
                e2 = e();
                if (e2 == 0 || !x(e2)) {
                    w(((i2 >>> 3) << 3) | 4);
                }
                e2 = e();
                break;
            } while (!x(e2));
            w(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                I(4);
                return true;
            }
            throw zzegl.f();
        }
    }

    public final int y(int i2) throws zzegl {
        if (i2 >= 0) {
            int u = i2 + u();
            int i3 = this.k;
            if (u <= i3) {
                this.k = u;
                G();
                return i3;
            }
            throw zzegl.a();
        }
        throw zzegl.b();
    }

    public final void z(int i2) {
        this.k = i2;
        G();
    }
}
