package com.google.zxing.y.c;

/* compiled from: FormatInformation */
final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final int[][] f12075c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a  reason: collision with root package name */
    private final f f12076a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f12077b;

    private g(int i) {
        this.f12076a = f.f((i >> 3) & 3);
        this.f12077b = (byte) (i & 7);
    }

    static g a(int i, int i2) {
        g b2 = b(i, i2);
        if (b2 != null) {
            return b2;
        }
        return b(i ^ 21522, i2 ^ 21522);
    }

    private static g b(int i, int i2) {
        int e2;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : f12075c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new g(iArr[1]);
            }
            int e3 = e(i, i5);
            if (e3 < i3) {
                i4 = iArr[1];
                i3 = e3;
            }
            if (i != i2 && (e2 = e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
        }
        if (i3 <= 3) {
            return new g(i4);
        }
        return null;
    }

    static int e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* access modifiers changed from: package-private */
    public byte c() {
        return this.f12077b;
    }

    /* access modifiers changed from: package-private */
    public f d() {
        return this.f12076a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f12076a == gVar.f12076a && this.f12077b == gVar.f12077b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f12076a.ordinal() << 3) | this.f12077b;
    }
}
