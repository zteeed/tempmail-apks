package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class t2 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzamx f5128a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzann f5129b;

    t2(zzann zzann, zzamx zzamx) {
        this.f5129b = zzann;
        this.f5128a = zzamx;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            MediationRewardedAd unused = this.f5129b.f5990f = mediationRewardedAd;
            this.f5128a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
        return new zzavb(this.f5128a);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.f5129b.f5986b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            zzbba.f(sb.toString());
            this.f5128a.z2(0, str);
            this.f5128a.onAdFailedToLoad(0);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
