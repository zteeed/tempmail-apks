package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauw implements RewardItem {

    /* renamed from: a  reason: collision with root package name */
    private final zzaud f6150a;

    public zzauw(zzaud zzaud) {
        this.f6150a = zzaud;
    }

    public final int getAmount() {
        zzaud zzaud = this.f6150a;
        if (zzaud == null) {
            return 0;
        }
        try {
            return zzaud.getAmount();
        } catch (RemoteException e2) {
            zzbba.d("Could not forward getAmount to RewardItem", e2);
            return 0;
        }
    }

    public final String getType() {
        zzaud zzaud = this.f6150a;
        if (zzaud == null) {
            return null;
        }
        try {
            return zzaud.getType();
        } catch (RemoteException e2) {
            zzbba.d("Could not forward getType to RewardItem", e2);
            return null;
        }
    }
}
