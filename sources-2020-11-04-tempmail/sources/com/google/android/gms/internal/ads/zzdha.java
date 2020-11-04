package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdha extends zzwv implements zzy, zzbuf, zzsa {

    /* renamed from: b  reason: collision with root package name */
    private final zzbif f8226b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8227c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f8228d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f8229e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final String f8230f;
    private final zzdgr g;
    /* access modifiers changed from: private */
    public final zzdhi h;
    /* access modifiers changed from: private */
    public final zzbbd i;
    private long j;
    private zzbml k;
    @GuardedBy("this")
    protected zzbmw l;

    public zzdha(zzbif zzbif, Context context, String str, zzdgr zzdgr, zzdhi zzdhi, zzbbd zzbbd) {
        this.f8228d = new FrameLayout(context);
        this.f8226b = zzbif;
        this.f8227c = context;
        this.f8230f = str;
        this.g = zzdgr;
        this.h = zzdhi;
        zzdhi.c(this);
        this.i = zzbbd;
    }

    /* access modifiers changed from: private */
    public final zzq f7(zzbmw zzbmw) {
        boolean i2 = zzbmw.i();
        int intValue = ((Integer) zzwg.e().c(zzaav.h2)).intValue();
        zzp zzp = new zzp();
        zzp.size = 50;
        zzp.paddingLeft = i2 ? intValue : 0;
        zzp.paddingRight = i2 ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        return new zzq(this.f8227c, zzp, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: h7 */
    public final void k7() {
        if (this.f8229e.compareAndSet(false, true)) {
            zzbmw zzbmw = this.l;
            if (!(zzbmw == null || zzbmw.p() == null)) {
                this.h.g(this.l.p());
            }
            this.h.a();
            this.f8228d.removeAllViews();
            zzbml zzbml = this.k;
            if (zzbml != null) {
                com.google.android.gms.ads.internal.zzq.zzkz().e(zzbml);
            }
            zzbmw zzbmw2 = this.l;
            if (zzbmw2 != null) {
                zzbmw2.q(com.google.android.gms.ads.internal.zzq.zzld().b() - this.j);
            }
            destroy();
        }
    }

    /* access modifiers changed from: private */
    public final zzvh i7() {
        return zzdld.b(this.f8227c, Collections.singletonList(this.l.m()));
    }

    /* access modifiers changed from: private */
    public static RelativeLayout.LayoutParams l7(zzbmw zzbmw) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(zzbmw.i() ? 11 : 9);
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public final void p7(zzbmw zzbmw) {
        zzbmw.g(this);
    }

    public final void a1() {
        if (this.l != null) {
            this.j = com.google.android.gms.ads.internal.zzq.zzld().b();
            int j2 = this.l.j();
            if (j2 > 0) {
                zzbml zzbml = new zzbml(this.f8226b.f(), com.google.android.gms.ads.internal.zzq.zzld());
                this.k = zzbml;
                zzbml.b(j2, new nu(this));
            }
        }
    }

    public final synchronized void destroy() {
        Preconditions.f("destroy must be called on the main UI thread.");
        if (this.l != null) {
            this.l.a();
        }
    }

    public final Bundle getAdMetadata() {
        return new Bundle();
    }

    public final synchronized String getAdUnitId() {
        return this.f8230f;
    }

    public final synchronized String getMediationAdapterClassName() {
        return null;
    }

    public final synchronized zzyi getVideoController() {
        return null;
    }

    public final void h0() {
        k7();
    }

    public final synchronized boolean isLoading() {
        return this.g.isLoading();
    }

    public final boolean isReady() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j7() {
        this.f8226b.e().execute(new ku(this));
    }

    public final synchronized void pause() {
        Preconditions.f("pause must be called on the main UI thread.");
    }

    public final synchronized void resume() {
        Preconditions.f("resume must be called on the main UI thread.");
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final synchronized void setManualImpressionsEnabled(boolean z) {
    }

    public final void setUserId(String str) {
    }

    public final void showInterstitial() {
    }

    public final void stopLoading() {
    }

    public final void zza(zzaqs zzaqs) {
    }

    public final void zza(zzaqy zzaqy, String str) {
    }

    public final void zza(zzatq zzatq) {
    }

    public final void zza(zzvo zzvo) {
        this.g.f(zzvo);
    }

    public final void zza(zzwi zzwi) {
    }

    public final void zza(zzwj zzwj) {
    }

    public final void zza(zzwz zzwz) {
    }

    public final void zza(zzxe zzxe) {
    }

    public final void zza(zzyc zzyc) {
    }

    public final void zza(zzyo zzyo) {
    }

    public final void zzbo(String str) {
    }

    public final IObjectWrapper zzkf() {
        Preconditions.f("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.h0(this.f8228d);
    }

    public final synchronized void zzkg() {
    }

    public final synchronized zzvh zzkh() {
        Preconditions.f("getAdSize must be called on the main UI thread.");
        if (this.l == null) {
            return null;
        }
        return zzdld.b(this.f8227c, Collections.singletonList(this.l.m()));
    }

    public final synchronized String zzki() {
        return null;
    }

    public final synchronized zzyd zzkj() {
        return null;
    }

    public final zzxe zzkk() {
        return null;
    }

    public final zzwj zzkl() {
        return null;
    }

    public final void zzuk() {
        k7();
    }

    public final synchronized boolean zza(zzve zzve) throws RemoteException {
        Preconditions.f("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaye.M(this.f8227c) && zzve.t == null) {
            zzbba.g("Failed to load the ad because app ID is missing.");
            this.h.onAdFailedToLoad(8);
            return false;
        } else if (isLoading()) {
            return false;
        } else {
            this.f8229e = new AtomicBoolean();
            return this.g.a(zzve, this.f8230f, new mu(this), new ou(this));
        }
    }

    public final void zza(zzsg zzsg) {
        this.h.f(zzsg);
    }

    public final synchronized void zza(zzvh zzvh) {
        Preconditions.f("setAdSize must be called on the main UI thread.");
    }

    public final synchronized void zza(zzxk zzxk) {
    }

    public final synchronized void zza(zzaaa zzaaa) {
    }

    public final synchronized void zza(zzabo zzabo) {
    }
}
