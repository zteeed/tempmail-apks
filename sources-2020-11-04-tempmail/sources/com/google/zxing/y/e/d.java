package com.google.zxing.y.e;

/* compiled from: MaskUtil */
final class d {
    static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(b bVar, boolean z) {
        int d2 = z ? bVar.d() : bVar.e();
        int e2 = z ? bVar.e() : bVar.d();
        byte[][] c2 = bVar.c();
        int i = 0;
        for (int i2 = 0; i2 < d2; i2++) {
            byte b2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < e2; i4++) {
                byte b3 = z ? c2[i2][i4] : c2[i4][i2];
                if (b3 == b2) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    b2 = b3;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }

    static int c(b bVar) {
        byte[][] c2 = bVar.c();
        int e2 = bVar.e();
        int d2 = bVar.d();
        int i = 0;
        for (int i2 = 0; i2 < d2 - 1; i2++) {
            byte[] bArr = c2[i2];
            int i3 = 0;
            while (i3 < e2 - 1) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                if (b2 == bArr[i4]) {
                    int i5 = i2 + 1;
                    if (b2 == c2[i5][i3] && b2 == c2[i5][i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    static int d(b bVar) {
        byte[][] c2 = bVar.c();
        int e2 = bVar.e();
        int d2 = bVar.d();
        int i = 0;
        for (int i2 = 0; i2 < d2; i2++) {
            for (int i3 = 0; i3 < e2; i3++) {
                byte[] bArr = c2[i2];
                int i4 = i3 + 6;
                if (i4 < e2 && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (g(bArr, i3 - 4, i3) || g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < d2 && c2[i2][i3] == 1 && c2[i2 + 1][i3] == 0 && c2[i2 + 2][i3] == 1 && c2[i2 + 3][i3] == 1 && c2[i2 + 4][i3] == 1 && c2[i2 + 5][i3] == 0 && c2[i5][i3] == 1 && (h(c2, i3, i2 - 4, i2) || h(c2, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    static int e(b bVar) {
        byte[][] c2 = bVar.c();
        int e2 = bVar.e();
        int d2 = bVar.d();
        int i = 0;
        for (int i2 = 0; i2 < d2; i2++) {
            byte[] bArr = c2[i2];
            for (int i3 = 0; i3 < e2; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int d3 = bVar.d() * bVar.e();
        return ((Math.abs((i << 1) - d3) * 10) / d3) * 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r1 != 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r1 = r1 & 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L_0x003a;
                case 1: goto L_0x003b;
                case 2: goto L_0x0037;
                case 3: goto L_0x0033;
                case 4: goto L_0x002e;
                case 5: goto L_0x0026;
                case 6: goto L_0x001d;
                case 7: goto L_0x0014;
                default: goto L_0x0004;
            }
        L_0x0004:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0014:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L_0x0024
        L_0x001d:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L_0x0024:
            r1 = r1 & r0
            goto L_0x003d
        L_0x0026:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x003d
        L_0x002e:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L_0x003a
        L_0x0033:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x003d
        L_0x0037:
            int r1 = r2 % 3
            goto L_0x003d
        L_0x003a:
            int r3 = r3 + r2
        L_0x003b:
            r1 = r3 & 1
        L_0x003d:
            if (r1 != 0) goto L_0x0040
            return r0
        L_0x0040:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.y.e.d.f(int, int, int):boolean");
    }

    private static boolean g(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean h(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
