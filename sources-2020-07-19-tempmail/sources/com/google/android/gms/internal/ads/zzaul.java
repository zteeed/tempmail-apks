package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaul extends zzgu implements zzauj {
    zzaul(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void D4(zzuy zzuy) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzuy);
        P(5, y);
    }

    public final void L0() throws RemoteException {
        P(2, y());
    }

    public final void O(zzaud zzaud) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaud);
        P(3, y);
    }

    public final void V5(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(4, y);
    }

    public final void v1() throws RemoteException {
        P(1, y());
    }
}
