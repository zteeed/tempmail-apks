package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzati extends zzgu implements zzatg {
    zzati(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final int getAmount() throws RemoteException {
        Parcel E = E(2, y());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final String getType() throws RemoteException {
        Parcel E = E(1, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }
}
