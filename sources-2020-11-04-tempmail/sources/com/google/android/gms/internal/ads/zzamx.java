package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzamx extends IInterface {
    void D0(String str) throws RemoteException;

    void D1(String str) throws RemoteException;

    void L0(zzamy zzamy) throws RemoteException;

    void R3() throws RemoteException;

    void U(zzaud zzaud) throws RemoteException;

    void W2() throws RemoteException;

    void Y() throws RemoteException;

    void b0(zzaep zzaep, String str) throws RemoteException;

    void g2(int i) throws RemoteException;

    void i4(zzaub zzaub) throws RemoteException;

    void onAdClicked() throws RemoteException;

    void onAdClosed() throws RemoteException;

    void onAdFailedToLoad(int i) throws RemoteException;

    void onAdImpression() throws RemoteException;

    void onAdLeftApplication() throws RemoteException;

    void onAdLoaded() throws RemoteException;

    void onAdOpened() throws RemoteException;

    void onAppEvent(String str, String str2) throws RemoteException;

    void onVideoPause() throws RemoteException;

    void onVideoPlay() throws RemoteException;

    void z2(int i, String str) throws RemoteException;

    void zzb(Bundle bundle) throws RemoteException;
}
