package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzha implements zzhv, zzhy {

    /* renamed from: a  reason: collision with root package name */
    private final int f8713a;

    /* renamed from: b  reason: collision with root package name */
    private zzhx f8714b;

    /* renamed from: c  reason: collision with root package name */
    private int f8715c;

    /* renamed from: d  reason: collision with root package name */
    private int f8716d;

    /* renamed from: e  reason: collision with root package name */
    private zznk f8717e;

    /* renamed from: f  reason: collision with root package name */
    private long f8718f;
    private boolean g = true;
    private boolean h;

    public zzha(int i) {
        this.f8713a = i;
    }

    /* access modifiers changed from: protected */
    public void A(long j, boolean z) throws zzhb {
    }

    /* access modifiers changed from: protected */
    public void B(zzhq[] zzhqArr, long j) throws zzhb {
    }

    /* access modifiers changed from: protected */
    public final void C(long j) {
        this.f8717e.a(j - this.f8718f);
    }

    /* access modifiers changed from: protected */
    public void D(boolean z) throws zzhb {
    }

    /* access modifiers changed from: protected */
    public void E() {
    }

    /* access modifiers changed from: protected */
    public final zzhx F() {
        return this.f8714b;
    }

    /* access modifiers changed from: protected */
    public final boolean G() {
        return this.g ? this.h : this.f8717e.isReady();
    }

    public final int c() {
        return this.f8716d;
    }

    public final int d() {
        return this.f8713a;
    }

    public final void e() {
        this.h = true;
    }

    public final void f(zzhq[] zzhqArr, zznk zznk, long j) throws zzhb {
        zzpb.e(!this.h);
        this.f8717e = zznk;
        this.g = false;
        this.f8718f = j;
        B(zzhqArr, j);
    }

    public final zzhy g() {
        return this;
    }

    public final void h(long j) throws zzhb {
        this.h = false;
        this.g = false;
        A(j, false);
    }

    public void i(int i, Object obj) throws zzhb {
    }

    public final boolean j() {
        return this.h;
    }

    public zzpf l() {
        return null;
    }

    public final zznk n() {
        return this.f8717e;
    }

    public final boolean o() {
        return this.g;
    }

    public final void p(int i) {
        this.f8715c = i;
    }

    public final void q() {
        boolean z = true;
        if (this.f8716d != 1) {
            z = false;
        }
        zzpb.e(z);
        this.f8716d = 0;
        this.f8717e = null;
        this.h = false;
        E();
    }

    public final void r() throws IOException {
        this.f8717e.c();
    }

    public final void s(zzhx zzhx, zzhq[] zzhqArr, zznk zznk, long j, boolean z, long j2) throws zzhb {
        zzpb.e(this.f8716d == 0);
        this.f8714b = zzhx;
        this.f8716d = 1;
        D(z);
        f(zzhqArr, zznk, j2);
        A(j, z);
    }

    public final void start() throws zzhb {
        boolean z = true;
        if (this.f8716d != 1) {
            z = false;
        }
        zzpb.e(z);
        this.f8716d = 2;
        x();
    }

    public final void stop() throws zzhb {
        zzpb.e(this.f8716d == 2);
        this.f8716d = 1;
        y();
    }

    public int v() throws zzhb {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int w() {
        return this.f8715c;
    }

    /* access modifiers changed from: protected */
    public void x() throws zzhb {
    }

    /* access modifiers changed from: protected */
    public void y() throws zzhb {
    }

    /* access modifiers changed from: protected */
    public final int z(zzhs zzhs, zzjm zzjm, boolean z) {
        int b2 = this.f8717e.b(zzhs, zzjm, z);
        if (b2 == -4) {
            if (zzjm.f()) {
                this.g = true;
                if (this.h) {
                    return -4;
                }
                return -3;
            }
            zzjm.f8797d += this.f8718f;
        } else if (b2 == -5) {
            zzhq zzhq = zzhs.f8737a;
            long j = zzhq.x;
            if (j != Long.MAX_VALUE) {
                zzhs.f8737a = zzhq.m(j + this.f8718f);
            }
        }
        return b2;
    }
}
