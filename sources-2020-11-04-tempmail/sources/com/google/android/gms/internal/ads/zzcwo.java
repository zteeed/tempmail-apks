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
    private final Context f7824b;

    /* renamed from: c  reason: collision with root package name */
    private final zzwj f7825c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdla f7826d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbnc f7827e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f7828f;

    public zzcwo(Context context, zzwj zzwj, zzdla zzdla, zzbnc zzbnc) {
        this.f7824b = context;
        this.f7825c = zzwj;
        this.f7826d = zzdla;
        this.f7827e = zzbnc;
        FrameLayout frameLayout = new FrameLayout(this.f7824b);
        frameLayout.removeAllViews();
        frameLayout.addView(this.f7827e.j(), zzq.zzky().r());
        frameLayout.setMinimumHeight(zzkh().f9374d);
        frameLayout.setMinimumWidth(zzkh().g);
        this.f7828f = frameLayout;
    }

    public final void destroy() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f7827e.a();
    }

    public final Bundle getAdMetadata() throws RemoteException {
        zzbba.h("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    public final String getAdUnitId() throws RemoteException {
        return this.f7826d.f8351f;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.f7827e.d() != null) {
            return this.f7827e.d().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzyi getVideoController() throws RemoteException {
        return this.f7827e.g();
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final boolean isReady() throws RemoteException {
        return false;
    }

    public final void pause() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f7827e.c().D0((Context) null);
    }

    public final void resume() throws RemoteException {
        Preconditions.f("destroy must be called on the main UI thread.");
        this.f7827e.c().E0((Context) null);
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
        return ObjectWrapper.h0(this.f7828f);
    }

    public final void zzkg() throws RemoteException {
        this.f7827e.m();
    }

    public final zzvh zzkh() {
        Preconditions.f("getAdSize must be called on the main UI thread.");
        return zzdld.b(this.f7824b, Collections.singletonList(this.f7827e.i()));
    }

    public final String zzki() throws RemoteException {
        if (this.f7827e.d() != null) {
            return this.f7827e.d().getMediationAdapterClassName();
        }
        return null;
    }

    public final zzyd zzkj() {
        return this.f7827e.d();
    }

    public final zzxe zzkk() throws RemoteException {
        return this.f7826d.m;
    }

    public final zzwj zzkl() throws RemoteException {
        return this.f7825c;
    }

    public final void zza(zzaaa zzaaa) throws RemoteException {
        zzbba.h("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    public final void zza(zzvh zzvh) throws RemoteException {
        Preconditions.f("setAdSize must be called on the main UI thread.");
        zzbnc zzbnc = this.f7827e;
        if (zzbnc != null) {
            zzbnc.h(this.f7828f, zzvh);
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
