package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class qa0 implements Handler.Callback, zzmy, zzna, zzoh {
    private long A;
    private int B;
    private ta0 C;
    private long D;
    private sa0 E;
    private sa0 F;
    private sa0 G;
    private zzia H;

    /* renamed from: b  reason: collision with root package name */
    private final zzhv[] f4889b;

    /* renamed from: c  reason: collision with root package name */
    private final zzhy[] f4890c;

    /* renamed from: d  reason: collision with root package name */
    private final zzoe f4891d;

    /* renamed from: e  reason: collision with root package name */
    private final zzhu f4892e;

    /* renamed from: f  reason: collision with root package name */
    private final zzpn f4893f;
    private final Handler g;
    private final HandlerThread h;
    private final Handler i;
    private final zzhe j;
    private final zzib k;
    private final zzic l;
    private zzhl m;
    private zzhw n;
    private zzhv o;
    private zzpf p;
    private zznb q;
    private zzhv[] r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x = 0;
    private int y;
    private int z;

    public qa0(zzhv[] zzhvArr, zzoe zzoe, zzhu zzhu, boolean z2, int i2, Handler handler, zzhl zzhl, zzhe zzhe) {
        this.f4889b = zzhvArr;
        this.f4891d = zzoe;
        this.f4892e = zzhu;
        this.t = z2;
        this.i = handler;
        this.w = 1;
        this.m = zzhl;
        this.j = zzhe;
        this.f4890c = new zzhy[zzhvArr.length];
        for (int i3 = 0; i3 < zzhvArr.length; i3++) {
            zzhvArr[i3].p(i3);
            this.f4890c[i3] = zzhvArr[i3].g();
        }
        this.f4893f = new zzpn();
        this.r = new zzhv[0];
        this.k = new zzib();
        this.l = new zzic();
        zzoe.c(this);
        this.n = zzhw.f8921d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.h = handlerThread;
        handlerThread.start();
        this.g = new Handler(this.h.getLooper(), this);
    }

    private final void A() throws zzhb {
        this.u = false;
        this.f4893f.a();
        for (zzhv start : this.r) {
            start.start();
        }
    }

    private final void B() throws zzhb {
        this.f4893f.b();
        for (zzhv n2 : this.r) {
            n(n2);
        }
    }

    private final void C() throws zzhb {
        long j2;
        sa0 sa0 = this.G;
        if (sa0 != null) {
            long m2 = sa0.f5069a.m();
            if (m2 != -9223372036854775807L) {
                y(m2);
            } else {
                zzhv zzhv = this.o;
                if (zzhv == null || zzhv.b()) {
                    this.D = this.f4893f.t();
                } else {
                    long t2 = this.p.t();
                    this.D = t2;
                    this.f4893f.d(t2);
                }
                m2 = this.D - this.G.e();
            }
            this.m.f8909c = m2;
            this.A = SystemClock.elapsedRealtime() * 1000;
            if (this.r.length == 0) {
                j2 = Long.MIN_VALUE;
            } else {
                j2 = this.G.f5069a.n();
            }
            zzhl zzhl = this.m;
            if (j2 == Long.MIN_VALUE) {
                j2 = this.H.e(this.G.g, this.l, false).f8936c;
            }
            zzhl.f8910d = j2;
        }
    }

    private final void D() {
        I(true);
        this.f4892e.f();
        f(1);
    }

    private final void E() throws IOException {
        sa0 sa0 = this.E;
        if (sa0 != null && !sa0.j) {
            sa0 sa02 = this.F;
            if (sa02 == null || sa02.l == sa0) {
                zzhv[] zzhvArr = this.r;
                int length = zzhvArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (zzhvArr[i2].o()) {
                        i2++;
                    } else {
                        return;
                    }
                }
                this.E.f5069a.o();
            }
        }
    }

    private final void F() {
        long j2;
        sa0 sa0 = this.E;
        if (!sa0.j) {
            j2 = 0;
        } else {
            j2 = sa0.f5069a.a();
        }
        if (j2 == Long.MIN_VALUE) {
            H(false);
            return;
        }
        long e2 = this.D - this.E.e();
        boolean b2 = this.f4892e.b(j2 - e2);
        H(b2);
        if (b2) {
            this.E.f5069a.b(e2);
        }
    }

    private final void H(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            this.i.obtainMessage(2, z2 ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void I(boolean z2) {
        this.g.removeMessages(2);
        this.u = false;
        this.f4893f.b();
        this.p = null;
        this.o = null;
        this.D = 60000000;
        for (zzhv zzhv : this.r) {
            try {
                n(zzhv);
                zzhv.q();
            } catch (zzhb | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.r = new zzhv[0];
        sa0 sa0 = this.G;
        if (sa0 == null) {
            sa0 = this.E;
        }
        m(sa0);
        this.E = null;
        this.F = null;
        this.G = null;
        H(false);
        if (z2) {
            zznb zznb = this.q;
            if (zznb != null) {
                zznb.f();
                this.q = null;
            }
            this.H = null;
        }
    }

    private final boolean J(int i2) {
        this.H.e(i2, this.l, false);
        if (this.H.c(0, this.k, false).f8932e || this.H.b(i2, this.l, this.k, this.x) != -1) {
            return false;
        }
        return true;
    }

    private final void f(int i2) {
        if (this.w != i2) {
            this.w = i2;
            this.i.obtainMessage(1, i2, 0).sendToTarget();
        }
    }

    private final int h(int i2, zzia zzia, zzia zzia2) {
        int h2 = zzia.h();
        int i3 = -1;
        for (int i4 = 0; i4 < h2 && i3 == -1; i4++) {
            i2 = zzia.b(i2, this.l, this.k, this.x);
            i3 = zzia2.f(zzia.e(i2, this.l, true).f8935b);
        }
        return i3;
    }

    private final long i(int i2, long j2) throws zzhb {
        sa0 sa0;
        B();
        this.u = false;
        f(2);
        sa0 sa02 = this.G;
        if (sa02 == null) {
            sa0 sa03 = this.E;
            if (sa03 != null) {
                sa03.a();
            }
            sa0 = null;
        } else {
            sa0 = null;
            while (sa02 != null) {
                if (sa02.g != i2 || !sa02.j) {
                    sa02.a();
                } else {
                    sa0 = sa02;
                }
                sa02 = sa02.l;
            }
        }
        sa0 sa04 = this.G;
        if (!(sa04 == sa0 && sa04 == this.F)) {
            for (zzhv q2 : this.r) {
                q2.q();
            }
            this.r = new zzhv[0];
            this.p = null;
            this.o = null;
            this.G = null;
        }
        if (sa0 != null) {
            sa0.l = null;
            this.E = sa0;
            this.F = sa0;
            v(sa0);
            sa0 sa05 = this.G;
            if (sa05.k) {
                j2 = sa05.f5069a.j(j2);
            }
            y(j2);
            F();
        } else {
            this.E = null;
            this.F = null;
            this.G = null;
            y(j2);
        }
        this.g.sendEmptyMessage(2);
        return j2;
    }

    private final Pair<Integer, Long> j(ta0 ta0) {
        zzia zzia = ta0.f5151a;
        if (zzia.a()) {
            zzia = this.H;
        }
        try {
            Pair<Integer, Long> u2 = u(zzia, ta0.f5152b, ta0.f5153c);
            zzia zzia2 = this.H;
            if (zzia2 == zzia) {
                return u2;
            }
            int f2 = zzia2.f(zzia.e(((Integer) u2.first).intValue(), this.l, true).f8935b);
            if (f2 != -1) {
                return Pair.create(Integer.valueOf(f2), (Long) u2.second);
            }
            int h2 = h(((Integer) u2.first).intValue(), zzia, this.H);
            if (h2 == -1) {
                return null;
            }
            this.H.e(h2, this.l, false);
            return t(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhr(this.H, ta0.f5152b, ta0.f5153c);
        }
    }

    private final Pair<Integer, Long> k(zzia zzia, int i2, long j2, long j3) {
        zzpb.g(i2, 0, zzia.g());
        zzia.d(i2, this.k, false, j3);
        if (j2 == -9223372036854775807L) {
            j2 = this.k.h;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        long j4 = this.k.j + j2;
        long j5 = zzia.e(0, this.l, false).f8936c;
        if (j5 != -9223372036854775807L) {
            int i3 = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j4));
    }

    private final void l(long j2, long j3) {
        this.g.removeMessages(2);
        long elapsedRealtime = (j2 + j3) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.g.sendEmptyMessage(2);
        } else {
            this.g.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private static void m(sa0 sa0) {
        while (sa0 != null) {
            sa0.a();
            sa0 = sa0.l;
        }
    }

    private static void n(zzhv zzhv) throws zzhb {
        if (zzhv.c() == 2) {
            zzhv.stop();
        }
    }

    private final void q(Object obj, int i2) {
        this.m = new zzhl(0, 0);
        w(obj, i2);
        this.m = new zzhl(0, -9223372036854775807L);
        f(4);
        I(false);
    }

    private final void s(boolean[] zArr, int i2) throws zzhb {
        this.r = new zzhv[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            zzhv[] zzhvArr = this.f4889b;
            if (i3 < zzhvArr.length) {
                zzhv zzhv = zzhvArr[i3];
                zzod a2 = this.G.m.f9118b.a(i3);
                if (a2 != null) {
                    int i5 = i4 + 1;
                    this.r[i4] = zzhv;
                    if (zzhv.c() == 0) {
                        zzhx zzhx = this.G.m.f9120d[i3];
                        boolean z2 = this.t && this.w == 3;
                        boolean z3 = !zArr[i3] && z2;
                        int length = a2.length();
                        zzhq[] zzhqArr = new zzhq[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            zzhqArr[i6] = a2.b(i6);
                        }
                        sa0 sa0 = this.G;
                        zzhv.s(zzhx, zzhqArr, sa0.f5072d[i3], this.D, z3, sa0.e());
                        zzpf l2 = zzhv.l();
                        if (l2 != null) {
                            if (this.p == null) {
                                this.p = l2;
                                this.o = zzhv;
                                l2.k(this.n);
                            } else {
                                throw zzhb.c(new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z2) {
                            zzhv.start();
                        }
                    }
                    i4 = i5;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    private final Pair<Integer, Long> t(int i2, long j2) {
        return u(this.H, i2, -9223372036854775807L);
    }

    private final Pair<Integer, Long> u(zzia zzia, int i2, long j2) {
        return k(zzia, i2, j2, 0);
    }

    private final void v(sa0 sa0) throws zzhb {
        if (this.G != sa0) {
            boolean[] zArr = new boolean[this.f4889b.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                zzhv[] zzhvArr = this.f4889b;
                if (i2 < zzhvArr.length) {
                    zzhv zzhv = zzhvArr[i2];
                    zArr[i2] = zzhv.c() != 0;
                    zzod a2 = sa0.m.f9118b.a(i2);
                    if (a2 != null) {
                        i3++;
                    }
                    if (zArr[i2] && (a2 == null || (zzhv.j() && zzhv.n() == this.G.f5072d[i2]))) {
                        if (zzhv == this.o) {
                            this.f4893f.c(this.p);
                            this.p = null;
                            this.o = null;
                        }
                        n(zzhv);
                        zzhv.q();
                    }
                    i2++;
                } else {
                    this.G = sa0;
                    this.i.obtainMessage(3, sa0.m).sendToTarget();
                    s(zArr, i3);
                    return;
                }
            }
        }
    }

    private final void w(Object obj, int i2) {
        this.i.obtainMessage(6, new zzhn(this.H, obj, this.m, i2)).sendToTarget();
    }

    private final void y(long j2) throws zzhb {
        long j3;
        sa0 sa0 = this.G;
        if (sa0 == null) {
            j3 = 60000000;
        } else {
            j3 = sa0.e();
        }
        long j4 = j2 + j3;
        this.D = j4;
        this.f4893f.d(j4);
        for (zzhv h2 : this.r) {
            h2.h(this.D);
        }
    }

    private final boolean z(long j2) {
        if (j2 == -9223372036854775807L || this.m.f8909c < j2) {
            return true;
        }
        sa0 sa0 = this.G.l;
        return sa0 != null && sa0.j;
    }

    public final void G(boolean z2) {
        this.g.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public final void a() {
        this.g.sendEmptyMessage(10);
    }

    public final void b(zzia zzia, Object obj) {
        this.g.obtainMessage(7, Pair.create(zzia, obj)).sendToTarget();
    }

    public final void c(zzmz zzmz) {
        this.g.obtainMessage(8, zzmz).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.s     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.g     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.s     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.h     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qa0.d():void");
    }

    public final /* synthetic */ void e(zznn zznn) {
        this.g.obtainMessage(9, (zzmz) zznn).sendToTarget();
    }

    public final void g() {
        this.g.sendEmptyMessage(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0380, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0445, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0446, code lost:
        r2 = r0;
        r8.m = new com.google.android.gms.internal.ads.zzhl(r3, r4);
        r3 = r8.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0450, code lost:
        if (r1 != false) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0452, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0454, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0455, code lost:
        r3.obtainMessage(4, r1, 0, r8.m).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x045e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0899, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x089a, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x089e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x089f, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x08a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x08a4, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.i.obtainMessage(8, com.google.android.gms.internal.ads.zzhb.c(r1)).sendToTarget();
        D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08be, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c9, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
        monitor-enter(r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r8.z++;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0285 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0288 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x028c A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x034e A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0362 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0529 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0530 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x054a A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x054d A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0588 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x059a A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x05b6 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }, LOOP:8: B:331:0x05b6->B:335:0x05c8, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0713 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x07cc A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x08a3 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            r34 = this;
            r8 = r34
            r1 = r35
            r10 = 1
            int r2 = r1.what     // Catch:{ zzhb -> 0x08db, IOException -> 0x08bf, RuntimeException -> 0x08a3 }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0862;
                case 1: goto L_0x0835;
                case 2: goto L_0x045f;
                case 3: goto L_0x03a8;
                case 4: goto L_0x0388;
                case 5: goto L_0x0384;
                case 6: goto L_0x036d;
                case 7: goto L_0x0213;
                case 8: goto L_0x01df;
                case 9: goto L_0x01cc;
                case 10: goto L_0x00d9;
                case 11: goto L_0x009b;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r9
        L_0x0019:
            int r1 = r1.arg1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.x = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.sa0 r2 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0026:
            if (r2 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.sa0 r3 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.sa0 r4 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r4) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.google.android.gms.internal.ads.zzia r11 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r12 = r2.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r13 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzib r14 = r8.k     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r11 = r11.b(r12, r13, r14, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r12 = r2.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x0061
            if (r11 == r5) goto L_0x0061
            com.google.android.gms.internal.ads.sa0 r12 = r2.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r12 = r12.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 != r11) goto L_0x0061
            com.google.android.gms.internal.ads.sa0 r2 = r2.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r11 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r11) goto L_0x0056
            r11 = 1
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            r3 = r3 | r11
            com.google.android.gms.internal.ads.sa0 r11 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r11) goto L_0x005e
            r11 = 1
            goto L_0x005f
        L_0x005e:
            r11 = 0
        L_0x005f:
            r4 = r4 | r11
            goto L_0x0036
        L_0x0061:
            com.google.android.gms.internal.ads.sa0 r5 = r2.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r5 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.sa0 r5 = r2.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            m(r5)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.l = r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x006c:
            int r5 = r2.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r5 = r8.J(r5)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.i = r5     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 != 0) goto L_0x0078
            r8.E = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0078:
            if (r3 != 0) goto L_0x0091
            com.google.android.gms.internal.ads.sa0 r2 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.sa0 r2 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r3 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r3.f8909c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r8.i(r2, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r5 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5.<init>(r2, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r5     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0091:
            int r2 = r8.w     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r15) goto L_0x009a
            if (r1 == 0) goto L_0x009a
            r8.f(r7)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x009a:
            return r10
        L_0x009b:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhf[] r1 = (com.google.android.gms.internal.ads.zzhf[]) r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r1.length     // Catch:{ all -> 0x00c8 }
        L_0x00a0:
            if (r9 >= r2) goto L_0x00b0
            r3 = r1[r9]     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.internal.ads.zzhg r4 = r3.f8904a     // Catch:{ all -> 0x00c8 }
            int r5 = r3.f8905b     // Catch:{ all -> 0x00c8 }
            java.lang.Object r3 = r3.f8906c     // Catch:{ all -> 0x00c8 }
            r4.i(r5, r3)     // Catch:{ all -> 0x00c8 }
            int r9 = r9 + 1
            goto L_0x00a0
        L_0x00b0:
            com.google.android.gms.internal.ads.zznb r1 = r8.q     // Catch:{ all -> 0x00c8 }
            if (r1 == 0) goto L_0x00b9
            android.os.Handler r1 = r8.g     // Catch:{ all -> 0x00c8 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c8 }
        L_0x00b9:
            monitor-enter(r34)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r8.z     // Catch:{ all -> 0x00c4 }
            int r1 = r1 + r10
            r8.z = r1     // Catch:{ all -> 0x00c4 }
            r34.notifyAll()     // Catch:{ all -> 0x00c4 }
            monitor-exit(r34)     // Catch:{ all -> 0x00c4 }
            return r10
        L_0x00c4:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00c4 }
            throw r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            monitor-enter(r34)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r8.z     // Catch:{ all -> 0x00d5 }
            int r2 = r2 + r10
            r8.z = r2     // Catch:{ all -> 0x00d5 }
            r34.notifyAll()     // Catch:{ all -> 0x00d5 }
            monitor-exit(r34)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x00d5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x00d9:
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x01cb
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 1
        L_0x00e0:
            if (r1 == 0) goto L_0x01cb
            boolean r3 = r1.j     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 != 0) goto L_0x00e8
            goto L_0x01cb
        L_0x00e8:
            boolean r3 = r1.g()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 != 0) goto L_0x00f6
            com.google.android.gms.internal.ads.sa0 r3 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != r3) goto L_0x00f3
            r2 = 0
        L_0x00f3:
            com.google.android.gms.internal.ads.sa0 r1 = r1.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x00e0
        L_0x00f6:
            if (r2 == 0) goto L_0x0194
            com.google.android.gms.internal.ads.sa0 r2 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == r3) goto L_0x0100
            r2 = 1
            goto L_0x0101
        L_0x0100:
            r2 = 0
        L_0x0101:
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r3.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            m(r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.l = r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.E = r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.F = r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhv[] r3 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean[] r3 = new boolean[r3]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r4 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r5 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r5.f8909c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r4.b(r11, r2, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r2 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r2.f8909c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0132
            com.google.android.gms.internal.ads.zzhl r2 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.f8909c = r4     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.y(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0132:
            com.google.android.gms.internal.ads.zzhv[] r2 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean[] r2 = new boolean[r2]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r4 = 0
            r5 = 0
        L_0x0139:
            com.google.android.gms.internal.ads.zzhv[] r11 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r11 = r11.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 >= r11) goto L_0x0185
            com.google.android.gms.internal.ads.zzhv[] r11 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11 = r11[r4]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r12 = r11.c()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x014a
            r12 = 1
            goto L_0x014b
        L_0x014a:
            r12 = 0
        L_0x014b:
            r2[r4] = r12     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r12 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zznk[] r12 = r12.f5072d     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12 = r12[r4]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x0157
            int r5 = r5 + 1
        L_0x0157:
            boolean r13 = r2[r4]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r13 == 0) goto L_0x0182
            com.google.android.gms.internal.ads.zznk r13 = r11.n()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == r13) goto L_0x0179
            com.google.android.gms.internal.ads.zzhv r13 = r8.o     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r11 != r13) goto L_0x0172
            if (r12 != 0) goto L_0x016e
            com.google.android.gms.internal.ads.zzpn r12 = r8.f4893f     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzpf r13 = r8.p     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12.c(r13)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x016e:
            r8.p = r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.o = r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0172:
            n(r11)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11.q()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0182
        L_0x0179:
            boolean r12 = r3[r4]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x0182
            long r12 = r8.D     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11.h(r12)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0182:
            int r4 = r4 + 1
            goto L_0x0139
        L_0x0185:
            android.os.Handler r3 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzog r1 = r1.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.s(r2, r5)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x01c0
        L_0x0194:
            r8.E = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r1.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0198:
            if (r1 == 0) goto L_0x01a0
            r1.a()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r1.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0198
        L_0x01a0:
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.l = r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r1.j     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x01c0
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1.h     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r8.D     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r3.e()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.c(r1, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x01c0:
            r34.F()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.C()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r1 = r8.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendEmptyMessage(r7)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x01cb:
            return r10
        L_0x01cc:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzmz r1 = (com.google.android.gms.internal.ads.zzmz) r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x01de
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzmz r2 = r2.f5069a     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == r1) goto L_0x01db
            goto L_0x01de
        L_0x01db:
            r34.F()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x01de:
            return r10
        L_0x01df:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzmz r1 = (com.google.android.gms.internal.ads.zzmz) r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0212
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzmz r2 = r2.f5069a     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == r1) goto L_0x01ee
            goto L_0x0212
        L_0x01ee:
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.j = r10     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.g()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r1.h     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r1.c(r2, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.h = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x020f
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.F = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1.h     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.y(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.v(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x020f:
            r34.F()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0212:
            return r10
        L_0x0213:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r3 = r1.first     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r3 = (com.google.android.gms.internal.ads.zzia) r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.H = r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r1 = r1.second     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x0280
            int r4 = r8.B     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 <= 0) goto L_0x0252
            com.google.android.gms.internal.ads.ta0 r3 = r8.C     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.util.Pair r3 = r8.j(r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r4 = r8.B     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.B = r9     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.C = r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 != 0) goto L_0x023a
            r8.q(r1, r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x036c
        L_0x023a:
            com.google.android.gms.internal.ads.zzhl r7 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r11 = r3.first     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r11 = r11.intValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r3 = r3.second     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r3.longValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r7.<init>(r11, r14)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r7     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0281
        L_0x0252:
            com.google.android.gms.internal.ads.zzhl r4 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r4.f8908b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0280
            boolean r3 = r3.a()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x0265
            r8.q(r1, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x036c
        L_0x0265:
            android.util.Pair r3 = r8.t(r9, r12)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r4 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r7 = r3.first     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r7.intValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r3 = r3.second     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r3.longValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r4.<init>(r7, r14)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r4     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0280:
            r4 = 0
        L_0x0281:
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x0288
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x028a
        L_0x0288:
            com.google.android.gms.internal.ads.sa0 r3 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x028a:
            if (r3 == 0) goto L_0x0369
            com.google.android.gms.internal.ads.zzia r7 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r11 = r3.f5070b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r7.f(r11)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 != r5) goto L_0x02ee
            int r6 = r3.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r7 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r8.h(r6, r2, r7)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r5) goto L_0x02a5
            r8.q(r1, r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x036c
        L_0x02a5:
            com.google.android.gms.internal.ads.zzia r6 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r7 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r6.e(r2, r7, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.util.Pair r2 = r8.t(r9, r12)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r6 = r2.first     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r6 = r6.intValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r2 = r2.second     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r2.longValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r7 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.e(r6, r7, r10)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r2 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r2 = r2.f8935b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.g = r5     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x02cd:
            com.google.android.gms.internal.ads.sa0 r7 = r3.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x02e1
            com.google.android.gms.internal.ads.sa0 r3 = r3.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r7 = r3.f5070b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r7 = r7.equals(r2)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x02dd
            r7 = r6
            goto L_0x02de
        L_0x02dd:
            r7 = -1
        L_0x02de:
            r3.g = r7     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x02cd
        L_0x02e1:
            long r2 = r8.i(r6, r11)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r5 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5.<init>(r6, r2)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r5     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0369
        L_0x02ee:
            boolean r2 = r8.J(r7)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.d(r7, r2)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 != r2) goto L_0x02fb
            r2 = 1
            goto L_0x02fc
        L_0x02fb:
            r2 = 0
        L_0x02fc:
            com.google.android.gms.internal.ads.zzhl r11 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r11 = r11.f8907a     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == r11) goto L_0x0315
            com.google.android.gms.internal.ads.zzhl r11 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r12 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r13 = r11.f8908b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12.<init>(r7, r13)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r13 = r11.f8909c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12.f8909c = r13     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r13 = r11.f8910d     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12.f8910d = r13     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r12     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0315:
            com.google.android.gms.internal.ads.sa0 r11 = r3.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r11 == 0) goto L_0x0369
            com.google.android.gms.internal.ads.sa0 r11 = r3.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r12 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r13 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzib r14 = r8.k     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r15 = r8.x     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r12.b(r7, r13, r14, r15)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == r5) goto L_0x034c
            java.lang.Object r12 = r11.f5070b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r13 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r14 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r13 = r13.e(r7, r14, r10)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r13 = r13.f8935b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r12 = r12.equals(r13)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x034c
            boolean r3 = r8.J(r7)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11.d(r7, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r11 != r3) goto L_0x0348
            r3 = 1
            goto L_0x0349
        L_0x0348:
            r3 = 0
        L_0x0349:
            r2 = r2 | r3
            r3 = r11
            goto L_0x0315
        L_0x034c:
            if (r2 != 0) goto L_0x0362
            com.google.android.gms.internal.ads.sa0 r2 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r3 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r5 = r3.f8909c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r5 = r8.i(r2, r5)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r3 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.<init>(r2, r5)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0369
        L_0x0362:
            r8.E = r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.l = r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            m(r11)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0369:
            r8.w(r1, r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x036c:
            return r10
        L_0x036d:
            r8.I(r10)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhu r1 = r8.f4892e     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.c()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f(r10)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            monitor-enter(r34)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.s = r10     // Catch:{ all -> 0x0380 }
            r34.notifyAll()     // Catch:{ all -> 0x0380 }
            monitor-exit(r34)     // Catch:{ all -> 0x0380 }
            return r10
        L_0x0380:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x0380 }
            throw r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0384:
            r34.D()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            return r10
        L_0x0388:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhw r1 = (com.google.android.gms.internal.ads.zzhw) r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzpf r2 = r8.p     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0397
            com.google.android.gms.internal.ads.zzpf r2 = r8.p     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhw r1 = r2.k(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x039c
        L_0x0397:
            com.google.android.gms.internal.ads.zzpn r2 = r8.f4893f     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.k(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x039c:
            r8.n = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            return r10
        L_0x03a8:
            java.lang.Object r1 = r1.obj     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.ta0 r1 = (com.google.android.gms.internal.ads.ta0) r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x03b9
            int r2 = r8.B     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2 + r10
            r8.B = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.C = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0444
        L_0x03b9:
            android.util.Pair r2 = r8.j(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x03dd
            com.google.android.gms.internal.ads.zzhl r1 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.<init>(r9, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r1 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.<init>(r9, r12)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f(r15)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.I(r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0444
        L_0x03dd:
            long r3 = r1.f5153c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03e5
            r1 = 1
            goto L_0x03e6
        L_0x03e5:
            r1 = 0
        L_0x03e6:
            java.lang.Object r3 = r2.first     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.intValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r2 = r2.second     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r2.longValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r2 = r8.m     // Catch:{ all -> 0x0445 }
            int r2 = r2.f8907a     // Catch:{ all -> 0x0445 }
            if (r3 != r2) goto L_0x0421
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.google.android.gms.internal.ads.zzhl r2 = r8.m     // Catch:{ all -> 0x0445 }
            long r13 = r2.f8909c     // Catch:{ all -> 0x0445 }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0421
            com.google.android.gms.internal.ads.zzhl r2 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.<init>(r3, r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0416
            r1 = 1
            goto L_0x0417
        L_0x0416:
            r1 = 0
        L_0x0417:
            com.google.android.gms.internal.ads.zzhl r3 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0444
        L_0x0421:
            long r6 = r8.i(r3, r4)     // Catch:{ all -> 0x0445 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x042b
            r2 = 1
            goto L_0x042c
        L_0x042b:
            r2 = 0
        L_0x042c:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.zzhl r2 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.<init>(r3, r6)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x043a
            r1 = 1
            goto L_0x043b
        L_0x043a:
            r1 = 0
        L_0x043b:
            com.google.android.gms.internal.ads.zzhl r3 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0444:
            return r10
        L_0x0445:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzhl r6 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r6.<init>(r3, r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r6     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r3 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0454
            r1 = 1
            goto L_0x0455
        L_0x0454:
            r1 = 0
        L_0x0455:
            com.google.android.gms.internal.ads.zzhl r4 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            throw r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x045f:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r1 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x046f
            com.google.android.gms.internal.ads.zznb r1 = r8.q     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.d()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r14 = r5
            goto L_0x06c4
        L_0x046f:
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x0478
            com.google.android.gms.internal.ads.zzhl r1 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r1.f8907a     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x04b6
        L_0x0478:
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r1.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r2.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x04c3
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r2.f()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x04c3
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r7 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r2 = r2.e(r1, r7, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r2.f8936c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0499
            goto L_0x04c3
        L_0x0499:
            com.google.android.gms.internal.ads.sa0 r2 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x04aa
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.f5071c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r7 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r7.f5071c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2 - r7
            r7 = 100
            if (r2 == r7) goto L_0x04c3
        L_0x04aa:
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r7 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzib r14 = r8.k     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r15 = r8.x     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r2.b(r1, r7, r14, r15)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x04b6:
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.h()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 < r2) goto L_0x04c6
            com.google.android.gms.internal.ads.zznb r1 = r8.q     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.d()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x04c3:
            r14 = r5
            goto L_0x0596
        L_0x04c6:
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x04d0
            com.google.android.gms.internal.ads.zzhl r2 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r2.f8909c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x04ce:
            r14 = r5
            goto L_0x0525
        L_0x04d0:
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r7 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.e(r1, r7, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzib r7 = r8.k     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.c(r9, r7, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x04e1
            goto L_0x04ce
        L_0x04e1:
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1.e()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r7 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r14 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r14 = r14.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r15 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r7 = r7.e(r14, r15, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r7.f8936c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1 + r14
            long r14 = r8.D     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1 - r14
            com.google.android.gms.internal.ads.zzia r7 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1 = r34
            r2 = r7
            r3 = r14
            r14 = r5
            r4 = r16
            r6 = r18
            android.util.Pair r1 = r1.k(r2, r3, r4, r6)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0596
            java.lang.Object r2 = r1.first     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.intValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r1 = r1.second     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r1.longValue()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1 = r2
        L_0x0525:
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x0530
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x052d:
            r23 = r5
            goto L_0x0546
        L_0x0530:
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r5 = r2.e()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r7 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r7.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r11 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r2 = r2.e(r7, r11, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r12 = r2.f8936c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r5 = r5 + r12
            goto L_0x052d
        L_0x0546:
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x054d
            r29 = 0
            goto L_0x0554
        L_0x054d:
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.f5071c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2 + r10
            r29 = r2
        L_0x0554:
            boolean r31 = r8.J(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r5 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.e(r1, r5, r10)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = new com.google.android.gms.internal.ads.sa0     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhv[] r5 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhy[] r6 = r8.f4890c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzoe r7 = r8.f4891d     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhu r11 = r8.f4892e     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zznb r12 = r8.q     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r13 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r13 = r13.f8935b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r20 = r2
            r21 = r5
            r22 = r6
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r13
            r30 = r1
            r32 = r3
            r20.<init>(r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x058c
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.l = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x058c:
            r8.E = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzmz r1 = r2.f5069a     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.l(r8, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.H(r10)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0596:
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x05af
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r1.f()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x05a3
            goto L_0x05af
        L_0x05a3:
            com.google.android.gms.internal.ads.sa0 r1 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x05b2
            boolean r1 = r8.v     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x05b2
            r34.F()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x05b2
        L_0x05af:
            r8.H(r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x05b2:
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x06c4
        L_0x05b6:
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == r2) goto L_0x05f3
            long r1 = r8.D     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r3.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r3.f5074f     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x05f3
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.a()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r1.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.v(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r1 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r3.h     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.<init>(r2, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.C()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r1 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 5
            com.google.android.gms.internal.ads.zzhl r3 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x05b6
        L_0x05f3:
            com.google.android.gms.internal.ads.sa0 r1 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r1.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x061d
            r1 = 0
        L_0x05fa:
            com.google.android.gms.internal.ads.zzhv[] r2 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 >= r2) goto L_0x06c4
            com.google.android.gms.internal.ads.zzhv[] r2 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = r2[r1]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zznk[] r3 = r3.f5072d     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3 = r3[r1]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x061a
            com.google.android.gms.internal.ads.zznk r4 = r2.n()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 != r3) goto L_0x061a
            boolean r3 = r2.o()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x061a
            r2.e()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x061a:
            int r1 = r1 + 1
            goto L_0x05fa
        L_0x061d:
            r1 = 0
        L_0x061e:
            com.google.android.gms.internal.ads.zzhv[] r2 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 >= r2) goto L_0x0640
            com.google.android.gms.internal.ads.zzhv[] r2 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = r2[r1]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zznk[] r3 = r3.f5072d     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3 = r3[r1]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zznk r4 = r2.n()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 != r3) goto L_0x06c4
            if (r3 == 0) goto L_0x063d
            boolean r2 = r2.o()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x063d
            goto L_0x06c4
        L_0x063d:
            int r1 = r1 + 1
            goto L_0x061e
        L_0x0640:
            com.google.android.gms.internal.ads.sa0 r1 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r1.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x06c4
            com.google.android.gms.internal.ads.sa0 r1 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r1.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r1.j     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x06c4
            com.google.android.gms.internal.ads.sa0 r1 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzog r1 = r1.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r2.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.F = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzog r3 = r2.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzmz r2 = r2.f5069a     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r2.m()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x066b
            r2 = 1
            goto L_0x066c
        L_0x066b:
            r2 = 0
        L_0x066c:
            r4 = 0
        L_0x066d:
            com.google.android.gms.internal.ads.zzhv[] r5 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r5 = r5.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 >= r5) goto L_0x06c4
            com.google.android.gms.internal.ads.zzhv[] r5 = r8.f4889b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5 = r5[r4]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzof r6 = r1.f9118b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzod r6 = r6.a(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r6 == 0) goto L_0x06c1
            if (r2 != 0) goto L_0x06be
            boolean r6 = r5.j()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r6 != 0) goto L_0x06c1
            com.google.android.gms.internal.ads.zzof r6 = r3.f9118b     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzod r6 = r6.a(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhx[] r7 = r1.f9120d     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r7 = r7[r4]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhx[] r11 = r3.f9120d     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11 = r11[r4]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r6 == 0) goto L_0x06be
            boolean r7 = r11.equals(r7)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x06be
            int r7 = r6.length()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhq[] r11 = new com.google.android.gms.internal.ads.zzhq[r7]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12 = 0
        L_0x06a3:
            if (r12 >= r7) goto L_0x06ae
            com.google.android.gms.internal.ads.zzhq r13 = r6.b(r12)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11[r12] = r13     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r12 = r12 + 1
            goto L_0x06a3
        L_0x06ae:
            com.google.android.gms.internal.ads.sa0 r6 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zznk[] r6 = r6.f5072d     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r6 = r6[r4]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r7 = r8.F     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r12 = r7.e()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5.f(r11, r6, r12)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x06c1
        L_0x06be:
            r5.e()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x06c1:
            int r4 = r4 + 1
            goto L_0x066d
        L_0x06c4:
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 10
            if (r1 != 0) goto L_0x06d2
            r34.E()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.l(r14, r2)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0834
        L_0x06d2:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.zzpp.a(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.C()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r1 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzmz r1 = r1.f5069a     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhl r4 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r4.f8909c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.g(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhv[] r1 = r8.r     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r4 = r1.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5 = 0
            r6 = 1
            r7 = 1
        L_0x06eb:
            if (r5 >= r4) goto L_0x0722
            r11 = r1[r5]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r12 = r8.D     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r8.A     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11.m(r12, r2)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x0700
            boolean r2 = r11.b()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0700
            r7 = 1
            goto L_0x0701
        L_0x0700:
            r7 = 0
        L_0x0701:
            boolean r2 = r11.isReady()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x0710
            boolean r2 = r11.b()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x070e
            goto L_0x0710
        L_0x070e:
            r2 = 0
            goto L_0x0711
        L_0x0710:
            r2 = 1
        L_0x0711:
            if (r2 != 0) goto L_0x0716
            r11.r()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0716:
            if (r6 == 0) goto L_0x071c
            if (r2 == 0) goto L_0x071c
            r6 = 1
            goto L_0x071d
        L_0x071c:
            r6 = 0
        L_0x071d:
            int r5 = r5 + 1
            r2 = 10
            goto L_0x06eb
        L_0x0722:
            if (r6 != 0) goto L_0x0727
            r34.E()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0727:
            com.google.android.gms.internal.ads.zzpf r1 = r8.p     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x074c
            com.google.android.gms.internal.ads.zzpf r1 = r8.p     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhw r1 = r1.u()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhw r2 = r8.n     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r1.equals(r2)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x074c
            r8.n = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzpn r2 = r8.f4893f     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzpf r3 = r8.p     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.c(r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x074c:
            com.google.android.gms.internal.ads.zzia r1 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r3 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r1 = r1.e(r2, r3, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1.f8936c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x077d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x076d
            com.google.android.gms.internal.ads.zzhl r3 = r8.m     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r3.f8909c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x077d
        L_0x076d:
            com.google.android.gms.internal.ads.sa0 r3 = r8.G     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r3 = r3.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x077d
            r3 = 4
            r8.f(r3)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.B()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r4 = 2
            goto L_0x07fd
        L_0x077d:
            int r3 = r8.w     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r4 = 2
            if (r3 != r4) goto L_0x07e2
            com.google.android.gms.internal.ads.zzhv[] r3 = r8.r     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 <= 0) goto L_0x07d0
            if (r6 == 0) goto L_0x07ce
            boolean r1 = r8.u     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r2.j     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x0796
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r2.h     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x079e
        L_0x0796:
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzmz r2 = r2.f5069a     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r2.n()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x079e:
            r5 = -9223372036854775808
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07ba
            com.google.android.gms.internal.ads.sa0 r2 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r2.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x07ac
            r1 = 1
            goto L_0x07ca
        L_0x07ac:
            com.google.android.gms.internal.ads.zzia r2 = r8.H     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r3 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r5 = r8.l     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzic r2 = r2.e(r3, r5, r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r2.f8936c     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07ba:
            com.google.android.gms.internal.ads.zzhu r5 = r8.f4892e     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.sa0 r6 = r8.E     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r8.D     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r6 = r6.e()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r11 - r6
            long r2 = r2 - r11
            boolean r1 = r5.g(r2, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07ca:
            if (r1 == 0) goto L_0x07ce
            r1 = 1
            goto L_0x07d4
        L_0x07ce:
            r1 = 0
            goto L_0x07d4
        L_0x07d0:
            boolean r1 = r8.z(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07d4:
            if (r1 == 0) goto L_0x07fd
            r1 = 3
            r8.f(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r8.t     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x07fd
            r34.A()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x07fd
        L_0x07e2:
            int r3 = r8.w     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5 = 3
            if (r3 != r5) goto L_0x07fd
            com.google.android.gms.internal.ads.zzhv[] r3 = r8.r     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 <= 0) goto L_0x07ed
            goto L_0x07f1
        L_0x07ed:
            boolean r6 = r8.z(r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07f1:
            if (r6 != 0) goto L_0x07fd
            boolean r1 = r8.t     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.u = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.B()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07fd:
            int r1 = r8.w     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != r4) goto L_0x080e
            com.google.android.gms.internal.ads.zzhv[] r1 = r8.r     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r1.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0804:
            if (r9 >= r2) goto L_0x080e
            r3 = r1[r9]     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.r()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r9 = r9 + 1
            goto L_0x0804
        L_0x080e:
            boolean r1 = r8.t     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0817
            int r1 = r8.w     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 3
            if (r1 == r2) goto L_0x081b
        L_0x0817:
            int r1 = r8.w     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != r4) goto L_0x0821
        L_0x081b:
            r1 = 10
            r8.l(r14, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0831
        L_0x0821:
            com.google.android.gms.internal.ads.zzhv[] r1 = r8.r     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r1.length     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x082c
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.l(r14, r1)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0831
        L_0x082c:
            android.os.Handler r1 = r8.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.removeMessages(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0831:
            com.google.android.gms.internal.ads.zzpp.b()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0834:
            return r10
        L_0x0835:
            r4 = 2
            int r1 = r1.arg1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x083c
            r1 = 1
            goto L_0x083d
        L_0x083c:
            r1 = 0
        L_0x083d:
            r8.u = r9     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.t = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x084a
            r34.B()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.C()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0861
        L_0x084a:
            int r1 = r8.w     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 3
            if (r1 != r2) goto L_0x0858
            r34.A()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r1 = r8.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0861
        L_0x0858:
            int r1 = r8.w     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != r4) goto L_0x0861
            android.os.Handler r1 = r8.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0861:
            return r10
        L_0x0862:
            r4 = 2
            java.lang.Object r2 = r1.obj     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zznb r2 = (com.google.android.gms.internal.ads.zznb) r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r1.arg1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x086d
            r1 = 1
            goto L_0x086e
        L_0x086d:
            r1 = 0
        L_0x086e:
            android.os.Handler r3 = r8.i     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.sendEmptyMessage(r9)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.I(r10)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhu r3 = r8.f4892e     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.a()     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0889
            com.google.android.gms.internal.ads.zzhl r1 = new com.google.android.gms.internal.ads.zzhl     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r9, r5)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m = r1     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0889:
            r8.q = r2     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzhe r1 = r8.j     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.c(r1, r10, r8)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r1 = r8.g     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzhb -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            return r10
        L_0x0899:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08c3
        L_0x089e:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08df
        L_0x08a3:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.i
            com.google.android.gms.internal.ads.zzhb r1 = com.google.android.gms.internal.ads.zzhb.c(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.D()
            return r10
        L_0x08bf:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08c3:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Source error."
            android.util.Log.e(r2, r4, r1)
            android.os.Handler r2 = r8.i
            com.google.android.gms.internal.ads.zzhb r1 = com.google.android.gms.internal.ads.zzhb.a(r1)
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.D()
            return r10
        L_0x08db:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08df:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Renderer error."
            android.util.Log.e(r2, r4, r1)
            android.os.Handler r2 = r8.i
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.D()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qa0.handleMessage(android.os.Message):boolean");
    }

    public final void o(zzia zzia, int i2, long j2) {
        this.g.obtainMessage(3, new ta0(zzia, i2, j2)).sendToTarget();
    }

    public final void p(zznb zznb, boolean z2) {
        this.g.obtainMessage(0, 1, 0, zznb).sendToTarget();
    }

    public final void r(zzhf... zzhfArr) {
        if (this.s) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.y++;
        this.g.obtainMessage(11, zzhfArr).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void x(com.google.android.gms.internal.ads.zzhf... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.s     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.y     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.y = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.g     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.z     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qa0.x(com.google.android.gms.internal.ads.zzhf[]):void");
    }
}
