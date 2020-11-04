package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatr implements RewardItem {

    /* renamed from: a  reason: collision with root package name */
    private final zzatg f6131a;

    public zzatr(zzatg zzatg) {
        this.f6131a = zzatg;
    }

    public final int getAmount() {
        zzatg zzatg = this.f6131a;
        if (zzatg == null) {
            return 0;
        }
        try {
            return zzatg.getAmount();
        } catch (RemoteException e2) {
            zzbba.d("Could not forward getAmount to RewardItem", e2);
            return 0;
        }
    }

    public final String getType() {
        zzatg zzatg = this.f6131a;
        if (zzatg == null) {
            return null;
        }
        try {
            return zzatg.getType();
        } catch (RemoteException e2) {
            zzbba.d("Could not forward getType to RewardItem", e2);
            return null;
        }
    }
}
