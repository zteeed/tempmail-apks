package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzats extends zzgu implements zzatq {
    zzats(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void H4(zzatg zzatg) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzatg);
        P(5, y);
    }

    public final void onRewardedVideoAdClosed() throws RemoteException {
        P(4, y());
    }

    public final void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(7, y);
    }

    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        P(6, y());
    }

    public final void onRewardedVideoAdLoaded() throws RemoteException {
        P(1, y());
    }

    public final void onRewardedVideoAdOpened() throws RemoteException {
        P(2, y());
    }

    public final void onRewardedVideoCompleted() throws RemoteException {
        P(8, y());
    }

    public final void onRewardedVideoStarted() throws RemoteException {
        P(3, y());
    }
}
