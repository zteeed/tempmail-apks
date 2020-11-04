package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class y2 implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaol f5344a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzamx f5345b;

    y2(zzapc zzapc, zzaol zzaol, zzamx zzamx) {
        this.f5344a = zzaol;
        this.f5345b = zzamx;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationBannerAdCallback onSuccess(MediationBannerAd mediationBannerAd) {
        if (mediationBannerAd == null) {
            zzbba.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f5344a.q("Adapter returned null.");
                return null;
            } catch (RemoteException e2) {
                zzbba.c("", e2);
                return null;
            }
        } else {
            try {
                this.f5344a.T2(ObjectWrapper.b0(mediationBannerAd.getView()));
            } catch (RemoteException e3) {
                zzbba.c("", e3);
            }
            return new b3(this.f5345b);
        }
    }

    public final void onFailure(String str) {
        try {
            this.f5344a.q(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
