package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauf extends zzgu implements zzaud {
    zzauf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public final int getAmount() throws RemoteException {
        Parcel H = H(2, B());
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final String getType() throws RemoteException {
        Parcel H = H(1, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }
}
