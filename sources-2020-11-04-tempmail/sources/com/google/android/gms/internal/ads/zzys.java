package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzys {

    /* renamed from: a  reason: collision with root package name */
    private final zzamo f9425a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f9426b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final VideoController f9427c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private final zzwf f9428d;

    /* renamed from: e  reason: collision with root package name */
    private zzuu f9429e;

    /* renamed from: f  reason: collision with root package name */
    private AdListener f9430f;
    private AdSize[] g;
    private AppEventListener h;
    private zzww i;
    private OnCustomRenderedAdLoadedListener j;
    private VideoOptions k;
    private String l;
    private ViewGroup m;
    private int n;
    private boolean o;
    private OnPaidEventListener p;

    public zzys(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, zzvf.f9371a, 0);
    }

    private static boolean D(int i2) {
        return i2 == 1;
    }

    private static zzvh y(Context context, AdSize[] adSizeArr, int i2) {
        for (AdSize equals : adSizeArr) {
            if (equals.equals(AdSize.INVALID)) {
                return zzvh.K();
            }
        }
        zzvh zzvh = new zzvh(context, adSizeArr);
        zzvh.k = D(i2);
        return zzvh;
    }

    public final void A(zzyq zzyq) {
        zzww zzww;
        try {
            if (this.i == null) {
                if ((this.g == null || this.l == null) && this.i == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.m.getContext();
                zzvh y = y(context, this.g, this.n);
                if ("search_v2".equals(y.f9372b)) {
                    zzww = (zzww) new ig0(zzwg.b(), context, y, this.l).b(context, false);
                } else {
                    zzww = (zzww) new cg0(zzwg.b(), context, y, this.l, this.f9425a).b(context, false);
                }
                this.i = zzww;
                zzww.zza((zzwj) new zzva(this.f9428d));
                if (this.f9429e != null) {
                    this.i.zza((zzwi) new zzut(this.f9429e));
                }
                if (this.h != null) {
                    this.i.zza((zzxe) new zzvl(this.h));
                }
                if (this.j != null) {
                    this.i.zza((zzabo) new zzabt(this.j));
                }
                if (this.k != null) {
                    this.i.zza(new zzaaa(this.k));
                }
                this.i.zza((zzyc) new zzzv(this.p));
                this.i.setManualImpressionsEnabled(this.o);
                try {
                    IObjectWrapper zzkf = this.i.zzkf();
                    if (zzkf != null) {
                        this.m.addView((View) ObjectWrapper.V(zzkf));
                    }
                } catch (RemoteException e2) {
                    zzbba.e("#007 Could not call remote method.", e2);
                }
            }
            if (this.i.zza(zzvf.b(this.m.getContext(), zzyq))) {
                this.f9425a.h7(zzyq.r());
            }
        } catch (RemoteException e3) {
            zzbba.e("#007 Could not call remote method.", e3);
        }
    }

    public final void B(AdSize... adSizeArr) {
        this.g = adSizeArr;
        try {
            if (this.i != null) {
                this.i.zza(y(this.m.getContext(), this.g, this.n));
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        this.m.requestLayout();
    }

    public final boolean C(zzww zzww) {
        if (zzww == null) {
            return false;
        }
        try {
            IObjectWrapper zzkf = zzww.zzkf();
            if (zzkf == null || ((View) ObjectWrapper.V(zzkf)).getParent() != null) {
                return false;
            }
            this.m.addView((View) ObjectWrapper.V(zzkf));
            this.i = zzww;
            return true;
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final zzyi E() {
        zzww zzww = this.i;
        if (zzww == null) {
            return null;
        }
        try {
            return zzww.getVideoController();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final void a() {
        try {
            if (this.i != null) {
                this.i.destroy();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final AdListener b() {
        return this.f9430f;
    }

    public final AdSize c() {
        zzvh zzkh;
        try {
            if (!(this.i == null || (zzkh = this.i.zzkh()) == null)) {
                return zzkh.N();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        AdSize[] adSizeArr = this.g;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] d() {
        return this.g;
    }

    public final String e() {
        zzww zzww;
        if (this.l == null && (zzww = this.i) != null) {
            try {
                this.l = zzww.getAdUnitId();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
        return this.l;
    }

    public final AppEventListener f() {
        return this.h;
    }

    public final String g() {
        try {
            if (this.i != null) {
                return this.i.zzki();
            }
            return null;
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final OnCustomRenderedAdLoadedListener h() {
        return this.j;
    }

    public final ResponseInfo i() {
        zzyd zzyd = null;
        try {
            if (this.i != null) {
                zzyd = this.i.zzkj();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zza(zzyd);
    }

    public final VideoController j() {
        return this.f9427c;
    }

    public final VideoOptions k() {
        return this.k;
    }

    public final boolean l() {
        try {
            if (this.i != null) {
                return this.i.isLoading();
            }
            return false;
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final void m() {
        try {
            if (this.i != null) {
                this.i.pause();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void n() {
        if (!this.f9426b.getAndSet(true)) {
            try {
                if (this.i != null) {
                    this.i.zzkg();
                }
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void o() {
        try {
            if (this.i != null) {
                this.i.resume();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void p(AdListener adListener) {
        this.f9430f = adListener;
        this.f9428d.a(adListener);
    }

    public final void q(AdSize... adSizeArr) {
        if (this.g == null) {
            B(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void r(String str) {
        if (this.l == null) {
            this.l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void s(AppEventListener appEventListener) {
        try {
            this.h = appEventListener;
            if (this.i != null) {
                this.i.zza((zzxe) appEventListener != null ? new zzvl(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void t(boolean z) {
        this.o = z;
        try {
            if (this.i != null) {
                this.i.setManualImpressionsEnabled(z);
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void u(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.j = onCustomRenderedAdLoadedListener;
        try {
            if (this.i != null) {
                this.i.zza((zzabo) onCustomRenderedAdLoadedListener != null ? new zzabt(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void v(OnPaidEventListener onPaidEventListener) {
        try {
            this.p = onPaidEventListener;
            if (this.i != null) {
                this.i.zza((zzyc) new zzzv(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            zzbba.e("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void w(VideoOptions videoOptions) {
        zzaaa zzaaa;
        this.k = videoOptions;
        try {
            if (this.i != null) {
                zzww zzww = this.i;
                if (videoOptions == null) {
                    zzaaa = null;
                } else {
                    zzaaa = new zzaaa(videoOptions);
                }
                zzww.zza(zzaaa);
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void z(zzuu zzuu) {
        try {
            this.f9429e = zzuu;
            if (this.i != null) {
                this.i.zza((zzwi) zzuu != null ? new zzut(zzuu) : null);
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public zzys(ViewGroup viewGroup, int i2) {
        this(viewGroup, (AttributeSet) null, false, zzvf.f9371a, i2);
    }

    public zzys(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzvf.f9371a, 0);
    }

    public zzys(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i2) {
        this(viewGroup, attributeSet, false, zzvf.f9371a, i2);
    }

    @VisibleForTesting
    private zzys(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzvf zzvf, zzww zzww, int i2) {
        zzvh zzvh;
        this.f9425a = new zzamo();
        this.f9427c = new VideoController();
        this.f9428d = new pg0(this);
        this.m = viewGroup;
        this.i = null;
        this.f9426b = new AtomicBoolean(false);
        this.n = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzvq zzvq = new zzvq(context, attributeSet);
                this.g = zzvq.c(z);
                this.l = zzvq.a();
                if (viewGroup.isInEditMode()) {
                    zzbaq a2 = zzwg.a();
                    AdSize adSize = this.g[0];
                    int i3 = this.n;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzvh = zzvh.K();
                    } else {
                        zzvh zzvh2 = new zzvh(context, adSize);
                        zzvh2.k = D(i3);
                        zzvh = zzvh2;
                    }
                    a2.f(viewGroup, zzvh, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                zzwg.a().h(viewGroup, new zzvh(context, AdSize.BANNER), e2.getMessage(), e2.getMessage());
            }
        }
    }

    @VisibleForTesting
    private zzys(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzvf zzvf, int i2) {
        this(viewGroup, attributeSet, z, zzvf, (zzww) null, i2);
    }
}
