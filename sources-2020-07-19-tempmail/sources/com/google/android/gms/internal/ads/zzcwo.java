package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcwo extends zzwv {

    /* renamed from: b  reason: collision with root package name */
    private final Context f7641b;

    /* renamed from: c  reason: collision with root package name */
    private final zzwj f7642c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdla f7643d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbnc f7644e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f7645f;

    public zzcwo(Context context, zzwj zzwj, zzdla zzdla, zzbnc zzbnc) {
        this.f7641b = context;
        this.f7642c = zzwj;
        this.f7643d = zzdla;
        this.f7644e = zzbnc;
        FrameLayout frameLayout = new FrameLayout(this.f7641b);
        frameLayout.removeAllViews();
        frameLayout.addView(this.f7644e.j(), zzq.zzky().r());
        frameLayout.setMinimumHeight(zzkh().f9191d);
        frameLayout.setMinimumWidth(zzkh().g);
        this.f7645f = frameLayout;
    }

    public final void destroy() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f7644e.a();
    }

    public final Bundle getAdMetadata() throws RemoteException {
        zzbba.h("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    public final String getAdUnitId() throws RemoteException {
        return this.f7643d.f8168f;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.f7644e.d() != null) {
            return this.f7644e.d().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzyi getVideoController() throws RemoteException {
        return this.f7644e.g();
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final void pause() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f7644e.c().D0((Context) null);
    }

    public final void resume() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f7644e.c().E0((Context) null);
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        zzbba.h("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void setUserId(String str) throws RemoteException {
    }

    public final void showInterstitial() throws RemoteException {
    }

    public final void stopLoading() throws RemoteException {
    }

    public final void zza(zzaqs zzaqs) throws RemoteException {
    }

    public final void zza(zzaqy zzaqy, String str) throws RemoteException {
    }

    public final void zza(zzatq zzatq) throws RemoteException {
    }

    public final void zza(zzsg zzsg) throws RemoteException {
    }

    public final void zza(zzvo zzvo) throws RemoteException {
    }

    public final void zza(zzyo zzyo) throws RemoteException {
    }

    public final boolean zza(zzve zzve) throws RemoteException {
        zzbba.h("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    public final void zzbo(String str) throws RemoteException {
    }

    public final IObjectWrapper zzkf() throws RemoteException {
        return ObjectWrapper.b0(this.f7645f);
    }

    public final void zzkg() throws RemoteException {
        this.f7644e.m();
    }

    public final zzvh zzkh() {
        Preconditions.f("getAdSize must be called on the main UI thread.");
        return zzdld.b(this.f7641b, Collections.singletonList(this.f7644e.i()));
    }

    public final String zzki() throws RemoteException {
        if (this.f7644e.d() != null) {
            return this.f7644e.d().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzyd zzkj() {
        return this.f7644e.d();
    }

    public final zzxe zzkk() throws RemoteException {
        return this.f7643d.m;
    }

    public final zzwj zzkl() throws RemoteException {
        return this.f7642c;
    }

    public final void zza(zzaaa zzaaa) throws RemoteException {
        zzbba.h("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzvh zzvh) throws RemoteException {
        Preconditions.f("setAdSize must be called on the main UI thread.");
        zzbnc zzbnc = this.f7644e;
        if (zzbnc != null) {
            zzbnc.h(this.f7645f, zzvh);
        }
    }

    public final void zza(zzabo zzabo) throws RemoteException {
        zzbba.h("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwi zzwi) throws RemoteException {
        zzbba.h("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzxk zzxk) throws RemoteException {
        zzbba.h("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwj zzwj) throws RemoteException {
        zzbba.h("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzxe zzxe) throws RemoteException {
        zzbba.h("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzwz zzwz) throws RemoteException {
        zzbba.h("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzyc zzyc) {
        zzbba.h("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
