package com.google.protobuf;

/* compiled from: Utf8 */
final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final a f12179a = (c.c() ? new c() : new b());

    /* compiled from: Utf8 */
    static abstract class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public final boolean a(byte[] bArr, int i, int i2) {
            return b(0, bArr, i, i2) == 0;
        }

        /* access modifiers changed from: package-private */
        public abstract int b(int i, byte[] bArr, int i2, int i3);
    }

    /* compiled from: Utf8 */
    static final class b extends a {
        b() {
        }

        private static int c(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return d(bArr, i, i2);
        }

        private static int d(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b2 < -16) {
                        if (i3 >= i2 - 1) {
                            return v.h(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return v.h(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        byte b4 = bArr[i3];
                        if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
            if (r8[r9] > -65) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0082
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001c
                r7 = -62
                if (r0 < r7) goto L_0x001b
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
                goto L_0x001b
            L_0x0018:
                r9 = r7
                goto L_0x0082
            L_0x001b:
                return r2
            L_0x001c:
                r4 = -16
                if (r0 >= r4) goto L_0x0049
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0034
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r7 < r10) goto L_0x0031
                int r7 = com.google.protobuf.v.f(r0, r9)
                return r7
            L_0x0031:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0034:
                if (r7 > r3) goto L_0x0048
                r4 = -96
                if (r0 != r1) goto L_0x003c
                if (r7 < r4) goto L_0x0048
            L_0x003c:
                r1 = -19
                if (r0 != r1) goto L_0x0042
                if (r7 >= r4) goto L_0x0048
            L_0x0042:
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0048:
                return r2
            L_0x0049:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L_0x005d
                int r7 = r9 + 1
                byte r1 = r8[r9]
                if (r7 < r10) goto L_0x005b
                int r7 = com.google.protobuf.v.f(r0, r1)
                return r7
            L_0x005b:
                r9 = r7
                goto L_0x0060
            L_0x005d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L_0x0060:
                if (r4 != 0) goto L_0x006e
                int r7 = r9 + 1
                byte r4 = r8[r9]
                if (r7 < r10) goto L_0x006d
                int r7 = com.google.protobuf.v.g(r0, r1, r4)
                return r7
            L_0x006d:
                r9 = r7
            L_0x006e:
                if (r1 > r3) goto L_0x0081
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L_0x0081
                if (r4 > r3) goto L_0x0081
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0081:
                return r2
            L_0x0082:
                int r7 = c(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v.b.b(int, byte[], int, int):int");
        }
    }

    /* compiled from: Utf8 */
    static final class c extends a {
        c() {
        }

        static boolean c() {
            return u.h() && u.i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static int d(byte[] r8, long r9, int r11) {
            /*
                int r0 = e(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L_0x0007:
                r0 = 0
                r1 = 0
            L_0x0009:
                r2 = 1
                if (r11 <= 0) goto L_0x001a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.u.e(r8, r9)
                if (r1 < 0) goto L_0x0019
                int r11 = r11 + -1
                r9 = r4
                goto L_0x0009
            L_0x0019:
                r9 = r4
            L_0x001a:
                if (r11 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r11 = r11 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r11 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r11 = r11 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.u.e(r8, r9)
                if (r9 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r9 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r11 >= r6) goto L_0x0046
                int r8 = f(r8, r1, r9, r11)
                return r8
            L_0x0046:
                int r11 = r11 + -2
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.u.e(r8, r9)
                if (r9 > r4) goto L_0x0063
                r10 = -96
                if (r1 != r0) goto L_0x0056
                if (r9 < r10) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r9 >= r10) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r9 = com.google.protobuf.u.e(r8, r6)
                if (r9 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r11 >= r0) goto L_0x006c
                int r8 = f(r8, r1, r9, r11)
                return r8
            L_0x006c:
                int r11 = r11 + -3
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.u.e(r8, r9)
                if (r9 > r4) goto L_0x008e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L_0x008e
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.u.e(r8, r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.u.e(r8, r9)
                if (r9 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v.c.d(byte[], long, int):int");
        }

        private static int e(byte[] bArr, long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (u.e(bArr, j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (u.f(bArr, j) & -9187201950435737472L) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        private static int f(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return v.e(i);
            }
            if (i2 == 1) {
                return v.f(i, u.e(bArr, j));
            }
            if (i2 == 2) {
                return v.g(i, u.e(bArr, j), u.e(bArr, j + 1));
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
            if (com.google.protobuf.u.e(r13, r2) > -65) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
            if (com.google.protobuf.u.e(r13, r2) > -65) goto L_0x00aa;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = r14 | r15
                int r1 = r13.length
                int r1 = r1 - r15
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00b2
                long r2 = com.google.protobuf.u.d()
                long r4 = (long) r14
                long r2 = r2 + r4
                long r4 = com.google.protobuf.u.d()
                long r14 = (long) r15
                long r4 = r4 + r14
                if (r12 == 0) goto L_0x00ab
                int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r14 < 0) goto L_0x001b
                return r12
            L_0x001b:
                byte r14 = (byte) r12
                r15 = -32
                r0 = -1
                r6 = -65
                r7 = 1
                if (r14 >= r15) goto L_0x0035
                r12 = -62
                if (r14 < r12) goto L_0x0034
                long r7 = r7 + r2
                byte r12 = com.google.protobuf.u.e(r13, r2)
                if (r12 <= r6) goto L_0x0031
                goto L_0x0034
            L_0x0031:
                r2 = r7
                goto L_0x00ab
            L_0x0034:
                return r0
            L_0x0035:
                r9 = -16
                if (r14 >= r9) goto L_0x0069
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x004f
                long r9 = r2 + r7
                byte r12 = com.google.protobuf.u.e(r13, r2)
                int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r1 < 0) goto L_0x004e
                int r12 = com.google.protobuf.v.f(r14, r12)
                return r12
            L_0x004e:
                r2 = r9
            L_0x004f:
                if (r12 > r6) goto L_0x0068
                r1 = -96
                if (r14 != r15) goto L_0x0057
                if (r12 < r1) goto L_0x0068
            L_0x0057:
                r15 = -19
                if (r14 != r15) goto L_0x005d
                if (r12 >= r1) goto L_0x0068
            L_0x005d:
                long r14 = r2 + r7
                byte r12 = com.google.protobuf.u.e(r13, r2)
                if (r12 <= r6) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r2 = r14
                goto L_0x00ab
            L_0x0068:
                return r0
            L_0x0069:
                int r15 = r12 >> 8
                int r15 = ~r15
                byte r15 = (byte) r15
                if (r15 != 0) goto L_0x0080
                long r9 = r2 + r7
                byte r15 = com.google.protobuf.u.e(r13, r2)
                int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r12 < 0) goto L_0x007e
                int r12 = com.google.protobuf.v.f(r14, r15)
                return r12
            L_0x007e:
                r2 = r9
                goto L_0x0083
            L_0x0080:
                int r12 = r12 >> 16
                byte r1 = (byte) r12
            L_0x0083:
                if (r1 != 0) goto L_0x0095
                long r9 = r2 + r7
                byte r1 = com.google.protobuf.u.e(r13, r2)
                int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r12 < 0) goto L_0x0094
                int r12 = com.google.protobuf.v.g(r14, r15, r1)
                return r12
            L_0x0094:
                r2 = r9
            L_0x0095:
                if (r15 > r6) goto L_0x00aa
                int r12 = r14 << 28
                int r15 = r15 + 112
                int r12 = r12 + r15
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00aa
                if (r1 > r6) goto L_0x00aa
                long r14 = r2 + r7
                byte r12 = com.google.protobuf.u.e(r13, r2)
                if (r12 <= r6) goto L_0x0066
            L_0x00aa:
                return r0
            L_0x00ab:
                long r4 = r4 - r2
                int r12 = (int) r4
                int r12 = d(r13, r2, r12)
                return r12
            L_0x00b2:
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r1] = r13
                r13 = 1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r13] = r14
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                r0[r13] = r14
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r13 = java.lang.String.format(r13, r0)
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v.c.b(int, byte[], int, int):int");
        }
    }

    /* access modifiers changed from: private */
    public static int e(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int f(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    public static int g(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* access modifiers changed from: private */
    public static int h(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return e(b2);
        }
        if (i3 == 1) {
            return f(b2, bArr[i]);
        }
        if (i3 == 2) {
            return g(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean i(byte[] bArr, int i, int i2) {
        return f12179a.a(bArr, i, i2);
    }
}
