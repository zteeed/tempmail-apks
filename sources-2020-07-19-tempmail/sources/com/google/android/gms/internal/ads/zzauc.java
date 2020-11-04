package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauc implements MediationRewardedVideoAdListener {

    /* renamed from: a  reason: collision with root package name */
    private final zzatx f5963a;

    public zzauc(zzatx zzatx) {
        this.f5963a = zzatx;
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClicked.");
        try {
            this.f5963a.L3(ObjectWrapper.b0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClosed.");
        try {
            this.f5963a.i6(ObjectWrapper.b0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdFailedToLoad.");
        try {
            this.f5963a.Z1(ObjectWrapper.b0(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLeftApplication.");
        try {
            this.f5963a.N4(ObjectWrapper.b0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLoaded.");
        try {
            this.f5963a.C0(ObjectWrapper.b0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdOpened.");
        try {
            this.f5963a.I1(ObjectWrapper.b0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onInitializationFailed.");
        try {
            this.f5963a.i1(ObjectWrapper.b0(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onInitializationSucceeded.");
        try {
            this.f5963a.f3(ObjectWrapper.b0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.f5963a.u6(ObjectWrapper.b0(mediationRewardedVideoAdAdapter), new zzaub(rewardItem));
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        } else {
            this.f5963a.u6(ObjectWrapper.b0(mediationRewardedVideoAdAdapter), new zzaub("", 1));
        }
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onVideoCompleted.");
        try {
            this.f5963a.h2(ObjectWrapper.b0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onVideoStarted.");
        try {
            this.f5963a.J5(ObjectWrapper.b0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void zzb(Bundle bundle) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdMetadataChanged.");
        try {
            this.f5963a.zzb(bundle);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
