package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzejc {

    /* renamed from: f  reason: collision with root package name */
    private static final zzejc f8774f = new zzejc(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f8775a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f8776b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f8777c;

    /* renamed from: d  reason: collision with root package name */
    private int f8778d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8779e;

    private zzejc() {
        this(0, new int[8], new Object[8], true);
    }

    static zzejc a(zzejc zzejc, zzejc zzejc2) {
        int i = zzejc.f8775a + zzejc2.f8775a;
        int[] copyOf = Arrays.copyOf(zzejc.f8776b, i);
        System.arraycopy(zzejc2.f8776b, 0, copyOf, zzejc.f8775a, zzejc2.f8775a);
        Object[] copyOf2 = Arrays.copyOf(zzejc.f8777c, i);
        System.arraycopy(zzejc2.f8777c, 0, copyOf2, zzejc.f8775a, zzejc2.f8775a);
        return new zzejc(i, copyOf, copyOf2, true);
    }

    private static void d(int i, Object obj, j90 j90) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            j90.G(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            j90.A(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            j90.Q(i2, (zzeer) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                j90.O(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzegl.f());
        } else if (j90.C() == zzegb.zze.k) {
            j90.R(i2);
            ((zzejc) obj).e(j90);
            j90.U(i2);
        } else {
            j90.U(i2);
            ((zzejc) obj).e(j90);
            j90.R(i2);
        }
    }

    public static zzejc h() {
        return f8774f;
    }

    static zzejc i() {
        return new zzejc();
    }

    /* access modifiers changed from: package-private */
    public final void b(j90 j90) throws IOException {
        if (j90.C() == zzegb.zze.l) {
            for (int i = this.f8775a - 1; i >= 0; i--) {
                j90.z(this.f8776b[i] >>> 3, this.f8777c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f8775a; i2++) {
            j90.z(this.f8776b[i2] >>> 3, this.f8777c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f8775a; i2++) {
            k70.c(sb, i, String.valueOf(this.f8776b[i2] >>> 3), this.f8777c[i2]);
        }
    }

    public final void e(j90 j90) throws IOException {
        if (this.f8775a != 0) {
            if (j90.C() == zzegb.zze.k) {
                for (int i = 0; i < this.f8775a; i++) {
                    d(this.f8776b[i], this.f8777c[i], j90);
                }
                return;
            }
            for (int i2 = this.f8775a - 1; i2 >= 0; i2--) {
                d(this.f8776b[i2], this.f8777c[i2], j90);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzejc)) {
            return false;
        }
        zzejc zzejc = (zzejc) obj;
        int i = this.f8775a;
        if (i == zzejc.f8775a) {
            int[] iArr = this.f8776b;
            int[] iArr2 = zzejc.f8776b;
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
                Object[] objArr = this.f8777c;
                Object[] objArr2 = zzejc.f8777c;
                int i3 = this.f8775a;
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

    public final void f() {
        this.f8779e = false;
    }

    public final int g() {
        int i;
        int i2 = this.f8778d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f8775a; i4++) {
            int i5 = this.f8776b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzefl.z0(i6, ((Long) this.f8777c[i4]).longValue());
            } else if (i7 == 1) {
                i = zzefl.C0(i6, ((Long) this.f8777c[i4]).longValue());
            } else if (i7 == 2) {
                i = zzefl.K(i6, (zzeer) this.f8777c[i4]);
            } else if (i7 == 3) {
                i = (zzefl.e0(i6) << 1) + ((zzejc) this.f8777c[i4]).g();
            } else if (i7 == 5) {
                i = zzefl.s(i6, ((Integer) this.f8777c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzegl.f());
            }
            i3 += i;
        }
        this.f8778d = i3;
        return i3;
    }

    public final int hashCode() {
        int i = this.f8775a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f8776b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f8777c;
        int i7 = this.f8775a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int j() {
        int i = this.f8778d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f8775a; i3++) {
            i2 += zzefl.M(this.f8776b[i3] >>> 3, (zzeer) this.f8777c[i3]);
        }
        this.f8778d = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final void k(int i, Object obj) {
        if (this.f8779e) {
            int i2 = this.f8775a;
            if (i2 == this.f8776b.length) {
                int i3 = this.f8775a + (i2 < 4 ? 8 : i2 >> 1);
                this.f8776b = Arrays.copyOf(this.f8776b, i3);
                this.f8777c = Arrays.copyOf(this.f8777c, i3);
            }
            int[] iArr = this.f8776b;
            int i4 = this.f8775a;
            iArr[i4] = i;
            this.f8777c[i4] = obj;
            this.f8775a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    private zzejc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f8778d = -1;
        this.f8775a = i;
        this.f8776b = iArr;
        this.f8777c = objArr;
        this.f8779e = z;
    }
}
