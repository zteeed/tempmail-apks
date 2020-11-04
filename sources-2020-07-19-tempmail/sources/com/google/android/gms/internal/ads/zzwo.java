package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzwo extends IInterface {
    void J4(zzve zzve, int i) throws RemoteException;

    void X5(zzve zzve) throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoading() throws RemoteException;

    String zzki() throws RemoteException;
}
