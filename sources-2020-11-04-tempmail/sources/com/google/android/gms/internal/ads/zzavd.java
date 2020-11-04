package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzavd extends zzaum {

    /* renamed from: b  reason: collision with root package name */
    private FullScreenContentCallback f6159b;

    /* renamed from: c  reason: collision with root package name */
    private OnUserEarnedRewardListener f6160c;

    public final void E1() {
        FullScreenContentCallback fullScreenContentCallback = this.f6159b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void S0() {
        FullScreenContentCallback fullScreenContentCallback = this.f6159b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void U(zzaud zzaud) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f6160c;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new zzauw(zzaud));
        }
    }

    public final void X4(zzuy zzuy) {
        FullScreenContentCallback fullScreenContentCallback = this.f6159b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(new AdError(zzuy.f9355b, zzuy.f9356c, zzuy.f9357d));
        }
    }

    public final void e7(FullScreenContentCallback fullScreenContentCallback) {
        this.f6159b = fullScreenContentCallback;
    }

    public final void f7(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f6160c = onUserEarnedRewardListener;
    }

    public final void v6(int i) {
    }
}
