package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class b3 implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationRewardedAdCallback {

    /* renamed from: a  reason: collision with root package name */
    private zzamx f3598a;

    b3(zzamx zzamx) {
        this.f3598a = zzamx;
    }

    public final void onAdClosed() {
        try {
            this.f3598a.onAdClosed();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            String valueOf = String.valueOf(str);
            zzbba.i(valueOf.length() != 0 ? "Mediated ad failed to show: ".concat(valueOf) : new String("Mediated ad failed to show: "));
            this.f3598a.D1(str);
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.f3598a.onAdLeftApplication();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.f3598a.onAdOpened();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        try {
            this.f3598a.U(new zzave(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.f3598a.Y();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
    }

    public final void onVideoPlay() {
        try {
            this.f3598a.onVideoPlay();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.f3598a.R3();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.f3598a.onAdClicked();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.f3598a.onAdImpression();
        } catch (RemoteException unused) {
        }
    }
}
