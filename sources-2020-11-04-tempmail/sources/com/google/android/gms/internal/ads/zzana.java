package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzana extends IInterface {
    void D(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean G() throws RemoteException;

    void O(IObjectWrapper iObjectWrapper) throws RemoteException;

    String e() throws RemoteException;

    IObjectWrapper f() throws RemoteException;

    zzadl g() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    String i() throws RemoteException;

    String j() throws RemoteException;

    List k() throws RemoteException;

    zzadt m() throws RemoteException;

    String n() throws RemoteException;

    double p() throws RemoteException;

    String r() throws RemoteException;

    void recordImpression() throws RemoteException;

    void t(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean v() throws RemoteException;

    void w(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    IObjectWrapper x() throws RemoteException;

    IObjectWrapper z() throws RemoteException;
}
