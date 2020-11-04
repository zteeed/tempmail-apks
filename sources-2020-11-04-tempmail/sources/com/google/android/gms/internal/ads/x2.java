package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class x2 implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaom f5457a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzamx f5458b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzapc f5459c;

    x2(zzapc zzapc, zzaom zzaom, zzamx zzamx) {
        this.f5459c = zzapc;
        this.f5457a = zzaom;
        this.f5458b = zzamx;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        if (mediationInterstitialAd == null) {
            zzbba.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f5457a.s("Adapter returned null.");
                return null;
            } catch (RemoteException e2) {
                zzbba.c("", e2);
                return null;
            }
        } else {
            try {
                MediationInterstitialAd unused = this.f5459c.f6010c = mediationInterstitialAd;
                this.f5457a.j0();
            } catch (RemoteException e3) {
                zzbba.c("", e3);
            }
            return new b3(this.f5458b);
        }
    }

    public final void onFailure(String str) {
        try {
            this.f5457a.s(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
