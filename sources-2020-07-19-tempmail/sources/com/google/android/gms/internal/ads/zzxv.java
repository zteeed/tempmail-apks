package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzxv extends zzgu implements zzxt {
    zzxv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public final String E0() throws RemoteException {
        Parcel E = E(2, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final String getDescription() throws RemoteException {
        Parcel E = E(1, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }
}
