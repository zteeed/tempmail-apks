package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class j70<T> implements z70<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = v80.o();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f4287a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f4288b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4289c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4290d;

    /* renamed from: e  reason: collision with root package name */
    private final zzehl f4291e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4292f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final n70 m;
    private final v60 n;
    private final r80<?, ?> o;
    private final h60<?> p;
    private final f70 q;

    private j70(int[] iArr, Object[] objArr, int i2, int i3, zzehl zzehl, boolean z, boolean z2, int[] iArr2, int i4, int i5, n70 n70, v60 v60, r80<?, ?> r80, h60<?> h60, f70 f70) {
        this.f4287a = iArr;
        this.f4288b = objArr;
        this.f4289c = i2;
        this.f4290d = i3;
        this.g = zzehl instanceof zzegb;
        this.h = z;
        this.f4292f = h60 != null && h60.j(zzehl);
        this.i = false;
        this.j = iArr2;
        this.k = i4;
        this.l = i5;
        this.m = n70;
        this.n = v60;
        this.o = r80;
        this.p = h60;
        this.f4291e = zzehl;
        this.q = f70;
    }

    private final boolean A(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return K(t, i2);
        }
        return (i4 & i5) != 0;
    }

    private static boolean B(Object obj, int i2, z70 z70) {
        return z70.h(v80.G(obj, (long) (i2 & 1048575)));
    }

    private final int C(int i2, int i3) {
        if (i2 < this.f4289c || i2 > this.f4290d) {
            return -1;
        }
        return D(i2, i3);
    }

    private final int D(int i2, int i3) {
        int length = (this.f4287a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f4287a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static zzejc E(Object obj) {
        zzegb zzegb = (zzegb) obj;
        zzejc zzejc = zzegb.zzieg;
        if (zzejc != zzejc.h()) {
            return zzejc;
        }
        zzejc i2 = zzejc.i();
        zzegb.zzieg = i2;
        return i2;
    }

    private final void F(T t, int i2, int i3) {
        v80.k(t, (long) (T(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void G(T r17, com.google.android.gms.internal.ads.j90 r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f4292f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.h60<?> r3 = r0.p
            com.google.android.gms.internal.ads.l60 r3 = r3.g(r1)
            com.google.android.gms.internal.ads.e80<T, java.lang.Object> r5 = r3.f4450a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.d()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            int[] r5 = r0.f4287a
            int r5 = r5.length
            sun.misc.Unsafe r6 = s
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
        L_0x0031:
            if (r9 >= r5) goto L_0x046b
            int r12 = r0.S(r9)
            int[] r13 = r0.f4287a
            r14 = r13[r9]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.h
            r8 = 1
            if (r4 != 0) goto L_0x005c
            r4 = 17
            if (r15 > r4) goto L_0x005c
            int r4 = r9 + 2
            r4 = r13[r4]
            r13 = r4 & r7
            if (r13 == r10) goto L_0x0057
            long r10 = (long) r13
            int r11 = r6.getInt(r1, r10)
            r10 = r13
        L_0x0057:
            int r4 = r4 >>> 20
            int r4 = r8 << r4
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            if (r3 != 0) goto L_0x0464
            r12 = r12 & r7
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L_0x0455;
                case 1: goto L_0x0449;
                case 2: goto L_0x043d;
                case 3: goto L_0x0431;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040d;
                case 7: goto L_0x0401;
                case 8: goto L_0x03f5;
                case 9: goto L_0x03e4;
                case 10: goto L_0x03d5;
                case 11: goto L_0x03c8;
                case 12: goto L_0x03bb;
                case 13: goto L_0x03ae;
                case 14: goto L_0x03a1;
                case 15: goto L_0x0394;
                case 16: goto L_0x0387;
                case 17: goto L_0x0376;
                case 18: goto L_0x0366;
                case 19: goto L_0x0356;
                case 20: goto L_0x0346;
                case 21: goto L_0x0336;
                case 22: goto L_0x0326;
                case 23: goto L_0x0316;
                case 24: goto L_0x0306;
                case 25: goto L_0x02f6;
                case 26: goto L_0x02e7;
                case 27: goto L_0x02d4;
                case 28: goto L_0x02c5;
                case 29: goto L_0x02b5;
                case 30: goto L_0x02a5;
                case 31: goto L_0x0295;
                case 32: goto L_0x0285;
                case 33: goto L_0x0275;
                case 34: goto L_0x0265;
                case 35: goto L_0x0256;
                case 36: goto L_0x0247;
                case 37: goto L_0x0238;
                case 38: goto L_0x0229;
                case 39: goto L_0x021a;
                case 40: goto L_0x020b;
                case 41: goto L_0x01fc;
                case 42: goto L_0x01ed;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cf;
                case 45: goto L_0x01c0;
                case 46: goto L_0x01b1;
                case 47: goto L_0x01a2;
                case 48: goto L_0x0193;
                case 49: goto L_0x0180;
                case 50: goto L_0x0177;
                case 51: goto L_0x0168;
                case 52: goto L_0x0159;
                case 53: goto L_0x014a;
                case 54: goto L_0x013b;
                case 55: goto L_0x012c;
                case 56: goto L_0x011d;
                case 57: goto L_0x010e;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00f0;
                case 60: goto L_0x00dd;
                case 61: goto L_0x00cd;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a3;
                case 65: goto L_0x0095;
                case 66: goto L_0x0087;
                case 67: goto L_0x0079;
                case 68: goto L_0x0067;
                default: goto L_0x0064;
            }
        L_0x0064:
            r15 = 0
            goto L_0x0460
        L_0x0067:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.z70 r8 = r0.P(r9)
            r2.N(r14, r4, r8)
            goto L_0x0064
        L_0x0079:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = W(r1, r12)
            r2.M(r14, r12)
            goto L_0x0064
        L_0x0087:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = O(r1, r12)
            r2.W(r14, r4)
            goto L_0x0064
        L_0x0095:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = W(r1, r12)
            r2.J(r14, r12)
            goto L_0x0064
        L_0x00a3:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = O(r1, r12)
            r2.S(r14, r4)
            goto L_0x0064
        L_0x00b1:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = O(r1, r12)
            r2.V(r14, r4)
            goto L_0x0064
        L_0x00bf:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = O(r1, r12)
            r2.T(r14, r4)
            goto L_0x0064
        L_0x00cd:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.zzeer r4 = (com.google.android.gms.internal.ads.zzeer) r4
            r2.Q(r14, r4)
            goto L_0x0064
        L_0x00dd:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.z70 r8 = r0.P(r9)
            r2.P(r14, r4, r8)
            goto L_0x0064
        L_0x00f0:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r6.getObject(r1, r12)
            u(r14, r4, r2)
            goto L_0x0064
        L_0x00ff:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            boolean r4 = X(r1, r12)
            r2.L(r14, r4)
            goto L_0x0064
        L_0x010e:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = O(r1, r12)
            r2.O(r14, r4)
            goto L_0x0064
        L_0x011d:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = W(r1, r12)
            r2.A(r14, r12)
            goto L_0x0064
        L_0x012c:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            int r4 = O(r1, r12)
            r2.D(r14, r4)
            goto L_0x0064
        L_0x013b:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = W(r1, r12)
            r2.I(r14, r12)
            goto L_0x0064
        L_0x014a:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            long r12 = W(r1, r12)
            r2.G(r14, r12)
            goto L_0x0064
        L_0x0159:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            float r4 = N(r1, r12)
            r2.q(r14, r4)
            goto L_0x0064
        L_0x0168:
            boolean r4 = r0.z(r1, r14, r9)
            if (r4 == 0) goto L_0x0064
            double r12 = L(r1, r12)
            r2.B(r14, r12)
            goto L_0x0064
        L_0x0177:
            java.lang.Object r4 = r6.getObject(r1, r12)
            r0.w(r2, r14, r4, r9)
            goto L_0x0064
        L_0x0180:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.z70 r12 = r0.P(r9)
            com.google.android.gms.internal.ads.b80.t(r4, r8, r2, r12)
            goto L_0x0064
        L_0x0193:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.I(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01a2:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.P(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01b1:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.K(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01c0:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.R(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01cf:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.S(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01de:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.N(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01ed:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.T(r4, r12, r2, r8)
            goto L_0x0064
        L_0x01fc:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.Q(r4, r12, r2, r8)
            goto L_0x0064
        L_0x020b:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.J(r4, r12, r2, r8)
            goto L_0x0064
        L_0x021a:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.L(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0229:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.H(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0238:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.E(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0247:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.u(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0256:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r12 = r6.getObject(r1, r12)
            java.util.List r12 = (java.util.List) r12
            com.google.android.gms.internal.ads.b80.e(r4, r12, r2, r8)
            goto L_0x0064
        L_0x0265:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.ads.b80.I(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0275:
            r14 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.P(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0285:
            r14 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.K(r4, r8, r2, r14)
            goto L_0x0064
        L_0x0295:
            r14 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.R(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02a5:
            r14 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.S(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02b5:
            r14 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.N(r4, r8, r2, r14)
            goto L_0x0064
        L_0x02c5:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.s(r4, r8, r2)
            goto L_0x0064
        L_0x02d4:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.z70 r12 = r0.P(r9)
            com.google.android.gms.internal.ads.b80.d(r4, r8, r2, r12)
            goto L_0x0064
        L_0x02e7:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.c(r4, r8, r2)
            goto L_0x0064
        L_0x02f6:
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.ads.b80.T(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0306:
            r15 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.Q(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0316:
            r15 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.J(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0326:
            r15 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.L(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0336:
            r15 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.H(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0346:
            r15 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.E(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0356:
            r15 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.u(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0366:
            r15 = 0
            int[] r4 = r0.f4287a
            r4 = r4[r9]
            java.lang.Object r8 = r6.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.e(r4, r8, r2, r15)
            goto L_0x0460
        L_0x0376:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.z70 r8 = r0.P(r9)
            r2.N(r14, r4, r8)
            goto L_0x0460
        L_0x0387:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.M(r14, r12)
            goto L_0x0460
        L_0x0394:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.W(r14, r4)
            goto L_0x0460
        L_0x03a1:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.J(r14, r12)
            goto L_0x0460
        L_0x03ae:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.S(r14, r4)
            goto L_0x0460
        L_0x03bb:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.V(r14, r4)
            goto L_0x0460
        L_0x03c8:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.T(r14, r4)
            goto L_0x0460
        L_0x03d5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.zzeer r4 = (com.google.android.gms.internal.ads.zzeer) r4
            r2.Q(r14, r4)
            goto L_0x0460
        L_0x03e4:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            com.google.android.gms.internal.ads.z70 r8 = r0.P(r9)
            r2.P(r14, r4, r8)
            goto L_0x0460
        L_0x03f5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            java.lang.Object r4 = r6.getObject(r1, r12)
            u(r14, r4, r2)
            goto L_0x0460
        L_0x0401:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            boolean r4 = com.google.android.gms.internal.ads.v80.D(r1, r12)
            r2.L(r14, r4)
            goto L_0x0460
        L_0x040d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.O(r14, r4)
            goto L_0x0460
        L_0x0419:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.A(r14, r12)
            goto L_0x0460
        L_0x0425:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            int r4 = r6.getInt(r1, r12)
            r2.D(r14, r4)
            goto L_0x0460
        L_0x0431:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.I(r14, r12)
            goto L_0x0460
        L_0x043d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            long r12 = r6.getLong(r1, r12)
            r2.G(r14, r12)
            goto L_0x0460
        L_0x0449:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            float r4 = com.google.android.gms.internal.ads.v80.E(r1, r12)
            r2.q(r14, r4)
            goto L_0x0460
        L_0x0455:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0460
            double r12 = com.google.android.gms.internal.ads.v80.F(r1, r12)
            r2.B(r14, r12)
        L_0x0460:
            int r9 = r9 + 3
            goto L_0x0031
        L_0x0464:
            com.google.android.gms.internal.ads.h60<?> r1 = r0.p
            r1.a(r3)
            r4 = 0
            throw r4
        L_0x046b:
            r4 = 0
            if (r3 != 0) goto L_0x0474
            com.google.android.gms.internal.ads.r80<?, ?> r3 = r0.o
            v(r3, r1, r2)
            return
        L_0x0474:
            com.google.android.gms.internal.ads.h60<?> r1 = r0.p
            r1.f(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.G(java.lang.Object, com.google.android.gms.internal.ads.j90):void");
    }

    private final void H(T t, T t2, int i2) {
        int S = S(i2);
        int i3 = this.f4287a[i2];
        long j2 = (long) (S & 1048575);
        if (z(t2, i3, i2)) {
            Object G = v80.G(t, j2);
            Object G2 = v80.G(t2, j2);
            if (G != null && G2 != null) {
                v80.f(t, j2, zzegd.f(G, G2));
                F(t, i3, i2);
            } else if (G2 != null) {
                v80.f(t, j2, G2);
                F(t, i3, i2);
            }
        }
    }

    private final boolean I(T t, T t2, int i2) {
        return K(t, i2) == K(t2, i2);
    }

    private static List<?> J(Object obj, long j2) {
        return (List) v80.G(obj, j2);
    }

    private final boolean K(T t, int i2) {
        int T = T(i2);
        long j2 = (long) (T & 1048575);
        if (j2 == 1048575) {
            int S = S(i2);
            long j3 = (long) (S & 1048575);
            switch ((S & 267386880) >>> 20) {
                case 0:
                    return v80.F(t, j3) != 0.0d;
                case 1:
                    return v80.E(t, j3) != 0.0f;
                case 2:
                    return v80.B(t, j3) != 0;
                case 3:
                    return v80.B(t, j3) != 0;
                case 4:
                    return v80.z(t, j3) != 0;
                case 5:
                    return v80.B(t, j3) != 0;
                case 6:
                    return v80.z(t, j3) != 0;
                case 7:
                    return v80.D(t, j3);
                case 8:
                    Object G = v80.G(t, j3);
                    if (G instanceof String) {
                        return !((String) G).isEmpty();
                    }
                    if (G instanceof zzeer) {
                        return !zzeer.f8716c.equals(G);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return v80.G(t, j3) != null;
                case 10:
                    return !zzeer.f8716c.equals(v80.G(t, j3));
                case 11:
                    return v80.z(t, j3) != 0;
                case 12:
                    return v80.z(t, j3) != 0;
                case 13:
                    return v80.z(t, j3) != 0;
                case 14:
                    return v80.B(t, j3) != 0;
                case 15:
                    return v80.z(t, j3) != 0;
                case 16:
                    return v80.B(t, j3) != 0;
                case 17:
                    return v80.G(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (v80.z(t, j2) & (1 << (T >>> 20))) != 0;
        }
    }

    private static <T> double L(T t, long j2) {
        return ((Double) v80.G(t, j2)).doubleValue();
    }

    private final void M(T t, int i2) {
        int T = T(i2);
        long j2 = (long) (1048575 & T);
        if (j2 != 1048575) {
            v80.k(t, j2, (1 << (T >>> 20)) | v80.z(t, j2));
        }
    }

    private static <T> float N(T t, long j2) {
        return ((Float) v80.G(t, j2)).floatValue();
    }

    private static <T> int O(T t, long j2) {
        return ((Integer) v80.G(t, j2)).intValue();
    }

    private final z70 P(int i2) {
        int i3 = (i2 / 3) << 1;
        z70 z70 = (z70) this.f4288b[i3];
        if (z70 != null) {
            return z70;
        }
        z70 c2 = s70.b().c((Class) this.f4288b[i3 + 1]);
        this.f4288b[i3] = c2;
        return c2;
    }

    private final Object Q(int i2) {
        return this.f4288b[(i2 / 3) << 1];
    }

    private final zzegi R(int i2) {
        return (zzegi) this.f4288b[((i2 / 3) << 1) + 1];
    }

    private final int S(int i2) {
        return this.f4287a[i2 + 1];
    }

    private final int T(int i2) {
        return this.f4287a[i2 + 2];
    }

    private static boolean U(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final int V(int i2) {
        if (i2 < this.f4289c || i2 > this.f4290d) {
            return -1;
        }
        return D(i2, 0);
    }

    private static <T> long W(T t, long j2) {
        return ((Long) v80.G(t, j2)).longValue();
    }

    private static <T> boolean X(T t, long j2) {
        return ((Boolean) v80.G(t, j2)).booleanValue();
    }

    private static <UT, UB> int k(r80<UT, UB> r80, T t) {
        return r80.i(r80.j(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int l(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.n50 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = s
            int[] r7 = r0.f4287a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.z70 r2 = r0.P(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.o50.f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f4634c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.f4634c
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzegd.f(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.o50.j(r3, r4, r11)
            long r3 = r11.f4633b
            long r3 = com.google.android.gms.internal.ads.zzefc.v(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.o50.h(r3, r4, r11)
            int r3 = r11.f4632a
            int r3 = com.google.android.gms.internal.ads.zzefc.A(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.ads.o50.h(r3, r4, r11)
            int r4 = r11.f4632a
            com.google.android.gms.internal.ads.zzegi r5 = r0.R(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.ads.zzejc r1 = E(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.k(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.o50.m(r3, r4, r11)
            java.lang.Object r3 = r11.f4634c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.ads.z70 r2 = r0.P(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.ads.o50.g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f4634c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f4634c
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzegd.f(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.o50.h(r3, r4, r11)
            int r4 = r11.f4632a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.y80.j(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.i()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.zzegd.f8758a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.o50.j(r3, r4, r11)
            long r3 = r11.f4633b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.o50.n(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.ads.o50.o(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.o50.h(r3, r4, r11)
            int r3 = r11.f4632a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.o50.j(r3, r4, r11)
            long r3 = r11.f4633b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.ads.o50.q(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.ads.o50.p(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.l(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.n50):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    private final int m(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.n50 r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = s
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzegm r11 = (com.google.android.gms.internal.ads.zzegm) r11
            boolean r12 = r11.p()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.ads.zzegm r11 = r11.r(r12)
            sun.misc.Unsafe r12 = s
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            com.google.android.gms.internal.ads.z70 r1 = r0.P(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.o50.f(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f4634c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r9 = r7.f4632a
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.o50.f(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f4634c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.ads.y60 r11 = (com.google.android.gms.internal.ads.y60) r11
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r2 = r7.f4632a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.ads.o50.j(r3, r1, r7)
            long r4 = r7.f4633b
            long r4 = com.google.android.gms.internal.ads.zzefc.v(r4)
            r11.m(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.ads.y60 r11 = (com.google.android.gms.internal.ads.y60) r11
            int r1 = com.google.android.gms.internal.ads.o50.j(r3, r4, r7)
            long r8 = r7.f4633b
            long r8 = com.google.android.gms.internal.ads.zzefc.v(r8)
            r11.m(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r6 = r7.f4632a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.o50.j(r3, r4, r7)
            long r8 = r7.f4633b
            long r8 = com.google.android.gms.internal.ads.zzefc.v(r8)
            r11.m(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.ads.r60 r11 = (com.google.android.gms.internal.ads.r60) r11
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r2 = r7.f4632a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r4 = r7.f4632a
            int r4 = com.google.android.gms.internal.ads.zzefc.A(r4)
            r11.L(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.ads.r60 r11 = (com.google.android.gms.internal.ads.r60) r11
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r4 = r7.f4632a
            int r4 = com.google.android.gms.internal.ads.zzefc.A(r4)
            r11.L(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r6 = r7.f4632a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r4 = r7.f4632a
            int r4 = com.google.android.gms.internal.ads.zzefc.A(r4)
            r11.L(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.ads.o50.i(r3, r4, r11, r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.o50.b(r2, r3, r4, r5, r6, r7)
        L_0x0131:
            com.google.android.gms.internal.ads.zzegb r1 = (com.google.android.gms.internal.ads.zzegb) r1
            com.google.android.gms.internal.ads.zzejc r3 = r1.zzieg
            com.google.android.gms.internal.ads.zzejc r4 = com.google.android.gms.internal.ads.zzejc.h()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.ads.zzegi r4 = r0.R(r8)
            com.google.android.gms.internal.ads.r80<?, ?> r5 = r0.o
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.b80.b(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.ads.zzejc r3 = (com.google.android.gms.internal.ads.zzejc) r3
            if (r3 == 0) goto L_0x014e
            r1.zzieg = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r4 = r7.f4632a
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzeer r4 = com.google.android.gms.internal.ads.zzeer.f8716c
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.ads.zzeer r6 = com.google.android.gms.internal.ads.zzeer.P(r3, r1, r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r6 = r7.f4632a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r4 = r7.f4632a
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.ads.zzeer r4 = com.google.android.gms.internal.ads.zzeer.f8716c
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.ads.zzeer r6 = com.google.android.gms.internal.ads.zzeer.P(r3, r1, r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x019a:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.b()
            throw r1
        L_0x019f:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x01a4:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.b()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            com.google.android.gms.internal.ads.z70 r1 = r0.P(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.ads.o50.e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r6 = r7.f4632a
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzegd.f8758a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r8 = r7.f4632a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r6, r7)
            int r6 = r7.f4632a
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzegd.f8758a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.b()
            throw r1
        L_0x0211:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.b()
            throw r1
        L_0x0216:
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r6 = r7.f4632a
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.y80.j(r3, r4, r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzegd.f8758a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r8 = r7.f4632a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r6, r7)
            int r6 = r7.f4632a
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.y80.j(r3, r4, r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzegd.f8758a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.i()
            throw r1
        L_0x0267:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.b()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.i()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.b()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            com.google.android.gms.internal.ads.p50 r11 = (com.google.android.gms.internal.ads.p50) r11
            int r2 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r4 = r7.f4632a
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = com.google.android.gms.internal.ads.o50.j(r3, r2, r7)
            long r5 = r7.f4633b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0290
            r5 = 1
            goto L_0x0291
        L_0x0290:
            r5 = 0
        L_0x0291:
            r11.h(r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.ads.p50 r11 = (com.google.android.gms.internal.ads.p50) r11
            int r4 = com.google.android.gms.internal.ads.o50.j(r3, r4, r7)
            long r8 = r7.f4633b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r11.h(r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r8 = r7.f4632a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.ads.o50.j(r3, r6, r7)
            long r8 = r7.f4633b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = 1
            goto L_0x02c9
        L_0x02c8:
            r6 = 0
        L_0x02c9:
            r11.h(r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            com.google.android.gms.internal.ads.r60 r11 = (com.google.android.gms.internal.ads.r60) r11
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r2 = r7.f4632a
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = com.google.android.gms.internal.ads.o50.n(r3, r1)
            r11.L(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.ads.r60 r11 = (com.google.android.gms.internal.ads.r60) r11
            int r1 = com.google.android.gms.internal.ads.o50.n(r18, r19)
            r11.L(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r6 = r7.f4632a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.o50.n(r3, r4)
            r11.L(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            com.google.android.gms.internal.ads.y60 r11 = (com.google.android.gms.internal.ads.y60) r11
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r2 = r7.f4632a
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = com.google.android.gms.internal.ads.o50.o(r3, r1)
            r11.m(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.ads.y60 r11 = (com.google.android.gms.internal.ads.y60) r11
            long r8 = com.google.android.gms.internal.ads.o50.o(r18, r19)
            r11.m(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r6 = r7.f4632a
            if (r2 != r6) goto L_0x0423
            long r8 = com.google.android.gms.internal.ads.o50.o(r3, r4)
            r11.m(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = com.google.android.gms.internal.ads.o50.i(r3, r4, r11, r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.o50.b(r21, r22, r23, r24, r25, r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            com.google.android.gms.internal.ads.y60 r11 = (com.google.android.gms.internal.ads.y60) r11
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r2 = r7.f4632a
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = com.google.android.gms.internal.ads.o50.j(r3, r1, r7)
            long r4 = r7.f4633b
            r11.m(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.ads.y60 r11 = (com.google.android.gms.internal.ads.y60) r11
            int r1 = com.google.android.gms.internal.ads.o50.j(r3, r4, r7)
            long r8 = r7.f4633b
            r11.m(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r6 = r7.f4632a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.o50.j(r3, r4, r7)
            long r8 = r7.f4633b
            r11.m(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            com.google.android.gms.internal.ads.p60 r11 = (com.google.android.gms.internal.ads.p60) r11
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r2 = r7.f4632a
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = com.google.android.gms.internal.ads.o50.q(r3, r1)
            r11.j(r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.ads.p60 r11 = (com.google.android.gms.internal.ads.p60) r11
            float r1 = com.google.android.gms.internal.ads.o50.q(r18, r19)
            r11.j(r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r6 = r7.f4632a
            if (r2 != r6) goto L_0x0423
            float r1 = com.google.android.gms.internal.ads.o50.q(r3, r4)
            r11.j(r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            com.google.android.gms.internal.ads.f60 r11 = (com.google.android.gms.internal.ads.f60) r11
            int r1 = com.google.android.gms.internal.ads.o50.h(r3, r4, r7)
            int r2 = r7.f4632a
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = com.google.android.gms.internal.ads.o50.p(r3, r1)
            r11.h(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            com.google.android.gms.internal.ads.zzegl r1 = com.google.android.gms.internal.ads.zzegl.a()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.ads.f60 r11 = (com.google.android.gms.internal.ads.f60) r11
            double r8 = com.google.android.gms.internal.ads.o50.p(r18, r19)
            r11.h(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.o50.h(r3, r1, r7)
            int r6 = r7.f4632a
            if (r2 != r6) goto L_0x0423
            double r8 = com.google.android.gms.internal.ads.o50.p(r3, r4)
            r11.h(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.m(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.n50):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int n(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.ads.n50 r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = s
            java.lang.Object r12 = r7.Q(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.ads.f70 r2 = r7.q
            boolean r2 = r2.c(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.f70 r2 = r7.q
            java.lang.Object r2 = r2.f(r12)
            com.google.android.gms.internal.ads.f70 r3 = r7.q
            r3.e(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.ads.f70 r8 = r7.q
            com.google.android.gms.internal.ads.d70 r8 = r8.a(r12)
            com.google.android.gms.internal.ads.f70 r12 = r7.q
            java.util.Map r12 = r12.h(r1)
            int r10 = com.google.android.gms.internal.ads.o50.h(r9, r10, r15)
            int r13 = r15.f4632a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f3797b
            V r0 = r8.f3799d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.ads.o50.d(r10, r9, r1, r15)
            int r10 = r15.f4632a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.ads.zzejq r1 = r8.f3798c
            int r1 = r1.g()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.ads.zzejq r4 = r8.f3798c
            V r10 = r8.f3799d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = p(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f4634c
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.ads.zzejq r1 = r8.f3796a
            int r1 = r1.g()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.ads.zzejq r4 = r8.f3796a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = p(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.f4634c
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.ads.o50.a(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.ads.zzegl r8 = com.google.android.gms.internal.ads.zzegl.h()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.ads.zzegl r8 = com.google.android.gms.internal.ads.zzegl.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.n(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.ads.n50):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int p(byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzejq r4, java.lang.Class<?> r5, com.google.android.gms.internal.ads.n50 r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.ads.m70.f4539a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.ads.o50.l(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = com.google.android.gms.internal.ads.o50.j(r1, r2, r6)
            long r2 = r6.f4633b
            long r2 = com.google.android.gms.internal.ads.zzefc.v(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f4634c = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = com.google.android.gms.internal.ads.o50.h(r1, r2, r6)
            int r2 = r6.f4632a
            int r2 = com.google.android.gms.internal.ads.zzefc.A(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f4634c = r2
            goto L_0x00ae
        L_0x003d:
            com.google.android.gms.internal.ads.s70 r4 = com.google.android.gms.internal.ads.s70.b()
            com.google.android.gms.internal.ads.z70 r4 = r4.c(r5)
            int r1 = com.google.android.gms.internal.ads.o50.g(r4, r1, r2, r3, r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = com.google.android.gms.internal.ads.o50.j(r1, r2, r6)
            long r2 = r6.f4633b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f4634c = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = com.google.android.gms.internal.ads.o50.h(r1, r2, r6)
            int r2 = r6.f4632a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f4634c = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = com.google.android.gms.internal.ads.o50.q(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f4634c = r1
            goto L_0x0084
        L_0x006f:
            long r3 = com.google.android.gms.internal.ads.o50.o(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f4634c = r1
            goto L_0x0091
        L_0x007a:
            int r1 = com.google.android.gms.internal.ads.o50.n(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f4634c = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = com.google.android.gms.internal.ads.o50.p(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f4634c = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = com.google.android.gms.internal.ads.o50.m(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = com.google.android.gms.internal.ads.o50.j(r1, r2, r6)
            long r2 = r6.f4633b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f4634c = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.p(byte[], int, int, com.google.android.gms.internal.ads.zzejq, java.lang.Class, com.google.android.gms.internal.ads.n50):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x038c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.j70<T> q(java.lang.Class<T> r33, com.google.android.gms.internal.ads.g70 r34, com.google.android.gms.internal.ads.n70 r35, com.google.android.gms.internal.ads.v60 r36, com.google.android.gms.internal.ads.r80<?, ?> r37, com.google.android.gms.internal.ads.h60<?> r38, com.google.android.gms.internal.ads.f70 r39) {
        /*
            r0 = r34
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.u70
            if (r1 == 0) goto L_0x040f
            com.google.android.gms.internal.ads.u70 r0 = (com.google.android.gms.internal.ads.u70) r0
            int r1 = r0.a()
            int r2 = com.google.android.gms.internal.ads.zzegb.zze.j
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.d()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = 1
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = 1
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = r
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = s
            java.lang.Object[] r16 = r0.e()
            com.google.android.gms.internal.ads.zzehl r17 = r0.c()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03e3
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020d
            int r10 = r17 + 1
            r14[r17] = r20
            r17 = r10
        L_0x020d:
            r10 = 51
            r29 = r9
            if (r15 < r10) goto L_0x02aa
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0222:
            int r32 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0237
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r4 = r4 | r9
            int r31 = r31 + 13
            r10 = r32
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0237:
            int r9 = r10 << r31
            r4 = r4 | r9
            r10 = r32
        L_0x023c:
            int r9 = r15 + -51
            r31 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025d
            r10 = 17
            if (r9 != r10) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r10 = 12
            if (r9 != r10) goto L_0x025b
            if (r11 != 0) goto L_0x025b
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r10
        L_0x025b:
            r10 = 1
            goto L_0x026a
        L_0x025d:
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r24 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r24
        L_0x026a:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0274
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027c
        L_0x0274:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = t(r6, r9)
            r16[r4] = r9
        L_0x027c:
            long r9 = r8.objectFieldOffset(r9)
            int r10 = (int) r9
            int r4 = r4 + 1
            r9 = r16[r4]
            r25 = r10
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x028e
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0296
        L_0x028e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = t(r6, r9)
            r16[r4] = r9
        L_0x0296:
            long r9 = r8.objectFieldOffset(r9)
            int r4 = (int) r9
            r30 = r1
            r9 = r4
            r1 = r11
            r24 = r12
            r10 = r25
            r11 = r31
            r4 = 0
            r18 = 1
            goto L_0x03a8
        L_0x02aa:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = t(r6, r10)
            r13 = 9
            if (r15 == r13) goto L_0x031e
            r13 = 17
            if (r15 != r13) goto L_0x02bd
            goto L_0x031e
        L_0x02bd:
            r13 = 27
            if (r15 == r13) goto L_0x030d
            r13 = 49
            if (r15 != r13) goto L_0x02c6
            goto L_0x030d
        L_0x02c6:
            r13 = 12
            if (r15 == r13) goto L_0x02f9
            r13 = 30
            if (r15 == r13) goto L_0x02f9
            r13 = 44
            if (r15 != r13) goto L_0x02d3
            goto L_0x02f9
        L_0x02d3:
            r13 = 50
            if (r15 != r13) goto L_0x032c
            int r13 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02f6
            int r21 = r21 + 1
            int r9 = r25 + 1
            r25 = r16[r25]
            r12[r21] = r25
            r21 = r13
            goto L_0x032c
        L_0x02f6:
            r21 = r13
            goto L_0x031b
        L_0x02f9:
            if (r11 != 0) goto L_0x030a
            int r13 = r20 / 3
            r24 = 1
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
            goto L_0x031b
        L_0x030a:
            r24 = 1
            goto L_0x032c
        L_0x030d:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            int r25 = r9 + 1
            r9 = r16[r9]
            r12[r13] = r9
        L_0x031b:
            r13 = r25
            goto L_0x032d
        L_0x031e:
            r24 = 1
            int r13 = r20 / 3
            int r13 = r13 << 1
            int r13 = r13 + 1
            java.lang.Class r25 = r10.getType()
            r12[r13] = r25
        L_0x032c:
            r13 = r9
        L_0x032d:
            long r9 = r8.objectFieldOffset(r10)
            int r10 = (int) r9
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            r25 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r9 != r13) goto L_0x038c
            r9 = 17
            if (r15 > r9) goto L_0x038c
            int r9 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0364
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x034d:
            int r28 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r13) goto L_0x035f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r18
            r4 = r4 | r9
            int r18 = r18 + 13
            r9 = r28
            goto L_0x034d
        L_0x035f:
            int r9 = r9 << r18
            r4 = r4 | r9
            r9 = r28
        L_0x0364:
            r18 = 1
            int r24 = r3 << 1
            int r28 = r4 / 32
            int r24 = r24 + r28
            r13 = r16[r24]
            r30 = r1
            boolean r1 = r13 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0377
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x037f
        L_0x0377:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = t(r6, r13)
            r16[r24] = r13
        L_0x037f:
            r1 = r11
            r24 = r12
            long r11 = r8.objectFieldOffset(r13)
            int r12 = (int) r11
            int r4 = r4 % 32
            r11 = r9
            r9 = r12
            goto L_0x0398
        L_0x038c:
            r30 = r1
            r1 = r11
            r24 = r12
            r18 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r4
            r4 = 0
        L_0x0398:
            r12 = 18
            if (r15 < r12) goto L_0x03a6
            r12 = 49
            if (r15 > r12) goto L_0x03a6
            int r12 = r22 + 1
            r14[r22] = r10
            r22 = r12
        L_0x03a6:
            r13 = r25
        L_0x03a8:
            int r12 = r20 + 1
            r5[r20] = r7
            int r7 = r12 + 1
            r20 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b7
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b8
        L_0x03b7:
            r3 = 0
        L_0x03b8:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03bf
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c0
        L_0x03bf:
            r2 = 0
        L_0x03c0:
            r2 = r2 | r3
            int r3 = r15 << 20
            r2 = r2 | r3
            r2 = r2 | r10
            r5[r12] = r2
            int r2 = r7 + 1
            int r3 = r4 << 20
            r3 = r3 | r9
            r5[r7] = r3
            r7 = r11
            r3 = r20
            r10 = r23
            r12 = r24
            r15 = r27
            r9 = r29
            r4 = 1
            r11 = r1
            r20 = r2
            r2 = r26
            r1 = r30
            goto L_0x0193
        L_0x03e3:
            r29 = r9
            r23 = r10
            r1 = r11
            r24 = r12
            r27 = r15
            com.google.android.gms.internal.ads.j70 r2 = new com.google.android.gms.internal.ads.j70
            com.google.android.gms.internal.ads.zzehl r10 = r0.c()
            r12 = 0
            r0 = r5
            r5 = r2
            r6 = r0
            r7 = r24
            r8 = r29
            r9 = r23
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r20 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L_0x040f:
            com.google.android.gms.internal.ads.o80 r0 = (com.google.android.gms.internal.ads.o80) r0
            r0.a()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.q(java.lang.Class, com.google.android.gms.internal.ads.g70, com.google.android.gms.internal.ads.n70, com.google.android.gms.internal.ads.v60, com.google.android.gms.internal.ads.r80, com.google.android.gms.internal.ads.h60, com.google.android.gms.internal.ads.f70):com.google.android.gms.internal.ads.j70");
    }

    private final <K, V, UT, UB> UB r(int i2, int i3, Map<K, V> map, zzegi zzegi, UB ub, r80<UT, UB> r80) {
        d70<?, ?> a2 = this.q.a(Q(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzegi.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = r80.n();
                }
                w50 G = zzeer.G(zzehd.a(a2, next.getKey(), next.getValue()));
                try {
                    zzehd.b(G.b(), a2, next.getKey(), next.getValue());
                    r80.b(ub, i3, G.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB s(Object obj, int i2, UB ub, r80<UT, UB> r80) {
        zzegi R;
        int i3 = this.f4287a[i2];
        Object G = v80.G(obj, (long) (S(i2) & 1048575));
        if (G == null || (R = R(i2)) == null) {
            return ub;
        }
        return r(i2, i3, this.q.h(G), R, ub, r80);
    }

    private static Field t(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void u(int i2, Object obj, j90 j90) throws IOException {
        if (obj instanceof String) {
            j90.F(i2, (String) obj);
        } else {
            j90.Q(i2, (zzeer) obj);
        }
    }

    private static <UT, UB> void v(r80<UT, UB> r80, T t, j90 j90) throws IOException {
        r80.d(r80.j(t), j90);
    }

    private final <K, V> void w(j90 j90, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            j90.E(i2, this.q.a(Q(i3)), this.q.b(obj));
        }
    }

    private final void x(Object obj, int i2, t70 t70) throws IOException {
        if (U(i2)) {
            v80.f(obj, (long) (i2 & 1048575), t70.B());
        } else if (this.g) {
            v80.f(obj, (long) (i2 & 1048575), t70.V());
        } else {
            v80.f(obj, (long) (i2 & 1048575), t70.F());
        }
    }

    private final void y(T t, T t2, int i2) {
        long S = (long) (S(i2) & 1048575);
        if (K(t2, i2)) {
            Object G = v80.G(t, S);
            Object G2 = v80.G(t2, S);
            if (G != null && G2 != null) {
                v80.f(t, S, zzegd.f(G, G2));
                M(t, i2);
            } else if (G2 != null) {
                v80.f(t, S, G2);
                M(t, i2);
            }
        }
    }

    private final boolean z(T t, int i2, int i3) {
        return v80.z(t, (long) (T(i3) & 1048575)) == i2;
    }

    public final void a(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.f4287a.length; i2 += 3) {
                int S = S(i2);
                long j2 = (long) (1048575 & S);
                int i3 = this.f4287a[i2];
                switch ((S & 267386880) >>> 20) {
                    case 0:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.c(t, j2, v80.F(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 1:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.d(t, j2, v80.E(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 2:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.e(t, j2, v80.B(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 3:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.e(t, j2, v80.B(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 4:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.k(t, j2, v80.z(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 5:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.e(t, j2, v80.B(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 6:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.k(t, j2, v80.z(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 7:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.g(t, j2, v80.D(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 8:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.f(t, j2, v80.G(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 9:
                        y(t, t2, i2);
                        break;
                    case 10:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.f(t, j2, v80.G(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 11:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.k(t, j2, v80.z(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 12:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.k(t, j2, v80.z(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 13:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.k(t, j2, v80.z(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 14:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.e(t, j2, v80.B(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 15:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.k(t, j2, v80.z(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 16:
                        if (!K(t2, i2)) {
                            break;
                        } else {
                            v80.e(t, j2, v80.B(t2, j2));
                            M(t, i2);
                            break;
                        }
                    case 17:
                        y(t, t2, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.b(t, t2, j2);
                        break;
                    case 50:
                        b80.g(this.q, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!z(t2, i3, i2)) {
                            break;
                        } else {
                            v80.f(t, j2, v80.G(t2, j2));
                            F(t, i3, i2);
                            break;
                        }
                    case 60:
                        H(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!z(t2, i3, i2)) {
                            break;
                        } else {
                            v80.f(t, j2, v80.G(t2, j2));
                            F(t, i3, i2);
                            break;
                        }
                    case 68:
                        H(t, t2, i2);
                        break;
                }
            }
            b80.h(this.o, t, t2);
            if (this.f4292f) {
                b80.f(this.p, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    public final void b(T t) {
        int i2;
        int i3 = this.k;
        while (true) {
            i2 = this.l;
            if (i3 >= i2) {
                break;
            }
            long S = (long) (S(this.j[i3]) & 1048575);
            Object G = v80.G(t, S);
            if (G != null) {
                v80.f(t, S, this.q.d(G));
            }
            i3++;
        }
        int length = this.j.length;
        while (i2 < length) {
            this.n.c(t, (long) this.j[i2]);
            i2++;
        }
        this.o.g(t);
        if (this.f4292f) {
            this.p.i(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0832, code lost:
        r9 = (r9 + r10) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x090b, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0953, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09fd, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a1f, code lost:
        r3 = r3 + 3;
        r9 = r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = s
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f4287a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.S(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f4287a
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.ads.zzefv r14 = com.google.android.gms.internal.ads.zzefv.L
            int r14 = r14.f()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.ads.zzefv r14 = com.google.android.gms.internal.ads.zzefv.Y
            int r14 = r14.f()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f4287a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0482;
                case 7: goto L_0x0476;
                case 8: goto L_0x0458;
                case 9: goto L_0x0444;
                case 10: goto L_0x0433;
                case 11: goto L_0x0424;
                case 12: goto L_0x0415;
                case 13: goto L_0x040a;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03f0;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a6;
                case 22: goto L_0x039d;
                case 23: goto L_0x0394;
                case 24: goto L_0x038b;
                case 25: goto L_0x0382;
                case 26: goto L_0x0379;
                case 27: goto L_0x036c;
                case 28: goto L_0x0363;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04e4
        L_0x0047:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            com.google.android.gms.internal.ads.zzehl r5 = (com.google.android.gms.internal.ads.zzehl) r5
            com.google.android.gms.internal.ads.z70 r6 = r0.P(r12)
            int r3 = com.google.android.gms.internal.ads.zzefl.L(r3, r5, r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = W(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.B0(r3, r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = O(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.q(r3, r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.z(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.D0(r3, r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.z(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.u(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = O(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.v(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = O(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.p(r3, r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            com.google.android.gms.internal.ads.zzeer r5 = (com.google.android.gms.internal.ads.zzeer) r5
            int r3 = com.google.android.gms.internal.ads.zzefl.K(r3, r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            com.google.android.gms.internal.ads.z70 r6 = r0.P(r12)
            int r3 = com.google.android.gms.internal.ads.b80.B(r3, r5, r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzeer
            if (r6 == 0) goto L_0x00f1
            com.google.android.gms.internal.ads.zzeer r5 = (com.google.android.gms.internal.ads.zzeer) r5
            int r3 = com.google.android.gms.internal.ads.zzefl.K(r3, r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.zzefl.A0(r3, r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.z(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.s0(r3, r7)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.z(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.s(r3, r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.z(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.C0(r3, r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = O(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.o(r3, r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = W(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.z0(r3, r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = W(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.w0(r3, r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.z(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.w(r3, r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.z(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.zzefl.J(r3, r5)
            goto L_0x03c9
        L_0x0167:
            com.google.android.gms.internal.ads.f70 r14 = r0.q
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            java.lang.Object r6 = r0.Q(r12)
            int r3 = r14.g(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = J(r1, r5)
            com.google.android.gms.internal.ads.z70 r6 = r0.P(r12)
            int r3 = com.google.android.gms.internal.ads.b80.G(r3, r5, r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.k(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.o(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.q(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.p(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.l(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.n(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.r(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.p(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.q(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.m(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.j(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.i(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.p(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.b80.q(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.gms.internal.ads.zzefl.e0(r3)
            int r6 = com.google.android.gms.internal.ads.zzefl.g0(r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.W(r3, r5, r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.a0(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.c0(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.b0(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.X(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.Z(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.F(r3, r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = J(r1, r5)
            com.google.android.gms.internal.ads.z70 r6 = r0.P(r12)
            int r3 = com.google.android.gms.internal.ads.b80.D(r3, r5, r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.C(r3, r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.d0(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.b0(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.c0(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.Y(r3, r5, r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.V(r3, r5, r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.U(r3, r5, r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.b0(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = J(r1, r5)
            int r3 = com.google.android.gms.internal.ads.b80.c0(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            com.google.android.gms.internal.ads.zzehl r5 = (com.google.android.gms.internal.ads.zzehl) r5
            com.google.android.gms.internal.ads.z70 r6 = r0.P(r12)
            int r3 = com.google.android.gms.internal.ads.zzefl.L(r3, r5, r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.ads.v80.B(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.B0(r3, r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.ads.v80.z(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.q(r3, r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.K(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.D0(r3, r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.K(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.u(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.ads.v80.z(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.v(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.ads.v80.z(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.p(r3, r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            com.google.android.gms.internal.ads.zzeer r5 = (com.google.android.gms.internal.ads.zzeer) r5
            int r3 = com.google.android.gms.internal.ads.zzefl.K(r3, r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            com.google.android.gms.internal.ads.z70 r6 = r0.P(r12)
            int r3 = com.google.android.gms.internal.ads.b80.B(r3, r5, r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzeer
            if (r6 == 0) goto L_0x046e
            com.google.android.gms.internal.ads.zzeer r5 = (com.google.android.gms.internal.ads.zzeer) r5
            int r3 = com.google.android.gms.internal.ads.zzefl.K(r3, r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.zzefl.A0(r3, r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.K(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.s0(r3, r7)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.K(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.s(r3, r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.K(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.C0(r3, r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.ads.v80.z(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.o(r3, r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.ads.v80.B(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.z0(r3, r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.K(r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.ads.v80.B(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzefl.w0(r3, r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.K(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzefl.w(r3, r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.K(r1, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.zzefl.J(r3, r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            com.google.android.gms.internal.ads.r80<?, ?> r2 = r0.o
            int r1 = k(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = s
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x04fa:
            int[] r13 = r0.f4287a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0a26
            int r13 = r0.S(r3)
            int[] r14 = r0.f4287a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x0525
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r6) goto L_0x0523
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r6 = r14
        L_0x0523:
            r9 = r11
            goto L_0x0544
        L_0x0525:
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0541
            com.google.android.gms.internal.ads.zzefv r9 = com.google.android.gms.internal.ads.zzefv.L
            int r9 = r9.f()
            if (r4 < r9) goto L_0x0541
            com.google.android.gms.internal.ads.zzefv r9 = com.google.android.gms.internal.ads.zzefv.Y
            int r9 = r9.f()
            if (r4 > r9) goto L_0x0541
            int[] r9 = r0.f4287a
            int r10 = r3 + 2
            r9 = r9[r10]
            r9 = r9 & r8
            goto L_0x0542
        L_0x0541:
            r9 = 0
        L_0x0542:
            r18 = 0
        L_0x0544:
            r10 = r13 & r8
            long r10 = (long) r10
            switch(r4) {
                case 0: goto L_0x0a10;
                case 1: goto L_0x0a00;
                case 2: goto L_0x09ee;
                case 3: goto L_0x09de;
                case 4: goto L_0x09ce;
                case 5: goto L_0x09c2;
                case 6: goto L_0x09b6;
                case 7: goto L_0x09ac;
                case 8: goto L_0x0990;
                case 9: goto L_0x097e;
                case 10: goto L_0x096f;
                case 11: goto L_0x0962;
                case 12: goto L_0x0955;
                case 13: goto L_0x094a;
                case 14: goto L_0x093f;
                case 15: goto L_0x0932;
                case 16: goto L_0x0925;
                case 17: goto L_0x0912;
                case 18: goto L_0x08fe;
                case 19: goto L_0x08f2;
                case 20: goto L_0x08e6;
                case 21: goto L_0x08da;
                case 22: goto L_0x08ce;
                case 23: goto L_0x08c2;
                case 24: goto L_0x08b6;
                case 25: goto L_0x08aa;
                case 26: goto L_0x089f;
                case 27: goto L_0x0890;
                case 28: goto L_0x0884;
                case 29: goto L_0x0877;
                case 30: goto L_0x086a;
                case 31: goto L_0x085d;
                case 32: goto L_0x0850;
                case 33: goto L_0x0843;
                case 34: goto L_0x0836;
                case 35: goto L_0x0816;
                case 36: goto L_0x07f9;
                case 37: goto L_0x07dc;
                case 38: goto L_0x07bf;
                case 39: goto L_0x07a1;
                case 40: goto L_0x0783;
                case 41: goto L_0x0765;
                case 42: goto L_0x0747;
                case 43: goto L_0x0729;
                case 44: goto L_0x070b;
                case 45: goto L_0x06ed;
                case 46: goto L_0x06cf;
                case 47: goto L_0x06b1;
                case 48: goto L_0x0693;
                case 49: goto L_0x0683;
                case 50: goto L_0x0673;
                case 51: goto L_0x0665;
                case 52: goto L_0x0658;
                case 53: goto L_0x0648;
                case 54: goto L_0x0638;
                case 55: goto L_0x0628;
                case 56: goto L_0x061a;
                case 57: goto L_0x060d;
                case 58: goto L_0x0601;
                case 59: goto L_0x05e3;
                case 60: goto L_0x05cf;
                case 61: goto L_0x05bd;
                case 62: goto L_0x05ad;
                case 63: goto L_0x059d;
                case 64: goto L_0x0590;
                case 65: goto L_0x0582;
                case 66: goto L_0x0572;
                case 67: goto L_0x0562;
                case 68: goto L_0x054c;
                default: goto L_0x054a;
            }
        L_0x054a:
            goto L_0x090a
        L_0x054c:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.zzehl r4 = (com.google.android.gms.internal.ads.zzehl) r4
            com.google.android.gms.internal.ads.z70 r9 = r0.P(r3)
            int r4 = com.google.android.gms.internal.ads.zzefl.L(r15, r4, r9)
            goto L_0x0909
        L_0x0562:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            long r9 = W(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.B0(r15, r9)
            goto L_0x0909
        L_0x0572:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            int r4 = O(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.q(r15, r4)
            goto L_0x0909
        L_0x0582:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzefl.D0(r15, r9)
            goto L_0x0909
        L_0x0590:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzefl.u(r15, r4)
            goto L_0x0953
        L_0x059d:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            int r4 = O(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.v(r15, r4)
            goto L_0x0909
        L_0x05ad:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            int r4 = O(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.p(r15, r4)
            goto L_0x0909
        L_0x05bd:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.zzeer r4 = (com.google.android.gms.internal.ads.zzeer) r4
            int r4 = com.google.android.gms.internal.ads.zzefl.K(r15, r4)
            goto L_0x0909
        L_0x05cf:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.z70 r9 = r0.P(r3)
            int r4 = com.google.android.gms.internal.ads.b80.B(r15, r4, r9)
            goto L_0x0909
        L_0x05e3:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.zzeer
            if (r9 == 0) goto L_0x05f9
            com.google.android.gms.internal.ads.zzeer r4 = (com.google.android.gms.internal.ads.zzeer) r4
            int r4 = com.google.android.gms.internal.ads.zzefl.K(r15, r4)
            goto L_0x0909
        L_0x05f9:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzefl.A0(r15, r4)
            goto L_0x0909
        L_0x0601:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            int r4 = com.google.android.gms.internal.ads.zzefl.s0(r15, r7)
            goto L_0x0909
        L_0x060d:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzefl.s(r15, r4)
            goto L_0x0953
        L_0x061a:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzefl.C0(r15, r9)
            goto L_0x0909
        L_0x0628:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            int r4 = O(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.o(r15, r4)
            goto L_0x0909
        L_0x0638:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            long r9 = W(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.z0(r15, r9)
            goto L_0x0909
        L_0x0648:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            long r9 = W(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.w0(r15, r9)
            goto L_0x0909
        L_0x0658:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzefl.w(r15, r4)
            goto L_0x0953
        L_0x0665:
            boolean r4 = r0.z(r1, r15, r3)
            if (r4 == 0) goto L_0x090a
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzefl.J(r15, r9)
            goto L_0x0909
        L_0x0673:
            com.google.android.gms.internal.ads.f70 r4 = r0.q
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.Q(r3)
            int r4 = r4.g(r15, r9, r10)
            goto L_0x0909
        L_0x0683:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.z70 r9 = r0.P(r3)
            int r4 = com.google.android.gms.internal.ads.b80.G(r15, r4, r9)
            goto L_0x0909
        L_0x0693:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.k(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x06a7
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06a7:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x06b1:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.o(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x06c5
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06c5:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x06cf:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.q(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x06e3
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06e3:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x06ed:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.p(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x0701
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0701:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x070b:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.l(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x071f
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x071f:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x0729:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.n(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x073d
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x073d:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x0747:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.r(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x075b
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x075b:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x0765:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.p(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x0779
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0779:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x0783:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.q(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x0797
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0797:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x07a1:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.m(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x07b5
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07b5:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x07bf:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.j(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x07d3
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07d3:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x07dc:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.i(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x07f0
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07f0:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x07f9:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.p(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x080d
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x080d:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
            goto L_0x0832
        L_0x0816:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.q(r4)
            if (r4 <= 0) goto L_0x090a
            boolean r10 = r0.i
            if (r10 == 0) goto L_0x082a
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x082a:
            int r9 = com.google.android.gms.internal.ads.zzefl.e0(r15)
            int r10 = com.google.android.gms.internal.ads.zzefl.g0(r4)
        L_0x0832:
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x0953
        L_0x0836:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.b80.W(r15, r4, r9)
            goto L_0x0909
        L_0x0843:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.a0(r15, r4, r9)
            goto L_0x0909
        L_0x0850:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.c0(r15, r4, r9)
            goto L_0x0909
        L_0x085d:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.b0(r15, r4, r9)
            goto L_0x0909
        L_0x086a:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.X(r15, r4, r9)
            goto L_0x0909
        L_0x0877:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.Z(r15, r4, r9)
            goto L_0x0909
        L_0x0884:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.F(r15, r4)
            goto L_0x0909
        L_0x0890:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.z70 r9 = r0.P(r3)
            int r4 = com.google.android.gms.internal.ads.b80.D(r15, r4, r9)
            goto L_0x0909
        L_0x089f:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.C(r15, r4)
            goto L_0x0909
        L_0x08aa:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.b80.d0(r15, r4, r9)
            goto L_0x0909
        L_0x08b6:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.b0(r15, r4, r9)
            goto L_0x0909
        L_0x08c2:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.c0(r15, r4, r9)
            goto L_0x0909
        L_0x08ce:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.Y(r15, r4, r9)
            goto L_0x0909
        L_0x08da:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.V(r15, r4, r9)
            goto L_0x0909
        L_0x08e6:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.U(r15, r4, r9)
            goto L_0x0909
        L_0x08f2:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.b0(r15, r4, r9)
            goto L_0x0909
        L_0x08fe:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.b80.c0(r15, r4, r9)
        L_0x0909:
            int r5 = r5 + r4
        L_0x090a:
            r4 = 0
        L_0x090b:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x0a1f
        L_0x0912:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.zzehl r4 = (com.google.android.gms.internal.ads.zzehl) r4
            com.google.android.gms.internal.ads.z70 r9 = r0.P(r3)
            int r4 = com.google.android.gms.internal.ads.zzefl.L(r15, r4, r9)
            goto L_0x0909
        L_0x0925:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            long r9 = r2.getLong(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.B0(r15, r9)
            goto L_0x0909
        L_0x0932:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.q(r15, r4)
            goto L_0x0909
        L_0x093f:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzefl.D0(r15, r9)
            goto L_0x0909
        L_0x094a:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzefl.u(r15, r4)
        L_0x0953:
            int r5 = r5 + r9
            goto L_0x090a
        L_0x0955:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.v(r15, r4)
            goto L_0x0909
        L_0x0962:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzefl.p(r15, r4)
            goto L_0x0909
        L_0x096f:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.zzeer r4 = (com.google.android.gms.internal.ads.zzeer) r4
            int r4 = com.google.android.gms.internal.ads.zzefl.K(r15, r4)
            goto L_0x0909
        L_0x097e:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.z70 r9 = r0.P(r3)
            int r4 = com.google.android.gms.internal.ads.b80.B(r15, r4, r9)
            goto L_0x0909
        L_0x0990:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.zzeer
            if (r9 == 0) goto L_0x09a4
            com.google.android.gms.internal.ads.zzeer r4 = (com.google.android.gms.internal.ads.zzeer) r4
            int r4 = com.google.android.gms.internal.ads.zzefl.K(r15, r4)
            goto L_0x0909
        L_0x09a4:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzefl.A0(r15, r4)
            goto L_0x0909
        L_0x09ac:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            int r4 = com.google.android.gms.internal.ads.zzefl.s0(r15, r7)
            goto L_0x0909
        L_0x09b6:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090a
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzefl.s(r15, r4)
            int r5 = r5 + r9
            goto L_0x090b
        L_0x09c2:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x09fe
            int r9 = com.google.android.gms.internal.ads.zzefl.C0(r15, r13)
            goto L_0x09fd
        L_0x09ce:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fe
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.ads.zzefl.o(r15, r9)
            goto L_0x09fd
        L_0x09de:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fe
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.ads.zzefl.z0(r15, r9)
            goto L_0x09fd
        L_0x09ee:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fe
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.ads.zzefl.w0(r15, r9)
        L_0x09fd:
            int r5 = r5 + r9
        L_0x09fe:
            r9 = 0
            goto L_0x0a0d
        L_0x0a00:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fe
            r9 = 0
            int r10 = com.google.android.gms.internal.ads.zzefl.w(r15, r9)
            int r5 = r5 + r10
        L_0x0a0d:
            r10 = 0
            goto L_0x0a1f
        L_0x0a10:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x0a0d
            r10 = 0
            int r15 = com.google.android.gms.internal.ads.zzefl.J(r15, r10)
            int r5 = r5 + r15
        L_0x0a1f:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r11 = 0
            goto L_0x04fa
        L_0x0a26:
            r4 = 0
            com.google.android.gms.internal.ads.r80<?, ?> r2 = r0.o
            int r2 = k(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f4292f
            if (r2 == 0) goto L_0x0a80
            com.google.android.gms.internal.ads.h60<?> r2 = r0.p
            com.google.android.gms.internal.ads.l60 r1 = r2.g(r1)
            r11 = 0
        L_0x0a39:
            com.google.android.gms.internal.ads.e80<T, java.lang.Object> r2 = r1.f4450a
            int r2 = r2.h()
            if (r11 >= r2) goto L_0x0a59
            com.google.android.gms.internal.ads.e80<T, java.lang.Object> r2 = r1.f4450a
            java.util.Map$Entry r2 = r2.p(r11)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.ads.zzefw r3 = (com.google.android.gms.internal.ads.zzefw) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.ads.l60.l(r3, r2)
            int r4 = r4 + r2
            int r11 = r11 + 1
            goto L_0x0a39
        L_0x0a59:
            com.google.android.gms.internal.ads.e80<T, java.lang.Object> r1 = r1.f4450a
            java.lang.Iterable r1 = r1.i()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a63:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a7f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.ads.zzefw r3 = (com.google.android.gms.internal.ads.zzefw) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.ads.l60.l(r3, r2)
            int r4 = r4 + r2
            goto L_0x0a63
        L_0x0a7f:
            int r5 = r5 + r4
        L_0x0a80:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.c(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x096d  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0973  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(T r13, com.google.android.gms.internal.ads.j90 r14) throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r14.C()
            int r1 = com.google.android.gms.internal.ads.zzegb.zze.l
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04c3
            com.google.android.gms.internal.ads.r80<?, ?> r0 = r12.o
            v(r0, r13, r14)
            boolean r0 = r12.f4292f
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.h60<?> r0 = r12.p
            com.google.android.gms.internal.ads.l60 r0 = r0.g(r13)
            com.google.android.gms.internal.ads.e80<T, java.lang.Object> r1 = r0.f4450a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.a()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            int[] r1 = r12.f4287a
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0038:
            if (r1 < 0) goto L_0x04ba
            int r7 = r12.S(r1)
            int[] r8 = r12.f4287a
            r9 = r8[r1]
            if (r0 != 0) goto L_0x04b4
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04a1;
                case 1: goto L_0x0491;
                case 2: goto L_0x0481;
                case 3: goto L_0x0471;
                case 4: goto L_0x0461;
                case 5: goto L_0x0451;
                case 6: goto L_0x0441;
                case 7: goto L_0x0430;
                case 8: goto L_0x041f;
                case 9: goto L_0x040a;
                case 10: goto L_0x03f7;
                case 11: goto L_0x03e6;
                case 12: goto L_0x03d5;
                case 13: goto L_0x03c4;
                case 14: goto L_0x03b3;
                case 15: goto L_0x03a2;
                case 16: goto L_0x0391;
                case 17: goto L_0x037c;
                case 18: goto L_0x036d;
                case 19: goto L_0x035e;
                case 20: goto L_0x034f;
                case 21: goto L_0x0340;
                case 22: goto L_0x0331;
                case 23: goto L_0x0322;
                case 24: goto L_0x0313;
                case 25: goto L_0x0304;
                case 26: goto L_0x02f5;
                case 27: goto L_0x02e2;
                case 28: goto L_0x02d3;
                case 29: goto L_0x02c4;
                case 30: goto L_0x02b5;
                case 31: goto L_0x02a6;
                case 32: goto L_0x0297;
                case 33: goto L_0x0288;
                case 34: goto L_0x0279;
                case 35: goto L_0x026a;
                case 36: goto L_0x025b;
                case 37: goto L_0x024c;
                case 38: goto L_0x023d;
                case 39: goto L_0x022e;
                case 40: goto L_0x021f;
                case 41: goto L_0x0210;
                case 42: goto L_0x0201;
                case 43: goto L_0x01f2;
                case 44: goto L_0x01e3;
                case 45: goto L_0x01d4;
                case 46: goto L_0x01c5;
                case 47: goto L_0x01b6;
                case 48: goto L_0x01a7;
                case 49: goto L_0x0194;
                case 50: goto L_0x0189;
                case 51: goto L_0x0178;
                case 52: goto L_0x0167;
                case 53: goto L_0x0156;
                case 54: goto L_0x0145;
                case 55: goto L_0x0134;
                case 56: goto L_0x0123;
                case 57: goto L_0x0112;
                case 58: goto L_0x0101;
                case 59: goto L_0x00f0;
                case 60: goto L_0x00db;
                case 61: goto L_0x00c8;
                case 62: goto L_0x00b7;
                case 63: goto L_0x00a6;
                case 64: goto L_0x0095;
                case 65: goto L_0x0084;
                case 66: goto L_0x0073;
                case 67: goto L_0x0062;
                case 68: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x04b0
        L_0x004d:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            com.google.android.gms.internal.ads.z70 r8 = r12.P(r1)
            r14.N(r9, r7, r8)
            goto L_0x04b0
        L_0x0062:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = W(r13, r7)
            r14.M(r9, r7)
            goto L_0x04b0
        L_0x0073:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = O(r13, r7)
            r14.W(r9, r7)
            goto L_0x04b0
        L_0x0084:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = W(r13, r7)
            r14.J(r9, r7)
            goto L_0x04b0
        L_0x0095:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = O(r13, r7)
            r14.S(r9, r7)
            goto L_0x04b0
        L_0x00a6:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = O(r13, r7)
            r14.V(r9, r7)
            goto L_0x04b0
        L_0x00b7:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = O(r13, r7)
            r14.T(r9, r7)
            goto L_0x04b0
        L_0x00c8:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            com.google.android.gms.internal.ads.zzeer r7 = (com.google.android.gms.internal.ads.zzeer) r7
            r14.Q(r9, r7)
            goto L_0x04b0
        L_0x00db:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            com.google.android.gms.internal.ads.z70 r8 = r12.P(r1)
            r14.P(r9, r7, r8)
            goto L_0x04b0
        L_0x00f0:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            u(r9, r7, r14)
            goto L_0x04b0
        L_0x0101:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = X(r13, r7)
            r14.L(r9, r7)
            goto L_0x04b0
        L_0x0112:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = O(r13, r7)
            r14.O(r9, r7)
            goto L_0x04b0
        L_0x0123:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = W(r13, r7)
            r14.A(r9, r7)
            goto L_0x04b0
        L_0x0134:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = O(r13, r7)
            r14.D(r9, r7)
            goto L_0x04b0
        L_0x0145:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = W(r13, r7)
            r14.I(r9, r7)
            goto L_0x04b0
        L_0x0156:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = W(r13, r7)
            r14.G(r9, r7)
            goto L_0x04b0
        L_0x0167:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = N(r13, r7)
            r14.q(r9, r7)
            goto L_0x04b0
        L_0x0178:
            boolean r8 = r12.z(r13, r9, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = L(r13, r7)
            r14.B(r9, r7)
            goto L_0x04b0
        L_0x0189:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            r12.w(r14, r9, r7, r1)
            goto L_0x04b0
        L_0x0194:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.z70 r9 = r12.P(r1)
            com.google.android.gms.internal.ads.b80.t(r8, r7, r14, r9)
            goto L_0x04b0
        L_0x01a7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.I(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01b6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.P(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01c5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.K(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01d4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.R(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01e3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.S(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x01f2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.N(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0201:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.T(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0210:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.Q(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x021f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.J(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x022e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.L(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x023d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.H(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x024c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.E(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x025b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.u(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x026a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.e(r8, r7, r14, r4)
            goto L_0x04b0
        L_0x0279:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.I(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0288:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.P(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0297:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.K(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02a6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.R(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02b5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.S(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02c4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.N(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x02d3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.s(r8, r7, r14)
            goto L_0x04b0
        L_0x02e2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.z70 r9 = r12.P(r1)
            com.google.android.gms.internal.ads.b80.d(r8, r7, r14, r9)
            goto L_0x04b0
        L_0x02f5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.c(r8, r7, r14)
            goto L_0x04b0
        L_0x0304:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.T(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0313:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.Q(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0322:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.J(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0331:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.L(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x0340:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.H(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x034f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.E(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x035e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.u(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x036d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.b80.e(r8, r7, r14, r5)
            goto L_0x04b0
        L_0x037c:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            com.google.android.gms.internal.ads.z70 r8 = r12.P(r1)
            r14.N(r9, r7, r8)
            goto L_0x04b0
        L_0x0391:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.v80.B(r13, r7)
            r14.M(r9, r7)
            goto L_0x04b0
        L_0x03a2:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.v80.z(r13, r7)
            r14.W(r9, r7)
            goto L_0x04b0
        L_0x03b3:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.v80.B(r13, r7)
            r14.J(r9, r7)
            goto L_0x04b0
        L_0x03c4:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.v80.z(r13, r7)
            r14.S(r9, r7)
            goto L_0x04b0
        L_0x03d5:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.v80.z(r13, r7)
            r14.V(r9, r7)
            goto L_0x04b0
        L_0x03e6:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.v80.z(r13, r7)
            r14.T(r9, r7)
            goto L_0x04b0
        L_0x03f7:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            com.google.android.gms.internal.ads.zzeer r7 = (com.google.android.gms.internal.ads.zzeer) r7
            r14.Q(r9, r7)
            goto L_0x04b0
        L_0x040a:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            com.google.android.gms.internal.ads.z70 r8 = r12.P(r1)
            r14.P(r9, r7, r8)
            goto L_0x04b0
        L_0x041f:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.v80.G(r13, r7)
            u(r9, r7, r14)
            goto L_0x04b0
        L_0x0430:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = com.google.android.gms.internal.ads.v80.D(r13, r7)
            r14.L(r9, r7)
            goto L_0x04b0
        L_0x0441:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.v80.z(r13, r7)
            r14.O(r9, r7)
            goto L_0x04b0
        L_0x0451:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.v80.B(r13, r7)
            r14.A(r9, r7)
            goto L_0x04b0
        L_0x0461:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.v80.z(r13, r7)
            r14.D(r9, r7)
            goto L_0x04b0
        L_0x0471:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.v80.B(r13, r7)
            r14.I(r9, r7)
            goto L_0x04b0
        L_0x0481:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.v80.B(r13, r7)
            r14.G(r9, r7)
            goto L_0x04b0
        L_0x0491:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = com.google.android.gms.internal.ads.v80.E(r13, r7)
            r14.q(r9, r7)
            goto L_0x04b0
        L_0x04a1:
            boolean r8 = r12.K(r13, r1)
            if (r8 == 0) goto L_0x04b0
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = com.google.android.gms.internal.ads.v80.F(r13, r7)
            r14.B(r9, r7)
        L_0x04b0:
            int r1 = r1 + -3
            goto L_0x0038
        L_0x04b4:
            com.google.android.gms.internal.ads.h60<?> r13 = r12.p
            r13.a(r0)
            throw r3
        L_0x04ba:
            if (r0 != 0) goto L_0x04bd
            return
        L_0x04bd:
            com.google.android.gms.internal.ads.h60<?> r13 = r12.p
            r13.f(r14, r0)
            throw r3
        L_0x04c3:
            boolean r0 = r12.h
            if (r0 == 0) goto L_0x0979
            boolean r0 = r12.f4292f
            if (r0 == 0) goto L_0x04e4
            com.google.android.gms.internal.ads.h60<?> r0 = r12.p
            com.google.android.gms.internal.ads.l60 r0 = r0.g(r13)
            com.google.android.gms.internal.ads.e80<T, java.lang.Object> r1 = r0.f4450a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04e4
            java.util.Iterator r0 = r0.d()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x04e5
        L_0x04e4:
            r0 = r3
        L_0x04e5:
            int[] r1 = r12.f4287a
            int r1 = r1.length
            r7 = 0
        L_0x04e9:
            if (r7 >= r1) goto L_0x096b
            int r8 = r12.S(r7)
            int[] r9 = r12.f4287a
            r10 = r9[r7]
            if (r0 != 0) goto L_0x0965
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0952;
                case 1: goto L_0x0942;
                case 2: goto L_0x0932;
                case 3: goto L_0x0922;
                case 4: goto L_0x0912;
                case 5: goto L_0x0902;
                case 6: goto L_0x08f2;
                case 7: goto L_0x08e1;
                case 8: goto L_0x08d0;
                case 9: goto L_0x08bb;
                case 10: goto L_0x08a8;
                case 11: goto L_0x0897;
                case 12: goto L_0x0886;
                case 13: goto L_0x0875;
                case 14: goto L_0x0864;
                case 15: goto L_0x0853;
                case 16: goto L_0x0842;
                case 17: goto L_0x082d;
                case 18: goto L_0x081e;
                case 19: goto L_0x080f;
                case 20: goto L_0x0800;
                case 21: goto L_0x07f1;
                case 22: goto L_0x07e2;
                case 23: goto L_0x07d3;
                case 24: goto L_0x07c4;
                case 25: goto L_0x07b5;
                case 26: goto L_0x07a6;
                case 27: goto L_0x0793;
                case 28: goto L_0x0784;
                case 29: goto L_0x0775;
                case 30: goto L_0x0766;
                case 31: goto L_0x0757;
                case 32: goto L_0x0748;
                case 33: goto L_0x0739;
                case 34: goto L_0x072a;
                case 35: goto L_0x071b;
                case 36: goto L_0x070c;
                case 37: goto L_0x06fd;
                case 38: goto L_0x06ee;
                case 39: goto L_0x06df;
                case 40: goto L_0x06d0;
                case 41: goto L_0x06c1;
                case 42: goto L_0x06b2;
                case 43: goto L_0x06a3;
                case 44: goto L_0x0694;
                case 45: goto L_0x0685;
                case 46: goto L_0x0676;
                case 47: goto L_0x0667;
                case 48: goto L_0x0658;
                case 49: goto L_0x0645;
                case 50: goto L_0x063a;
                case 51: goto L_0x0629;
                case 52: goto L_0x0618;
                case 53: goto L_0x0607;
                case 54: goto L_0x05f6;
                case 55: goto L_0x05e5;
                case 56: goto L_0x05d4;
                case 57: goto L_0x05c3;
                case 58: goto L_0x05b2;
                case 59: goto L_0x05a1;
                case 60: goto L_0x058c;
                case 61: goto L_0x0579;
                case 62: goto L_0x0568;
                case 63: goto L_0x0557;
                case 64: goto L_0x0546;
                case 65: goto L_0x0535;
                case 66: goto L_0x0524;
                case 67: goto L_0x0513;
                case 68: goto L_0x04fe;
                default: goto L_0x04fc;
            }
        L_0x04fc:
            goto L_0x0961
        L_0x04fe:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            com.google.android.gms.internal.ads.z70 r9 = r12.P(r7)
            r14.N(r10, r8, r9)
            goto L_0x0961
        L_0x0513:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = W(r13, r8)
            r14.M(r10, r8)
            goto L_0x0961
        L_0x0524:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = O(r13, r8)
            r14.W(r10, r8)
            goto L_0x0961
        L_0x0535:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = W(r13, r8)
            r14.J(r10, r8)
            goto L_0x0961
        L_0x0546:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = O(r13, r8)
            r14.S(r10, r8)
            goto L_0x0961
        L_0x0557:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = O(r13, r8)
            r14.V(r10, r8)
            goto L_0x0961
        L_0x0568:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = O(r13, r8)
            r14.T(r10, r8)
            goto L_0x0961
        L_0x0579:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            com.google.android.gms.internal.ads.zzeer r8 = (com.google.android.gms.internal.ads.zzeer) r8
            r14.Q(r10, r8)
            goto L_0x0961
        L_0x058c:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            com.google.android.gms.internal.ads.z70 r9 = r12.P(r7)
            r14.P(r10, r8, r9)
            goto L_0x0961
        L_0x05a1:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            u(r10, r8, r14)
            goto L_0x0961
        L_0x05b2:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = X(r13, r8)
            r14.L(r10, r8)
            goto L_0x0961
        L_0x05c3:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = O(r13, r8)
            r14.O(r10, r8)
            goto L_0x0961
        L_0x05d4:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = W(r13, r8)
            r14.A(r10, r8)
            goto L_0x0961
        L_0x05e5:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = O(r13, r8)
            r14.D(r10, r8)
            goto L_0x0961
        L_0x05f6:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = W(r13, r8)
            r14.I(r10, r8)
            goto L_0x0961
        L_0x0607:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = W(r13, r8)
            r14.G(r10, r8)
            goto L_0x0961
        L_0x0618:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = N(r13, r8)
            r14.q(r10, r8)
            goto L_0x0961
        L_0x0629:
            boolean r9 = r12.z(r13, r10, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = L(r13, r8)
            r14.B(r10, r8)
            goto L_0x0961
        L_0x063a:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            r12.w(r14, r10, r8, r7)
            goto L_0x0961
        L_0x0645:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.z70 r10 = r12.P(r7)
            com.google.android.gms.internal.ads.b80.t(r9, r8, r14, r10)
            goto L_0x0961
        L_0x0658:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.I(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0667:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.P(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0676:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.K(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0685:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.R(r9, r8, r14, r4)
            goto L_0x0961
        L_0x0694:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.S(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06a3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.N(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06b2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.T(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06c1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.Q(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06d0:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.J(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06df:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.L(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06ee:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.H(r9, r8, r14, r4)
            goto L_0x0961
        L_0x06fd:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.E(r9, r8, r14, r4)
            goto L_0x0961
        L_0x070c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.u(r9, r8, r14, r4)
            goto L_0x0961
        L_0x071b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.e(r9, r8, r14, r4)
            goto L_0x0961
        L_0x072a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.I(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0739:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.P(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0748:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.K(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0757:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.R(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0766:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.S(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0775:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.N(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0784:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.s(r9, r8, r14)
            goto L_0x0961
        L_0x0793:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.z70 r10 = r12.P(r7)
            com.google.android.gms.internal.ads.b80.d(r9, r8, r14, r10)
            goto L_0x0961
        L_0x07a6:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.c(r9, r8, r14)
            goto L_0x0961
        L_0x07b5:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.T(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07c4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.Q(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07d3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.J(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07e2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.L(r9, r8, r14, r5)
            goto L_0x0961
        L_0x07f1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.H(r9, r8, r14, r5)
            goto L_0x0961
        L_0x0800:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.E(r9, r8, r14, r5)
            goto L_0x0961
        L_0x080f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.u(r9, r8, r14, r5)
            goto L_0x0961
        L_0x081e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.b80.e(r9, r8, r14, r5)
            goto L_0x0961
        L_0x082d:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            com.google.android.gms.internal.ads.z70 r9 = r12.P(r7)
            r14.N(r10, r8, r9)
            goto L_0x0961
        L_0x0842:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.v80.B(r13, r8)
            r14.M(r10, r8)
            goto L_0x0961
        L_0x0853:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.v80.z(r13, r8)
            r14.W(r10, r8)
            goto L_0x0961
        L_0x0864:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.v80.B(r13, r8)
            r14.J(r10, r8)
            goto L_0x0961
        L_0x0875:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.v80.z(r13, r8)
            r14.S(r10, r8)
            goto L_0x0961
        L_0x0886:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.v80.z(r13, r8)
            r14.V(r10, r8)
            goto L_0x0961
        L_0x0897:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.v80.z(r13, r8)
            r14.T(r10, r8)
            goto L_0x0961
        L_0x08a8:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            com.google.android.gms.internal.ads.zzeer r8 = (com.google.android.gms.internal.ads.zzeer) r8
            r14.Q(r10, r8)
            goto L_0x0961
        L_0x08bb:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            com.google.android.gms.internal.ads.z70 r9 = r12.P(r7)
            r14.P(r10, r8, r9)
            goto L_0x0961
        L_0x08d0:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.v80.G(r13, r8)
            u(r10, r8, r14)
            goto L_0x0961
        L_0x08e1:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.v80.D(r13, r8)
            r14.L(r10, r8)
            goto L_0x0961
        L_0x08f2:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.v80.z(r13, r8)
            r14.O(r10, r8)
            goto L_0x0961
        L_0x0902:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.v80.B(r13, r8)
            r14.A(r10, r8)
            goto L_0x0961
        L_0x0912:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.v80.z(r13, r8)
            r14.D(r10, r8)
            goto L_0x0961
        L_0x0922:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.v80.B(r13, r8)
            r14.I(r10, r8)
            goto L_0x0961
        L_0x0932:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.v80.B(r13, r8)
            r14.G(r10, r8)
            goto L_0x0961
        L_0x0942:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = com.google.android.gms.internal.ads.v80.E(r13, r8)
            r14.q(r10, r8)
            goto L_0x0961
        L_0x0952:
            boolean r9 = r12.K(r13, r7)
            if (r9 == 0) goto L_0x0961
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = com.google.android.gms.internal.ads.v80.F(r13, r8)
            r14.B(r10, r8)
        L_0x0961:
            int r7 = r7 + 3
            goto L_0x04e9
        L_0x0965:
            com.google.android.gms.internal.ads.h60<?> r13 = r12.p
            r13.a(r0)
            throw r3
        L_0x096b:
            if (r0 != 0) goto L_0x0973
            com.google.android.gms.internal.ads.r80<?, ?> r0 = r12.o
            v(r0, r13, r14)
            return
        L_0x0973:
            com.google.android.gms.internal.ads.h60<?> r13 = r12.p
            r13.f(r14, r0)
            throw r3
        L_0x0979:
            r12.G(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.d(java.lang.Object, com.google.android.gms.internal.ads.j90):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02dc, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0323, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0346, code lost:
        if (r0 == r15) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0348, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ca, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0234, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0239, code lost:
        r2 = r5;
        r29 = r7;
        r18 = r10;
        r7 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.n50 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.h
            if (r0 == 0) goto L_0x038d
            sun.misc.Unsafe r9 = s
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001e:
            if (r0 >= r13) goto L_0x0370
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.google.android.gms.internal.ads.o50.d(r0, r12, r3, r11)
            int r3 = r11.f4632a
            r4 = r0
            r17 = r3
            goto L_0x0033
        L_0x0030:
            r17 = r0
            r4 = r3
        L_0x0033:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.C(r5, r2)
            goto L_0x0044
        L_0x0040:
            int r0 = r15.V(r5)
        L_0x0044:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r25 = r5
            r29 = r9
            r18 = 0
        L_0x004e:
            r20 = -1
            goto L_0x034a
        L_0x0052:
            int[] r0 = r15.f4287a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r33 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0242
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r5) goto L_0x0085
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r18
        L_0x0087:
            if (r0 == r5) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r18
        L_0x0094:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x021d;
                case 1: goto L_0x0206;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01ab;
                case 6: goto L_0x0194;
                case 7: goto L_0x0174;
                case 8: goto L_0x0151;
                case 9: goto L_0x0124;
                case 10: goto L_0x010c;
                case 11: goto L_0x01cd;
                case 12: goto L_0x00f5;
                case 13: goto L_0x0194;
                case 14: goto L_0x01ab;
                case 15: goto L_0x00da;
                case 16: goto L_0x00a5;
                default: goto L_0x0098;
            }
        L_0x0098:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x0239
        L_0x00a5:
            if (r3 != 0) goto L_0x00cc
            int r10 = com.google.android.gms.internal.ads.o50.j(r12, r4, r11)
            long r0 = r11.f4633b
            long r17 = com.google.android.gms.internal.ads.zzefc.v(r0)
            r0 = r2
            r1 = r31
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r33
            r8 = r4
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x028c
        L_0x00cc:
            r25 = r33
            r8 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0239
        L_0x00da:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.ads.o50.h(r12, r4, r11)
            int r1 = r11.f4632a
            int r1 = com.google.android.gms.internal.ads.zzefc.A(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x00f5:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.ads.o50.h(r12, r4, r11)
            int r1 = r11.f4632a
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x010c:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.ads.o50.m(r12, r4, r11)
            java.lang.Object r1 = r11.f4634c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0124:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            com.google.android.gms.internal.ads.z70 r0 = r15.P(r10)
            int r0 = com.google.android.gms.internal.ads.o50.g(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0146
            java.lang.Object r1 = r11.f4634c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0146:
            java.lang.Object r2 = r11.f4634c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzegd.f(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0151:
            r25 = r33
            r10 = r20
            r0 = 2
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0169
            int r0 = com.google.android.gms.internal.ads.o50.k(r12, r4, r11)
            goto L_0x016d
        L_0x0169:
            int r0 = com.google.android.gms.internal.ads.o50.l(r12, r4, r11)
        L_0x016d:
            java.lang.Object r1 = r11.f4634c
            r7.putObject(r14, r8, r1)
            goto L_0x0234
        L_0x0174:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.ads.o50.j(r12, r4, r11)
            long r1 = r11.f4633b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018e
            r1 = 1
            goto L_0x018f
        L_0x018e:
            r1 = 0
        L_0x018f:
            com.google.android.gms.internal.ads.v80.g(r14, r8, r1)
            goto L_0x0234
        L_0x0194:
            r25 = r33
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            int r0 = com.google.android.gms.internal.ads.o50.n(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0234
        L_0x01ab:
            r25 = r33
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x01ca
            long r17 = com.google.android.gms.internal.ads.o50.o(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0234
        L_0x01ca:
            r5 = r4
            goto L_0x0239
        L_0x01cd:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0239
            int r0 = com.google.android.gms.internal.ads.o50.h(r12, r5, r11)
            int r1 = r11.f4632a
            r7.putInt(r14, r8, r1)
            goto L_0x0234
        L_0x01e4:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0239
            int r17 = com.google.android.gms.internal.ads.o50.j(r12, r5, r11)
            long r4 = r11.f4633b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x028c
        L_0x0206:
            r25 = r33
            r5 = r4
            r10 = r20
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0239
            float r0 = com.google.android.gms.internal.ads.o50.q(r12, r5)
            com.google.android.gms.internal.ads.v80.d(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x0234
        L_0x021d:
            r25 = r33
            r5 = r4
            r10 = r20
            r0 = 1
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0239
            double r0 = com.google.android.gms.internal.ads.o50.p(r12, r5)
            com.google.android.gms.internal.ads.v80.c(r14, r8, r0)
            int r0 = r5 + 8
        L_0x0234:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            goto L_0x028c
        L_0x0239:
            r2 = r5
            r29 = r7
            r18 = r10
            r7 = r20
            goto L_0x004e
        L_0x0242:
            r25 = r33
            r5 = r4
            r20 = r7
            r7 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r10 != r0) goto L_0x029f
            r0 = 2
            if (r3 != r0) goto L_0x0292
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.ads.zzegm r0 = (com.google.android.gms.internal.ads.zzegm) r0
            boolean r1 = r0.p()
            if (r1 != 0) goto L_0x0272
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0269
            r1 = 10
            goto L_0x026b
        L_0x0269:
            int r1 = r1 << 1
        L_0x026b:
            com.google.android.gms.internal.ads.zzegm r0 = r0.r(r1)
            r7.putObject(r14, r8, r0)
        L_0x0272:
            r8 = r0
            com.google.android.gms.internal.ads.z70 r0 = r15.P(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r18 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.ads.o50.e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r2 = r18
        L_0x028c:
            r7 = r20
            r1 = r25
            goto L_0x036a
        L_0x0292:
            r18 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r20
            r20 = -1
            goto L_0x0326
        L_0x029f:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02f4
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r33
            r23 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r18
            r19 = r10
            r29 = r20
            r20 = -1
            r9 = r21
            r11 = r19
            r12 = r23
            r14 = r35
            int r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02e0
            goto L_0x0348
        L_0x02e0:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
            r6 = r27
            r7 = r28
            goto L_0x0368
        L_0x02f4:
            r33 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r19 = r10
            r28 = r20
            r1 = r21
            r20 = -1
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x032c
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0326
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r23
            r8 = r35
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x02e0
            goto L_0x0348
        L_0x0326:
            r2 = r15
        L_0x0327:
            r6 = r27
            r7 = r28
            goto L_0x034a
        L_0x032c:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r18
            r13 = r35
            int r0 = r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02e0
        L_0x0348:
            r2 = r0
            goto L_0x0327
        L_0x034a:
            com.google.android.gms.internal.ads.zzejc r4 = E(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.o50.c(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r1 = r25
        L_0x0368:
            r9 = r29
        L_0x036a:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001e
        L_0x0370:
            r27 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0383
            long r1 = (long) r7
            r3 = r31
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0383:
            r4 = r34
            if (r0 != r4) goto L_0x0388
            return
        L_0x0388:
            com.google.android.gms.internal.ads.zzegl r0 = com.google.android.gms.internal.ads.zzegl.h()
            throw r0
        L_0x038d:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.o(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.e(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.n50):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.ads.b80.M(com.google.android.gms.internal.ads.v80.G(r10, r6), com.google.android.gms.internal.ads.v80.G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.ads.v80.B(r10, r6) == com.google.android.gms.internal.ads.v80.B(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.ads.v80.z(r10, r6) == com.google.android.gms.internal.ads.v80.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.v80.B(r10, r6) == com.google.android.gms.internal.ads.v80.B(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.v80.z(r10, r6) == com.google.android.gms.internal.ads.v80.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.v80.z(r10, r6) == com.google.android.gms.internal.ads.v80.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.ads.v80.z(r10, r6) == com.google.android.gms.internal.ads.v80.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.b80.M(com.google.android.gms.internal.ads.v80.G(r10, r6), com.google.android.gms.internal.ads.v80.G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.ads.b80.M(com.google.android.gms.internal.ads.v80.G(r10, r6), com.google.android.gms.internal.ads.v80.G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.ads.b80.M(com.google.android.gms.internal.ads.v80.G(r10, r6), com.google.android.gms.internal.ads.v80.G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.ads.v80.D(r10, r6) == com.google.android.gms.internal.ads.v80.D(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.ads.v80.z(r10, r6) == com.google.android.gms.internal.ads.v80.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.ads.v80.B(r10, r6) == com.google.android.gms.internal.ads.v80.B(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.ads.v80.z(r10, r6) == com.google.android.gms.internal.ads.v80.z(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.ads.v80.B(r10, r6) == com.google.android.gms.internal.ads.v80.B(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.ads.v80.B(r10, r6) == com.google.android.gms.internal.ads.v80.B(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.v80.E(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.v80.E(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.v80.F(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.v80.F(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.b80.M(com.google.android.gms.internal.ads.v80.G(r10, r6), com.google.android.gms.internal.ads.v80.G(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f4287a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.S(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.T(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.v80.z(r10, r4)
            int r4 = com.google.android.gms.internal.ads.v80.z(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.v80.G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.b80.M(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.v80.G(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.b80.M(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.v80.G(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.b80.M(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.v80.G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.b80.M(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.v80.B(r10, r6)
            long r6 = com.google.android.gms.internal.ads.v80.B(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.v80.z(r10, r6)
            int r5 = com.google.android.gms.internal.ads.v80.z(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.v80.B(r10, r6)
            long r6 = com.google.android.gms.internal.ads.v80.B(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.v80.z(r10, r6)
            int r5 = com.google.android.gms.internal.ads.v80.z(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.v80.z(r10, r6)
            int r5 = com.google.android.gms.internal.ads.v80.z(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.v80.z(r10, r6)
            int r5 = com.google.android.gms.internal.ads.v80.z(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.v80.G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.b80.M(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.v80.G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.b80.M(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.v80.G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.b80.M(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.ads.v80.D(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.v80.D(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.v80.z(r10, r6)
            int r5 = com.google.android.gms.internal.ads.v80.z(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.v80.B(r10, r6)
            long r6 = com.google.android.gms.internal.ads.v80.B(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.v80.z(r10, r6)
            int r5 = com.google.android.gms.internal.ads.v80.z(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.v80.B(r10, r6)
            long r6 = com.google.android.gms.internal.ads.v80.B(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.v80.B(r10, r6)
            long r6 = com.google.android.gms.internal.ads.v80.B(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.ads.v80.E(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.ads.v80.E(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.ads.v80.F(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.ads.v80.F(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.ads.r80<?, ?> r0 = r9.o
            java.lang.Object r0 = r0.j(r10)
            com.google.android.gms.internal.ads.r80<?, ?> r2 = r9.o
            java.lang.Object r2 = r2.j(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f4292f
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.ads.h60<?> r0 = r9.p
            com.google.android.gms.internal.ads.l60 r10 = r0.g(r10)
            com.google.android.gms.internal.ads.h60<?> r0 = r9.p
            com.google.android.gms.internal.ads.l60 r11 = r0.g(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.f(java.lang.Object, java.lang.Object):boolean");
    }

    public final T g() {
        return this.m.a(this.f4291e);
    }

    public final boolean h(T t) {
        int i2;
        int i3;
        T t2 = t;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.k) {
                return !this.f4292f || this.p.g(t2).c();
            }
            int i7 = this.j[i6];
            int i8 = this.f4287a[i7];
            int S = S(i7);
            int i9 = this.f4287a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = s.getInt(t2, (long) i10);
                }
                i2 = i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & S) != 0) && !A(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & S) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (z(t2, i8, i7) && !B(t2, S, P(i7))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 != 50) {
                            continue;
                        } else {
                            Map<?, ?> b2 = this.q.b(v80.G(t2, (long) (S & 1048575)));
                            if (!b2.isEmpty()) {
                                if (this.q.a(Q(i7)).f3798c.f() == zzejt.MESSAGE) {
                                    z70<?> z70 = null;
                                    Iterator<?> it = b2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (z70 == null) {
                                            z70 = s70.b().c(next.getClass());
                                        }
                                        if (!z70.h(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) v80.G(t2, (long) (S & 1048575));
                if (!list.isEmpty()) {
                    z70 P = P(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!P.h(list.get(i13))) {
                            z = false;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (A(t, i7, i3, i2, i11) && !B(t2, S, P(i7))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f4287a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.S(r1)
            int[] r4 = r8.f4287a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = X(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.e(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = N(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = L(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.v80.B(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.v80.z(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.v80.B(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.v80.z(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.v80.z(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.v80.z(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.v80.G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.v80.D(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.e(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.v80.z(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.v80.B(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.v80.z(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.v80.B(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.v80.B(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.v80.E(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.v80.F(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zzegd.g(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.r80<?, ?> r0 = r8.o
            java.lang.Object r0 = r0.j(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f4292f
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.h60<?> r0 = r8.p
            com.google.android.gms.internal.ads.l60 r9 = r0.g(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.i(java.lang.Object):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:149|150|(1:152)|153|(5:175|155|(2:158|156)|256|(2:160|264)(1:265))(1:252)) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r8.e(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0598, code lost:
        if (r9 == null) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x059a, code lost:
        r9 = r8.k(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05a3, code lost:
        if (r8.f(r9, r12) == false) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x05a5, code lost:
        r12 = r10.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x05a9, code lost:
        if (r12 < r10.l) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x05ab, code lost:
        r9 = s(r11, r10.j[r12], r9, r8);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x05b6, code lost:
        if (r9 != null) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x05b8, code lost:
        r8.r(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x0595 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(T r11, com.google.android.gms.internal.ads.t70 r12, com.google.android.gms.internal.ads.zzefo r13) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            if (r13 == 0) goto L_0x05d4
            com.google.android.gms.internal.ads.r80<?, ?> r8 = r10.o
            com.google.android.gms.internal.ads.h60<?> r1 = r10.p
            r9 = r0
        L_0x0008:
            int r2 = r12.X()     // Catch:{ all -> 0x05bc }
            int r3 = r10.V(r2)     // Catch:{ all -> 0x05bc }
            if (r3 >= 0) goto L_0x006f
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x002e
            int r12 = r10.k
        L_0x0019:
            int r13 = r10.l
            if (r12 >= r13) goto L_0x0028
            int[] r13 = r10.j
            r13 = r13[r12]
            java.lang.Object r9 = r10.s(r11, r13, r9, r8)
            int r12 = r12 + 1
            goto L_0x0019
        L_0x0028:
            if (r9 == 0) goto L_0x002d
            r8.r(r11, r9)
        L_0x002d:
            return
        L_0x002e:
            boolean r3 = r10.f4292f     // Catch:{ all -> 0x05bc }
            if (r3 != 0) goto L_0x0034
            r3 = r0
            goto L_0x003b
        L_0x0034:
            com.google.android.gms.internal.ads.zzehl r3 = r10.f4291e     // Catch:{ all -> 0x05bc }
            java.lang.Object r2 = r1.b(r13, r3, r2)     // Catch:{ all -> 0x05bc }
            r3 = r2
        L_0x003b:
            if (r3 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.l60 r5 = r1.h(r11)     // Catch:{ all -> 0x05bc }
            r2 = r12
            r4 = r13
            r6 = r9
            r7 = r8
            r1.c(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x05bc }
            throw r0
        L_0x0049:
            r8.e(r12)     // Catch:{ all -> 0x05bc }
            if (r9 != 0) goto L_0x0052
            java.lang.Object r9 = r8.k(r11)     // Catch:{ all -> 0x05bc }
        L_0x0052:
            boolean r2 = r8.f(r9, r12)     // Catch:{ all -> 0x05bc }
            if (r2 != 0) goto L_0x0008
            int r12 = r10.k
        L_0x005a:
            int r13 = r10.l
            if (r12 >= r13) goto L_0x0069
            int[] r13 = r10.j
            r13 = r13[r12]
            java.lang.Object r9 = r10.s(r11, r13, r9, r8)
            int r12 = r12 + 1
            goto L_0x005a
        L_0x0069:
            if (r9 == 0) goto L_0x006e
            r8.r(r11, r9)
        L_0x006e:
            return
        L_0x006f:
            int r4 = r10.S(r3)     // Catch:{ all -> 0x05bc }
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            r6 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x0569;
                case 1: goto L_0x055a;
                case 2: goto L_0x054b;
                case 3: goto L_0x053c;
                case 4: goto L_0x052d;
                case 5: goto L_0x051e;
                case 6: goto L_0x050f;
                case 7: goto L_0x0500;
                case 8: goto L_0x04f8;
                case 9: goto L_0x04c7;
                case 10: goto L_0x04b8;
                case 11: goto L_0x04a9;
                case 12: goto L_0x0487;
                case 13: goto L_0x0478;
                case 14: goto L_0x0469;
                case 15: goto L_0x045a;
                case 16: goto L_0x044b;
                case 17: goto L_0x041a;
                case 18: goto L_0x040c;
                case 19: goto L_0x03fe;
                case 20: goto L_0x03f0;
                case 21: goto L_0x03e2;
                case 22: goto L_0x03d4;
                case 23: goto L_0x03c6;
                case 24: goto L_0x03b8;
                case 25: goto L_0x03aa;
                case 26: goto L_0x0388;
                case 27: goto L_0x0376;
                case 28: goto L_0x0368;
                case 29: goto L_0x035a;
                case 30: goto L_0x0345;
                case 31: goto L_0x0337;
                case 32: goto L_0x0329;
                case 33: goto L_0x031b;
                case 34: goto L_0x030d;
                case 35: goto L_0x02ff;
                case 36: goto L_0x02f1;
                case 37: goto L_0x02e3;
                case 38: goto L_0x02d5;
                case 39: goto L_0x02c7;
                case 40: goto L_0x02b9;
                case 41: goto L_0x02ab;
                case 42: goto L_0x029d;
                case 43: goto L_0x028f;
                case 44: goto L_0x027a;
                case 45: goto L_0x026c;
                case 46: goto L_0x025e;
                case 47: goto L_0x0250;
                case 48: goto L_0x0242;
                case 49: goto L_0x0230;
                case 50: goto L_0x01ee;
                case 51: goto L_0x01dc;
                case 52: goto L_0x01ca;
                case 53: goto L_0x01b8;
                case 54: goto L_0x01a6;
                case 55: goto L_0x0194;
                case 56: goto L_0x0182;
                case 57: goto L_0x0170;
                case 58: goto L_0x015e;
                case 59: goto L_0x0156;
                case 60: goto L_0x0125;
                case 61: goto L_0x0117;
                case 62: goto L_0x0105;
                case 63: goto L_0x00e0;
                case 64: goto L_0x00ce;
                case 65: goto L_0x00bc;
                case 66: goto L_0x00aa;
                case 67: goto L_0x0098;
                case 68: goto L_0x0086;
                default: goto L_0x007e;
            }
        L_0x007e:
            if (r9 != 0) goto L_0x0578
            java.lang.Object r9 = r8.n()     // Catch:{ zzego -> 0x0595 }
            goto L_0x0578
        L_0x0086:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.z70 r6 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r6 = r12.N(r6, r13)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0098:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.O()     // Catch:{ zzego -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x00aa:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            int r6 = r12.d0()     // Catch:{ zzego -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x00bc:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.a0()     // Catch:{ zzego -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x00ce:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            int r6 = r12.U()     // Catch:{ zzego -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x00e0:
            int r5 = r12.Q()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.zzegi r7 = r10.R(r3)     // Catch:{ zzego -> 0x0595 }
            if (r7 == 0) goto L_0x00f7
            boolean r7 = r7.a(r5)     // Catch:{ zzego -> 0x0595 }
            if (r7 == 0) goto L_0x00f1
            goto L_0x00f7
        L_0x00f1:
            java.lang.Object r9 = com.google.android.gms.internal.ads.b80.a(r2, r5, r9, r8)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x00f7:
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzego -> 0x0595 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r6, r4)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0105:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            int r6 = r12.J()     // Catch:{ zzego -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0117:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.zzeer r6 = r12.F()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0125:
            boolean r5 = r10.z(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            if (r5 == 0) goto L_0x0141
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r6 = com.google.android.gms.internal.ads.v80.G(r11, r4)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.z70 r7 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r7 = r12.I(r7, r13)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzegd.f(r6, r7)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0151
        L_0x0141:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.z70 r6 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r6 = r12.I(r6, r13)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
        L_0x0151:
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0156:
            r10.x(r11, r4, r12)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x015e:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            boolean r6 = r12.g0()     // Catch:{ zzego -> 0x0595 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0170:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            int r6 = r12.b0()     // Catch:{ zzego -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0182:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.W()     // Catch:{ zzego -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0194:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            int r6 = r12.R()     // Catch:{ zzego -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x01a6:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.H()     // Catch:{ zzego -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x01b8:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.M()     // Catch:{ zzego -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x01ca:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            float r6 = r12.f0()     // Catch:{ zzego -> 0x0595 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x01dc:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzego -> 0x0595 }
            double r6 = r12.L()     // Catch:{ zzego -> 0x0595 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.F(r11, r2, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x01ee:
            java.lang.Object r2 = r10.Q(r3)     // Catch:{ zzego -> 0x0595 }
            int r3 = r10.S(r3)     // Catch:{ zzego -> 0x0595 }
            r3 = r3 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.v80.G(r11, r3)     // Catch:{ zzego -> 0x0595 }
            if (r5 != 0) goto L_0x0208
            com.google.android.gms.internal.ads.f70 r5 = r10.q     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r5 = r5.f(r2)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r3, r5)     // Catch:{ zzego -> 0x0595 }
            goto L_0x021f
        L_0x0208:
            com.google.android.gms.internal.ads.f70 r6 = r10.q     // Catch:{ zzego -> 0x0595 }
            boolean r6 = r6.c(r5)     // Catch:{ zzego -> 0x0595 }
            if (r6 == 0) goto L_0x021f
            com.google.android.gms.internal.ads.f70 r6 = r10.q     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r6 = r6.f(r2)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.f70 r7 = r10.q     // Catch:{ zzego -> 0x0595 }
            r7.e(r6, r5)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r3, r6)     // Catch:{ zzego -> 0x0595 }
            r5 = r6
        L_0x021f:
            com.google.android.gms.internal.ads.f70 r3 = r10.q     // Catch:{ zzego -> 0x0595 }
            java.util.Map r3 = r3.h(r5)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.f70 r4 = r10.q     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.d70 r2 = r4.a(r2)     // Catch:{ zzego -> 0x0595 }
            r12.T(r3, r2, r13)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0230:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.z70 r2 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v60 r3 = r10.n     // Catch:{ zzego -> 0x0595 }
            java.util.List r3 = r3.a(r11, r4)     // Catch:{ zzego -> 0x0595 }
            r12.G(r3, r2, r13)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0242:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.P(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0250:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.A(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x025e:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.D(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x026c:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.E(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x027a:
            com.google.android.gms.internal.ads.v60 r5 = r10.n     // Catch:{ zzego -> 0x0595 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzego -> 0x0595 }
            java.util.List r4 = r5.a(r11, r6)     // Catch:{ zzego -> 0x0595 }
            r12.c0(r4)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.zzegi r3 = r10.R(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r9 = com.google.android.gms.internal.ads.b80.b(r2, r4, r3, r9, r8)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x028f:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.h0(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x029d:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.K(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x02ab:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.s(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x02b9:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.i(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x02c7:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.m(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x02d5:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.z(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x02e3:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.w(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x02f1:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.t(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x02ff:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.v(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x030d:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.P(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x031b:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.A(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0329:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.D(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0337:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.E(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0345:
            com.google.android.gms.internal.ads.v60 r5 = r10.n     // Catch:{ zzego -> 0x0595 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzego -> 0x0595 }
            java.util.List r4 = r5.a(r11, r6)     // Catch:{ zzego -> 0x0595 }
            r12.c0(r4)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.zzegi r3 = r10.R(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r9 = com.google.android.gms.internal.ads.b80.b(r2, r4, r3, r9, r8)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x035a:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.h0(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0368:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.S(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0376:
            com.google.android.gms.internal.ads.z70 r2 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v60 r5 = r10.n     // Catch:{ zzego -> 0x0595 }
            java.util.List r3 = r5.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.C(r3, r2, r13)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0388:
            boolean r2 = U(r4)     // Catch:{ zzego -> 0x0595 }
            if (r2 == 0) goto L_0x039c
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.Y(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x039c:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.Z(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x03aa:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.K(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x03b8:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.s(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x03c6:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.i(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x03d4:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.m(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x03e2:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.z(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x03f0:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.w(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x03fe:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.t(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x040c:
            com.google.android.gms.internal.ads.v60 r2 = r10.n     // Catch:{ zzego -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzego -> 0x0595 }
            java.util.List r2 = r2.a(r11, r3)     // Catch:{ zzego -> 0x0595 }
            r12.v(r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x041a:
            boolean r2 = r10.K(r11, r3)     // Catch:{ zzego -> 0x0595 }
            if (r2 == 0) goto L_0x0438
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.v80.G(r11, r4)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.z70 r3 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r3 = r12.N(r3, r13)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzegd.f(r2, r3)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0438:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.z70 r2 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r2 = r12.N(r2, r13)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x044b:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.O()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.e(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x045a:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            int r2 = r12.d0()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.k(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0469:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.a0()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.e(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0478:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            int r2 = r12.U()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.k(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0487:
            int r5 = r12.Q()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.zzegi r7 = r10.R(r3)     // Catch:{ zzego -> 0x0595 }
            if (r7 == 0) goto L_0x049e
            boolean r7 = r7.a(r5)     // Catch:{ zzego -> 0x0595 }
            if (r7 == 0) goto L_0x0498
            goto L_0x049e
        L_0x0498:
            java.lang.Object r9 = com.google.android.gms.internal.ads.b80.a(r2, r5, r9, r8)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x049e:
            r2 = r4 & r6
            long r6 = (long) r2     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.k(r11, r6, r5)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x04a9:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            int r2 = r12.J()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.k(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x04b8:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.zzeer r2 = r12.F()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x04c7:
            boolean r2 = r10.K(r11, r3)     // Catch:{ zzego -> 0x0595 }
            if (r2 == 0) goto L_0x04e5
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.v80.G(r11, r4)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.z70 r3 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r3 = r12.I(r3, r13)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzegd.f(r2, r3)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x04e5:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.z70 r2 = r10.P(r3)     // Catch:{ zzego -> 0x0595 }
            java.lang.Object r2 = r12.I(r2, r13)     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.f(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x04f8:
            r10.x(r11, r4, r12)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0500:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            boolean r2 = r12.g0()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.g(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x050f:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            int r2 = r12.b0()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.k(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x051e:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.W()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.e(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x052d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            int r2 = r12.R()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.k(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x053c:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.H()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.e(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x054b:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            long r6 = r12.M()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.e(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x055a:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            float r2 = r12.f0()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.d(r11, r4, r2)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0569:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzego -> 0x0595 }
            double r6 = r12.L()     // Catch:{ zzego -> 0x0595 }
            com.google.android.gms.internal.ads.v80.c(r11, r4, r6)     // Catch:{ zzego -> 0x0595 }
            r10.M(r11, r3)     // Catch:{ zzego -> 0x0595 }
            goto L_0x0008
        L_0x0578:
            boolean r2 = r8.f(r9, r12)     // Catch:{ zzego -> 0x0595 }
            if (r2 != 0) goto L_0x0008
            int r12 = r10.k
        L_0x0580:
            int r13 = r10.l
            if (r12 >= r13) goto L_0x058f
            int[] r13 = r10.j
            r13 = r13[r12]
            java.lang.Object r9 = r10.s(r11, r13, r9, r8)
            int r12 = r12 + 1
            goto L_0x0580
        L_0x058f:
            if (r9 == 0) goto L_0x0594
            r8.r(r11, r9)
        L_0x0594:
            return
        L_0x0595:
            r8.e(r12)     // Catch:{ all -> 0x05bc }
            if (r9 != 0) goto L_0x059f
            java.lang.Object r2 = r8.k(r11)     // Catch:{ all -> 0x05bc }
            r9 = r2
        L_0x059f:
            boolean r2 = r8.f(r9, r12)     // Catch:{ all -> 0x05bc }
            if (r2 != 0) goto L_0x0008
            int r12 = r10.k
        L_0x05a7:
            int r13 = r10.l
            if (r12 >= r13) goto L_0x05b6
            int[] r13 = r10.j
            r13 = r13[r12]
            java.lang.Object r9 = r10.s(r11, r13, r9, r8)
            int r12 = r12 + 1
            goto L_0x05a7
        L_0x05b6:
            if (r9 == 0) goto L_0x05bb
            r8.r(r11, r9)
        L_0x05bb:
            return
        L_0x05bc:
            r12 = move-exception
            int r13 = r10.k
        L_0x05bf:
            int r0 = r10.l
            if (r13 >= r0) goto L_0x05ce
            int[] r0 = r10.j
            r0 = r0[r13]
            java.lang.Object r9 = r10.s(r11, r0, r9, r8)
            int r13 = r13 + 1
            goto L_0x05bf
        L_0x05ce:
            if (r9 == 0) goto L_0x05d3
            r8.r(r11, r9)
        L_0x05d3:
            throw r12
        L_0x05d4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.j(java.lang.Object, com.google.android.gms.internal.ads.t70, com.google.android.gms.internal.ads.zzefo):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03bb, code lost:
        if (r0 == r15) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03fe, code lost:
        if (r0 == r15) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025a, code lost:
        r5 = r6 | r22;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025e, code lost:
        r3 = r8;
        r1 = r9;
        r9 = r13;
        r13 = r2;
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02cc, code lost:
        r5 = r6 | r22;
        r6 = r30;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x030a, code lost:
        r5 = r6 | r22;
        r6 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x030e, code lost:
        r3 = r8;
        r1 = r9;
        r2 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0312, code lost:
        r13 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0316, code lost:
        r7 = r32;
        r2 = r3;
        r22 = r6;
        r26 = r10;
        r17 = r11;
        r6 = r30;
        r30 = r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int o(T r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.n50 r33) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r33
            sun.misc.Unsafe r10 = s
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x04cb
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.android.gms.internal.ads.o50.d(r0, r12, r3, r9)
            int r3 = r9.f4632a
            r4 = r3
            r3 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r0
        L_0x002b:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x0038
            int r2 = r2 / r8
            int r1 = r15.C(r0, r2)
            goto L_0x003c
        L_0x0038:
            int r1 = r15.V(r0)
        L_0x003c:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004f
            r30 = r0
            r2 = r3
            r8 = r4
            r22 = r5
            r26 = r10
            r7 = r11
            r17 = 0
            r18 = -1
            goto L_0x0428
        L_0x004f:
            int[] r1 = r15.f4287a
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = r4
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r8 & r17
            long r12 = (long) r4
            r4 = 17
            r20 = r8
            if (r11 > r4) goto L_0x0325
            int r4 = r2 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            if (r1 == r6) goto L_0x0085
            if (r6 == r4) goto L_0x007e
            long r8 = (long) r6
            r10.putInt(r14, r8, r5)
        L_0x007e:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r8 = r1
            goto L_0x0086
        L_0x0085:
            r8 = r6
        L_0x0086:
            r6 = r5
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02ee;
                case 1: goto L_0x02d2;
                case 2: goto L_0x02a9;
                case 3: goto L_0x02a9;
                case 4: goto L_0x028c;
                case 5: goto L_0x0265;
                case 6: goto L_0x023d;
                case 7: goto L_0x0210;
                case 8: goto L_0x01e6;
                case 9: goto L_0x01ab;
                case 10: goto L_0x018d;
                case 11: goto L_0x028c;
                case 12: goto L_0x014e;
                case 13: goto L_0x023d;
                case 14: goto L_0x0265;
                case 15: goto L_0x012d;
                case 16: goto L_0x00f9;
                case 17: goto L_0x009c;
                default: goto L_0x008b;
            }
        L_0x008b:
            r12 = r29
            r13 = r33
            r9 = r0
            r11 = r2
            r30 = r8
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0316
        L_0x009c:
            r5 = 3
            if (r7 != r5) goto L_0x00e7
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.android.gms.internal.ads.z70 r1 = r15.P(r2)
            r9 = r0
            r0 = r1
            r18 = -1
            r1 = r29
            r11 = r2
            r2 = r3
            r3 = r31
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r5
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.o50.f(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00c9
            r4 = r33
            java.lang.Object r1 = r4.f4634c
            r10.putObject(r14, r12, r1)
            goto L_0x00d8
        L_0x00c9:
            r4 = r33
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r4.f4634c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzegd.f(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00d8:
            r5 = r6 | r22
            r12 = r29
            r13 = r31
            r3 = r7
            r6 = r8
            r1 = r9
            r2 = r11
            r11 = r32
            r9 = r4
            goto L_0x0019
        L_0x00e7:
            r9 = r0
            r11 = r2
            r7 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            r30 = r8
            r8 = r7
            goto L_0x0316
        L_0x00f9:
            r4 = r33
            r9 = r0
            r11 = r2
            r5 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0125
            r1 = r12
            r12 = r29
            int r7 = com.google.android.gms.internal.ads.o50.j(r12, r3, r4)
            r20 = r1
            long r0 = r4.f4633b
            long r23 = com.google.android.gms.internal.ads.zzefc.v(r0)
            r0 = r10
            r2 = r20
            r1 = r28
            r13 = r4
            r30 = r8
            r8 = r5
            r4 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x02cc
        L_0x0125:
            r12 = r29
            r13 = r4
            r30 = r8
            r8 = r5
            goto L_0x0316
        L_0x012d:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r0 = com.google.android.gms.internal.ads.o50.h(r12, r3, r13)
            int r1 = r13.f4632a
            int r1 = com.google.android.gms.internal.ads.zzefc.A(r1)
            r10.putInt(r14, r4, r1)
            goto L_0x030a
        L_0x014e:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r0 = com.google.android.gms.internal.ads.o50.h(r12, r3, r13)
            int r1 = r13.f4632a
            com.google.android.gms.internal.ads.zzegi r2 = r15.R(r11)
            if (r2 == 0) goto L_0x0188
            boolean r2 = r2.a(r1)
            if (r2 == 0) goto L_0x0173
            goto L_0x0188
        L_0x0173:
            com.google.android.gms.internal.ads.zzejc r2 = E(r28)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.k(r8, r1)
            r5 = r6
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
            r6 = r30
            goto L_0x0312
        L_0x0188:
            r10.putInt(r14, r4, r1)
            goto L_0x030a
        L_0x018d:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x0316
            int r0 = com.google.android.gms.internal.ads.o50.m(r12, r3, r13)
            java.lang.Object r1 = r13.f4634c
            r10.putObject(r14, r4, r1)
            goto L_0x030a
        L_0x01ab:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x01e2
            com.google.android.gms.internal.ads.z70 r0 = r15.P(r11)
            r2 = r31
            int r0 = com.google.android.gms.internal.ads.o50.g(r0, r12, r3, r2, r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x01d3
            java.lang.Object r1 = r13.f4634c
            r10.putObject(r14, r4, r1)
            goto L_0x025a
        L_0x01d3:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r13.f4634c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzegd.f(r1, r3)
            r10.putObject(r14, r4, r1)
            goto L_0x025a
        L_0x01e2:
            r2 = r31
            goto L_0x0316
        L_0x01e6:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r0) goto L_0x0316
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0206
            int r0 = com.google.android.gms.internal.ads.o50.k(r12, r3, r13)
            goto L_0x020a
        L_0x0206:
            int r0 = com.google.android.gms.internal.ads.o50.l(r12, r3, r13)
        L_0x020a:
            java.lang.Object r1 = r13.f4634c
            r10.putObject(r14, r4, r1)
            goto L_0x025a
        L_0x0210:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r0 = com.google.android.gms.internal.ads.o50.j(r12, r3, r13)
            r3 = r0
            long r0 = r13.f4633b
            r20 = 0
            int r7 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x0233
            r0 = 1
            goto L_0x0234
        L_0x0233:
            r0 = 0
        L_0x0234:
            com.google.android.gms.internal.ads.v80.g(r14, r4, r0)
            r5 = r6 | r22
            r6 = r30
            r0 = r3
            goto L_0x025e
        L_0x023d:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r1) goto L_0x0316
            int r0 = com.google.android.gms.internal.ads.o50.n(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x025a:
            r5 = r6 | r22
            r6 = r30
        L_0x025e:
            r3 = r8
            r1 = r9
            r9 = r13
            r13 = r2
            r2 = r11
            goto L_0x04c7
        L_0x0265:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r2 = r31
            r13 = r33
            if (r7 != r0) goto L_0x0316
            long r20 = com.google.android.gms.internal.ads.o50.o(r12, r3)
            r0 = r10
            r1 = r28
            r7 = r3
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x030a
        L_0x028c:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r0 = com.google.android.gms.internal.ads.o50.h(r12, r3, r13)
            int r1 = r13.f4632a
            r10.putInt(r14, r4, r1)
            goto L_0x030a
        L_0x02a9:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != 0) goto L_0x0316
            int r7 = com.google.android.gms.internal.ads.o50.j(r12, r3, r13)
            long r2 = r13.f4633b
            r0 = r10
            r1 = r28
            r20 = r2
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
        L_0x02cc:
            r5 = r6 | r22
            r6 = r30
            r0 = r7
            goto L_0x030e
        L_0x02d2:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r1) goto L_0x0316
            float r0 = com.google.android.gms.internal.ads.o50.q(r12, r3)
            com.google.android.gms.internal.ads.v80.d(r14, r4, r0)
            int r0 = r3 + 4
            goto L_0x030a
        L_0x02ee:
            r9 = r0
            r11 = r2
            r30 = r8
            r4 = r12
            r8 = r19
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r33
            if (r7 != r0) goto L_0x0316
            double r0 = com.google.android.gms.internal.ads.o50.p(r12, r3)
            com.google.android.gms.internal.ads.v80.c(r14, r4, r0)
            int r0 = r3 + 8
        L_0x030a:
            r5 = r6 | r22
            r6 = r30
        L_0x030e:
            r3 = r8
            r1 = r9
            r2 = r11
            r9 = r13
        L_0x0312:
            r13 = r31
            goto L_0x04c7
        L_0x0316:
            r7 = r32
            r2 = r3
            r22 = r6
            r26 = r10
            r17 = r11
            r6 = r30
            r30 = r9
            goto L_0x0428
        L_0x0325:
            r4 = r2
            r1 = r12
            r8 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r29
            r13 = r9
            r9 = r0
            r0 = 27
            if (r11 != r0) goto L_0x038c
            r0 = 2
            if (r7 != r0) goto L_0x037d
            java.lang.Object r0 = r10.getObject(r14, r1)
            com.google.android.gms.internal.ads.zzegm r0 = (com.google.android.gms.internal.ads.zzegm) r0
            boolean r7 = r0.p()
            if (r7 != 0) goto L_0x0357
            int r7 = r0.size()
            if (r7 != 0) goto L_0x034e
            r7 = 10
            goto L_0x0350
        L_0x034e:
            int r7 = r7 << 1
        L_0x0350:
            com.google.android.gms.internal.ads.zzegm r0 = r0.r(r7)
            r10.putObject(r14, r1, r0)
        L_0x0357:
            r7 = r0
            com.google.android.gms.internal.ads.z70 r0 = r15.P(r4)
            r1 = r8
            r2 = r29
            r17 = r4
            r4 = r31
            r22 = r5
            r5 = r7
            r23 = r6
            r6 = r33
            int r0 = com.google.android.gms.internal.ads.o50.e(r0, r1, r2, r3, r4, r5, r6)
            r11 = r32
            r3 = r8
            r1 = r9
            r9 = r13
            r2 = r17
            r5 = r22
            r6 = r23
            r13 = r31
            goto L_0x0019
        L_0x037d:
            r17 = r4
            r22 = r5
            r23 = r6
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            goto L_0x0401
        L_0x038c:
            r17 = r4
            r22 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x03d9
            r6 = r20
            long r5 = (long) r6
            r0 = r27
            r24 = r1
            r1 = r28
            r2 = r29
            r4 = r3
            r15 = r4
            r4 = r31
            r20 = r5
            r5 = r8
            r6 = r9
            r19 = r8
            r8 = r17
            r30 = r9
            r26 = r10
            r9 = r20
            r12 = r24
            r14 = r33
            int r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x03bf
            goto L_0x0424
        L_0x03bf:
            r15 = r27
            r14 = r28
            r12 = r29
            r1 = r30
            r13 = r31
            r11 = r32
            r9 = r33
            r2 = r17
            r3 = r19
            r5 = r22
            r6 = r23
            r10 = r26
            goto L_0x0019
        L_0x03d9:
            r24 = r1
            r15 = r3
            r19 = r8
            r30 = r9
            r26 = r10
            r6 = r20
            r0 = 50
            if (r11 != r0) goto L_0x0409
            r0 = 2
            if (r7 != r0) goto L_0x0401
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r17
            r6 = r24
            r8 = r33
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x03bf
            goto L_0x0424
        L_0x0401:
            r7 = r32
            r2 = r15
        L_0x0404:
            r8 = r19
            r6 = r23
            goto L_0x0428
        L_0x0409:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r8 = r6
            r6 = r30
            r9 = r11
            r10 = r24
            r12 = r17
            r13 = r33
            int r0 = r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x04af
        L_0x0424:
            r7 = r32
            r2 = r0
            goto L_0x0404
        L_0x0428:
            if (r8 != r7) goto L_0x0437
            if (r7 != 0) goto L_0x042d
            goto L_0x0437
        L_0x042d:
            r9 = r27
            r12 = r28
            r0 = r2
            r3 = r8
            r5 = r22
            goto L_0x04d4
        L_0x0437:
            r9 = r27
            boolean r0 = r9.f4292f
            if (r0 == 0) goto L_0x0488
            r10 = r33
            com.google.android.gms.internal.ads.zzefo r0 = r10.f4635d
            com.google.android.gms.internal.ads.zzefo r1 = com.google.android.gms.internal.ads.zzefo.b()
            if (r0 == r1) goto L_0x0483
            com.google.android.gms.internal.ads.zzehl r0 = r9.f4291e
            com.google.android.gms.internal.ads.zzefo r1 = r10.f4635d
            r11 = r30
            com.google.android.gms.internal.ads.zzegb$zzf r0 = r1.a(r0, r11)
            if (r0 != 0) goto L_0x0473
            com.google.android.gms.internal.ads.zzejc r4 = E(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.o50.c(r0, r1, r2, r3, r4, r5)
            r14 = r28
            r12 = r29
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r2 = r17
            r5 = r22
            r10 = r26
            goto L_0x04ac
        L_0x0473:
            r12 = r28
            r0 = r12
            com.google.android.gms.internal.ads.zzegb$zzd r0 = (com.google.android.gms.internal.ads.zzegb.zzd) r0
            r0.G()
            com.google.android.gms.internal.ads.l60<com.google.android.gms.internal.ads.zzegb$a> r0 = r0.zzien
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0483:
            r12 = r28
            r11 = r30
            goto L_0x048e
        L_0x0488:
            r12 = r28
            r11 = r30
            r10 = r33
        L_0x048e:
            com.google.android.gms.internal.ads.zzejc r4 = E(r28)
            r0 = r8
            r1 = r29
            r3 = r31
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.o50.c(r0, r1, r2, r3, r4, r5)
            r13 = r31
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r14 = r12
            r2 = r17
            r5 = r22
            r10 = r26
            r12 = r29
        L_0x04ac:
            r11 = r7
            goto L_0x0019
        L_0x04af:
            r11 = r30
            r8 = r19
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r9 = r33
            r3 = r8
            r1 = r11
            r2 = r17
            r5 = r22
            r6 = r23
            r10 = r26
        L_0x04c7:
            r11 = r32
            goto L_0x0019
        L_0x04cb:
            r22 = r5
            r23 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x04d4:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x04df
            long r1 = (long) r6
            r4 = r26
            r4.putInt(r12, r1, r5)
        L_0x04df:
            r1 = 0
            int r2 = r9.k
        L_0x04e2:
            int r4 = r9.l
            if (r2 >= r4) goto L_0x04f5
            int[] r4 = r9.j
            r4 = r4[r2]
            com.google.android.gms.internal.ads.r80<?, ?> r5 = r9.o
            java.lang.Object r1 = r9.s(r12, r4, r1, r5)
            com.google.android.gms.internal.ads.zzejc r1 = (com.google.android.gms.internal.ads.zzejc) r1
            int r2 = r2 + 1
            goto L_0x04e2
        L_0x04f5:
            if (r1 == 0) goto L_0x04fc
            com.google.android.gms.internal.ads.r80<?, ?> r2 = r9.o
            r2.r(r12, r1)
        L_0x04fc:
            if (r7 != 0) goto L_0x0508
            r1 = r31
            if (r0 != r1) goto L_0x0503
            goto L_0x050e
        L_0x0503:
            com.google.android.gms.internal.ads.zzegl r0 = com.google.android.gms.internal.ads.zzegl.h()
            throw r0
        L_0x0508:
            r1 = r31
            if (r0 > r1) goto L_0x050f
            if (r3 != r7) goto L_0x050f
        L_0x050e:
            return r0
        L_0x050f:
            com.google.android.gms.internal.ads.zzegl r0 = com.google.android.gms.internal.ads.zzegl.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j70.o(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.n50):int");
    }
}
