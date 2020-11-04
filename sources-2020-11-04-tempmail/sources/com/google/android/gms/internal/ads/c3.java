package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class c3 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaos f3694a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzamx f3695b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzapc f3696c;

    c3(zzapc zzapc, zzaos zzaos, zzamx zzamx) {
        this.f3696c = zzapc;
        this.f3694a = zzaos;
        this.f3695b = zzamx;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        if (mediationRewardedAd == null) {
            zzbba.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.f3694a.s("Adapter returned null.");
                return null;
            } catch (RemoteException e2) {
                zzbba.c("", e2);
                return null;
            }
        } else {
            try {
                MediationRewardedAd unused = this.f3696c.f6011d = mediationRewardedAd;
                this.f3694a.j0();
            } catch (RemoteException e3) {
                zzbba.c("", e3);
            }
            return new b3(this.f3695b);
        }
    }

    public final void onFailure(String str) {
        try {
            this.f3694a.s(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
