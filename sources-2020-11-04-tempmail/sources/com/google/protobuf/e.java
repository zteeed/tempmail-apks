package com.google.protobuf;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: CodedInputStream */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12113a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12114b;

    /* renamed from: c  reason: collision with root package name */
    private int f12115c;

    /* renamed from: d  reason: collision with root package name */
    private int f12116d;

    /* renamed from: e  reason: collision with root package name */
    private int f12117e;

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f12118f;
    private int g;
    private boolean h = false;
    private int i;
    private int j = Integer.MAX_VALUE;
    private int k;
    private int l = 100;
    private int m = 67108864;
    private a n = null;

    /* compiled from: CodedInputStream */
    private interface a {
        void a();
    }

    private e(byte[] bArr, int i2, int i3, boolean z) {
        this.f12113a = bArr;
        this.f12115c = i3 + i2;
        this.f12117e = i2;
        this.i = -i2;
        this.f12118f = null;
        this.f12114b = z;
    }

    private void A() {
        int i2 = this.f12115c + this.f12116d;
        this.f12115c = i2;
        int i3 = this.i + i2;
        int i4 = this.j;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f12116d = i5;
            this.f12115c = i2 - i5;
            return;
        }
        this.f12116d = 0;
    }

    private void B(int i2) throws IOException {
        if (!I(i2)) {
            throw InvalidProtocolBufferException.j();
        }
    }

    private void F(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.i;
            int i4 = this.f12117e;
            int i5 = i3 + i4 + i2;
            int i6 = this.j;
            if (i5 <= i6) {
                int i7 = this.f12115c;
                int i8 = i7 - i4;
                this.f12117e = i7;
                B(1);
                while (true) {
                    int i9 = i2 - i8;
                    int i10 = this.f12115c;
                    if (i9 > i10) {
                        i8 += i10;
                        this.f12117e = i10;
                        B(1);
                    } else {
                        this.f12117e = i9;
                        return;
                    }
                }
            } else {
                E((i6 - i3) - i4);
                throw InvalidProtocolBufferException.j();
            }
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    private void G() throws IOException {
        int i2 = this.f12115c;
        int i3 = this.f12117e;
        if (i2 - i3 >= 10) {
            byte[] bArr = this.f12113a;
            int i4 = 0;
            while (i4 < 10) {
                int i5 = i3 + 1;
                if (bArr[i3] >= 0) {
                    this.f12117e = i5;
                    return;
                } else {
                    i4++;
                    i3 = i5;
                }
            }
        }
        H();
    }

    private void H() throws IOException {
        int i2 = 0;
        while (i2 < 10) {
            if (q() < 0) {
                i2++;
            } else {
                return;
            }
        }
        throw InvalidProtocolBufferException.e();
    }

    private boolean I(int i2) throws IOException {
        int i3 = this.f12117e;
        if (i3 + i2 <= this.f12115c) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        } else if (this.i + i3 + i2 > this.j) {
            return false;
        } else {
            a aVar = this.n;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f12118f != null) {
                int i4 = this.f12117e;
                if (i4 > 0) {
                    int i5 = this.f12115c;
                    if (i5 > i4) {
                        byte[] bArr = this.f12113a;
                        System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                    }
                    this.i += i4;
                    this.f12115c -= i4;
                    this.f12117e = 0;
                }
                InputStream inputStream = this.f12118f;
                byte[] bArr2 = this.f12113a;
                int i6 = this.f12115c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.f12113a.length) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.f12115c += read;
                    if ((this.i + i2) - this.m <= 0) {
                        A();
                        if (this.f12115c >= i2) {
                            return true;
                        }
                        return I(i2);
                    }
                    throw InvalidProtocolBufferException.i();
                }
            }
            return false;
        }
    }

    public static e c(InputStream inputStream) {
        return new e(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE);
    }

    public static e d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static e e(byte[] bArr, int i2, int i3) {
        return f(bArr, i2, i3, false);
    }

    static e f(byte[] bArr, int i2, int i3, boolean z) {
        e eVar = new e(bArr, i2, i3, z);
        try {
            eVar.h(i3);
            return eVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private byte[] r(int i2) throws IOException {
        if (i2 > 0) {
            int i3 = this.i;
            int i4 = this.f12117e;
            int i5 = i3 + i4 + i2;
            if (i5 <= this.m) {
                int i6 = this.j;
                if (i5 <= i6) {
                    InputStream inputStream = this.f12118f;
                    if (inputStream != null) {
                        int i7 = this.f12115c;
                        int i8 = i7 - i4;
                        this.i = i3 + i7;
                        this.f12117e = 0;
                        this.f12115c = 0;
                        int i9 = i2 - i8;
                        if (i9 < 4096 || i9 <= inputStream.available()) {
                            byte[] bArr = new byte[i2];
                            System.arraycopy(this.f12113a, i4, bArr, 0, i8);
                            while (i8 < i2) {
                                int read = this.f12118f.read(bArr, i8, i2 - i8);
                                if (read != -1) {
                                    this.i += read;
                                    i8 += read;
                                } else {
                                    throw InvalidProtocolBufferException.j();
                                }
                            }
                            return bArr;
                        }
                        ArrayList<byte[]> arrayList = new ArrayList<>();
                        while (i9 > 0) {
                            int min = Math.min(i9, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                            byte[] bArr2 = new byte[min];
                            int i10 = 0;
                            while (i10 < min) {
                                int read2 = this.f12118f.read(bArr2, i10, min - i10);
                                if (read2 != -1) {
                                    this.i += read2;
                                    i10 += read2;
                                } else {
                                    throw InvalidProtocolBufferException.j();
                                }
                            }
                            i9 -= min;
                            arrayList.add(bArr2);
                        }
                        byte[] bArr3 = new byte[i2];
                        System.arraycopy(this.f12113a, i4, bArr3, 0, i8);
                        for (byte[] bArr4 : arrayList) {
                            System.arraycopy(bArr4, 0, bArr3, i8, bArr4.length);
                            i8 += bArr4.length;
                        }
                        return bArr3;
                    }
                    throw InvalidProtocolBufferException.j();
                }
                E((i6 - i3) - i4);
                throw InvalidProtocolBufferException.j();
            }
            throw InvalidProtocolBufferException.i();
        } else if (i2 == 0) {
            return j.f12145b;
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    public boolean C(int i2) throws IOException {
        int b2 = w.b(i2);
        if (b2 == 0) {
            G();
            return true;
        } else if (b2 == 1) {
            E(8);
            return true;
        } else if (b2 == 2) {
            E(u());
            return true;
        } else if (b2 == 3) {
            D();
            a(w.c(w.a(i2), 4));
            return true;
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                E(4);
                return true;
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void D() throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.z()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.C(r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.D():void");
    }

    public void E(int i2) throws IOException {
        int i3 = this.f12115c;
        int i4 = this.f12117e;
        if (i2 > i3 - i4 || i2 < 0) {
            F(i2);
        } else {
            this.f12117e = i4 + i2;
        }
    }

    public void a(int i2) throws InvalidProtocolBufferException {
        if (this.g != i2) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public boolean b() throws IOException {
        return this.f12117e == this.f12115c && !I(1);
    }

    public void g(int i2) {
        this.j = i2;
        A();
    }

    public int h(int i2) throws InvalidProtocolBufferException {
        if (i2 >= 0) {
            int i3 = i2 + this.i + this.f12117e;
            int i4 = this.j;
            if (i3 <= i4) {
                this.j = i3;
                A();
                return i4;
            }
            throw InvalidProtocolBufferException.j();
        }
        throw InvalidProtocolBufferException.f();
    }

    public boolean i() throws IOException {
        return v() != 0;
    }

    public d j() throws IOException {
        d dVar;
        int u = u();
        int i2 = this.f12115c;
        int i3 = this.f12117e;
        if (u <= i2 - i3 && u > 0) {
            if (!this.f12114b || !this.h) {
                dVar = d.j(this.f12113a, this.f12117e, u);
            } else {
                dVar = d.C(this.f12113a, i3, u);
            }
            this.f12117e += u;
            return dVar;
        } else if (u == 0) {
            return d.f12105c;
        } else {
            return d.B(r(u));
        }
    }

    public int k() throws IOException {
        return u();
    }

    public int l() throws IOException {
        return s();
    }

    public long m() throws IOException {
        return t();
    }

    public int n() throws IOException {
        return u();
    }

    public long o() throws IOException {
        return v();
    }

    public <T extends m> T p(p<T> pVar, g gVar) throws IOException {
        int u = u();
        if (this.k < this.l) {
            int h2 = h(u);
            this.k++;
            T t = (m) pVar.b(this, gVar);
            a(0);
            this.k--;
            g(h2);
            return t;
        }
        throw InvalidProtocolBufferException.g();
    }

    public byte q() throws IOException {
        if (this.f12117e == this.f12115c) {
            B(1);
        }
        byte[] bArr = this.f12113a;
        int i2 = this.f12117e;
        this.f12117e = i2 + 1;
        return bArr[i2];
    }

    public int s() throws IOException {
        int i2 = this.f12117e;
        if (this.f12115c - i2 < 4) {
            B(4);
            i2 = this.f12117e;
        }
        byte[] bArr = this.f12113a;
        this.f12117e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public long t() throws IOException {
        int i2 = this.f12117e;
        if (this.f12115c - i2 < 8) {
            B(8);
            i2 = this.f12117e;
        }
        byte[] bArr = this.f12113a;
        this.f12117e = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r2[r3] < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int u() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f12117e
            int r1 = r5.f12115c
            if (r1 != r0) goto L_0x0007
            goto L_0x006a
        L_0x0007:
            byte[] r2 = r5.f12113a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f12117e = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0018
            goto L_0x006a
        L_0x0018:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0070
        L_0x0024:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r1 = r3
            goto L_0x0070
        L_0x0031:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0070
        L_0x003f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0070
        L_0x006a:
            long r0 = r5.w()
            int r1 = (int) r0
            return r1
        L_0x0070:
            r5.f12117e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.u():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long v() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f12117e
            int r1 = r11.f12115c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b6
        L_0x0008:
            byte[] r2 = r11.f12113a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r11.f12117e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b6
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0029
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0026:
            long r2 = (long) r0
            goto L_0x00bd
        L_0x0029:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x003a
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00bd
        L_0x003a:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0048
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0026
        L_0x0048:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x005b:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bd
        L_0x005f:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0071:
            long r2 = r3 ^ r5
            goto L_0x00bd
        L_0x0074:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0087
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x005b
        L_0x0087:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0071
        L_0x009a:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bb
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bc
        L_0x00b6:
            long r0 = r11.w()
            return r0
        L_0x00bb:
            r1 = r0
        L_0x00bc:
            r2 = r3
        L_0x00bd:
            r11.f12117e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.v():long");
    }

    /* access modifiers changed from: package-private */
    public long w() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte q = q();
            j2 |= ((long) (q & Byte.MAX_VALUE)) << i2;
            if ((q & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.e();
    }

    public String x() throws IOException {
        int u = u();
        if (u <= this.f12115c - this.f12117e && u > 0) {
            String str = new String(this.f12113a, this.f12117e, u, j.f12144a);
            this.f12117e += u;
            return str;
        } else if (u == 0) {
            return "";
        } else {
            if (u > this.f12115c) {
                return new String(r(u), j.f12144a);
            }
            B(u);
            String str2 = new String(this.f12113a, this.f12117e, u, j.f12144a);
            this.f12117e += u;
            return str2;
        }
    }

    public String y() throws IOException {
        byte[] bArr;
        int u = u();
        int i2 = this.f12117e;
        if (u <= this.f12115c - i2 && u > 0) {
            bArr = this.f12113a;
            this.f12117e = i2 + u;
        } else if (u == 0) {
            return "";
        } else {
            if (u <= this.f12115c) {
                B(u);
                bArr = this.f12113a;
                this.f12117e = u + 0;
            } else {
                bArr = r(u);
            }
            i2 = 0;
        }
        if (v.i(bArr, i2, i2 + u)) {
            return new String(bArr, i2, u, j.f12144a);
        }
        throw InvalidProtocolBufferException.c();
    }

    public int z() throws IOException {
        if (b()) {
            this.g = 0;
            return 0;
        }
        int u = u();
        this.g = u;
        if (w.a(u) != 0) {
            return this.g;
        }
        throw InvalidProtocolBufferException.b();
    }

    private e(InputStream inputStream, int i2) {
        this.f12113a = new byte[i2];
        this.f12117e = 0;
        this.i = 0;
        this.f12118f = inputStream;
        this.f12114b = false;
    }
}
