package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class dd0 implements zzjz, zzmz, zznl, zzou<gd0> {
    private boolean[] A;
    private boolean[] B;
    private boolean C;
    private long D;
    private long E;
    private long F;
    private int G;
    private boolean H;
    /* access modifiers changed from: private */
    public boolean I;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f3818b;

    /* renamed from: c  reason: collision with root package name */
    private final zzok f3819c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3820d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f3821e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzmw f3822f;
    private final zzna g;
    private final zzoi h;
    /* access modifiers changed from: private */
    public final String i;
    /* access modifiers changed from: private */
    public final long j;
    private final zzov k = new zzov("Loader:ExtractorMediaPeriod");
    private final jd0 l;
    private final zzpd m;
    private final Runnable n;
    /* access modifiers changed from: private */
    public final Runnable o;
    /* access modifiers changed from: private */
    public final Handler p;
    /* access modifiers changed from: private */
    public final SparseArray<zznj> q;
    /* access modifiers changed from: private */
    public zzmy r;
    private zzkc s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private zznr y;
    private long z;

    public dd0(Uri uri, zzok zzok, zzjx[] zzjxArr, int i2, Handler handler, zzmw zzmw, zzna zzna, zzoi zzoi, String str, int i3) {
        this.f3818b = uri;
        this.f3819c = zzok;
        this.f3820d = i2;
        this.f3821e = handler;
        this.f3822f = zzmw;
        this.g = zzna;
        this.h = zzoi;
        this.i = str;
        this.j = (long) i3;
        this.l = new jd0(zzjxArr, this);
        this.m = new zzpd();
        this.n = new cd0(this);
        this.o = new fd0(this);
        this.p = new Handler();
        this.F = -9223372036854775807L;
        this.q = new SparseArray<>();
        this.D = -1;
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final void G() {
        /*
            r8 = this;
            boolean r0 = r8.I
            if (r0 != 0) goto L_0x009d
            boolean r0 = r8.u
            if (r0 != 0) goto L_0x009d
            com.google.android.gms.internal.ads.zzkc r0 = r8.s
            if (r0 == 0) goto L_0x009d
            boolean r0 = r8.t
            if (r0 != 0) goto L_0x0012
            goto L_0x009d
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.zznj> r0 = r8.q
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.internal.ads.zznj> r3 = r8.q
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zznj r3 = (com.google.android.gms.internal.ads.zznj) r3
            com.google.android.gms.internal.ads.zzhq r3 = r3.p()
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002e:
            com.google.android.gms.internal.ads.zzpd r2 = r8.m
            r2.c()
            com.google.android.gms.internal.ads.zzno[] r2 = new com.google.android.gms.internal.ads.zzno[r0]
            boolean[] r3 = new boolean[r0]
            r8.B = r3
            boolean[] r3 = new boolean[r0]
            r8.A = r3
            com.google.android.gms.internal.ads.zzkc r3 = r8.s
            long r3 = r3.g()
            r8.z = r3
            r3 = 0
        L_0x0046:
            r4 = 1
            if (r3 >= r0) goto L_0x007c
            android.util.SparseArray<com.google.android.gms.internal.ads.zznj> r5 = r8.q
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.zznj r5 = (com.google.android.gms.internal.ads.zznj) r5
            com.google.android.gms.internal.ads.zzhq r5 = r5.p()
            com.google.android.gms.internal.ads.zzno r6 = new com.google.android.gms.internal.ads.zzno
            com.google.android.gms.internal.ads.zzhq[] r7 = new com.google.android.gms.internal.ads.zzhq[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.g
            boolean r6 = com.google.android.gms.internal.ads.zzpe.b(r5)
            if (r6 != 0) goto L_0x0070
            boolean r5 = com.google.android.gms.internal.ads.zzpe.a(r5)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            boolean[] r5 = r8.B
            r5[r3] = r4
            boolean r5 = r8.C
            r4 = r4 | r5
            r8.C = r4
            int r3 = r3 + 1
            goto L_0x0046
        L_0x007c:
            com.google.android.gms.internal.ads.zznr r0 = new com.google.android.gms.internal.ads.zznr
            r0.<init>(r2)
            r8.y = r0
            r8.u = r4
            com.google.android.gms.internal.ads.zzna r0 = r8.g
            com.google.android.gms.internal.ads.zznp r1 = new com.google.android.gms.internal.ads.zznp
            long r2 = r8.z
            com.google.android.gms.internal.ads.zzkc r4 = r8.s
            boolean r4 = r4.b()
            r1.<init>(r2, r4)
            r2 = 0
            r0.b(r1, r2)
            com.google.android.gms.internal.ads.zzmy r0 = r8.r
            r0.c(r8)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dd0.G():void");
    }

    private final int H() {
        int size = this.q.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.q.valueAt(i3).n();
        }
        return i2;
    }

    private final long I() {
        int size = this.q.size();
        long j2 = Long.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, this.q.valueAt(i2).l());
        }
        return j2;
    }

    private final boolean J() {
        return this.F != -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r0 = r9.s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void s() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.gd0 r6 = new com.google.android.gms.internal.ads.gd0
            android.net.Uri r2 = r9.f3818b
            com.google.android.gms.internal.ads.zzok r3 = r9.f3819c
            com.google.android.gms.internal.ads.jd0 r4 = r9.l
            com.google.android.gms.internal.ads.zzpd r5 = r9.m
            r0 = r6
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r9.u
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r9.J()
            com.google.android.gms.internal.ads.zzpb.e(r0)
            long r3 = r9.z
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            long r7 = r9.F
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r0 = 1
            r9.H = r0
            r9.F = r1
            return
        L_0x0031:
            com.google.android.gms.internal.ads.zzkc r0 = r9.s
            long r3 = r9.F
            long r3 = r0.d(r3)
            long r7 = r9.F
            r6.e(r3, r7)
            r9.F = r1
        L_0x0040:
            int r0 = r9.H()
            r9.G = r0
            int r0 = r9.f3820d
            r3 = -1
            if (r0 != r3) goto L_0x0067
            boolean r0 = r9.u
            if (r0 == 0) goto L_0x0066
            long r3 = r9.D
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzkc r0 = r9.s
            if (r0 == 0) goto L_0x0064
            long r3 = r0.g()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0 = 6
            goto L_0x0067
        L_0x0066:
            r0 = 3
        L_0x0067:
            com.google.android.gms.internal.ads.zzov r1 = r9.k
            r1.b(r6, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dd0.s():void");
    }

    private final void v(gd0 gd0) {
        if (this.D == -1) {
            this.D = gd0.i;
        }
    }

    /* access modifiers changed from: package-private */
    public final void A(int i2, long j2) {
        zznj valueAt = this.q.valueAt(i2);
        if (!this.H || j2 <= valueAt.l()) {
            valueAt.j(j2, true);
        } else {
            valueAt.q();
        }
    }

    /* access modifiers changed from: package-private */
    public final void F() throws IOException {
        this.k.h(Integer.MIN_VALUE);
    }

    public final long a() {
        if (this.x == 0) {
            return Long.MIN_VALUE;
        }
        return n();
    }

    public final boolean b(long j2) {
        if (this.H) {
            return false;
        }
        if (this.u && this.x == 0) {
            return false;
        }
        boolean b2 = this.m.b();
        if (this.k.a()) {
            return b2;
        }
        s();
        return true;
    }

    public final /* synthetic */ int c(zzow zzow, long j2, long j3, IOException iOException) {
        zzkc zzkc;
        gd0 gd0 = (gd0) zzow;
        v(gd0);
        Handler handler = this.f3821e;
        if (!(handler == null || this.f3822f == null)) {
            handler.post(new hd0(this, iOException));
        }
        if (iOException instanceof zznq) {
            return 3;
        }
        boolean z2 = H() > this.G;
        if (this.D == -1 && ((zzkc = this.s) == null || zzkc.g() == -9223372036854775807L)) {
            this.E = 0;
            this.w = this.u;
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.q.valueAt(i2).t(!this.u || this.A[i2]);
            }
            gd0.e(0, 0);
        }
        this.G = H();
        return z2 ? 1 : 0;
    }

    public final long d(zzod[] zzodArr, boolean[] zArr, zznk[] zznkArr, boolean[] zArr2, long j2) {
        zzpb.e(this.u);
        for (int i2 = 0; i2 < zzodArr.length; i2++) {
            if (zznkArr[i2] != null && (zzodArr[i2] == null || !zArr[i2])) {
                int d2 = zznkArr[i2].f4229a;
                zzpb.e(this.A[d2]);
                this.x--;
                this.A[d2] = false;
                this.q.valueAt(d2).e();
                zznkArr[i2] = null;
            }
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < zzodArr.length; i3++) {
            if (zznkArr[i3] == null && zzodArr[i3] != null) {
                zzod zzod = zzodArr[i3];
                zzpb.e(zzod.length() == 1);
                zzpb.e(zzod.a(0) == 0);
                int a2 = this.y.a(zzod.c());
                zzpb.e(!this.A[a2]);
                this.x++;
                this.A[a2] = true;
                zznkArr[i3] = new id0(this, a2);
                zArr2[i3] = true;
                z2 = true;
            }
        }
        if (!this.v) {
            int size = this.q.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.A[i4]) {
                    this.q.valueAt(i4).e();
                }
            }
        }
        if (this.x == 0) {
            this.w = false;
            if (this.k.a()) {
                this.k.i();
            }
        } else if (!this.v ? j2 != 0 : z2) {
            j2 = j(j2);
            for (int i5 = 0; i5 < zznkArr.length; i5++) {
                if (zznkArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.v = true;
        return j2;
    }

    public final zzke e(int i2, int i3) {
        zznj zznj = this.q.get(i2);
        if (zznj != null) {
            return zznj;
        }
        zznj zznj2 = new zznj(this.h);
        zznj2.h(this);
        this.q.put(i2, zznj2);
        return zznj2;
    }

    public final void f() {
        this.t = true;
        this.p.post(this.n);
    }

    public final void g(long j2) {
    }

    public final /* synthetic */ void h(zzow zzow, long j2, long j3, boolean z2) {
        v((gd0) zzow);
        if (!z2 && this.x > 0) {
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.q.valueAt(i2).t(this.A[i2]);
            }
            this.r.e(this);
        }
    }

    public final void i(zzkc zzkc) {
        this.s = zzkc;
        this.p.post(this.n);
    }

    public final long j(long j2) {
        if (!this.s.b()) {
            j2 = 0;
        }
        this.E = j2;
        int size = this.q.size();
        boolean z2 = !J();
        int i2 = 0;
        while (z2 && i2 < size) {
            if (this.A[i2]) {
                z2 = this.q.valueAt(i2).j(j2, false);
            }
            i2++;
        }
        if (!z2) {
            this.F = j2;
            this.H = false;
            if (this.k.a()) {
                this.k.i();
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    this.q.valueAt(i3).t(this.A[i3]);
                }
            }
        }
        this.w = false;
        return j2;
    }

    public final /* synthetic */ void k(zzow zzow, long j2, long j3) {
        v((gd0) zzow);
        this.H = true;
        if (this.z == -9223372036854775807L) {
            long I2 = I();
            this.z = I2 == Long.MIN_VALUE ? 0 : I2 + 10000;
            this.g.b(new zznp(this.z, this.s.b()), (Object) null);
        }
        this.r.e(this);
    }

    public final void l(zzmy zzmy, long j2) {
        this.r = zzmy;
        this.m.b();
        s();
    }

    public final long m() {
        if (!this.w) {
            return -9223372036854775807L;
        }
        this.w = false;
        return this.E;
    }

    public final long n() {
        long j2;
        if (this.H) {
            return Long.MIN_VALUE;
        }
        if (J()) {
            return this.F;
        }
        if (this.C) {
            j2 = Long.MAX_VALUE;
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.B[i2]) {
                    j2 = Math.min(j2, this.q.valueAt(i2).l());
                }
            }
        } else {
            j2 = I();
        }
        return j2 == Long.MIN_VALUE ? this.E : j2;
    }

    public final void o() throws IOException {
        this.k.h(Integer.MIN_VALUE);
    }

    public final void p(zzhq zzhq) {
        this.p.post(this.n);
    }

    public final zznr q() {
        return this.y;
    }

    public final void r() {
        this.k.f(new ed0(this, this.l));
        this.p.removeCallbacksAndMessages((Object) null);
        this.I = true;
    }

    /* access modifiers changed from: package-private */
    public final int t(int i2, zzhs zzhs, zzjm zzjm, boolean z2) {
        if (this.w || J()) {
            return -3;
        }
        return this.q.valueAt(i2).f(zzhs, zzjm, z2, this.H, this.E);
    }

    /* access modifiers changed from: package-private */
    public final boolean x(int i2) {
        if (!this.H) {
            return !J() && this.q.valueAt(i2).o();
        }
        return true;
    }
}
