package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzadx extends IInterface {
    void B0(IObjectWrapper iObjectWrapper) throws RemoteException;

    void C(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper E3(String str) throws RemoteException;

    void L6(zzado zzado) throws RemoteException;

    void M(IObjectWrapper iObjectWrapper) throws RemoteException;

    void destroy() throws RemoteException;

    void n3(IObjectWrapper iObjectWrapper) throws RemoteException;

    void x2(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void z0(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}
