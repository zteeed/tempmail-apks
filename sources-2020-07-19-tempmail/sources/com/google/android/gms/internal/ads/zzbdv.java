package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdv implements zzhu {

    /* renamed from: a  reason: collision with root package name */
    private final zzoo f6197a;

    /* renamed from: b  reason: collision with root package name */
    private long f6198b;

    /* renamed from: c  reason: collision with root package name */
    private long f6199c;

    /* renamed from: d  reason: collision with root package name */
    private long f6200d;

    /* renamed from: e  reason: collision with root package name */
    private long f6201e;

    /* renamed from: f  reason: collision with root package name */
    private int f6202f;
    private boolean g;

    zzbdv() {
        this(15000, 30000, 2500, 5000);
    }

    @VisibleForTesting
    private final void l(boolean z) {
        this.f6202f = 0;
        this.g = false;
        if (z) {
            this.f6197a.a();
        }
    }

    public final void a() {
        l(false);
    }

    public final synchronized boolean b(long j) {
        boolean z;
        char c2;
        z = false;
        if (j > this.f6199c) {
            c2 = 0;
        } else {
            c2 = j < this.f6198b ? (char) 2 : 1;
        }
        boolean z2 = this.f6197a.c() >= this.f6202f;
        if (c2 == 2 || (c2 == 1 && this.g && !z2)) {
            z = true;
        }
        this.g = z;
        return z;
    }

    public final void c() {
        l(true);
    }

    public final zzoi d() {
        return this.f6197a;
    }

    public final void e(zzhv[] zzhvArr, zznr zznr, zzof zzof) {
        this.f6202f = 0;
        for (int i = 0; i < zzhvArr.length; i++) {
            if (zzof.a(i) != null) {
                this.f6202f += zzpo.o(zzhvArr[i].d());
            }
        }
        this.f6197a.b(this.f6202f);
    }

    public final void f() {
        l(true);
    }

    public final synchronized boolean g(long j, boolean z) {
        boolean z2;
        long j2 = z ? this.f6201e : this.f6200d;
        if (j2 <= 0 || j >= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final synchronized void h(int i) {
        this.f6200d = ((long) i) * 1000;
    }

    public final synchronized void i(int i) {
        this.f6201e = ((long) i) * 1000;
    }

    public final synchronized void j(int i) {
        this.f6198b = ((long) i) * 1000;
    }

    public final synchronized void k(int i) {
        this.f6199c = ((long) i) * 1000;
    }

    private zzbdv(int i, int i2, long j, long j2) {
        this.f6197a = new zzoo(true, 65536);
        this.f6198b = 15000000;
        this.f6199c = 30000000;
        this.f6200d = 2500000;
        this.f6201e = 5000000;
    }
}
