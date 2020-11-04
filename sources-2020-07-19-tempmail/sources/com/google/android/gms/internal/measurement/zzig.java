package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzig {

    /* renamed from: f  reason: collision with root package name */
    private static final zzig f9657f = new zzig(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f9658a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f9659b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f9660c;

    /* renamed from: d  reason: collision with root package name */
    private int f9661d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9662e;

    private zzig() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzig a() {
        return f9657f;
    }

    static zzig b(zzig zzig, zzig zzig2) {
        int i = zzig.f9658a + zzig2.f9658a;
        int[] copyOf = Arrays.copyOf(zzig.f9659b, i);
        System.arraycopy(zzig2.f9659b, 0, copyOf, zzig.f9658a, zzig2.f9658a);
        Object[] copyOf2 = Arrays.copyOf(zzig.f9660c, i);
        System.arraycopy(zzig2.f9660c, 0, copyOf2, zzig.f9658a, zzig2.f9658a);
        return new zzig(i, copyOf, copyOf2, true);
    }

    private static void d(int i, Object obj, w4 w4Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            w4Var.G(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            w4Var.L(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            w4Var.C(i2, (zzeg) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                w4Var.K(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzfw.f());
        } else if (w4Var.a() == zzfo.zzf.k) {
            w4Var.f(i2);
            ((zzig) obj).h(w4Var);
            w4Var.g(i2);
        } else {
            w4Var.g(i2);
            ((zzig) obj).h(w4Var);
            w4Var.f(i2);
        }
    }

    static zzig g() {
        return new zzig();
    }

    /* access modifiers changed from: package-private */
    public final void c(int i, Object obj) {
        if (this.f9662e) {
            int i2 = this.f9658a;
            if (i2 == this.f9659b.length) {
                int i3 = this.f9658a + (i2 < 4 ? 8 : i2 >> 1);
                this.f9659b = Arrays.copyOf(this.f9659b, i3);
                this.f9660c = Arrays.copyOf(this.f9660c, i3);
            }
            int[] iArr = this.f9659b;
            int i4 = this.f9658a;
            iArr[i4] = i;
            this.f9660c[i4] = obj;
            this.f9658a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void e(w4 w4Var) throws IOException {
        if (w4Var.a() == zzfo.zzf.l) {
            for (int i = this.f9658a - 1; i >= 0; i--) {
                w4Var.i(this.f9659b[i] >>> 3, this.f9660c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f9658a; i2++) {
            w4Var.i(this.f9659b[i2] >>> 3, this.f9660c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzig)) {
            return false;
        }
        zzig zzig = (zzig) obj;
        int i = this.f9658a;
        if (i == zzig.f9658a) {
            int[] iArr = this.f9659b;
            int[] iArr2 = zzig.f9659b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f9660c;
                Object[] objArr2 = zzig.f9660c;
                int i3 = this.f9658a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f9658a; i2++) {
            d3.d(sb, i, String.valueOf(this.f9659b[i2] >>> 3), this.f9660c[i2]);
        }
    }

    public final void h(w4 w4Var) throws IOException {
        if (this.f9658a != 0) {
            if (w4Var.a() == zzfo.zzf.k) {
                for (int i = 0; i < this.f9658a; i++) {
                    d(this.f9659b[i], this.f9660c[i], w4Var);
                }
                return;
            }
            for (int i2 = this.f9658a - 1; i2 >= 0; i2--) {
                d(this.f9659b[i2], this.f9660c[i2], w4Var);
            }
        }
    }

    public final int hashCode() {
        int i = this.f9658a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f9659b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f9660c;
        int i7 = this.f9658a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void i() {
        this.f9662e = false;
    }

    public final int j() {
        int i = this.f9661d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9658a; i3++) {
            i2 += zzev.d0(this.f9659b[i3] >>> 3, (zzeg) this.f9660c[i3]);
        }
        this.f9661d = i2;
        return i2;
    }

    public final int k() {
        int i;
        int i2 = this.f9661d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9658a; i4++) {
            int i5 = this.f9659b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzev.i0(i6, ((Long) this.f9660c[i4]).longValue());
            } else if (i7 == 1) {
                i = zzev.r0(i6, ((Long) this.f9660c[i4]).longValue());
            } else if (i7 == 2) {
                i = zzev.U(i6, (zzeg) this.f9660c[i4]);
            } else if (i7 == 3) {
                i = (zzev.h0(i6) << 1) + ((zzig) this.f9660c[i4]).k();
            } else if (i7 == 5) {
                i = zzev.y0(i6, ((Integer) this.f9660c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzfw.f());
            }
            i3 += i;
        }
        this.f9661d = i3;
        return i3;
    }

    private zzig(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9661d = -1;
        this.f9658a = i;
        this.f9659b = iArr;
        this.f9660c = objArr;
        this.f9662e = z;
    }
}