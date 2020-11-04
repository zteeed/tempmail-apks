package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class o50 {
    static int a(int i, byte[] bArr, int i2, int i3, n50 n50) throws zzegl {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return j(bArr, i2, n50);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return h(bArr, i2, n50) + n50.f4449a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = h(bArr, i2, n50);
                    i6 = n50.f4449a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, n50);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzegl.h();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzegl.d();
            }
        } else {
            throw zzegl.d();
        }
    }

    static int b(int i, byte[] bArr, int i2, int i3, zzegm<?> zzegm, n50 n50) {
        r60 r60 = (r60) zzegm;
        int h = h(bArr, i2, n50);
        r60.L(n50.f4449a);
        while (h < i3) {
            int h2 = h(bArr, h, n50);
            if (i != n50.f4449a) {
                break;
            }
            h = h(bArr, h2, n50);
            r60.L(n50.f4449a);
        }
        return h;
    }

    static int c(int i, byte[] bArr, int i2, int i3, zzejc zzejc, n50 n50) throws zzegl {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int j = j(bArr, i2, n50);
                zzejc.k(i, Long.valueOf(n50.f4450b));
                return j;
            } else if (i4 == 1) {
                zzejc.k(i, Long.valueOf(o(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int h = h(bArr, i2, n50);
                int i5 = n50.f4449a;
                if (i5 < 0) {
                    throw zzegl.b();
                } else if (i5 <= bArr.length - h) {
                    if (i5 == 0) {
                        zzejc.k(i, zzeer.f8533c);
                    } else {
                        zzejc.k(i, zzeer.P(bArr, h, i5));
                    }
                    return h + i5;
                } else {
                    throw zzegl.a();
                }
            } else if (i4 == 3) {
                zzejc i6 = zzejc.i();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int h2 = h(bArr, i2, n50);
                    int i9 = n50.f4449a;
                    i8 = i9;
                    if (i9 == i7) {
                        i2 = h2;
                        break;
                    }
                    int c2 = c(i8, bArr, h2, i3, i6, n50);
                    i8 = i9;
                    i2 = c2;
                }
                if (i2 > i3 || i8 != i7) {
                    throw zzegl.h();
                }
                zzejc.k(i, i6);
                return i2;
            } else if (i4 == 5) {
                zzejc.k(i, Integer.valueOf(n(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzegl.d();
            }
        } else {
            throw zzegl.d();
        }
    }

    static int d(int i, byte[] bArr, int i2, n50 n50) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            n50.f4449a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            n50.f4449a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            n50.f4449a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            n50.f4449a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                n50.f4449a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int e(z70<?> z70, int i, byte[] bArr, int i2, int i3, zzegm<?> zzegm, n50 n50) throws IOException {
        int g = g(z70, bArr, i2, i3, n50);
        zzegm.add(n50.f4451c);
        while (g < i3) {
            int h = h(bArr, g, n50);
            if (i != n50.f4449a) {
                break;
            }
            g = g(z70, bArr, h, i3, n50);
            zzegm.add(n50.f4451c);
        }
        return g;
    }

    static int f(z70 z70, byte[] bArr, int i, int i2, int i3, n50 n50) throws IOException {
        j70 j70 = (j70) z70;
        Object g = j70.g();
        int o = j70.o(g, bArr, i, i2, i3, n50);
        j70.b(g);
        n50.f4451c = g;
        return o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int g(com.google.android.gms.internal.ads.z70 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.n50 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = d(r8, r7, r0, r10)
            int r8 = r10.f4449a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.g()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.e(r1, r2, r3, r4, r5)
            r6.b(r9)
            r10.f4451c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.zzegl r6 = com.google.android.gms.internal.ads.zzegl.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o50.g(com.google.android.gms.internal.ads.z70, byte[], int, int, com.google.android.gms.internal.ads.n50):int");
    }

    static int h(byte[] bArr, int i, n50 n50) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return d(b2, bArr, i2, n50);
        }
        n50.f4449a = b2;
        return i2;
    }

    static int i(byte[] bArr, int i, zzegm<?> zzegm, n50 n50) throws IOException {
        r60 r60 = (r60) zzegm;
        int h = h(bArr, i, n50);
        int i2 = n50.f4449a + h;
        while (h < i2) {
            h = h(bArr, h, n50);
            r60.L(n50.f4449a);
        }
        if (h == i2) {
            return h;
        }
        throw zzegl.a();
    }

    static int j(byte[] bArr, int i, n50 n50) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            n50.f4450b = j;
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
        n50.f4450b = j2;
        return i3;
    }

    static int k(byte[] bArr, int i, n50 n50) throws zzegl {
        int h = h(bArr, i, n50);
        int i2 = n50.f4449a;
        if (i2 < 0) {
            throw zzegl.b();
        } else if (i2 == 0) {
            n50.f4451c = "";
            return h;
        } else {
            n50.f4451c = new String(bArr, h, i2, zzegd.f8575a);
            return h + i2;
        }
    }

    static int l(byte[] bArr, int i, n50 n50) throws zzegl {
        int h = h(bArr, i, n50);
        int i2 = n50.f4449a;
        if (i2 < 0) {
            throw zzegl.b();
        } else if (i2 == 0) {
            n50.f4451c = "";
            return h;
        } else {
            n50.f4451c = y80.l(bArr, h, i2);
            return h + i2;
        }
    }

    static int m(byte[] bArr, int i, n50 n50) throws zzegl {
        int h = h(bArr, i, n50);
        int i2 = n50.f4449a;
        if (i2 < 0) {
            throw zzegl.b();
        } else if (i2 > bArr.length - h) {
            throw zzegl.a();
        } else if (i2 == 0) {
            n50.f4451c = zzeer.f8533c;
            return h;
        } else {
            n50.f4451c = zzeer.P(bArr, h, i2);
            return h + i2;
        }
    }

    static int n(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long o(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double p(byte[] bArr, int i) {
        return Double.longBitsToDouble(o(bArr, i));
    }

    static float q(byte[] bArr, int i) {
        return Float.intBitsToFloat(n(bArr, i));
    }
}
