package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdke extends zzatm {

    /* renamed from: b  reason: collision with root package name */
    private final zzdjq f8299b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdiu f8300c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkv f8301d;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public zzchj f8302e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private boolean f8303f = false;

    public zzdke(zzdjq zzdjq, zzdiu zzdiu, zzdkv zzdkv) {
        this.f8299b = zzdjq;
        this.f8300c = zzdiu;
        this.f8301d = zzdkv;
    }

    private final synchronized boolean h7() {
        return this.f8302e != null && !this.f8302e.h();
    }

    public final boolean I1() {
        zzchj zzchj = this.f8302e;
        return zzchj != null && zzchj.l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void N6(com.google.android.gms.dynamic.IObjectWrapper r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.f(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzdiu r0 = r2.f8300c     // Catch:{ all -> 0x0025 }
            r1 = 0
            r0.e(r1)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzchj r0 = r2.f8302e     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0023
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.V(r3)     // Catch:{ all -> 0x0025 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0025 }
        L_0x001a:
            com.google.android.gms.internal.ads.zzchj r3 = r2.f8302e     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbtf r3 = r3.c()     // Catch:{ all -> 0x0025 }
            r3.F0(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdke.N6(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final synchronized void W5(zzatw zzatw) throws RemoteException {
        Preconditions.f("loadAd must be called on the main UI thread.");
        if (!zzaax.a(zzatw.f6134c)) {
            if (h7()) {
                if (!((Boolean) zzwg.e().c(zzaav.u2)).booleanValue()) {
                    return;
                }
            }
            zzdjn zzdjn = new zzdjn((String) null);
            this.f8302e = null;
            this.f8299b.h(zzdks.f8333a);
            this.f8299b.a(zzatw.f6133b, zzatw.f6134c, zzdjn, new lw(this));
        }
    }

    public final synchronized void Y4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.f("showAd must be called on the main UI thread.");
        if (this.f8302e != null) {
            if (iObjectWrapper != null) {
                Object V = ObjectWrapper.V(iObjectWrapper);
                if (V instanceof Activity) {
                    activity = (Activity) V;
                    this.f8302e.j(this.f8303f, activity);
                }
            }
            activity = null;
            this.f8302e.j(this.f8303f, activity);
        }
    }

    public final void b4(zzath zzath) {
        Preconditions.f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f8300c.g(zzath);
    }

    public final void destroy() throws RemoteException {
        N6((IObjectWrapper) null);
    }

    public final Bundle getAdMetadata() {
        Preconditions.f("getAdMetadata can only be called from the UI thread.");
        zzchj zzchj = this.f8302e;
        return zzchj != null ? zzchj.g() : new Bundle();
    }

    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.f8302e == null || this.f8302e.d() == null) {
            return null;
        }
        return this.f8302e.d().getMediationAdapterClassName();
    }

    public final boolean isLoaded() throws RemoteException {
        Preconditions.f("isLoaded must be called on the main UI thread.");
        return h7();
    }

    public final synchronized void o5(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.f("pause must be called on the main UI thread.");
        if (this.f8302e != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.V(iObjectWrapper);
            }
            this.f8302e.c().D0(context);
        }
    }

    public final void pause() {
        o5((IObjectWrapper) null);
    }

    public final void q5(String str) throws RemoteException {
    }

    public final void resume() {
        y4((IObjectWrapper) null);
    }

    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzwg.e().c(zzaav.p0)).booleanValue()) {
            Preconditions.f("#008 Must be called on the main UI thread.: setCustomData");
            this.f8301d.f8343b = str;
        }
    }

    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.f("setImmersiveMode must be called on the main UI thread.");
        this.f8303f = z;
    }

    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.f("setUserId must be called on the main UI thread.");
        this.f8301d.f8342a = str;
    }

    public final synchronized void show() throws RemoteException {
        Y4((IObjectWrapper) null);
    }

    public final synchronized void y4(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.f("resume must be called on the main UI thread.");
        if (this.f8302e != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.V(iObjectWrapper);
            }
            this.f8302e.c().E0(context);
        }
    }

    public final void zza(zzatq zzatq) throws RemoteException {
        Preconditions.f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f8300c.h(zzatq);
    }

    public final synchronized zzyd zzkj() throws RemoteException {
        if (!((Boolean) zzwg.e().c(zzaav.C3)).booleanValue()) {
            return null;
        }
        if (this.f8302e == null) {
            return null;
        }
        return this.f8302e.d();
    }

    public final void zza(zzwz zzwz) {
        Preconditions.f("setAdMetadataListener can only be called from the UI thread.");
        if (zzwz == null) {
            this.f8300c.e((AdMetadataListener) null);
        } else {
            this.f8300c.e(new mw(this, zzwz));
        }
    }
}
