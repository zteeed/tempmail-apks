package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class i1 {
    static int a(int i, byte[] bArr, int i2, int i3, h1 h1Var) throws zzfw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return k(bArr, i2, h1Var);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return i(bArr, i2, h1Var) + h1Var.f9407a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = i(bArr, i2, h1Var);
                    i6 = h1Var.f9407a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, h1Var);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzfw.g();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzfw.d();
            }
        } else {
            throw zzfw.d();
        }
    }

    static int b(int i, byte[] bArr, int i2, int i3, zzfx<?> zzfx, h1 h1Var) {
        k2 k2Var = (k2) zzfx;
        int i4 = i(bArr, i2, h1Var);
        k2Var.j(h1Var.f9407a);
        while (i4 < i3) {
            int i5 = i(bArr, i4, h1Var);
            if (i != h1Var.f9407a) {
                break;
            }
            i4 = i(bArr, i5, h1Var);
            k2Var.j(h1Var.f9407a);
        }
        return i4;
    }

    static int c(int i, byte[] bArr, int i2, int i3, zzig zzig, h1 h1Var) throws zzfw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int k = k(bArr, i2, h1Var);
                zzig.c(i, Long.valueOf(h1Var.f9408b));
                return k;
            } else if (i4 == 1) {
                zzig.c(i, Long.valueOf(l(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int i5 = i(bArr, i2, h1Var);
                int i6 = h1Var.f9407a;
                if (i6 < 0) {
                    throw zzfw.b();
                } else if (i6 <= bArr.length - i5) {
                    if (i6 == 0) {
                        zzig.c(i, zzeg.f9608c);
                    } else {
                        zzig.c(i, zzeg.q(bArr, i5, i6));
                    }
                    return i5 + i6;
                } else {
                    throw zzfw.a();
                }
            } else if (i4 == 3) {
                zzig g = zzig.g();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i9 = i(bArr, i2, h1Var);
                    int i10 = h1Var.f9407a;
                    i8 = i10;
                    if (i10 == i7) {
                        i2 = i9;
                        break;
                    }
                    int c2 = c(i8, bArr, i9, i3, g, h1Var);
                    i8 = i10;
                    i2 = c2;
                }
                if (i2 > i3 || i8 != i7) {
                    throw zzfw.g();
                }
                zzig.c(i, g);
                return i2;
            } else if (i4 == 5) {
                zzig.c(i, Integer.valueOf(h(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzfw.d();
            }
        } else {
            throw zzfw.d();
        }
    }

    static int d(int i, byte[] bArr, int i2, h1 h1Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            h1Var.f9407a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            h1Var.f9407a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            h1Var.f9407a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            h1Var.f9407a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                h1Var.f9407a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int e(p3<?> p3Var, int i, byte[] bArr, int i2, int i3, zzfx<?> zzfx, h1 h1Var) throws IOException {
        int g = g(p3Var, bArr, i2, i3, h1Var);
        zzfx.add(h1Var.f9409c);
        while (g < i3) {
            int i4 = i(bArr, g, h1Var);
            if (i != h1Var.f9407a) {
                break;
            }
            g = g(p3Var, bArr, i4, i3, h1Var);
            zzfx.add(h1Var.f9409c);
        }
        return g;
    }

    static int f(p3 p3Var, byte[] bArr, int i, int i2, int i3, h1 h1Var) throws IOException {
        c3 c3Var = (c3) p3Var;
        Object a2 = c3Var.a();
        int p = c3Var.p(a2, bArr, i, i2, i3, h1Var);
        c3Var.f(a2);
        h1Var.f9409c = a2;
        return p;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int g(com.google.android.gms.internal.measurement.p3 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.h1 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = d(r8, r7, r0, r10)
            int r8 = r10.f9407a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.j(r1, r2, r3, r4, r5)
            r6.f(r9)
            r10.f9409c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzfw r6 = com.google.android.gms.internal.measurement.zzfw.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i1.g(com.google.android.gms.internal.measurement.p3, byte[], int, int, com.google.android.gms.internal.measurement.h1):int");
    }

    static int h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i, h1 h1Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return d(b2, bArr, i2, h1Var);
        }
        h1Var.f9407a = b2;
        return i2;
    }

    static int j(byte[] bArr, int i, zzfx<?> zzfx, h1 h1Var) throws IOException {
        k2 k2Var = (k2) zzfx;
        int i2 = i(bArr, i, h1Var);
        int i3 = h1Var.f9407a + i2;
        while (i2 < i3) {
            i2 = i(bArr, i2, h1Var);
            k2Var.j(h1Var.f9407a);
        }
        if (i2 == i3) {
            return i2;
        }
        throw zzfw.a();
    }

    static int k(byte[] bArr, int i, h1 h1Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            h1Var.f9408b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b2 = b3;
            i3 = i6;
        }
        h1Var.f9408b = j2;
        return i3;
    }

    static long l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double m(byte[] bArr, int i) {
        return Double.longBitsToDouble(l(bArr, i));
    }

    static int n(byte[] bArr, int i, h1 h1Var) throws zzfw {
        int i2 = i(bArr, i, h1Var);
        int i3 = h1Var.f9407a;
        if (i3 < 0) {
            throw zzfw.b();
        } else if (i3 == 0) {
            h1Var.f9409c = "";
            return i2;
        } else {
            h1Var.f9409c = new String(bArr, i2, i3, zzfr.f9640a);
            return i2 + i3;
        }
    }

    static float o(byte[] bArr, int i) {
        return Float.intBitsToFloat(h(bArr, i));
    }

    static int p(byte[] bArr, int i, h1 h1Var) throws zzfw {
        int i2 = i(bArr, i, h1Var);
        int i3 = h1Var.f9407a;
        if (i3 < 0) {
            throw zzfw.b();
        } else if (i3 == 0) {
            h1Var.f9409c = "";
            return i2;
        } else {
            h1Var.f9409c = m4.k(bArr, i2, i3);
            return i2 + i3;
        }
    }

    static int q(byte[] bArr, int i, h1 h1Var) throws zzfw {
        int i2 = i(bArr, i, h1Var);
        int i3 = h1Var.f9407a;
        if (i3 < 0) {
            throw zzfw.b();
        } else if (i3 > bArr.length - i2) {
            throw zzfw.a();
        } else if (i3 == 0) {
            h1Var.f9409c = zzeg.f9608c;
            return i2;
        } else {
            h1Var.f9409c = zzeg.q(bArr, i2, i3);
            return i2 + i3;
        }
    }
}
