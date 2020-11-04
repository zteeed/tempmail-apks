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

    public final void D0(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(12, B);
    }

    public final void D1(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(21, B);
    }

    public final void L0(zzamy zzamy) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzamy);
        V(7, B);
    }

    public final void R3() throws RemoteException {
        V(13, B());
    }

    public final void U(zzaud zzaud) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaud);
        V(16, B);
    }

    public final void W2() throws RemoteException {
        V(18, B());
    }

    public final void Y() throws RemoteException {
        V(11, B());
    }

    public final void b0(zzaep zzaep, String str) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaep);
        B.writeString(str);
        V(10, B);
    }

    public final void g2(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(17, B);
    }

    public final void i4(zzaub zzaub) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzaub);
        V(14, B);
    }

    public final void onAdClicked() throws RemoteException {
        V(1, B());
    }

    public final void onAdClosed() throws RemoteException {
        V(2, B());
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(3, B);
    }

    public final void onAdImpression() throws RemoteException {
        V(8, B());
    }

    public final void onAdLeftApplication() throws RemoteException {
        V(4, B());
    }

    public final void onAdLoaded() throws RemoteException {
        V(6, B());
    }

    public final void onAdOpened() throws RemoteException {
        V(5, B());
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        B.writeString(str2);
        V(9, B);
    }

    public final void onVideoPause() throws RemoteException {
        V(15, B());
    }

    public final void onVideoPlay() throws RemoteException {
        V(20, B());
    }

    public final void z2(int i, String str) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        B.writeString(str);
        V(22, B);
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        V(19, B);
    }
}
