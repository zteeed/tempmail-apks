package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class kb0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f4382a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4383b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4384c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4385d;

    /* renamed from: e  reason: collision with root package name */
    private final int f4386e;

    /* renamed from: f  reason: collision with root package name */
    private final short[] f4387f;
    private int g;
    private short[] h;
    private int i;
    private short[] j;
    private int k;
    private short[] l;
    private int m = 0;
    private int n = 0;
    private float o = 1.0f;
    private float p = 1.0f;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u = 0;
    private int v;
    private int w;
    private int x;

    public kb0(int i2, int i3) {
        this.f4382a = i2;
        this.f4383b = i3;
        this.f4384c = i2 / 400;
        int i4 = i2 / 65;
        this.f4385d = i4;
        int i5 = i4 * 2;
        this.f4386e = i5;
        this.f4387f = new short[i5];
        this.g = i5;
        this.h = new short[(i5 * i3)];
        this.i = i5;
        this.j = new short[(i5 * i3)];
        this.k = i5;
        this.l = new short[(i5 * i3)];
    }

    private final int b(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f4383b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                short s2 = sArr[i5 + i11];
                short s3 = sArr[i5 + i3 + i11];
                i10 += s2 >= s3 ? s2 - s3 : s3 - s2;
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.w = i6 / i8;
        this.x = i9 / i7;
        return i8;
    }

    private static void d(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    private final void f(short[] sArr, int i2, int i3) {
        m(i3);
        int i4 = this.f4383b;
        System.arraycopy(sArr, i2 * i4, this.j, this.r * i4, i4 * i3);
        this.r += i3;
    }

    private final void g(int i2) {
        int i3 = this.q + i2;
        int i4 = this.g;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.g = i5;
            this.h = Arrays.copyOf(this.h, i5 * this.f4383b);
        }
    }

    private final void i(short[] sArr, int i2, int i3) {
        int i4 = this.f4386e / i3;
        int i5 = this.f4383b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f4387f[i8] = (short) (i9 / i6);
        }
    }

    private final void l() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.r;
        float f2 = this.o / this.p;
        double d2 = (double) f2;
        int i9 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i10 = this.q;
            if (i10 >= this.f4386e) {
                int i11 = 0;
                while (true) {
                    int i12 = this.t;
                    if (i12 > 0) {
                        int min = Math.min(this.f4386e, i12);
                        f(this.h, i11, min);
                        this.t -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.h;
                        int i13 = this.f4382a;
                        int i14 = i13 > 4000 ? i13 / 4000 : 1;
                        if (this.f4383b == i9 && i14 == i9) {
                            i5 = b(sArr, i11, this.f4384c, this.f4385d);
                        } else {
                            i(sArr, i11, i14);
                            int b2 = b(this.f4387f, 0, this.f4384c / i14, this.f4385d / i14);
                            if (i14 != i9) {
                                int i15 = b2 * i14;
                                int i16 = i14 << 2;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.f4384c;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.f4385d;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.f4383b == i9) {
                                    i5 = b(sArr, i11, i17, i18);
                                } else {
                                    i(sArr, i11, i9);
                                    i5 = b(this.f4387f, 0, i17, i18);
                                }
                            } else {
                                i5 = b2;
                            }
                        }
                        int i21 = this.w;
                        int i22 = i21 != 0 && this.u != 0 && this.x <= i21 * 3 && (i21 << 1) > this.v * 3 ? this.u : i5;
                        this.v = this.w;
                        this.u = i5;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.h;
                            if (f2 >= 2.0f) {
                                i7 = (int) (((float) i22) / (f2 - 1.0f));
                            } else {
                                this.t = (int) ((((float) i22) * (2.0f - f2)) / (f2 - 1.0f));
                                i7 = i22;
                            }
                            m(i7);
                            int i23 = i7;
                            d(i7, this.f4383b, this.j, this.r, sArr2, i11, sArr2, i11 + i22);
                            this.r += i23;
                            i11 += i22 + i23;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.h;
                            if (f2 < 0.5f) {
                                i6 = (int) ((((float) i24) * f2) / (1.0f - f2));
                            } else {
                                this.t = (int) ((((float) i24) * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
                                i6 = i24;
                            }
                            int i25 = i24 + i6;
                            m(i25);
                            int i26 = this.f4383b;
                            System.arraycopy(sArr3, i11 * i26, this.j, this.r * i26, i26 * i24);
                            d(i6, this.f4383b, this.j, this.r + i24, sArr3, i24 + i11, sArr3, i11);
                            this.r += i25;
                            i11 += i6;
                        }
                    }
                    if (this.f4386e + i11 > i10) {
                        break;
                    }
                    i9 = 1;
                }
                int i27 = this.q - i11;
                short[] sArr4 = this.h;
                int i28 = this.f4383b;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.q = i27;
            }
        } else {
            f(this.h, 0, this.q);
            this.q = 0;
        }
        float f3 = this.p;
        if (f3 != 1.0f && this.r != i8) {
            int i29 = this.f4382a;
            int i30 = (int) (((float) i29) / f3);
            while (true) {
                if (i30 <= 16384 && i29 <= 16384) {
                    break;
                }
                i30 /= 2;
                i29 /= 2;
            }
            int i31 = this.r - i8;
            int i32 = this.s + i31;
            int i33 = this.k;
            if (i32 > i33) {
                int i34 = i33 + (i33 / 2) + i31;
                this.k = i34;
                this.l = Arrays.copyOf(this.l, i34 * this.f4383b);
            }
            short[] sArr5 = this.j;
            int i35 = this.f4383b;
            System.arraycopy(sArr5, i8 * i35, this.l, this.s * i35, i35 * i31);
            this.r = i8;
            this.s += i31;
            int i36 = 0;
            while (true) {
                i2 = this.s;
                if (i36 >= i2 - 1) {
                    break;
                }
                while (true) {
                    i3 = this.m;
                    int i37 = (i3 + 1) * i30;
                    i4 = this.n;
                    if (i37 <= i4 * i29) {
                        break;
                    }
                    m(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f4383b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.l;
                        int i40 = (i36 * i39) + i38;
                        short s2 = sArr6[i40];
                        short s3 = sArr6[i40 + i39];
                        int i41 = this.m;
                        int i42 = i41 * i30;
                        int i43 = (i41 + 1) * i30;
                        int i44 = i43 - (this.n * i29);
                        int i45 = i43 - i42;
                        this.j[(this.r * i39) + i38] = (short) (((s2 * i44) + ((i45 - i44) * s3)) / i45);
                        i38++;
                    }
                    this.n++;
                    this.r++;
                }
                int i46 = i3 + 1;
                this.m = i46;
                if (i46 == i29) {
                    this.m = 0;
                    zzpb.e(i4 == i30);
                    this.n = 0;
                }
                i36++;
            }
            int i47 = i2 - 1;
            if (i47 != 0) {
                short[] sArr7 = this.l;
                int i48 = this.f4383b;
                System.arraycopy(sArr7, i47 * i48, sArr7, 0, (i2 - i47) * i48);
                this.s -= i47;
            }
        }
    }

    private final void m(int i2) {
        int i3 = this.r + i2;
        int i4 = this.i;
        if (i3 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.i = i5;
            this.j = Arrays.copyOf(this.j, i5 * this.f4383b);
        }
    }

    public final void a(float f2) {
        this.o = f2;
    }

    public final void c(float f2) {
        this.p = f2;
    }

    public final void e(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f4383b;
        int i3 = remaining / i2;
        g(i3);
        shortBuffer.get(this.h, this.q * this.f4383b, ((i2 * i3) << 1) / 2);
        this.q += i3;
        l();
    }

    public final void h(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f4383b, this.r);
        shortBuffer.put(this.j, 0, this.f4383b * min);
        int i2 = this.r - min;
        this.r = i2;
        short[] sArr = this.j;
        int i3 = this.f4383b;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    public final void j() {
        int i2;
        int i3 = this.q;
        float f2 = this.o;
        float f3 = this.p;
        int i4 = this.r + ((int) ((((((float) i3) / (f2 / f3)) + ((float) this.s)) / f3) + 0.5f));
        g((this.f4386e * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f4386e;
            int i6 = this.f4383b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.h[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.q += i2 * 2;
        l();
        if (this.r > i4) {
            this.r = i4;
        }
        this.q = 0;
        this.t = 0;
        this.s = 0;
    }

    public final int k() {
        return this.r;
    }
}
