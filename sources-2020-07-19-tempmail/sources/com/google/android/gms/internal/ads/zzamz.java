package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzamz extends zzgu implements zzamx {
    zzamz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void D3() throws RemoteException {
        P(13, y());
    }

    public final void F0(zzamy zzamy) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzamy);
        P(7, y);
    }

    public final void K2() throws RemoteException {
        P(18, y());
    }

    public final void O(zzaud zzaud) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaud);
        P(16, y);
    }

    public final void R3(zzaub zzaub) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzaub);
        P(14, y);
    }

    public final void S() throws RemoteException {
        P(11, y());
    }

    public final void V(zzaep zzaep, String str) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaep);
        y.writeString(str);
        P(10, y);
    }

    public final void W1(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(17, y);
    }

    public final void o2(int i, String str) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        y.writeString(str);
        P(22, y);
    }

    public final void onAdClicked() throws RemoteException {
        P(1, y());
    }

    public final void onAdClosed() throws RemoteException {
        P(2, y());
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(3, y);
    }

    public final void onAdImpression() throws RemoteException {
        P(8, y());
    }

    public final void onAdLeftApplication() throws RemoteException {
        P(4, y());
    }

    public final void onAdLoaded() throws RemoteException {
        P(6, y());
    }

    public final void onAdOpened() throws RemoteException {
        P(5, y());
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        y.writeString(str2);
        P(9, y);
    }

    public final void onVideoPause() throws RemoteException {
        P(15, y());
    }

    public final void onVideoPlay() throws RemoteException {
        P(20, y());
    }

    public final void u1(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(21, y);
    }

    public final void x0(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(12, y);
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, bundle);
        P(19, y);
    }
}
