package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzavd extends zzaum {

    /* renamed from: b  reason: collision with root package name */
    private FullScreenContentCallback f5976b;

    /* renamed from: c  reason: collision with root package name */
    private OnUserEarnedRewardListener f5977c;

    public final void A6(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f5977c = onUserEarnedRewardListener;
    }

    public final void D4(zzuy zzuy) {
        FullScreenContentCallback fullScreenContentCallback = this.f5976b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(new AdError(zzuy.f9172b, zzuy.f9173c, zzuy.f9174d));
        }
    }

    public final void L0() {
        FullScreenContentCallback fullScreenContentCallback = this.f5976b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void O(zzaud zzaud) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f5977c;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new zzauw(zzaud));
        }
    }

    public final void V5(int i) {
    }

    public final void v1() {
        FullScreenContentCallback fullScreenContentCallback = this.f5976b;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void z6(FullScreenContentCallback fullScreenContentCallback) {
        this.f5976b = fullScreenContentCallback;
    }
}
