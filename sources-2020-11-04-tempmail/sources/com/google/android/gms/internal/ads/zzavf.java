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
    private final zzaui f6163a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6164b;

    /* renamed from: c  reason: collision with root package name */
    private final zzavd f6165c = new zzavd();

    public zzavf(Context context, String str) {
        this.f6164b = context.getApplicationContext();
        this.f6163a = zzwg.b().k(context, str, new zzamo());
    }

    public final void a(zzyq zzyq, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            this.f6163a.k1(zzvf.b(this.f6164b, zzyq), new zzavg(rewardedInterstitialAdLoadCallback, this));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            return this.f6163a.getAdMetadata();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return new Bundle();
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyd zzyd;
        try {
            zzyd = this.f6163a.zzkj();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            zzyd = null;
        }
        return ResponseInfo.zza(zzyd);
    }

    public final RewardItem getRewardItem() {
        try {
            zzaud K2 = this.f6163a.K2();
            if (K2 != null) {
                return new zzauw(K2);
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f6165c.e7(fullScreenContentCallback);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f6163a.e1(new zzzs(onAdMetadataChangedListener));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f6163a.zza(new zzzv(onPaidEventListener));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.f6163a.Z5(new zzauz(serverSideVerificationOptions));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f6165c.f7(onUserEarnedRewardListener);
        try {
            this.f6163a.e5(this.f6165c);
            this.f6163a.l2(ObjectWrapper.h0(activity));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
