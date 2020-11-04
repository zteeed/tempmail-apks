package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class b60 extends zzefc {

    /* renamed from: e  reason: collision with root package name */
    private final InputStream f3608e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f3609f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    private b60(InputStream inputStream, int i2) {
        super();
        this.l = Integer.MAX_VALUE;
        zzegd.d(inputStream, "input");
        this.f3608e = inputStream;
        this.f3609f = new byte[i2];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int C() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.i
            int r1 = r5.g
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f3609f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.i = r3
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
            r5.i = r1
            return r0
        L_0x006b:
            long r0 = r5.B()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b60.C():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long D() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.i
            int r1 = r11.g
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f3609f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.i = r3
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
            r11.i = r1
            return r2
        L_0x00b8:
            long r0 = r11.B()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b60.D():long");
    }

    private final int E() throws IOException {
        int i2 = this.i;
        if (this.g - i2 < 4) {
            K(4);
            i2 = this.i;
        }
        byte[] bArr = this.f3609f;
        this.i = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final long F() throws IOException {
        int i2 = this.i;
        if (this.g - i2 < 8) {
            K(8);
            i2 = this.i;
        }
        byte[] bArr = this.f3609f;
        this.i = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final void G() {
        int i2 = this.g + this.h;
        this.g = i2;
        int i3 = this.k + i2;
        int i4 = this.l;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.h = i5;
            this.g = i2 - i5;
            return;
        }
        this.h = 0;
    }

    private final byte H() throws IOException {
        if (this.i == this.g) {
            K(1);
        }
        byte[] bArr = this.f3609f;
        int i2 = this.i;
        this.i = i2 + 1;
        return bArr[i2];
    }

    private final byte[] I(int i2, boolean z) throws IOException {
        byte[] M = M(i2);
        if (M != null) {
            return M;
        }
        int i3 = this.i;
        int i4 = this.g;
        int i5 = i4 - i3;
        this.k += i4;
        this.i = 0;
        this.g = 0;
        List<byte[]> N = N(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f3609f, i3, bArr, 0, i5);
        for (byte[] next : N) {
            System.arraycopy(next, 0, bArr, i5, next.length);
            i5 += next.length;
        }
        return bArr;
    }

    private final void J(int i2) throws IOException {
        int i3 = this.g;
        int i4 = this.i;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.i = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.k;
            int i6 = this.i;
            int i7 = i5 + i6 + i2;
            int i8 = this.l;
            if (i7 <= i8) {
                this.k = i5 + i6;
                int i9 = this.g - i6;
                this.g = 0;
                this.i = 0;
                while (i9 < i2) {
                    try {
                        long j2 = (long) (i2 - i9);
                        long skip = this.f3608e.skip(j2);
                        int i10 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i10 >= 0 && skip <= j2) {
                            if (i10 == 0) {
                                break;
                            }
                            i9 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.f3608e.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.k += i9;
                        G();
                        throw th;
                    }
                }
                this.k += i9;
                G();
                if (i9 < i2) {
                    int i11 = this.g;
                    int i12 = i11 - this.i;
                    this.i = i11;
                    K(1);
                    while (true) {
                        int i13 = i2 - i12;
                        int i14 = this.g;
                        if (i13 > i14) {
                            i12 += i14;
                            this.i = i14;
                            K(1);
                        } else {
                            this.i = i13;
                            return;
                        }
                    }
                }
            } else {
                J((i8 - i5) - i6);
                throw zzegl.a();
            }
        } else {
            throw zzegl.b();
        }
    }

    private final void K(int i2) throws IOException {
        if (L(i2)) {
            return;
        }
        if (i2 > (this.f8726c - this.k) - this.i) {
            throw zzegl.g();
        }
        throw zzegl.a();
    }

    private final boolean L(int i2) throws IOException {
        do {
            int i3 = this.i;
            int i4 = i3 + i2;
            int i5 = this.g;
            if (i4 > i5) {
                int i6 = this.f8726c;
                int i7 = this.k;
                if (i2 > (i6 - i7) - i3 || i7 + i3 + i2 > this.l) {
                    return false;
                }
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.f3609f;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.k += i3;
                    this.g -= i3;
                    this.i = 0;
                }
                InputStream inputStream = this.f3608e;
                byte[] bArr2 = this.f3609f;
                int i8 = this.g;
                int read = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.f8726c - this.k) - i8));
                if (read == 0 || read < -1 || read > this.f3609f.length) {
                    String valueOf = String.valueOf(this.f3608e.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.g += read;
                    G();
                }
            } else {
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("refillBuffer() called when ");
                sb2.append(i2);
                sb2.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb2.toString());
            }
        } while (this.g < i2);
        return true;
    }

    private final byte[] M(int i2) throws IOException {
        if (i2 == 0) {
            return zzegd.f8759b;
        }
        if (i2 >= 0) {
            int i3 = this.k;
            int i4 = this.i;
            int i5 = i3 + i4 + i2;
            if (i5 - this.f8726c <= 0) {
                int i6 = this.l;
                if (i5 <= i6) {
                    int i7 = this.g - i4;
                    int i8 = i2 - i7;
                    if (i8 >= 4096 && i8 > this.f3608e.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f3609f, this.i, bArr, 0, i7);
                    this.k += this.g;
                    this.i = 0;
                    this.g = 0;
                    while (i7 < i2) {
                        int read = this.f3608e.read(bArr, i7, i2 - i7);
                        if (read != -1) {
                            this.k += read;
                            i7 += read;
                        } else {
                            throw zzegl.a();
                        }
                    }
                    return bArr;
                }
                J((i6 - i3) - i4);
                throw zzegl.a();
            }
            throw zzegl.g();
        }
        throw zzegl.b();
    }

    private final List<byte[]> N(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i3 = 0;
            while (i3 < min) {
                int read = this.f3608e.read(bArr, i3, min - i3);
                if (read != -1) {
                    this.k += read;
                    i3 += read;
                } else {
                    throw zzegl.a();
                }
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
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
        if (C > 0 && C <= this.g - this.i) {
            String str = new String(this.f3609f, this.i, C, zzegd.f8758a);
            this.i += C;
            return str;
        } else if (C == 0) {
            return "";
        } else {
            if (C > this.g) {
                return new String(I(C, false), zzegd.f8758a);
            }
            K(C);
            String str2 = new String(this.f3609f, this.i, C, zzegd.f8758a);
            this.i += C;
            return str2;
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
        byte[] bArr;
        int C = C();
        int i2 = this.i;
        if (C <= this.g - i2 && C > 0) {
            bArr = this.f3609f;
            this.i = i2 + C;
        } else if (C == 0) {
            return "";
        } else {
            if (C <= this.g) {
                K(C);
                bArr = this.f3609f;
                this.i = C;
            } else {
                bArr = I(C, false);
            }
            i2 = 0;
        }
        return y80.l(bArr, i2, C);
    }

    public final zzeer m() throws IOException {
        int C = C();
        int i2 = this.g;
        int i3 = this.i;
        if (C <= i2 - i3 && C > 0) {
            zzeer P = zzeer.P(this.f3609f, i3, C);
            this.i += C;
            return P;
        } else if (C == 0) {
            return zzeer.f8716c;
        } else {
            byte[] M = M(C);
            if (M != null) {
                return zzeer.U(M);
            }
            int i4 = this.i;
            int i5 = this.g;
            int i6 = i5 - i4;
            this.k += i5;
            this.i = 0;
            this.g = 0;
            List<byte[]> N = N(C - i6);
            byte[] bArr = new byte[C];
            System.arraycopy(this.f3609f, i4, bArr, 0, i6);
            for (byte[] next : N) {
                System.arraycopy(next, 0, bArr, i6, next.length);
                i6 += next.length;
            }
            return zzeer.V(bArr);
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
        return this.i == this.g && !L(1);
    }

    public final int u() {
        return this.k + this.i;
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
            if (this.g - this.i >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f3609f;
                    int i5 = this.i;
                    this.i = i5 + 1;
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
            J(8);
            return true;
        } else if (i3 == 2) {
            J(C());
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
                J(4);
                return true;
            }
            throw zzegl.f();
        }
    }

    public final int y(int i2) throws zzegl {
        if (i2 >= 0) {
            int i3 = i2 + this.k + this.i;
            int i4 = this.l;
            if (i3 <= i4) {
                this.l = i3;
                G();
                return i4;
            }
            throw zzegl.a();
        }
        throw zzegl.b();
    }

    public final void z(int i2) {
        this.l = i2;
        G();
    }
}
