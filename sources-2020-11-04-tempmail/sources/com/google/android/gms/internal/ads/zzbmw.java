package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmw extends zzbpb {
    private final View h;
    private final zzbfn i;
    private final zzdkj j;
    private final int k;
    private final boolean l;
    private final boolean m;
    private zzsl n;
    private final zzbmr o;

    zzbmw(zzbpa zzbpa, View view, zzbfn zzbfn, zzdkj zzdkj, int i2, boolean z, boolean z2, zzbmr zzbmr) {
        super(zzbpa);
        this.h = view;
        this.i = zzbfn;
        this.j = zzdkj;
        this.k = i2;
        this.l = z;
        this.m = z2;
        this.o = zzbmr;
    }

    public final void g(zzsa zzsa) {
        zzbfn zzbfn = this.i;
        if (zzbfn != null) {
            zzbfn.W(zzsa);
        }
    }

    public final void h(zzsl zzsl) {
        this.n = zzsl;
    }

    public final boolean i() {
        zzbfn zzbfn = this.i;
        return (zzbfn == null || zzbfn.q() == null || !this.i.q().o()) ? false : true;
    }

    public final int j() {
        return this.k;
    }

    public final boolean k() {
        return this.l;
    }

    public final boolean l() {
        return this.m;
    }

    public final zzdkj m() {
        return zzdld.a(this.f6673b.o, this.j);
    }

    public final View n() {
        return this.h;
    }

    public final boolean o() {
        zzbfn zzbfn = this.i;
        return zzbfn != null && zzbfn.z0();
    }

    public final zzsl p() {
        return this.n;
    }

    public final void q(long j2) {
        this.o.a(j2);
    }
}
