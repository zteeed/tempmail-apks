package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzavb implements MediationRewardedAdCallback {

    /* renamed from: a  reason: collision with root package name */
    private final zzamx f5975a;

    public zzavb(zzamx zzamx) {
        this.f5975a = zzamx;
    }

    public final void onAdClosed() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClosed.");
        try {
            this.f5975a.onAdClosed();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdFailedToShow(String str) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdFailedToShow.");
        String valueOf = String.valueOf(str);
        zzbba.i(valueOf.length() != 0 ? "Mediation ad failed to show: ".concat(valueOf) : new String("Mediation ad failed to show: "));
        try {
            this.f5975a.u1(str);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdOpened() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdOpened.");
        try {
            this.f5975a.onAdOpened();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onUserEarnedReward.");
        try {
            this.f5975a.O(new zzave(rewardItem));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onVideoComplete() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onVideoComplete.");
        try {
            this.f5975a.K2();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onVideoStart() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onVideoStart.");
        try {
            this.f5975a.D3();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void reportAdClicked() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called reportAdClicked.");
        try {
            this.f5975a.onAdClicked();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void reportAdImpression() {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called reportAdImpression.");
        try {
            this.f5975a.onAdImpression();
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
