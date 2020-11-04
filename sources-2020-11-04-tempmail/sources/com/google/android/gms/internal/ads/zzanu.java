package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzanu<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzamx f6005a;

    public zzanu(zzamx zzamx) {
        this.f6005a = zzamx;
    }

    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        zzbba.f(sb.toString());
        zzwg.a();
        if (!zzbaq.y()) {
            zzbba.e("#008 Must be called on the main UI thread.", (Throwable) null);
            zzbaq.f6298b.post(new u2(this, errorCode));
            return;
        }
        try {
            this.f6005a.onAdFailedToLoad(zzaog.a(errorCode));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void b(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        zzbba.f(sb.toString());
        zzwg.a();
        if (!zzbaq.y()) {
            zzbba.e("#008 Must be called on the main UI thread.", (Throwable) null);
            zzbaq.f6298b.post(new v2(this, errorCode));
            return;
        }
        try {
            this.f6005a.onAdFailedToLoad(zzaog.a(errorCode));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
