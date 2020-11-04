package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbdv implements zzhu {

    /* renamed from: a  reason: collision with root package name */
    private final zzoo f6380a;

    /* renamed from: b  reason: collision with root package name */
    private long f6381b;

    /* renamed from: c  reason: collision with root package name */
    private long f6382c;

    /* renamed from: d  reason: collision with root package name */
    private long f6383d;

    /* renamed from: e  reason: collision with root package name */
    private long f6384e;

    /* renamed from: f  reason: collision with root package name */
    private int f6385f;
    private boolean g;

    zzbdv() {
        this(15000, 30000, 2500, 5000);
    }

    @VisibleForTesting
    private final void l(boolean z) {
        this.f6385f = 0;
        this.g = false;
        if (z) {
            this.f6380a.a();
        }
    }

    public final void a() {
        l(false);
    }

    public final synchronized boolean b(long j) {
        boolean z;
        char c2;
        z = false;
        if (j > this.f6382c) {
            c2 = 0;
        } else {
            c2 = j < this.f6381b ? (char) 2 : 1;
        }
        boolean z2 = this.f6380a.c() >= this.f6385f;
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
        return this.f6380a;
    }

    public final void e(zzhv[] zzhvArr, zznr zznr, zzof zzof) {
        this.f6385f = 0;
        for (int i = 0; i < zzhvArr.length; i++) {
            if (zzof.a(i) != null) {
                this.f6385f += zzpo.o(zzhvArr[i].d());
            }
        }
        this.f6380a.b(this.f6385f);
    }

    public final void f() {
        l(true);
    }

    public final synchronized boolean g(long j, boolean z) {
        boolean z2;
        long j2 = z ? this.f6384e : this.f6383d;
        if (j2 <= 0 || j >= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final synchronized void h(int i) {
        this.f6383d = ((long) i) * 1000;
    }

    public final synchronized void i(int i) {
        this.f6384e = ((long) i) * 1000;
    }

    public final synchronized void j(int i) {
        this.f6381b = ((long) i) * 1000;
    }

    public final synchronized void k(int i) {
        this.f6382c = ((long) i) * 1000;
    }

    private zzbdv(int i, int i2, long j, long j2) {
        this.f6380a = new zzoo(true, 65536);
        this.f6381b = 15000000;
        this.f6382c = 30000000;
        this.f6383d = 2500000;
        this.f6384e = 5000000;
    }
}
