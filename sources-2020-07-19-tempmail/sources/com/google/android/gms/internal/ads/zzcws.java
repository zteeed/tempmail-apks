package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbxa;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcws extends zzwv implements zzbuw {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzbif f7660b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7661c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f7662d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzcxb f7663e = new zzcxb();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzcwy f7664f = new zzcwy();
    /* access modifiers changed from: private */
    public final zzcxa g = new zzcxa();
    /* access modifiers changed from: private */
    public final zzcww h = new zzcww();
    /* access modifiers changed from: private */
    public final zzbus i;
    private zzvh j;
    @GuardedBy("this")
    private final zzdlc k = new zzdlc();
    @GuardedBy("this")
    private zzabo l;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public zzbnc m;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public zzdvf<zzbnc> n;

    public zzcws(zzbif zzbif, Context context, zzvh zzvh, String str) {
        this.f7662d = new FrameLayout(context);
        this.f7660b = zzbif;
        this.f7661c = context;
        zzdlc zzdlc = this.k;
        zzdlc.r(zzvh);
        zzdlc.y(str);
        zzbus i2 = zzbif.i();
        this.i = i2;
        i2.p0(this, this.f7660b.e());
        this.j = zzvh;
    }

    private final synchronized zzbny D6(zzdla zzdla) {
        if (((Boolean) zzwg.e().c(zzaav.V3)).booleanValue()) {
            zzbob l2 = this.f7660b.l();
            zzbrx.zza zza = new zzbrx.zza();
            zza.g(this.f7661c);
            zza.c(zzdla);
            return l2.d(zza.d()).z(new zzbxa.zza().n()).a(new zzcvw(this.l)).c(new zzcay(zzccv.h, (zzwj) null)).s(new zzbou(this.i)).n(new zzbnb(this.f7662d)).r();
        }
        zzbob l3 = this.f7660b.l();
        zzbrx.zza zza2 = new zzbrx.zza();
        zza2.g(this.f7661c);
        zza2.c(zzdla);
        zzbob d2 = l3.d(zza2.d());
        zzbxa.zza zza3 = new zzbxa.zza();
        zza3.k(this.f7663e, this.f7660b.e());
        zza3.k(this.f7664f, this.f7660b.e());
        zza3.c(this.f7663e, this.f7660b.e());
        zza3.g(this.f7663e, this.f7660b.e());
        zza3.d(this.f7663e, this.f7660b.e());
        zza3.a(this.g, this.f7660b.e());
        zza3.i(this.h, this.f7660b.e());
        return d2.z(zza3.n()).a(new zzcvw(this.l)).c(new zzcay(zzccv.h, (zzwj) null)).s(new zzbou(this.i)).n(new zzbnb(this.f7662d)).r();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean J6(com.google.android.gms.internal.ads.zzve r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.f(r0)     // Catch:{ all -> 0x0080 }
            com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x0080 }
            android.content.Context r0 = r3.f7661c     // Catch:{ all -> 0x0080 }
            boolean r0 = com.google.android.gms.internal.ads.zzaye.M(r0)     // Catch:{ all -> 0x0080 }
            r1 = 0
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.zzuw r0 = r4.t     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0028
            java.lang.String r4 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzbba.g(r4)     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzcxb r4 = r3.f7663e     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzcxb r4 = r3.f7663e     // Catch:{ all -> 0x0080 }
            r0 = 8
            r4.onAdFailedToLoad(r0)     // Catch:{ all -> 0x0080 }
        L_0x0026:
            monitor-exit(r3)
            return r1
        L_0x0028:
            com.google.android.gms.internal.ads.zzdvf<com.google.android.gms.internal.ads.zzbnc> r0 = r3.n     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x002e
            monitor-exit(r3)
            return r1
        L_0x002e:
            android.content.Context r0 = r3.f7661c     // Catch:{ all -> 0x0080 }
            boolean r2 = r4.g     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzdlj.b(r0, r2)     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzdlc r0 = r3.k     // Catch:{ all -> 0x0080 }
            r0.A(r4)     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzdla r4 = r0.e()     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzabx<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacm.f5599b     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0080 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0080 }
            r2 = 1
            if (r0 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzdlc r0 = r3.k     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzvh r0 = r0.E()     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.l     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzcxb r0 = r3.f7663e     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzcxb r4 = r3.f7663e     // Catch:{ all -> 0x0080 }
            r4.onAdFailedToLoad(r2)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)
            return r1
        L_0x0062:
            com.google.android.gms.internal.ads.zzbny r4 = r3.D6(r4)     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzbpz r0 = r4.c()     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzdvf r0 = r0.g()     // Catch:{ all -> 0x0080 }
            r3.n = r0     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.yp r1 = new com.google.android.gms.internal.ads.yp     // Catch:{ all -> 0x0080 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzbif r4 = r3.f7660b     // Catch:{ all -> 0x0080 }
            java.util.concurrent.Executor r4 = r4.e()     // Catch:{ all -> 0x0080 }
            com.google.android.gms.internal.ads.zzdux.f(r0, r1, r4)     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)
            return r2
        L_0x0080:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcws.J6(com.google.android.gms.internal.ads.zzve):boolean");
    }

    public final synchronized void M2() {
        boolean z;
        ViewParent parent = this.f7662d.getParent();
        if (!(parent instanceof View)) {
            z = false;
        } else {
            View view = (View) parent;
            z = zzq.zzkw().q(view, view.getContext());
        }
        if (z) {
            if (!(this.m == null || this.m.k() == null)) {
                this.k.r(zzdld.b(this.f7661c, Collections.singletonList(this.m.k())));
            }
            J6(this.k.b());
            return;
        }
        this.i.F0(60);
    }

    public final synchronized void destroy() {
        Preconditions.f("destroy must be called on the main UI thread.");
        if (this.m != null) {
            this.m.a();
        }
    }

    public final Bundle getAdMetadata() {
        Preconditions.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized String getAdUnitId() {
        return this.k.c();
    }

    public final synchronized String getMediationAdapterClassName() {
        if (this.m == null || this.m.d() == null) {
            return null;
        }
        return this.m.d().getMediationAdapterClassName();
    }

    public final synchronized zzyi getVideoController() {
        Preconditions.f("getVideoController must be called from the main thread.");
        if (this.m == null) {
            return null;
        }
        return this.m.g();
    }

    public final synchronized boolean isLoading() {
        return this.n != null && !this.n.isDone();
    }

    public final boolean isReady() {
        return false;
    }

    public final synchronized void pause() {
        Preconditions.f("pause must be called on the main UI thread.");
        if (this.m != null) {
            this.m.c().D0((Context) null);
        }
    }

    public final synchronized void resume() {
        Preconditions.f("resume must be called on the main UI thread.");
        if (this.m != null) {
            this.m.c().E0((Context) null);
        }
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.f("setManualImpressionsEnabled must be called from the main thread.");
        this.k.l(z);
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

    public final void zza(zzsg zzsg) {
    }

    public final void zza(zzvo zzvo) {
    }

    public final void zza(zzyo zzyo) {
    }

    public final synchronized boolean zza(zzve zzve) {
        this.k.r(this.j);
        this.k.k(this.j.o);
        return J6(zzve);
    }

    public final void zzbo(String str) {
    }

    public final IObjectWrapper zzkf() {
        Preconditions.f("destroy must be called on the main UI thread.");
        return ObjectWrapper.b0(this.f7662d);
    }

    public final synchronized void zzkg() {
        Preconditions.f("recordManualImpression must be called on the main UI thread.");
        if (this.m != null) {
            this.m.m();
        }
    }

    public final synchronized zzvh zzkh() {
        Preconditions.f("getAdSize must be called on the main UI thread.");
        if (this.m != null) {
            return zzdld.b(this.f7661c, Collections.singletonList(this.m.i()));
        }
        return this.k.E();
    }

    public final synchronized String zzki() {
        if (this.m == null || this.m.d() == null) {
            return null;
        }
        return this.m.d().getMediationAdapterClassName();
    }

    public final synchronized zzyd zzkj() {
        if (!((Boolean) zzwg.e().c(zzaav.C3)).booleanValue()) {
            return null;
        }
        if (this.m == null) {
            return null;
        }
        return this.m.d();
    }

    public final zzxe zzkk() {
        return this.g.a();
    }

    public final zzwj zzkl() {
        return this.f7663e.a();
    }

    public final void zza(zzwj zzwj) {
        Preconditions.f("setAdListener must be called on the main UI thread.");
        this.f7663e.b(zzwj);
    }

    public final void zza(zzxe zzxe) {
        Preconditions.f("setAppEventListener must be called on the main UI thread.");
        this.g.b(zzxe);
    }

    public final synchronized void zza(zzvh zzvh) {
        Preconditions.f("setAdSize must be called on the main UI thread.");
        this.k.r(zzvh);
        this.j = zzvh;
        if (this.m != null) {
            this.m.h(this.f7662d, zzvh);
        }
    }

    public final synchronized void zza(zzxk zzxk) {
        Preconditions.f("setCorrelationIdProvider must be called on the main UI thread");
        this.k.o(zzxk);
    }

    public final synchronized void zza(zzaaa zzaaa) {
        Preconditions.f("setVideoOptions must be called on the main UI thread.");
        this.k.m(zzaaa);
    }

    public final void zza(zzwi zzwi) {
        Preconditions.f("setAdListener must be called on the main UI thread.");
        this.f7664f.a(zzwi);
    }

    public final synchronized void zza(zzabo zzabo) {
        Preconditions.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.l = zzabo;
    }

    public final void zza(zzyc zzyc) {
        Preconditions.f("setPaidEventListener must be called on the main UI thread.");
        this.h.b(zzyc);
    }

    public final void zza(zzwz zzwz) {
        Preconditions.f("setAdMetadataListener must be called on the main UI thread.");
    }
}
