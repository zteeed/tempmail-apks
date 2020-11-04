package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzats extends zzgu implements zzatq {
    zzats(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void b5(zzatg zzatg) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzatg);
        V(5, B);
    }

    public final void onRewardedVideoAdClosed() throws RemoteException {
        V(4, B());
    }

    public final void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(7, B);
    }

    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        V(6, B());
    }

    public final void onRewardedVideoAdLoaded() throws RemoteException {
        V(1, B());
    }

    public final void onRewardedVideoAdOpened() throws RemoteException {
        V(2, B());
    }

    public final void onRewardedVideoCompleted() throws RemoteException {
        V(8, B());
    }

    public final void onRewardedVideoStarted() throws RemoteException {
        V(3, B());
    }
}
