package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class t2 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzamx f4945a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzann f4946b;

    t2(zzann zzann, zzamx zzamx) {
        this.f4946b = zzann;
        this.f4945a = zzamx;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            MediationRewardedAd unused = this.f4946b.f5807f = mediationRewardedAd;
            this.f4945a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
        return new zzavb(this.f4945a);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.f4946b.f5803b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            zzbba.f(sb.toString());
            this.f4945a.o2(0, str);
            this.f4945a.onAdFailedToLoad(0);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
