package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class yp implements zzduu<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbny f5410a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzcws f5411b;

    yp(zzcws zzcws, zzbny zzbny) {
        this.f5411b = zzcws;
        this.f5410a = zzbny;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        synchronized (this.f5411b) {
            zzdvf unused = this.f5411b.n = null;
            this.f5410a.d().onAdFailedToLoad(b2.f9172b);
            if (((Boolean) zzwg.e().c(zzaav.V3)).booleanValue()) {
                this.f5411b.f7660b.e().execute(new zp(this, b2));
            }
            this.f5411b.i.F0(60);
            zzdlj.a(b2.f9172b, th, "BannerAdManagerShim.onFailure");
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbnc zzbnc = (zzbnc) obj;
        synchronized (this.f5411b) {
            zzdvf unused = this.f5411b.n = null;
            if (this.f5411b.m != null) {
                this.f5411b.m.a();
            }
            zzbnc unused2 = this.f5411b.m = zzbnc;
            this.f5411b.f7662d.removeAllViews();
            if (zzbnc.j() != null) {
                ViewParent parent = zzbnc.j().getParent();
                if (parent instanceof ViewGroup) {
                    String mediationAdapterClassName = this.f5411b.getMediationAdapterClassName();
                    StringBuilder sb = new StringBuilder(String.valueOf(mediationAdapterClassName).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(mediationAdapterClassName);
                    sb.append(" already has a parent view. Removing its old parent.");
                    zzbba.i(sb.toString());
                    ((ViewGroup) parent).removeView(zzbnc.j());
                }
            }
            if (((Boolean) zzwg.e().c(zzaav.V3)).booleanValue()) {
                zzbvy f2 = zzbnc.f();
                f2.d(this.f5411b.f7663e);
                f2.b(this.f5411b.f7664f);
                f2.c(this.f5411b.g);
                f2.a(this.f5411b.h);
            }
            this.f5411b.f7662d.addView(zzbnc.j());
            zzbnc.b();
            if (((Boolean) zzwg.e().c(zzaav.V3)).booleanValue()) {
                Executor e2 = this.f5411b.f7660b.e();
                zzcxb H6 = this.f5411b.f7663e;
                H6.getClass();
                e2.execute(xp.a(H6));
            }
            this.f5411b.i.F0(zzbnc.l());
        }
    }
}
