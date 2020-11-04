package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class qb0 implements ub0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f4896a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final Stack<rb0> f4897b = new Stack<>();

    /* renamed from: c  reason: collision with root package name */
    private final yb0 f4898c = new yb0();

    /* renamed from: d  reason: collision with root package name */
    private tb0 f4899d;

    /* renamed from: e  reason: collision with root package name */
    private int f4900e;

    /* renamed from: f  reason: collision with root package name */
    private int f4901f;
    private long g;

    qb0() {
    }

    private final long d(zzjw zzjw, int i) throws IOException, InterruptedException {
        zzjw.b(this.f4896a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f4896a[i2] & 255));
        }
        return j;
    }

    public final void a() {
        this.f4900e = 0;
        this.f4897b.clear();
        this.f4898c.a();
    }

    public final void b(tb0 tb0) {
        this.f4899d = tb0;
    }

    public final boolean c(zzjw zzjw) throws IOException, InterruptedException {
        String str;
        double d2;
        int d3;
        int c2;
        zzpb.e(this.f4899d != null);
        while (true) {
            if (this.f4897b.isEmpty() || zzjw.getPosition() < this.f4897b.peek().f4990b) {
                if (this.f4900e == 0) {
                    long b2 = this.f4898c.b(zzjw, true, false, 4);
                    if (b2 == -2) {
                        zzjw.c();
                        while (true) {
                            zzjw.a(this.f4896a, 0, 4);
                            d3 = yb0.d(this.f4896a[0]);
                            if (d3 != -1 && d3 <= 4) {
                                c2 = (int) yb0.c(this.f4896a, d3, false);
                                if (this.f4899d.t(c2)) {
                                    break;
                                }
                            }
                            zzjw.d(1);
                        }
                        zzjw.d(d3);
                        b2 = (long) c2;
                    }
                    if (b2 == -1) {
                        return false;
                    }
                    this.f4901f = (int) b2;
                    this.f4900e = 1;
                }
                if (this.f4900e == 1) {
                    this.g = this.f4898c.b(zzjw, false, true, 8);
                    this.f4900e = 2;
                }
                int q = this.f4899d.q(this.f4901f);
                if (q == 0) {
                    zzjw.d((int) this.g);
                    this.f4900e = 0;
                } else if (q == 1) {
                    long position = zzjw.getPosition();
                    this.f4897b.add(new rb0(this.f4901f, this.g + position));
                    this.f4899d.r(this.f4901f, position, this.g);
                    this.f4900e = 0;
                    return true;
                } else if (q == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.f4899d.h(this.f4901f, d(zzjw, (int) j));
                        this.f4900e = 0;
                        return true;
                    }
                    long j2 = this.g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw new zzht(sb.toString());
                } else if (q == 3) {
                    long j3 = this.g;
                    if (j3 <= 2147483647L) {
                        tb0 tb0 = this.f4899d;
                        int i = this.f4901f;
                        int i2 = (int) j3;
                        if (i2 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i2];
                            zzjw.b(bArr, 0, i2);
                            str = new String(bArr);
                        }
                        tb0.m(i, str);
                        this.f4900e = 0;
                        return true;
                    }
                    long j4 = this.g;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j4);
                    throw new zzht(sb2.toString());
                } else if (q == 4) {
                    this.f4899d.s(this.f4901f, (int) this.g, zzjw);
                    this.f4900e = 0;
                    return true;
                } else if (q == 5) {
                    long j5 = this.g;
                    if (j5 == 4 || j5 == 8) {
                        tb0 tb02 = this.f4899d;
                        int i3 = this.f4901f;
                        int i4 = (int) this.g;
                        long d4 = d(zzjw, i4);
                        if (i4 == 4) {
                            d2 = (double) Float.intBitsToFloat((int) d4);
                        } else {
                            d2 = Double.longBitsToDouble(d4);
                        }
                        tb02.p(i3, d2);
                        this.f4900e = 0;
                        return true;
                    }
                    long j6 = this.g;
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j6);
                    throw new zzht(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(q);
                    throw new zzht(sb4.toString());
                }
            } else {
                this.f4899d.u(this.f4897b.pop().f4989a);
                return true;
            }
        }
    }
}
