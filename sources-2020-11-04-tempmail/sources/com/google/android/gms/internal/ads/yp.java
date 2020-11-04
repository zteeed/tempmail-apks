package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class yp implements zzduu<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbny f5593a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzcws f5594b;

    yp(zzcws zzcws, zzbny zzbny) {
        this.f5594b = zzcws;
        this.f5593a = zzbny;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        synchronized (this.f5594b) {
            zzdvf unused = this.f5594b.n = null;
            this.f5593a.d().onAdFailedToLoad(b2.f9355b);
            if (((Boolean) zzwg.e().c(zzaav.V3)).booleanValue()) {
                this.f5594b.f7843b.e().execute(new zp(this, b2));
            }
            this.f5594b.i.F0(60);
            zzdlj.a(b2.f9355b, th, "BannerAdManagerShim.onFailure");
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbnc zzbnc = (zzbnc) obj;
        synchronized (this.f5594b) {
            zzdvf unused = this.f5594b.n = null;
            if (this.f5594b.m != null) {
                this.f5594b.m.a();
            }
            zzbnc unused2 = this.f5594b.m = zzbnc;
            this.f5594b.f7845d.removeAllViews();
            if (zzbnc.j() != null) {
                ViewParent parent = zzbnc.j().getParent();
                if (parent instanceof ViewGroup) {
                    String mediationAdapterClassName = this.f5594b.getMediationAdapterClassName();
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
                f2.d(this.f5594b.f7846e);
                f2.b(this.f5594b.f7847f);
                f2.c(this.f5594b.g);
                f2.a(this.f5594b.h);
            }
            this.f5594b.f7845d.addView(zzbnc.j());
            zzbnc.b();
            if (((Boolean) zzwg.e().c(zzaav.V3)).booleanValue()) {
                Executor e2 = this.f5594b.f7843b.e();
                zzcxb m7 = this.f5594b.f7846e;
                m7.getClass();
                e2.execute(xp.a(m7));
            }
            this.f5594b.i.F0(zzbnc.l());
        }
    }
}
