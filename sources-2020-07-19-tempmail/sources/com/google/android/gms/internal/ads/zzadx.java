package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzadx extends IInterface {
    void I(IObjectWrapper iObjectWrapper) throws RemoteException;

    void b3(IObjectWrapper iObjectWrapper) throws RemoteException;

    void destroy() throws RemoteException;

    void j6(zzado zzado) throws RemoteException;

    void n2(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper o3(String str) throws RemoteException;

    void t0(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    void v0(IObjectWrapper iObjectWrapper) throws RemoteException;

    void z(IObjectWrapper iObjectWrapper) throws RemoteException;
}
