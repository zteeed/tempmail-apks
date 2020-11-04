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
    private final zzatx f6146a;

    public zzauc(zzatx zzatx) {
        this.f6146a = zzatx;
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClicked.");
        try {
            this.f6146a.Z3(ObjectWrapper.h0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdClosed.");
        try {
            this.f6146a.K6(ObjectWrapper.h0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdFailedToLoad.");
        try {
            this.f6146a.j2(ObjectWrapper.h0(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLeftApplication.");
        try {
            this.f6146a.h5(ObjectWrapper.h0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdLoaded.");
        try {
            this.f6146a.I0(ObjectWrapper.h0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdOpened.");
        try {
            this.f6146a.R1(ObjectWrapper.h0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onInitializationFailed.");
        try {
            this.f6146a.o1(ObjectWrapper.h0(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onInitializationSucceeded.");
        try {
            this.f6146a.v3(ObjectWrapper.h0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.f6146a.Y6(ObjectWrapper.h0(mediationRewardedVideoAdAdapter), new zzaub(rewardItem));
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        } else {
            this.f6146a.Y6(ObjectWrapper.h0(mediationRewardedVideoAdAdapter), new zzaub("", 1));
        }
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onVideoCompleted.");
        try {
            this.f6146a.r2(ObjectWrapper.h0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onVideoStarted.");
        try {
            this.f6146a.h6(ObjectWrapper.h0(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void zzb(Bundle bundle) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbba.f("Adapter called onAdMetadataChanged.");
        try {
            this.f6146a.zzb(bundle);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }
}
