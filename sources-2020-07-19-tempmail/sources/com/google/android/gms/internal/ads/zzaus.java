package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaus extends zzgu implements zzauq {
    zzaus(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    public final void A4(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(2, y);
    }

    public final void J0() throws RemoteException {
        P(1, y());
    }
}
