package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class x2 implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaom f5274a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzamx f5275b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzapc f5276c;

    x2(zzapc zzapc, zzaom zzaom, zzamx zzamx) {
        this.f5276c = zzapc;
        this.f5274a = zzaom;
        this.f5275b = zzamx;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        if (mediationInterstitialAd == null) {
            zzbba.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f5274a.q("Adapter returned null.");
                return null;
            } catch (RemoteException e2) {
                zzbba.c("", e2);
                return null;
            }
        } else {
            try {
                MediationInterstitialAd unused = this.f5276c.f5827c = mediationInterstitialAd;
                this.f5274a.d0();
            } catch (RemoteException e3) {
                zzbba.c("", e3);
            }
            return new b3(this.f5275b);
        }
    }

    public final void onFailure(String str) {
        try {
            this.f5274a.q(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
