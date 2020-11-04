package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzavf extends RewardedInterstitialAd {

    /* renamed from: a  reason: collision with root package name */
    private final zzaui f5980a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5981b;

    /* renamed from: c  reason: collision with root package name */
    private final zzavd f5982c = new zzavd();

    public zzavf(Context context, String str) {
        this.f5981b = context.getApplicationContext();
        this.f5980a = zzwg.b().k(context, str, new zzamo());
    }

    public final void a(zzyq zzyq, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            this.f5980a.e1(zzvf.b(this.f5981b, zzyq), new zzavg(rewardedInterstitialAdLoadCallback, this));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            return this.f5980a.getAdMetadata();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return new Bundle();
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyd zzyd;
        try {
            zzyd = this.f5980a.zzkj();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            zzyd = null;
        }
        return ResponseInfo.zza(zzyd);
    }

    public final RewardItem getRewardItem() {
        try {
            zzaud x2 = this.f5980a.x2();
            if (x2 != null) {
                return new zzauw(x2);
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f5982c.z6(fullScreenContentCallback);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f5980a.Y0(new zzzs(onAdMetadataChangedListener));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f5980a.zza(new zzzv(onPaidEventListener));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.f5980a.B5(new zzauz(serverSideVerificationOptions));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f5982c.A6(onUserEarnedRewardListener);
        try {
            this.f5980a.K4(this.f5982c);
            this.f5980a.b2(ObjectWrapper.b0(activity));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
