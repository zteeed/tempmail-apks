package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaul extends zzgu implements zzauj {
    zzaul(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void E1() throws RemoteException {
        V(1, B());
    }

    public final void S0() throws RemoteException {
        V(2, B());
    }

    public final void U(zzaud zzaud) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaud);
        V(3, B);
    }

    public final void X4(zzuy zzuy) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzuy);
        V(5, B);
    }

    public final void v6(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(4, B);
    }
}
