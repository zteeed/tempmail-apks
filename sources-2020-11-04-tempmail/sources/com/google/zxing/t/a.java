package com.google.zxing.t;

import java.util.Arrays;

/* compiled from: BitArray */
public final class a implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private int[] f12317b;

    /* renamed from: c  reason: collision with root package name */
    private int f12318c;

    public a() {
        this.f12318c = 0;
        this.f12317b = new int[1];
    }

    private void g(int i) {
        if (i > (this.f12317b.length << 5)) {
            int[] r = r(i);
            int[] iArr = this.f12317b;
            System.arraycopy(iArr, 0, r, 0, iArr.length);
            this.f12317b = r;
        }
    }

    private static int[] r(int i) {
        return new int[((i + 31) / 32)];
    }

    public void b(boolean z) {
        g(this.f12318c + 1);
        if (z) {
            int[] iArr = this.f12317b;
            int i = this.f12318c;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f12318c++;
    }

    public void c(a aVar) {
        int i = aVar.f12318c;
        g(this.f12318c + i);
        for (int i2 = 0; i2 < i; i2++) {
            b(aVar.i(i2));
        }
    }

    public void d(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        g(this.f12318c + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            b(z);
            i2--;
        }
    }

    public void e() {
        int length = this.f12317b.length;
        for (int i = 0; i < length; i++) {
            this.f12317b[i] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f12318c != aVar.f12318c || !Arrays.equals(this.f12317b, aVar.f12317b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public a clone() {
        return new a((int[]) this.f12317b.clone(), this.f12318c);
    }

    public int hashCode() {
        return (this.f12318c * 31) + Arrays.hashCode(this.f12317b);
    }

    public boolean i(int i) {
        return ((1 << (i & 31)) & this.f12317b[i / 32]) != 0;
    }

    public int[] j() {
        return this.f12317b;
    }

    public int k(int i) {
        int i2 = this.f12318c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f12317b[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f12317b;
            if (i3 == iArr.length) {
                return this.f12318c;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f12318c;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int l(int i) {
        int i2 = this.f12318c;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f12317b[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f12317b;
            if (i3 == iArr.length) {
                return this.f12318c;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f12318c;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int n() {
        return this.f12318c;
    }

    public int o() {
        return (this.f12318c + 7) / 8;
    }

    public boolean p(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f12318c) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f12317b[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    public void s() {
        int[] iArr = new int[this.f12317b.length];
        int i = (this.f12318c - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f12317b[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f12318c;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f12317b = iArr;
    }

    public void t(int i) {
        int[] iArr = this.f12317b;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public String toString() {
        int i = this.f12318c;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f12318c; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(i(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public void w(int i, int i2) {
        this.f12317b[i / 32] = i2;
    }

    public void x(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (i(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public void y(a aVar) {
        if (this.f12318c == aVar.f12318c) {
            int i = 0;
            while (true) {
                int[] iArr = this.f12317b;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f12317b[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public a(int i) {
        this.f12318c = i;
        this.f12317b = r(i);
    }

    a(int[] iArr, int i) {
        this.f12317b = iArr;
        this.f12318c = i;
    }
}
