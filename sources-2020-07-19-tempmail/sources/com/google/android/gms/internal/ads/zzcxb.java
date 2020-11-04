package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcxb implements zzbsl, zzbsq, zzbtd, zzbua, zzuu {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private zzwj f7669b;

    public final synchronized zzwj a() {
        return this.f7669b;
    }

    public final synchronized void b(zzwj zzwj) {
        this.f7669b = zzwj;
    }

    public final void d(zzatg zzatg, String str, String str2) {
    }

    public final synchronized void onAdClicked() {
        if (this.f7669b != null) {
            try {
                this.f7669b.onAdClicked();
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAdClicked.", e2);
            }
        }
    }

    public final synchronized void onAdClosed() {
        if (this.f7669b != null) {
            try {
                this.f7669b.onAdClosed();
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAdClosed.", e2);
            }
        }
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (this.f7669b != null) {
            try {
                this.f7669b.onAdFailedToLoad(i);
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAdFailedToLoad.", e2);
            }
        }
    }

    public final synchronized void onAdImpression() {
        if (this.f7669b != null) {
            try {
                this.f7669b.onAdImpression();
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAdImpression.", e2);
            }
        }
    }

    public final synchronized void onAdLeftApplication() {
        if (this.f7669b != null) {
            try {
                this.f7669b.onAdLeftApplication();
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAdLeftApplication.", e2);
            }
        }
    }

    public final synchronized void onAdLoaded() {
        if (this.f7669b != null) {
            try {
                this.f7669b.onAdLoaded();
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAdLoaded.", e2);
            }
        }
    }

    public final synchronized void onAdOpened() {
        if (this.f7669b != null) {
            try {
                this.f7669b.onAdOpened();
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAdOpened.", e2);
            }
        }
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }
}
