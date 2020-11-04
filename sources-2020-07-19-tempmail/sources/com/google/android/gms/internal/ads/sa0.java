package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class sa0 {

    /* renamed from: a  reason: collision with root package name */
    public final zzmz f4886a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4887b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4888c;

    /* renamed from: d  reason: collision with root package name */
    public final zznk[] f4889d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean[] f4890e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4891f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public sa0 l;
    public zzog m;
    private final zzhv[] n;
    private final zzhy[] o;
    private final zzoe p;
    private final zzhu q;
    private final zznb r;
    private zzog s;

    public sa0(zzhv[] zzhvArr, zzhy[] zzhyArr, long j2, zzoe zzoe, zzhu zzhu, zznb zznb, Object obj, int i2, int i3, boolean z, long j3) {
        this.n = zzhvArr;
        this.o = zzhyArr;
        this.f4891f = j2;
        this.p = zzoe;
        this.q = zzhu;
        this.r = zznb;
        zzpb.d(obj);
        this.f4887b = obj;
        this.f4888c = i2;
        this.g = i3;
        this.i = z;
        this.h = j3;
        this.f4889d = new zznk[zzhvArr.length];
        this.f4890e = new boolean[zzhvArr.length];
        this.f4886a = zznb.a(i3, zzhu.d());
    }

    public final void a() {
        try {
            this.r.e(this.f4886a);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }

    public final long b(long j2, boolean z, boolean[] zArr) {
        zzof zzof = this.m.f8935b;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= zzof.f8931a) {
                break;
            }
            boolean[] zArr2 = this.f4890e;
            if (z || !this.m.a(this.s, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long d2 = this.f4886a.d(zzof.b(), this.f4890e, this.f4889d, zArr, j2);
        this.s = this.m;
        this.k = false;
        int i3 = 0;
        while (true) {
            zznk[] zznkArr = this.f4889d;
            if (i3 < zznkArr.length) {
                if (zznkArr[i3] != null) {
                    zzpb.e(zzof.a(i3) != null);
                    this.k = true;
                } else {
                    zzpb.e(zzof.a(i3) == null);
                }
                i3++;
            } else {
                this.q.e(this.n, this.m.f8934a, zzof);
                return d2;
            }
        }
    }

    public final long c(long j2, boolean z) {
        return b(j2, false, new boolean[this.n.length]);
    }

    public final void d(int i2, boolean z) {
        this.g = i2;
        this.i = z;
    }

    public final long e() {
        return this.f4891f - this.h;
    }

    public final boolean f() {
        if (this.j) {
            return !this.k || this.f4886a.n() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() throws com.google.android.gms.internal.ads.zzhb {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzoe r0 = r6.p
            com.google.android.gms.internal.ads.zzhy[] r1 = r6.o
            com.google.android.gms.internal.ads.zzmz r2 = r6.f4886a
            com.google.android.gms.internal.ads.zznr r2 = r2.q()
            com.google.android.gms.internal.ads.zzog r0 = r0.b(r1, r2)
            com.google.android.gms.internal.ads.zzog r1 = r6.s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.zzof r5 = r0.f8935b
            int r5 = r5.f8931a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.m = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sa0.g():boolean");
    }
}
