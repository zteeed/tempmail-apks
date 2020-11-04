package com.google.zxing.w.c0;

import com.google.zxing.NotFoundException;
import com.google.zxing.w.r;

/* compiled from: AbstractRSSReader */
public abstract class a extends r {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f11884a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final int[] f11885b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f11886c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f11887d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f11888e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f11889f;

    protected a() {
        int[] iArr = new int[8];
        this.f11885b = iArr;
        this.f11886c = new float[4];
        this.f11887d = new float[4];
        this.f11888e = new int[(iArr.length / 2)];
        this.f11889f = new int[(iArr.length / 2)];
    }

    protected static void i(int[] iArr, float[] fArr) {
        int i = 0;
        float f2 = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f2) {
                f2 = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    protected static void p(int[] iArr, float[] fArr) {
        int i = 0;
        float f2 = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f2) {
                f2 = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    protected static boolean q(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f2 = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f2 >= 0.7916667f && f2 <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static int r(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (r.f(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.a();
    }

    /* access modifiers changed from: protected */
    public final int[] j() {
        return this.f11885b;
    }

    /* access modifiers changed from: protected */
    public final int[] k() {
        return this.f11884a;
    }

    /* access modifiers changed from: protected */
    public final int[] l() {
        return this.f11889f;
    }

    /* access modifiers changed from: protected */
    public final float[] m() {
        return this.f11887d;
    }

    /* access modifiers changed from: protected */
    public final int[] n() {
        return this.f11888e;
    }

    /* access modifiers changed from: protected */
    public final float[] o() {
        return this.f11886c;
    }
}
