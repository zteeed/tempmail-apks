package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzq;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchj extends zzbpb {
    private final Context h;
    private final WeakReference<zzbfn> i;
    private final zzcam j;
    private final zzbxx k;
    private final zzbss l;
    private final zzbtz m;
    private final zzbpv n;
    private final zzaud o;
    private final zzdpx p;
    private boolean q = false;

    zzchj(zzbpa zzbpa, Context context, zzbfn zzbfn, zzcam zzcam, zzbxx zzbxx, zzbss zzbss, zzbtz zzbtz, zzbpv zzbpv, zzdkk zzdkk, zzdpx zzdpx) {
        super(zzbpa);
        this.h = context;
        this.j = zzcam;
        this.i = new WeakReference<>(zzbfn);
        this.k = zzbxx;
        this.l = zzbss;
        this.m = zzbtz;
        this.n = zzbpv;
        this.p = zzdpx;
        this.o = new zzave(zzdkk.l);
    }

    public final void finalize() throws Throwable {
        try {
            zzbfn zzbfn = (zzbfn) this.i.get();
            if (((Boolean) zzwg.e().c(zzaav.A3)).booleanValue()) {
                if (!this.q && zzbfn != null) {
                    zzdvi zzdvi = zzbbf.f6324e;
                    zzbfn.getClass();
                    zzdvi.execute(gj.a(zzbfn));
                }
            } else if (zzbfn != null) {
                zzbfn.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle g() {
        return this.m.C0();
    }

    public final boolean h() {
        return this.n.a();
    }

    public final boolean i() {
        return this.q;
    }

    public final boolean j(boolean z, Activity activity) {
        if (((Boolean) zzwg.e().c(zzaav.f0)).booleanValue()) {
            zzq.zzkw();
            if (zzaye.B(this.h)) {
                zzbba.i("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.l.g0();
                if (((Boolean) zzwg.e().c(zzaav.g0)).booleanValue()) {
                    this.p.a(this.f6672a.f8345b.f8340b.f8321b);
                }
                return false;
            }
        }
        if (this.q) {
            zzbba.i("The rewarded ad have been showed.");
            this.l.P(new zzuy(1, "The ad has already been shown.", "com.google.android.gms.ads"));
            return false;
        }
        this.q = true;
        this.k.O();
        Context context = activity;
        if (activity == null) {
            context = this.h;
        }
        try {
            this.j.a(z, context);
            return true;
        } catch (zzcap e2) {
            this.l.E(e2);
            return false;
        }
    }

    public final zzaud k() {
        return this.o;
    }

    public final boolean l() {
        zzbfn zzbfn = (zzbfn) this.i.get();
        return zzbfn != null && !zzbfn.S();
    }
}
