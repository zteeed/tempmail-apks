package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzabn extends IInterface {
    void P1(IObjectWrapper iObjectWrapper) throws RemoteException;

    String f1() throws RemoteException;

    String getContent() throws RemoteException;

    void recordClick() throws RemoteException;

    void recordImpression() throws RemoteException;
}
