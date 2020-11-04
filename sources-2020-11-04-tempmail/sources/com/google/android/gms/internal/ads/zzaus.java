package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaus extends zzgu implements zzauq {
    zzaus(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    public final void Q0() throws RemoteException {
        V(1, B());
    }

    public final void U4(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(2, B);
    }
}
