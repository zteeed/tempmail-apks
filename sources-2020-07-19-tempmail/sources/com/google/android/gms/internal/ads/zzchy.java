package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzc;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchy {

    /* renamed from: a  reason: collision with root package name */
    private final zzbsk f7080a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzbtl f7081b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbtz f7082c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbui f7083d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbwj f7084e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f7085f;
    private final zzbyj g;
    private final zzblu h;
    private final zzc i;
    private final zzbtf j;
    private final zzavr k;
    private final zzeg l;
    /* access modifiers changed from: private */
    public final zzbwc m;

    public zzchy(zzbsk zzbsk, zzbtl zzbtl, zzbtz zzbtz, zzbui zzbui, zzbwj zzbwj, Executor executor, zzbyj zzbyj, zzblu zzblu, zzc zzc, zzbtf zzbtf, zzavr zzavr, zzeg zzeg, zzbwc zzbwc) {
        this.f7080a = zzbsk;
        this.f7081b = zzbtl;
        this.f7082c = zzbtz;
        this.f7083d = zzbui;
        this.f7084e = zzbwj;
        this.f7085f = executor;
        this.g = zzbyj;
        this.h = zzblu;
        this.i = zzc;
        this.j = zzbtf;
        this.k = zzavr;
        this.l = zzeg;
        this.m = zzbwc;
    }

    public static zzdvf<?> b(zzbfn zzbfn, String str, String str2) {
        zzbbn zzbbn = new zzbbn();
        zzbfn.q().b(new vj(zzbbn));
        zzbfn.H(str, str2, (String) null);
        return zzbbn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(zzbfn zzbfn, zzbfn zzbfn2, Map map) {
        this.h.z(zzbfn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        this.i.recordClick();
        zzavr zzavr = this.k;
        if (zzavr == null) {
            return false;
        }
        zzavr.c();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(View view) {
        this.i.recordClick();
        zzavr zzavr = this.k;
        if (zzavr != null) {
            zzavr.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        this.f7081b.D0();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        this.f7080a.onAdClicked();
    }

    public final void i(zzbfn zzbfn, boolean z) {
        zzdw h2;
        zzbfn.q().f(new nj(this), this.f7082c, this.f7083d, new mj(this), new pj(this), z, (zzahf) null, this.i, new uj(this), this.k);
        zzbfn.setOnTouchListener(new oj(this));
        zzbfn.setOnClickListener(new rj(this));
        if (((Boolean) zzwg.e().c(zzaav.b1)).booleanValue() && (h2 = this.l.h()) != null) {
            h2.zzb(zzbfn.getView());
        }
        this.g.p0(zzbfn, this.f7085f);
        this.g.p0(new qj(zzbfn), this.f7085f);
        this.g.C0(zzbfn.getView());
        zzbfn.c("/trackActiveViewUnit", new tj(this, zzbfn));
        this.h.B(zzbfn);
        if (!((Boolean) zzwg.e().c(zzaav.l0)).booleanValue()) {
            zzbtf zzbtf = this.j;
            zzbfn.getClass();
            zzbtf.C0(sj.b(zzbfn), this.f7085f);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(String str, String str2) {
        this.f7084e.onAppEvent(str, str2);
    }
}
