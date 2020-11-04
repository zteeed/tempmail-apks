package okhttp3.internal.http2;

import java.util.Arrays;

/* compiled from: Settings */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private int f14427a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f14428b = new int[10];

    /* access modifiers changed from: package-private */
    public void a() {
        this.f14427a = 0;
        Arrays.fill(this.f14428b, 0);
    }

    /* access modifiers changed from: package-private */
    public int b(int i) {
        return this.f14428b[i];
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if ((this.f14427a & 2) != 0) {
            return this.f14428b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        if ((this.f14427a & 128) != 0) {
            return this.f14428b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public int e(int i) {
        return (this.f14427a & 16) != 0 ? this.f14428b[4] : i;
    }

    /* access modifiers changed from: package-private */
    public int f(int i) {
        return (this.f14427a & 32) != 0 ? this.f14428b[5] : i;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i) {
        return ((1 << i) & this.f14427a) != 0;
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
            int[] iArr = this.f14428b;
            if (i < iArr.length) {
                this.f14427a = (1 << i) | this.f14427a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Integer.bitCount(this.f14427a);
    }
}
