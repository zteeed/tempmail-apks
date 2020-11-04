package okhttp3.internal.http2;

import java.util.Arrays;

/* compiled from: Settings */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private int f14988a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f14989b = new int[10];

    /* access modifiers changed from: package-private */
    public void a() {
        this.f14988a = 0;
        Arrays.fill(this.f14989b, 0);
    }

    /* access modifiers changed from: package-private */
    public int b(int i) {
        return this.f14989b[i];
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if ((this.f14988a & 2) != 0) {
            return this.f14989b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        if ((this.f14988a & 128) != 0) {
            return this.f14989b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public int e(int i) {
        return (this.f14988a & 16) != 0 ? this.f14989b[4] : i;
    }

    /* access modifiers changed from: package-private */
    public int f(int i) {
        return (this.f14988a & 32) != 0 ? this.f14989b[5] : i;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i) {
        return ((1 << i) & this.f14988a) != 0;
    }

    /* access modifiers changed from: package-private */
    public void h(l lVar) {
        for (int i = 0; i < 10; i++) {
            if (lVar.g(i)) {
                i(i, lVar.b(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public l i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f14989b;
            if (i < iArr.length) {
                this.f14988a = (1 << i) | this.f14988a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Integer.bitCount(this.f14988a);
    }
}
