package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblk implements zzbsl, zzbtd, zzbua, zzuu {

    /* renamed from: b  reason: collision with root package name */
    private final Context f6318b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f6319c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f6320d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzdkw f6321e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzdkk f6322f;
    /* access modifiers changed from: private */
    public final zzdpd g;
    private final zzeg h;
    private final zzabv i;
    private final View j;
    @GuardedBy("this")
    private boolean k;
    @GuardedBy("this")
    private boolean l;

    public zzblk(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, zzdkw zzdkw, zzdkk zzdkk, zzdpd zzdpd, View view, zzeg zzeg, zzabv zzabv) {
        this.f6318b = context;
        this.f6319c = executor;
        this.f6320d = scheduledExecutorService;
        this.f6321e = zzdkw;
        this.f6322f = zzdkk;
        this.g = zzdpd;
        this.h = zzeg;
        this.j = view;
        this.i = zzabv;
    }

    public final void d(zzatg zzatg, String str, String str2) {
        zzdpd zzdpd = this.g;
        zzdkw zzdkw = this.f6321e;
        zzdkk zzdkk = this.f6322f;
        zzdpd.b(zzdkw, zzdkk, zzdkk.h, zzatg);
    }

    public final void onAdClicked() {
        zzdpd zzdpd = this.g;
        zzdkw zzdkw = this.f6321e;
        zzdkk zzdkk = this.f6322f;
        zzdpd.a(zzdkw, zzdkk, zzdkk.f8133c);
    }

    public final void onAdClosed() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onAdImpression() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.l     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x007b
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.r1     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x007d }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x007d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x007d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007d }
            r1 = 0
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.zzeg r0 = r9.h     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzdw r0 = r0.h()     // Catch:{ all -> 0x007d }
            android.content.Context r2 = r9.f6318b     // Catch:{ all -> 0x007d }
            android.view.View r3 = r9.j     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r0.zza((android.content.Context) r2, (android.view.View) r3, (android.app.Activity) r1)     // Catch:{ all -> 0x007d }
            r5 = r0
            goto L_0x0029
        L_0x0028:
            r5 = r1
        L_0x0029:
            com.google.android.gms.internal.ads.zzabx<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaci.f5588a     // Catch:{ all -> 0x007d }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x007d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x007d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007d }
            r8 = 1
            if (r0 != 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzdpd r1 = r9.g     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzdkw r2 = r9.f6321e     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzdkk r3 = r9.f6322f     // Catch:{ all -> 0x007d }
            r4 = 0
            r6 = 0
            com.google.android.gms.internal.ads.zzdkk r0 = r9.f6322f     // Catch:{ all -> 0x007d }
            java.util.List<java.lang.String> r7 = r0.f8134d     // Catch:{ all -> 0x007d }
            r1.c(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007d }
            r9.l = r8     // Catch:{ all -> 0x007d }
            monitor-exit(r9)
            return
        L_0x004b:
            com.google.android.gms.internal.ads.zzabv r0 = r9.i     // Catch:{ all -> 0x007d }
            android.content.Context r2 = r9.f6318b     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzdvf r0 = r0.a(r2, r1)     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzduo r0 = com.google.android.gms.internal.ads.zzduo.H(r0)     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzaav.t0     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzaar r2 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = r2.c(r1)     // Catch:{ all -> 0x007d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x007d }
            long r1 = r1.longValue()     // Catch:{ all -> 0x007d }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x007d }
            java.util.concurrent.ScheduledExecutorService r4 = r9.f6320d     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzduo r0 = r0.C(r1, r3, r4)     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.xb r1 = new com.google.android.gms.internal.ads.xb     // Catch:{ all -> 0x007d }
            r1.<init>(r9, r5)     // Catch:{ all -> 0x007d }
            java.util.concurrent.Executor r2 = r9.f6319c     // Catch:{ all -> 0x007d }
            com.google.android.gms.internal.ads.zzdux.f(r0, r1, r2)     // Catch:{ all -> 0x007d }
            r9.l = r8     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r9)
            return
        L_0x007d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzblk.onAdImpression():void");
    }

    public final void onAdLeftApplication() {
    }

    public final synchronized void onAdLoaded() {
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.f6322f.f8134d);
            arrayList.addAll(this.f6322f.f8136f);
            this.g.c(this.f6321e, this.f6322f, true, (String) null, (String) null, arrayList);
        } else {
            this.g.a(this.f6321e, this.f6322f, this.f6322f.m);
            this.g.a(this.f6321e, this.f6322f, this.f6322f.f8136f);
        }
        this.k = true;
    }

    public final void onAdOpened() {
    }

    public final void onRewardedVideoCompleted() {
        zzdpd zzdpd = this.g;
        zzdkw zzdkw = this.f6321e;
        zzdkk zzdkk = this.f6322f;
        zzdpd.a(zzdkw, zzdkk, zzdkk.i);
    }

    public final void onRewardedVideoStarted() {
        zzdpd zzdpd = this.g;
        zzdkw zzdkw = this.f6321e;
        zzdkk zzdkk = this.f6322f;
        zzdpd.a(zzdkw, zzdkk, zzdkk.g);
    }
}
