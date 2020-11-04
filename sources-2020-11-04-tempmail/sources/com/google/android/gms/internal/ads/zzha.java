package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzha implements zzhv, zzhy {

    /* renamed from: a  reason: collision with root package name */
    private final int f8896a;

    /* renamed from: b  reason: collision with root package name */
    private zzhx f8897b;

    /* renamed from: c  reason: collision with root package name */
    private int f8898c;

    /* renamed from: d  reason: collision with root package name */
    private int f8899d;

    /* renamed from: e  reason: collision with root package name */
    private zznk f8900e;

    /* renamed from: f  reason: collision with root package name */
    private long f8901f;
    private boolean g = true;
    private boolean h;

    public zzha(int i) {
        this.f8896a = i;
    }

    /* access modifiers changed from: protected */
    public void A(long j, boolean z) throws zzhb {
    }

    /* access modifiers changed from: protected */
    public void B(zzhq[] zzhqArr, long j) throws zzhb {
    }

    /* access modifiers changed from: protected */
    public final void C(long j) {
        this.f8900e.a(j - this.f8901f);
    }

    /* access modifiers changed from: protected */
    public void D(boolean z) throws zzhb {
    }

    /* access modifiers changed from: protected */
    public void E() {
    }

    /* access modifiers changed from: protected */
    public final zzhx F() {
        return this.f8897b;
    }

    /* access modifiers changed from: protected */
    public final boolean G() {
        return this.g ? this.h : this.f8900e.isReady();
    }

    public final int c() {
        return this.f8899d;
    }

    public final int d() {
        return this.f8896a;
    }

    public final void e() {
        this.h = true;
    }

    public final void f(zzhq[] zzhqArr, zznk zznk, long j) throws zzhb {
        zzpb.e(!this.h);
        this.f8900e = zznk;
        this.g = false;
        this.f8901f = j;
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
        return this.f8900e;
    }

    public final boolean o() {
        return this.g;
    }

    public final void p(int i) {
        this.f8898c = i;
    }

    public final void q() {
        boolean z = true;
        if (this.f8899d != 1) {
            z = false;
        }
        zzpb.e(z);
        this.f8899d = 0;
        this.f8900e = null;
        this.h = false;
        E();
    }

    public final void r() throws IOException {
        this.f8900e.c();
    }

    public final void s(zzhx zzhx, zzhq[] zzhqArr, zznk zznk, long j, boolean z, long j2) throws zzhb {
        zzpb.e(this.f8899d == 0);
        this.f8897b = zzhx;
        this.f8899d = 1;
        D(z);
        f(zzhqArr, zznk, j2);
        A(j, z);
    }

    public final void start() throws zzhb {
        boolean z = true;
        if (this.f8899d != 1) {
            z = false;
        }
        zzpb.e(z);
        this.f8899d = 2;
        x();
    }

    public final void stop() throws zzhb {
        zzpb.e(this.f8899d == 2);
        this.f8899d = 1;
        y();
    }

    public int v() throws zzhb {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int w() {
        return this.f8898c;
    }

    /* access modifiers changed from: protected */
    public void x() throws zzhb {
    }

    /* access modifiers changed from: protected */
    public void y() throws zzhb {
    }

    /* access modifiers changed from: protected */
    public final int z(zzhs zzhs, zzjm zzjm, boolean z) {
        int b2 = this.f8900e.b(zzhs, zzjm, z);
        if (b2 == -4) {
            if (zzjm.f()) {
                this.g = true;
                if (this.h) {
                    return -4;
                }
                return -3;
            }
            zzjm.f8980d += this.f8901f;
        } else if (b2 == -5) {
            zzhq zzhq = zzhs.f8920a;
            long j = zzhq.x;
            if (j != Long.MAX_VALUE) {
                zzhs.f8920a = zzhq.m(j + this.f8901f);
            }
        }
        return b2;
    }
}
