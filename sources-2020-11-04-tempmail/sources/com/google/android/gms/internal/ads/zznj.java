package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zznj implements zzke {

    /* renamed from: a  reason: collision with root package name */
    private final zzoi f9081a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9082b;

    /* renamed from: c  reason: collision with root package name */
    private final md0 f9083c = new md0();

    /* renamed from: d  reason: collision with root package name */
    private final zzng f9084d = new zzng();

    /* renamed from: e  reason: collision with root package name */
    private final zzpi f9085e = new zzpi(32);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f9086f = new AtomicInteger();
    private nd0 g;
    private nd0 h;
    private zzhq i;
    private zzhq j;
    private long k;
    private int l;
    private zznl m;

    public zznj(zzoi zzoi) {
        this.f9081a = zzoi;
        this.f9082b = zzoi.h();
        int i2 = this.f9082b;
        this.l = i2;
        nd0 nd0 = new nd0(0, i2);
        this.g = nd0;
        this.h = nd0;
    }

    private final void g(long j2, byte[] bArr, int i2) {
        k(j2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j2 - this.g.f4664a);
            int min = Math.min(i2 - i3, this.f9082b - i4);
            zzoj zzoj = this.g.f4667d;
            System.arraycopy(zzoj.f9121a, zzoj.a(i4), bArr, i3, min);
            j2 += (long) min;
            i3 += min;
            if (j2 == this.g.f4665b) {
                this.f9081a.j(zzoj);
                this.g = this.g.a();
            }
        }
    }

    private final int i(int i2) {
        if (this.l == this.f9082b) {
            this.l = 0;
            nd0 nd0 = this.h;
            if (nd0.f4666c) {
                this.h = nd0.f4668e;
            }
            nd0 nd02 = this.h;
            zzoj g2 = this.f9081a.g();
            nd0 nd03 = new nd0(this.h.f4665b, this.f9082b);
            nd02.f4667d = g2;
            nd02.f4668e = nd03;
            nd02.f4666c = true;
        }
        return Math.min(i2, this.f9082b - this.l);
    }

    private final void k(long j2) {
        while (true) {
            nd0 nd0 = this.g;
            if (j2 >= nd0.f4665b) {
                this.f9081a.j(nd0.f4667d);
                this.g = this.g.a();
            } else {
                return;
            }
        }
    }

    private final void m() {
        this.f9083c.g();
        nd0 nd0 = this.g;
        if (nd0.f4666c) {
            nd0 nd02 = this.h;
            int i2 = (nd02.f4666c ? 1 : 0) + (((int) (nd02.f4664a - nd0.f4664a)) / this.f9082b);
            zzoj[] zzojArr = new zzoj[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zzojArr[i3] = nd0.f4667d;
                nd0 = nd0.a();
            }
            this.f9081a.i(zzojArr);
        }
        nd0 nd03 = new nd0(0, this.f9082b);
        this.g = nd03;
        this.h = nd03;
        this.k = 0;
        this.l = this.f9082b;
        this.f9081a.f();
    }

    private final boolean r() {
        return this.f9086f.compareAndSet(0, 1);
    }

    private final void s() {
        if (!this.f9086f.compareAndSet(1, 0)) {
            m();
        }
    }

    public final void a(zzpi zzpi, int i2) {
        if (!r()) {
            zzpi.m(i2);
            return;
        }
        while (i2 > 0) {
            int i3 = i(i2);
            zzoj zzoj = this.h.f4667d;
            zzpi.p(zzoj.f9121a, zzoj.a(this.l), i3);
            this.l += i3;
            this.k += (long) i3;
            i2 -= i3;
        }
        s();
    }

    public final void b(zzhq zzhq) {
        zzhq zzhq2 = zzhq == null ? null : zzhq;
        boolean e2 = this.f9083c.e(zzhq2);
        this.j = zzhq;
        zznl zznl = this.m;
        if (zznl != null && e2) {
            zznl.p(zzhq2);
        }
    }

    public final int c(zzjw zzjw, int i2, boolean z) throws IOException, InterruptedException {
        if (!r()) {
            int h2 = zzjw.h(i2);
            if (h2 != -1) {
                return h2;
            }
            throw new EOFException();
        }
        try {
            int i3 = i(i2);
            zzoj zzoj = this.h.f4667d;
            int read = zzjw.read(zzoj.f9121a, zzoj.a(this.l), i3);
            if (read != -1) {
                this.l += read;
                this.k += (long) read;
                return read;
            }
            throw new EOFException();
        } finally {
            s();
        }
    }

    public final void d(long j2, int i2, int i3, int i4, zzkh zzkh) {
        if (!r()) {
            long j3 = j2;
            this.f9083c.d(j2);
            return;
        }
        long j4 = j2;
        try {
            this.f9083c.b(j2, i2, (this.k - ((long) i3)) - ((long) i4), i3, zzkh);
        } finally {
            s();
        }
    }

    public final void e() {
        if (this.f9086f.getAndSet(2) == 0) {
            m();
        }
    }

    public final int f(zzhs zzhs, zzjm zzjm, boolean z, boolean z2, long j2) {
        int i2;
        zzjm zzjm2 = zzjm;
        int a2 = this.f9083c.a(zzhs, zzjm, z, z2, this.i, this.f9084d);
        if (a2 == -5) {
            this.i = zzhs.f8920a;
            return -5;
        } else if (a2 == -4) {
            if (!zzjm.f()) {
                if (zzjm2.f8980d < j2) {
                    zzjm2.c(Integer.MIN_VALUE);
                }
                if (zzjm.h()) {
                    zzng zzng = this.f9084d;
                    long j3 = zzng.f9078b;
                    this.f9085e.j(1);
                    g(j3, this.f9085e.f9163a, 1);
                    long j4 = j3 + 1;
                    byte b2 = this.f9085e.f9163a[0];
                    boolean z3 = (b2 & 128) != 0;
                    byte b3 = b2 & Byte.MAX_VALUE;
                    zzji zzji = zzjm2.f8978b;
                    if (zzji.f8958a == null) {
                        zzji.f8958a = new byte[16];
                    }
                    g(j4, zzjm2.f8978b.f8958a, b3);
                    long j5 = j4 + ((long) b3);
                    if (z3) {
                        this.f9085e.j(2);
                        g(j5, this.f9085e.f9163a, 2);
                        j5 += 2;
                        i2 = this.f9085e.h();
                    } else {
                        i2 = 1;
                    }
                    int[] iArr = zzjm2.f8978b.f8961d;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzjm2.f8978b.f8962e;
                    if (iArr3 == null || iArr3.length < i2) {
                        iArr3 = new int[i2];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i3 = i2 * 6;
                        this.f9085e.j(i3);
                        g(j5, this.f9085e.f9163a, i3);
                        j5 += (long) i3;
                        this.f9085e.l(0);
                        for (int i4 = 0; i4 < i2; i4++) {
                            iArr2[i4] = this.f9085e.h();
                            iArr4[i4] = this.f9085e.v();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzng.f9077a - ((int) (j5 - zzng.f9078b));
                    }
                    zzkh zzkh = zzng.f9080d;
                    zzji zzji2 = zzjm2.f8978b;
                    zzji2.a(i2, iArr2, iArr4, zzkh.f8997b, zzji2.f8958a, zzkh.f8996a);
                    long j6 = zzng.f9078b;
                    int i5 = (int) (j5 - j6);
                    zzng.f9078b = j6 + ((long) i5);
                    zzng.f9077a -= i5;
                }
                zzjm2.i(this.f9084d.f9077a);
                zzng zzng2 = this.f9084d;
                long j7 = zzng2.f9078b;
                ByteBuffer byteBuffer = zzjm2.f8979c;
                int i6 = zzng2.f9077a;
                k(j7);
                while (i6 > 0) {
                    int i7 = (int) (j7 - this.g.f4664a);
                    int min = Math.min(i6, this.f9082b - i7);
                    zzoj zzoj = this.g.f4667d;
                    byteBuffer.put(zzoj.f9121a, zzoj.a(i7), min);
                    j7 += (long) min;
                    i6 -= min;
                    if (j7 == this.g.f4665b) {
                        this.f9081a.j(zzoj);
                        this.g = this.g.a();
                    }
                }
                k(this.f9084d.f9079c);
            }
            return -4;
        } else if (a2 == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void h(zznl zznl) {
        this.m = zznl;
    }

    public final boolean j(long j2, boolean z) {
        long c2 = this.f9083c.c(j2, z);
        if (c2 == -1) {
            return false;
        }
        k(c2);
        return true;
    }

    public final long l() {
        return this.f9083c.f();
    }

    public final int n() {
        return this.f9083c.i();
    }

    public final boolean o() {
        return this.f9083c.j();
    }

    public final zzhq p() {
        return this.f9083c.k();
    }

    public final void q() {
        long l2 = this.f9083c.l();
        if (l2 != -1) {
            k(l2);
        }
    }

    public final void t(boolean z) {
        int andSet = this.f9086f.getAndSet(z ? 0 : 2);
        m();
        this.f9083c.h();
        if (andSet == 2) {
            this.i = null;
        }
    }
}
