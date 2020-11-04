package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzwl extends zzgu implements zzwj {
    zzwl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void e2(zzuy zzuy) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzuy);
        P(8, y);
    }

    public final void onAdClicked() throws RemoteException {
        P(6, y());
    }

    public final void onAdClosed() throws RemoteException {
        P(1, y());
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(2, y);
    }

    public final void onAdImpression() throws RemoteException {
        P(7, y());
    }

    public final void onAdLeftApplication() throws RemoteException {
        P(3, y());
    }

    public final void onAdLoaded() throws RemoteException {
        P(4, y());
    }

    public final void onAdOpened() throws RemoteException {
        P(5, y());
    }
}
