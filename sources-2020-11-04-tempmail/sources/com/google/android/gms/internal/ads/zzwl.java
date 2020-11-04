package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzwl extends zzgu implements zzwj {
    zzwl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void o2(zzuy zzuy) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzuy);
        V(8, B);
    }

    public final void onAdClicked() throws RemoteException {
        V(6, B());
    }

    public final void onAdClosed() throws RemoteException {
        V(1, B());
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(2, B);
    }

    public final void onAdImpression() throws RemoteException {
        V(7, B());
    }

    public final void onAdLeftApplication() throws RemoteException {
        V(3, B());
    }

    public final void onAdLoaded() throws RemoteException {
        V(4, B());
    }

    public final void onAdOpened() throws RemoteException {
        V(5, B());
    }
}
