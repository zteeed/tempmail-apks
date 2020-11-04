package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcxd extends zzwv {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzbif f7670b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7671c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7672d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzcxb f7673e = new zzcxb();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzcxa f7674f = new zzcxa();
    /* access modifiers changed from: private */
    public final zzdiu g = new zzdiu(new zzdmi());
    /* access modifiers changed from: private */
    public final zzcww h = new zzcww();
    @GuardedBy("this")
    private final zzdlc i;
    @GuardedBy("this")
    private zzabo j;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public zzbzj k;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public zzdvf<zzbzj> l;
    @GuardedBy("this")
    private boolean m;

    public zzcxd(zzbif zzbif, Context context, zzvh zzvh, String str) {
        zzdlc zzdlc = new zzdlc();
        this.i = zzdlc;
        this.m = false;
        this.f7670b = zzbif;
        zzdlc.r(zzvh);
        zzdlc.y(str);
        this.f7672d = zzbif.e();
        this.f7671c = context;
    }

    private final synchronized boolean C6() {
        return this.k != null && !this.k.g();
    }

    public final synchronized void destroy() {
        Preconditions.f("destroy must be called on the main UI thread.");
        if (this.k != null) {
            this.k.c().F0((Context) null);
        }
    }

    public final Bundle getAdMetadata() {
        Preconditions.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized String getAdUnitId() {
        return this.i.c();
    }

    public final synchronized String getMediationAdapterClassName() {
        if (this.k == null || this.k.d() == null) {
            return null;
        }
        return this.k.d().getMediationAdapterClassName();
    }

    public final zzyi getVideoController() {
        return null;
    }

    public final synchronized boolean isLoading() {
        return this.l != null && !this.l.isDone();
    }

    public final synchronized boolean isReady() {
        Preconditions.f("isLoaded must be called on the main UI thread.");
        return C6();
    }

    public final synchronized void pause() {
        Preconditions.f("pause must be called on the main UI thread.");
        if (this.k != null) {
            this.k.c().D0((Context) null);
        }
    }

    public final synchronized void resume() {
        Preconditions.f("resume must be called on the main UI thread.");
        if (this.k != null) {
            this.k.c().E0((Context) null);
        }
    }

    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.f("setImmersiveMode must be called on the main UI thread.");
        this.m = z;
    }

    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.f("setManualImpressionsEnabled must be called from the main thread.");
        this.i.l(z);
    }

    public final void setUserId(String str) {
    }

    public final synchronized void showInterstitial() {
        Preconditions.f("showInterstitial must be called on the main UI thread.");
        if (this.k != null) {
            this.k.h(this.m);
        }
    }

    public final void stopLoading() {
    }

    public final void zza(zzaqs zzaqs) {
    }

    public final void zza(zzaqy zzaqy, String str) {
    }

    public final void zza(zzsg zzsg) {
    }

    public final void zza(zzvh zzvh) {
    }

    public final void zza(zzvo zzvo) {
    }

    public final void zza(zzwi zzwi) {
    }

    public final void zza(zzyo zzyo) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0148, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zza(com.google.android.gms.internal.ads.zzve r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.f(r0)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.ads.internal.zzq.zzkw()     // Catch:{ all -> 0x0149 }
            android.content.Context r0 = r4.f7671c     // Catch:{ all -> 0x0149 }
            boolean r0 = com.google.android.gms.internal.ads.zzaye.M(r0)     // Catch:{ all -> 0x0149 }
            r1 = 0
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.zzuw r0 = r5.t     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0028
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzbba.g(r5)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcxb r5 = r4.f7673e     // Catch:{ all -> 0x0149 }
            if (r5 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzcxb r5 = r4.f7673e     // Catch:{ all -> 0x0149 }
            r0 = 8
            r5.onAdFailedToLoad(r0)     // Catch:{ all -> 0x0149 }
        L_0x0026:
            monitor-exit(r4)
            return r1
        L_0x0028:
            com.google.android.gms.internal.ads.zzdvf<com.google.android.gms.internal.ads.zzbzj> r0 = r4.l     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0147
            boolean r0 = r4.C6()     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0034
            goto L_0x0147
        L_0x0034:
            android.content.Context r0 = r4.f7671c     // Catch:{ all -> 0x0149 }
            boolean r1 = r5.g     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzdlj.b(r0, r1)     // Catch:{ all -> 0x0149 }
            r0 = 0
            r4.k = r0     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzdlc r0 = r4.i     // Catch:{ all -> 0x0149 }
            r0.A(r5)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzdla r5 = r0.e()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.Y3     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x0149 }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x0149 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0149 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0092
            com.google.android.gms.internal.ads.zzbif r0 = r4.f7670b     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcah r0 = r0.o()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbrx$zza r1 = new com.google.android.gms.internal.ads.zzbrx$zza     // Catch:{ all -> 0x0149 }
            r1.<init>()     // Catch:{ all -> 0x0149 }
            android.content.Context r2 = r4.f7671c     // Catch:{ all -> 0x0149 }
            r1.g(r2)     // Catch:{ all -> 0x0149 }
            r1.c(r5)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbrx r5 = r1.d()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcah r5 = r0.y(r5)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbxa$zza r0 = new com.google.android.gms.internal.ads.zzbxa$zza     // Catch:{ all -> 0x0149 }
            r0.<init>()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbxa r0 = r0.n()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcah r5 = r5.w(r0)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcvw r0 = new com.google.android.gms.internal.ads.zzcvw     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzabo r1 = r4.j     // Catch:{ all -> 0x0149 }
            r0.<init>(r1)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcah r5 = r5.x(r0)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcae r5 = r5.t()     // Catch:{ all -> 0x0149 }
            goto L_0x0130
        L_0x0092:
            com.google.android.gms.internal.ads.zzbxa$zza r0 = new com.google.android.gms.internal.ads.zzbxa$zza     // Catch:{ all -> 0x0149 }
            r0.<init>()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzdiu r1 = r4.g     // Catch:{ all -> 0x0149 }
            if (r1 == 0) goto L_0x00bc
            com.google.android.gms.internal.ads.zzdiu r1 = r4.g     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzdiu r1 = r4.g     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.g(r1, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzdiu r1 = r4.g     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.d(r1, r2)     // Catch:{ all -> 0x0149 }
        L_0x00bc:
            com.google.android.gms.internal.ads.zzbif r1 = r4.f7670b     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcah r1 = r1.o()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbrx$zza r2 = new com.google.android.gms.internal.ads.zzbrx$zza     // Catch:{ all -> 0x0149 }
            r2.<init>()     // Catch:{ all -> 0x0149 }
            android.content.Context r3 = r4.f7671c     // Catch:{ all -> 0x0149 }
            r2.g(r3)     // Catch:{ all -> 0x0149 }
            r2.c(r5)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbrx r5 = r2.d()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcah r5 = r1.y(r5)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcxb r1 = r4.f7673e     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcxb r1 = r4.f7673e     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.g(r1, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcxb r1 = r4.f7673e     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.d(r1, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcxb r1 = r4.f7673e     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.k(r1, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcxa r1 = r4.f7674f     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.a(r1, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcww r1 = r4.h     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbif r2 = r4.f7670b     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r2 = r2.e()     // Catch:{ all -> 0x0149 }
            r0.i(r1, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzbxa r0 = r0.n()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcah r5 = r5.w(r0)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcvw r0 = new com.google.android.gms.internal.ads.zzcvw     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzabo r1 = r4.j     // Catch:{ all -> 0x0149 }
            r0.<init>(r1)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcah r5 = r5.x(r0)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzcae r5 = r5.t()     // Catch:{ all -> 0x0149 }
        L_0x0130:
            com.google.android.gms.internal.ads.zzbpz r0 = r5.b()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzdvf r0 = r0.g()     // Catch:{ all -> 0x0149 }
            r4.l = r0     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.cq r1 = new com.google.android.gms.internal.ads.cq     // Catch:{ all -> 0x0149 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0149 }
            java.util.concurrent.Executor r5 = r4.f7672d     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.ads.zzdux.f(r0, r1, r5)     // Catch:{ all -> 0x0149 }
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x0147:
            monitor-exit(r4)
            return r1
        L_0x0149:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcxd.zza(com.google.android.gms.internal.ads.zzve):boolean");
    }

    public final void zzbo(String str) {
    }

    public final IObjectWrapper zzkf() {
        return null;
    }

    public final void zzkg() {
    }

    public final zzvh zzkh() {
        return null;
    }

    public final synchronized String zzki() {
        if (this.k == null || this.k.d() == null) {
            return null;
        }
        return this.k.d().getMediationAdapterClassName();
    }

    public final synchronized zzyd zzkj() {
        if (!((Boolean) zzwg.e().c(zzaav.C3)).booleanValue()) {
            return null;
        }
        if (this.k == null) {
            return null;
        }
        return this.k.d();
    }

    public final zzxe zzkk() {
        return this.f7674f.a();
    }

    public final zzwj zzkl() {
        return this.f7673e.a();
    }

    public final void zza(zzwj zzwj) {
        Preconditions.f("setAdListener must be called on the main UI thread.");
        this.f7673e.b(zzwj);
    }

    public final void zza(zzxe zzxe) {
        Preconditions.f("setAppEventListener must be called on the main UI thread.");
        this.f7674f.b(zzxe);
    }

    public final synchronized void zza(zzxk zzxk) {
        Preconditions.f("setCorrelationIdProvider must be called on the main UI thread");
        this.i.o(zzxk);
    }

    public final synchronized void zza(zzaaa zzaaa) {
        this.i.m(zzaaa);
    }

    public final synchronized void zza(zzabo zzabo) {
        Preconditions.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.j = zzabo;
    }

    public final void zza(zzyc zzyc) {
        Preconditions.f("setPaidEventListener must be called on the main UI thread.");
        this.h.b(zzyc);
    }

    public final void zza(zzwz zzwz) {
        Preconditions.f("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void zza(zzatq zzatq) {
        this.g.h(zzatq);
    }
}
